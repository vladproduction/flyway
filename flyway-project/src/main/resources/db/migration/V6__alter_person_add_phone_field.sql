ALTER TABLE `flyway`.`person`
    ADD COLUMN `phone` VARCHAR(45) NULL DEFAULT '123-123' AFTER `age`;
