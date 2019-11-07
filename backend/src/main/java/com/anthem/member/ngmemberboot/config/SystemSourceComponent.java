package com.anthem.member.ngmemberboot.config;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.repository.TypCdVwRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemSourceComponent {

    private TypCdVwRepository typCdVwRepository;

    @Getter
    private List<TypCdVw> typCdVwList;

    @Getter
    private String activeSource;

    @Autowired
    public SystemSourceComponent(TypCdVwRepository typCdVwRepository) {
        this.typCdVwRepository = typCdVwRepository;

        typCdVwList = typCdVwRepository
                .findTypCdVwsByTypCdVwKey_CdciCdItmIdAndTypCdVwKey_UcfrFltrVal( Constants.TYPE_CODE,
                                                                                Constants.EET_FILTER );

        activeSource = Constants.WGS20_CMS_SYSTEM_CODE;
    }
}
