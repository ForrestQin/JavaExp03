CREATE TABLE `book1` (
  `id` int(11) NOT NULL,
  `bookName` varchar(255) DEFAULT NULL,
  `isbn` varchar(255) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`id`) ,
  UNIQUE KEY `bookName` (`bookName`)
) ENGINE=innodb AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;