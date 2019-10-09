CREATE TABLE `new_schema071019`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `car model` VARCHAR(45) NOT NULL,
  `car number` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `car number_UNIQUE` (`car number` ASC) VISIBLE);