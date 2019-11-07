package com.anthem.member.ngmemberboot.service;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.dto.ClientIdSourceSystemDTO;
import com.anthem.member.ngmemberboot.dto.SystemSource;
import com.anthem.member.ngmemberboot.dto.TransformedTypCd;
import com.anthem.member.ngmemberboot.exceptions.EETException;
import com.anthem.member.ngmemberboot.helppers.JidJobIdHelper;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.repository.JidJobidRepository;
import com.anthem.member.ngmemberboot.repository.TypCdVwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ClientMaintServiceImpl implements ClientMaintService {

    private JidJobidRepository jobidRepository;
    private TypCdVwRepository  typCdVwRepository;

    @Autowired
    public ClientMaintServiceImpl( JidJobidRepository jobidRepository,
                                   TypCdVwRepository  typCdVwRepository ) {
        this.jobidRepository = jobidRepository;

        this.typCdVwRepository = typCdVwRepository;
    }

    @Override
    public List<SystemSource> findSystemSources() {
        List<TypCdVw> typCdVwList =  typCdVwRepository.findTypCdVwsByTypCdVwKey_CdciCdItmIdAndTypCdVwKey_UcfrFltrVal( Constants.TYPE_CODE,
                                                                  Constants.EET_FILTER );

        List<SystemSource> systemSourceList = typCdVwList.stream()
                .filter( t -> t.getTypCdVwKey().getCdcvDomnVal().equals( Constants.WGS20_CMS_SYSTEM_CODE ) )
                .map( x -> new TransformedTypCd( x.getTypCdVwKey().getCdcvDomnVal() ) )
                .map( TransformedTypCd::getSystemSource )
                .collect( toList() );

        return systemSourceList;
    }

    public List<JidJobid> findBySystemTypeAndJobId( String sourceSystem, String jobId ) {
        return jobidRepository.findJidJobidsById_CmsSrcSysCdAndAndId_JidJobId( sourceSystem, jobId );
    }

    @Override
    public JidJobid createEmployerJobId( ClientIdSourceSystemDTO clientIdSourceSystemDTO ) {
        //check if we have a record with SystemType "WGS20" and a given Job_Id
        List<JidJobid> jidJobidList = this.findBySystemTypeAndJobId(
                                                    clientIdSourceSystemDTO.getSourceSystem(),
                                                    clientIdSourceSystemDTO.getJobId() );

        if ( jidJobidList != null && jidJobidList.size() > 0 )
            throw new EETException("The Job ID Already Exists");

        JidJobIdHelper jobIdHelper = new JidJobIdHelper( clientIdSourceSystemDTO );

        return jobidRepository.save( jobIdHelper.createJidJobId() );
    }

    @Override
    public JidJobid viewEmployerJobId( ClientIdSourceSystemDTO clientIdSourceSystemDTO ) {
        return null;
    }

    @Override
    public JidJobid updateEmployerJobId( ClientIdSourceSystemDTO clientIdSourceSystemDTO ) {
        return null;
    }
}
