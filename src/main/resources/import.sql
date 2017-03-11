CREATE TABLE IF NOT EXISTS `proxy` (
  `ID` int auto_increment,
  `GMT_CREATE` datetime,
  `GMT_MODIFIED` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `IP` varchar(64),
  `PORT` int default 0,
  `PATH` varchar(64) COLLATE utf8_bin,
  `CLUSTER_ID` int default 0,
  PRIMARY KEY (`ID`),
  UNIQUE KEY (`IP`, `PORT`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin ;

CREATE TABLE IF NOT EXISTS `cluster` (
  `ID` int auto_increment,
  `GMT_CREATE` datetime,
  `GMT_MODIFIED` timestamp default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `CLUSTER_NAME` varchar(64) COLLATE utf8_bin,
  `COMMENT` varchar(256) COLLATE utf8_bin,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `CLUSTER_NAME` (`CLUSTER_NAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin ;

