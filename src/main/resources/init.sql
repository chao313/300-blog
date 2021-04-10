/*
 Navicat Premium Data Transfer

 Source Server         : mysql_local
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : docker2

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 18/02/2020 11:30:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_author
-- ----------------------------
DROP TABLE IF EXISTS `t_author`;
CREATE TABLE `t_author` (
  `id` int(10) NOT NULL,
  `QQ` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'QQ',
  `we_chat` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '微信',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='站长信息';

-- ----------------------------
-- Records of t_author
-- ----------------------------
BEGIN;
INSERT INTO `t_author` VALUES (1, '2942200183', 'chaoone1');
COMMIT;

-- ----------------------------
-- Table structure for t_blog
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog` (
  `id` int(20) NOT NULL,
  `title` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '博客标题',
  `img` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '博客的图片',
  `time` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '博客时间',
  `type` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '博客类别',
  `look_sum` int(10) DEFAULT NULL COMMENT '博客浏览量',
  `content` text COLLATE utf8mb4_bin COMMENT '博客内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_blog
-- ----------------------------
BEGIN;
INSERT INTO `t_blog` VALUES (1, '陋室铭', '/demomaster/ResourceController/preByFileName?fileName=blog1.jpg', '2020-02-16 16:23:34', '文言文', 100, '山不在高，有仙则名。水不在深，有龙则灵。斯是陋室，惟吾德馨。苔痕上阶绿，草色入帘青。谈笑有鸿儒，往来无白丁。可以调素琴，阅金经。无丝竹之乱耳，无案牍之劳形。南阳诸葛庐，西蜀子云亭。孔子云：何陋之有？');
INSERT INTO `t_blog` VALUES (2, '爱莲说', '/demomaster/ResourceController/preByFileName?fileName=blog2.jpg', '2019-02-17', '文言文', 200, '水陆草木之花，可爱者甚蕃。晋陶渊明独爱菊。自李唐来，世人甚爱牡丹。予独爱莲之出淤泥而不染，濯清涟而不妖，中通外直，不蔓不枝，香远益清，亭亭净植，可远观而不可亵玩焉。(甚爱 一作：盛爱)  　　予谓菊，');
INSERT INTO `t_blog` VALUES (3, '水调歌头·明月几时有', '/demomaster/ResourceController/preByFileName?fileName=blog3.jpg', '2018-12-12 10:10:30', '宋词', 344, '丙辰中秋，欢饮达旦，大醉，作此篇，兼怀子由。  明月几时有？把酒问青天。不知天上宫阙，今夕是何年。我欲乘风归去，又恐琼楼玉宇，高处不胜寒。起舞弄清影，何似在人间。(何似 一作：何时；又恐 一作：惟 /');
INSERT INTO `t_blog` VALUES (5, '应天长·条风布暖', '/demomaster/ResourceController/preByFileName?fileName=blog4.jpg', '2019-01-30 12:30:01', '唐诗', 300, '条风布暖，霏雾弄晴，池台遍满春色。正是夜堂无月，沉沉暗寒食。梁间燕，前社客。似笑我、闭门愁寂。乱花过，隔院芸香，满地狼藉。 长记那回时，邂逅相逢，郊外驻油壁。又见汉宫传烛，飞烟五侯宅。青青草，迷路陌。');
INSERT INTO `t_blog` VALUES (7, '将进酒', '/demomaster/ResourceController/preByFileName?fileName=blog6.jpg', '2019-03-04 14:30:30', '唐诗', 999, '君不见，黄河之水天上来，奔流到海不复回。 君不见，高堂明镜悲白发，朝如青丝暮成雪。 人生得意须尽欢，莫使金樽空对月。 天生我材必有用，千金散尽还复来。 烹羊宰牛且为乐，会须一饮三百杯。 岑夫子，丹丘生');
INSERT INTO `t_blog` VALUES (12, '四块玉闲适', '	/demomaster/ResourceController/preByFileName?fileName=blog12.jpg', '2019-03-04 12:34:33', '元曲', 234, '适意行，安心坐，渴时饮饥时餐醉时歌，困来时就向莎茵卧。日月长，天地阔，闲快活！  旧酒投，新醅泼，老瓦盆边笑呵呵，共山僧野叟闲吟和。他出一对鸡，我出一个鹅，闲快活！  意马收，心猿锁，跳出红尘恶风波，');
INSERT INTO `t_blog` VALUES (13, '成年人的讨厌是一种默不作声', '/demomaster/ResourceController/preByFileName?fileName=blog13.jpg', '2020-01-13 23:30:44', '随想', 39, '成年人之间的友谊，不经意就被人伤了心，心里面厌烦得要命，要不要大吵一顿表示绝交？成人年的感情也是脆弱的，付出得不到回报，背叛欺骗伤透心，要不要和那人争吵表明态度？生活工作中遇到讨厌的人，怎么做才合适？');
COMMIT;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '昵称',
  `email` varchar(30) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '邮箱',
  `content` text COLLATE utf8mb4_bin COMMENT '评论内容',
  `blong_blog_id` int(30) DEFAULT NULL COMMENT '所属blog',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='博客评论';

-- ----------------------------
-- Records of t_comment
-- ----------------------------
BEGIN;
INSERT INTO `t_comment` VALUES (1, '1', '1', '1', 1, NULL);
INSERT INTO `t_comment` VALUES (2, '1', '1', '1', 1, NULL);
INSERT INTO `t_comment` VALUES (3, '潮的', '潮的', '潮的', 1, NULL);
INSERT INTO `t_comment` VALUES (4, '不错内存', '不错内存', '不错内存', 1, NULL);
INSERT INTO `t_comment` VALUES (5, '1', '1', '1', 12, NULL);
INSERT INTO `t_comment` VALUES (6, '1', '1', '1', 3, NULL);
COMMIT;

-- ----------------------------
-- Table structure for t_pic
-- ----------------------------
DROP TABLE IF EXISTS `t_pic`;
CREATE TABLE `t_pic` (
  `id` int(11) NOT NULL,
  `pic_path` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '图片路径',
  `alt` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '图片提示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='存放轮转图片的路径';

-- ----------------------------
-- Records of t_pic
-- ----------------------------
BEGIN;
INSERT INTO `t_pic` VALUES (1, '/demomaster/ResourceController/preByFileName?fileName=hpic1762.jpg', 'null');
INSERT INTO `t_pic` VALUES (2, '/demomaster/ResourceController/preByFileName?fileName=hpic1886.jpg', '测试');
COMMIT;

-- ----------------------------
-- Table structure for t_statistics
-- ----------------------------
DROP TABLE IF EXISTS `t_statistics`;
CREATE TABLE `t_statistics` (
  `id` int(20) NOT NULL,
  `total` int(20) DEFAULT NULL COMMENT '日志总数',
  `run_time` int(20) DEFAULT NULL COMMENT '网站运行时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='统计信息';

-- ----------------------------
-- Records of t_statistics
-- ----------------------------
BEGIN;
INSERT INTO `t_statistics` VALUES (1, 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for t_title
-- ----------------------------
DROP TABLE IF EXISTS `t_title`;
CREATE TABLE `t_title` (
  `id` int(10) NOT NULL,
  `title` varchar(200) COLLATE utf8mb4_bin NOT NULL COMMENT '栏目名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_title
-- ----------------------------
BEGIN;
INSERT INTO `t_title` VALUES (2, '随想');
INSERT INTO `t_title` VALUES (4, '文言文');
INSERT INTO `t_title` VALUES (6, '唐诗');
INSERT INTO `t_title` VALUES (7, '散文');
INSERT INTO `t_title` VALUES (9, '宋词');
INSERT INTO `t_title` VALUES (10, '元曲');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
