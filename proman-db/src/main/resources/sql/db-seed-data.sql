-- Copyright 2018-2019, https://beingtechie.io

-- Script: db-seed.sql
-- Description: Setup seed data that is essential to bring up applications in running state.
-- Version: 1.0
-- Author: Thribhuvan Krishnamurthy



INSERT INTO proman.ROLES (ID, UUID, NAME, DESCRIPTION, ACTIVE, CREATED_BY)
		VALUES
		(1, 101, 'Administrator', 'Administrator', true, CURRENT_USER),
		(2, 102, 'Project Manager', 'Project Manager', true, CURRENT_USER),
		(3, 103, 'Architect', 'Technical Architect', true, CURRENT_USER),
		(4, 104, 'Team Leader', 'Team Leader', true, CURRENT_USER),
		(5, 105, 'Team Member', 'Team Member', true, CURRENT_USER);

