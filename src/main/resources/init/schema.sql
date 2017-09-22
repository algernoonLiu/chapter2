CREATE TABLE `customer` (
    `id` BIGINT(18) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) DEFAULT NULL,
    `contact` VARCHAR(255) DEFAULT null,
    `telephone` VARCHAR(255) DEFAULT null,
    `email` VARCHAR(255) DEFAULT NULL,
    `remark` TEXT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;