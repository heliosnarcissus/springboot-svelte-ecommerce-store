CREATE TABLE `basketitem` (
  `basketitemid` int(11) NOT NULL AUTO_INCREMENT,
  `basketid` int(45) NOT NULL,
  `itemid` int(45) NOT NULL,
  PRIMARY KEY (`basketitemid`),
  UNIQUE KEY `basketitemid_UNIQUE` (`basketitemid`),
  KEY `itemid` (`itemid`),
  KEY `basketid` (`basketid`),
  CONSTRAINT `basketitem_ibfk_1` FOREIGN KEY (`itemid`) REFERENCES `product` (`idproduct`),
  CONSTRAINT `basketitem_ibfk_2` FOREIGN KEY (`basketid`) REFERENCES `mybasket` (`basketid`),
  CONSTRAINT `basketitem_ibfk_3` FOREIGN KEY (`basketid`) REFERENCES `mybasket` (`basketid`)
) ENGINE=InnoDB AUTO_INCREMENT=143 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
