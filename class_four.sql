DROP DATABASE IF EXISTS `gitchat_ssm_demo_db`;

CREATE DATABASE `gitchat_ssm_demo_db`;

USE `gitchat_ssm_demo_db`;

DROP TABLE IF EXISTS `tb_class_four`;

CREATE TABLE `tb_class_four` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `description` varchar(100) NOT NULL DEFAULT '''''' COMMENT '描述',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

LOCK TABLES `tb_class_four` WRITE;
/*!40000 ALTER TABLE `tb_class_four` DISABLE KEYS */;

INSERT INTO `tb_class_four` (`id`, `description`, `create_time`)
VALUES
  (1,'自己动手实现一个精美且实用的JavaWeb后台管理系统 达人课','2018-06-27 15:12:13');

/*!40000 ALTER TABLE `tb_class_four` ENABLE KEYS */;
UNLOCK TABLES;