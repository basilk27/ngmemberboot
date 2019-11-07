
DROP INDEX IF EXISTS  XJIDJ00104;
DROP INDEX IF EXISTS  XJIDJ00204;
DROP INDEX IF EXISTS  XJXFI00104;

DROP TABLE IF EXISTS  JID_JOBID;
DROP TABLE IF EXISTS JXF_XREF;

CREATE TABLE JID_JOBID (
	JID_JOB_ID        CHAR(20) NOT NULL,
	CMS_SRC_SYS_CD    CHAR(5) NOT NULL,
	JID_EFCTV_DT      TIMESTAMP NOT NULL,
	JID_TRMNTN_DT     TIMESTAMP,
	JID_JOBID_STAT_CD CHAR(5) NOT NULL,
	JID_OWNER_ID      CHAR(20) NOT NULL,
	MODIFY_USUS_ID    CHAR(20) NOT NULL,
	MODIFY_DT_TM      TIMESTAMP NOT NULL,
	JID_DESC_TXT      VARCHAR(1024) NOT NULL,
	CONSTRAINT JID_JOBID_PK04 PRIMARY KEY (JID_JOB_ID,CMS_SRC_SYS_CD,JID_EFCTV_DT)
);

CREATE UNIQUE INDEX XJIDJ00104 ON JID_JOBID (JID_JOB_ID,CMS_SRC_SYS_CD,JID_EFCTV_DT);
CREATE INDEX XJIDJ00204 ON JID_JOBID (JID_JOB_ID,CMS_SRC_SYS_CD);

CREATE TABLE JXF_XREF (
	GRP_GRP_ID      CHAR(10) NOT NULL,
	SGP_SBGRP_ID    CHAR(10) NOT NULL,
	CMS_SRC_SYS_CD  CHAR(5) NOT NULL,
	JXF_EFCTV_DT    TIMESTAMP NOT NULL,
	JXF_TRMNTN_DT   TIMESTAMP,
	JID_JOB_ID      CHAR(20) NOT NULL,
	JID_EFCTV_DT    TIMESTAMP NOT NULL,
	MODIFY_USUS_ID  CHAR(20) NOT NULL,
	MODIFY_DT_TM    TIMESTAMP NOT NULL,
	CONSTRAINT JXF_XREF_PK04 PRIMARY KEY (GRP_GRP_ID,SGP_SBGRP_ID,CMS_SRC_SYS_CD,JXF_EFCTV_DT)
);

CREATE UNIQUE INDEX XJXFI00104 ON JXF_XREF (GRP_GRP_ID,SGP_SBGRP_ID,CMS_SRC_SYS_CD,JXF_EFCTV_DT);

