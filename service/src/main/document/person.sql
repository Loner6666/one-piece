/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : gmall

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 29/09/2020 15:33:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `gender` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '外号',
  `position` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期【格式：YYYY-MM-DD】',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, '蒙奇·D·路飞', '男', 19, '草帽小子', '草帽一伙船长', '2001-05-05', '东海·风车村', '2020-09-29 11:01:36');
INSERT INTO `person` VALUES (2, '罗罗诺亚·索隆', '男', 21, '海贼猎人', '东海海贼赏金猎人', '1999-11-11', '东海·霜月村', '2020-09-29 11:03:20');
INSERT INTO `person` VALUES (3, '娜美', '女', 20, '小贼猫', '草帽一伙航海士', '2020-07-03', '东海▪可可亚西村', '2020-09-29 11:04:28');
INSERT INTO `person` VALUES (4, '乌索普', '男', 19, 'GOD', '草帽一伙狙击手', '2001-04-01', '东海▪西罗普村', '2020-09-29 11:05:41');
INSERT INTO `person` VALUES (5, '山治', '男', 21, '黑足', '草帽一伙厨师', '1999-03-02', '北海', '2020-09-29 11:07:07');
INSERT INTO `person` VALUES (6, '托尼托尼·乔巴', '男', 17, '爱吃棉花糖的驯鹿', '草帽一伙船医', '2003-09-29', '伟大航路▪磁鼓岛（冬岛、樱花之国）', '2020-09-29 11:08:50');
INSERT INTO `person` VALUES (7, '妮可·罗宾', '女', 30, '恶魔之子', '草帽一伙考古学家', '1990-02-06', '西海▪奥哈拉岛（已灭）', '2020-09-29 11:10:17');
INSERT INTO `person` VALUES (8, '弗兰奇', '男', 36, '改造人', '草帽一伙船工', '1984-03-09', '南海', '2020-09-29 11:11:54');
INSERT INTO `person` VALUES (9, '布鲁克', '男', 90, '灵魂之王', '草帽一伙音乐家', '1910-04-03', '西海', '2020-09-29 11:12:56');
INSERT INTO `person` VALUES (10, '甚平', '男', 46, '海侠', '草帽一伙舵手', '1974-04-02', '鱼人岛', '2020-09-29 11:14:57');

SET FOREIGN_KEY_CHECKS = 1;
