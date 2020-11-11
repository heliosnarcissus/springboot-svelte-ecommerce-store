CREATE TABLE `mybasket` (
  `basketid` int(11) NOT NULL AUTO_INCREMENT,
  `basketholder` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`basketid`),
  UNIQUE KEY `basketid_UNIQUE` (`basketid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;