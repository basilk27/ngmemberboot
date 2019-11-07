DROP TABLE IF EXISTS SGP_SBGRP_VW;

CREATE TABLE SGP_SBGRP_VW (
	GRP_GRP_ID CHAR(10),
	SGP_SBGRP_ID CHAR(10),
	CMS_SRC_SYS_CD CHAR(5),
	SGR_SBGRP_NM_TXT CHAR(75),
	CMS_EMP_GRP_CLF_CD CHAR(5),
	SGP_SGRP_EFCTV_DT TIMESTAMP,
	SGP_SGRP_TRMTN_DT TIMESTAMP,
	SGP_BLNG_SBGRP_ID CHAR(4),
	SGP_SLF_BLD_IND SMALLINT,
	MODIFY_USUS_ID CHAR(20),
	MODIFY_DT_TM TIMESTAMP,
	CONSTRAINT PK_SGP_SBGRP_VW PRIMARY KEY (GRP_GRP_ID,SGP_SBGRP_ID,CMS_SRC_SYS_CD)
);
