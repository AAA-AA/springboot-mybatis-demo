DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT "",
  `age` int(11) NOT NULL DEFAULT 0,
  `password` varchar(200) NOT NULL DEFAULT "",
  `ctime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0为正常，1为删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表-demo';
-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`(name,age,password) VALUES ('Ren', '24', 'wwwwww');