DROP TABLE IF EXISTS proman.ROLES CASCADE ;
CREATE TABLE IF NOT EXISTS proman.ROLES (
   ID SERIAL PRIMARY KEY,
   UUID SMALLINT NOT NULL,
   VERSION SERIAL NOT NULL,
   NAME VARCHAR(50) NOT NULL,
   DESCRIPTION VARCHAR(200),
   ACTIVE BOOLEAN NOT NULL,
   CREATED_BY VARCHAR(100) NOT NULL,
   CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   MODIFIED_BY VARCHAR(100),
   MODIFIED_AT TIMESTAMP
);
COMMENT ON TABLE proman.ROLES IS 'Table to define roles';
COMMENT ON COLUMN proman.ROLES.ID IS 'Auto generated PK identifier';
COMMENT ON COLUMN proman.ROLES.UUID IS 'Unique identifier used as reference by external systems';
COMMENT ON COLUMN proman.ROLES.VERSION IS 'Versioning for optimistic locking';
COMMENT ON COLUMN proman.ROLES.NAME IS 'Unique name of the role';
COMMENT ON COLUMN proman.ROLES.DESCRIPTION IS 'Description of the role';
COMMENT ON COLUMN proman.ROLES.ACTIVE IS 'Active status of the role - INACTIVE(0), ACTIVE (1)';
COMMENT ON COLUMN proman.ROLES.CREATED_BY IS 'User who inserted this record';
COMMENT ON COLUMN proman.ROLES.CREATED_AT IS 'Point in time when this record was inserted';
COMMENT ON COLUMN proman.ROLES.MODIFIED_BY IS 'User who modified this record';
COMMENT ON COLUMN proman.ROLES.MODIFIED_AT IS 'Point in time when this record was modified';


ALTER TABLE proman.ROLES ADD CONSTRAINT UK_ROLES_UUID UNIQUE(UUID);
ALTER TABLE proman.ROLES ADD CONSTRAINT UK_ROLES_NAME UNIQUE(NAME);


COMMIT;

