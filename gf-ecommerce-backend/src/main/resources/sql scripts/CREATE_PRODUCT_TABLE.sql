CREATE TABLE `product` (
  `idproduct` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `product_price` decimal(6,2) NOT NULL,
  `product_stock` int(11) NOT NULL,
  PRIMARY KEY (`idproduct`),
  UNIQUE KEY `idproduct_UNIQUE` (`idproduct`)
) ENGINE=InnoDB AUTO_INCREMENT=1011 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;