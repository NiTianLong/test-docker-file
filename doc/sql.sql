CREATE TABLE `tbl_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `count` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `test`.`tbl_goods` (`id`, `name`, `count`) VALUES ('1', '保温杯one', '30');
