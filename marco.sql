/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50561
Source Host           : localhost:3306
Source Database       : marco

Target Server Type    : MYSQL
Target Server Version : 50561
File Encoding         : 65001

Date: 2019-12-30 10:48:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for etour_order
-- ----------------------------
DROP TABLE IF EXISTS `etour_order`;
CREATE TABLE `etour_order` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_name` varchar(32) DEFAULT NULL,
  `o_user` varchar(32) DEFAULT NULL,
  `o_simple_des` varchar(32) DEFAULT NULL,
  `o_price` double DEFAULT NULL,
  `o_time` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of etour_order
-- ----------------------------
INSERT INTO `etour_order` VALUES ('1', '马尔代夫', 'fs', '住的好花的少，三餐全含', '29998', '2019-11-12 10:59:30');
INSERT INTO `etour_order` VALUES ('2', '美国东海岸', 'fs', '羚羊峡谷,马蹄湾,星光大道,双奥莱,东西7大名城,世界名校,十七', '63996', '2019-11-12 11:47:12');
INSERT INTO `etour_order` VALUES ('3', '美国东海岸', 'fs', '羚羊峡谷,马蹄湾,星光大道,双奥莱,东西7大名城,世界名校,十七', '15999', '2019-11-12 20:52:47');
INSERT INTO `etour_order` VALUES ('4', '土耳其', 'fs', '图兹盐湖/番红花/伊堡自由活动/可升热气球/住洞穴', '12159', '2019-11-12 20:53:43');
INSERT INTO `etour_order` VALUES ('5', '西班牙+葡萄牙', 'fs', '巴塞2晚市区五星连住,高迪建筑,含6/7大官导,佛朗明哥舞', '27998', '2019-11-12 20:54:35');
INSERT INTO `etour_order` VALUES ('6', '海南三亚', 'fs', '三亚湾国际五星临海酒店，4500平泳池、室内外儿童乐园，直达沙滩', '5378', '2019-11-12 20:56:47');
INSERT INTO `etour_order` VALUES ('7', '土耳其', 'fs', '图兹盐湖/番红花/伊堡自由活动/可升热气球/住洞穴', '12159', '2019-11-12 20:56:53');
INSERT INTO `etour_order` VALUES ('8', '美国东海岸', 'fs', '羚羊峡谷,马蹄湾,星光大道,双奥莱,东西7大名城,世界名校,十七', '15999', '2019-11-12 20:57:02');
INSERT INTO `etour_order` VALUES ('9', '摩洛哥', 'fs', '探访四大皇城/骑骆驼赏沙漠落日/阿里之家烤全羊特色晚宴表演', '12999', '2019-11-12 20:57:09');
INSERT INTO `etour_order` VALUES ('10', '美国东海岸', 'fs', '羚羊峡谷,马蹄湾,星光大道,双奥莱,东西7大名城,世界名校,十七', '15999', '2019-12-29 15:31:22');
INSERT INTO `etour_order` VALUES ('12', '美国东海岸', 'cmy', '羚羊峡谷,马蹄湾,星光大道,双奥莱,东西7大名城,世界名校,十七', '31998', '2019-12-29 22:03:19');

-- ----------------------------
-- Table structure for etour_tour
-- ----------------------------
DROP TABLE IF EXISTS `etour_tour`;
CREATE TABLE `etour_tour` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tour_num` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `type` varchar(32) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `simple_des` varchar(32) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `people_num` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `save_path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of etour_tour
-- ----------------------------
INSERT INTO `etour_tour` VALUES ('1', '344e8421ecab43a793119370559b2a0c', '马尔代夫', '私家游', '14999', '住的好花的少，三餐全含', '★马代高性价比岛屿，包含早中晚三餐，1.8公里海岸线，网红拖尾沙滩，日落优质观赏点', '1', '5', '74995', '/etour/pic/344e8421ecab43a793119370559b2a0c.jpg');
INSERT INTO `etour_tour` VALUES ('2', '35563389223046cc800e265717ec793c', '美国东海岸', '家庭游', '15999', '羚羊峡谷,马蹄湾,星光大道,双奥莱,东西7大名城,世界名校,十七', '搭乘自由女神游船看尽纽约繁华，走进哈佛、麻省体验名校震撼；去马蹄湾、羚羊彩穴留影，去尼亚加拉瀑布听雷霆之声，去渔人码头感受海港情怀，更有拉斯维加斯不夜城等你来挥洒热情。', '1', '9', '143991', '/etour/pic/35563389223046cc800e265717ec793c.jpg');
INSERT INTO `etour_tour` VALUES ('3', 'd240bc4afab141e0bceeb6d2f2f3d072', '土耳其', '情侣游', '12159', '图兹盐湖/番红花/伊堡自由活动/可升热气球/住洞穴', '★伊斯坦布尔住国际五星，2晚卡帕连住增加热气球几率，其中1晚体验卡帕洞穴酒店 ★网红打卡费特西耶，D400沿海公路，卡帕地下城，图兹湖，番红花城', '1', '3', '36477', '/etour/pic/d240bc4afab141e0bceeb6d2f2f3d072.jpg');
INSERT INTO `etour_tour` VALUES ('4', '86ccd333db5d478fbb7cf1a16a1a98ec', '摩洛哥', '亲子游', '12999', '探访四大皇城/骑骆驼赏沙漠落日/阿里之家烤全羊特色晚宴表演', '四大皇城—拉巴特、马拉喀什、菲斯、梅克内斯一览无余，非洲好莱坞—瓦尔扎扎特带您进入不一样的电影世界，中式餐+当地餐+酒店自助餐，全方位体验当地美食文化', '1', '1', '12999', '/etour/pic/86ccd333db5d478fbb7cf1a16a1a98ec.jpg');
INSERT INTO `etour_tour` VALUES ('5', 'e7d9f90f5f9d49f1a6eefd8cdcee90c0', '新西兰-南北岛', '家庭游', '20599', '蒂卡坡观星小镇/冰川冰湖/萤火虫洞/温泉/爱歌顿牧场', '皇后镇2天3晚连住放肆去嗨+1晚库克山内国宝级酒店（住在风景里看风景），浪漫萤火虫洞，皇家爱歌顿牧场，饕餮美食！', '1', '0', '0', '/etour/pic/e7d9f90f5f9d49f1a6eefd8cdcee90c0.jpg');
INSERT INTO `etour_tour` VALUES ('6', '38ea1477751e4505a542e1e9eac90105', '西班牙+葡萄牙', '家庭游', '13999', '巴塞2晚市区五星连住,高迪建筑,含6/7大官导,佛朗明哥舞', '狂想大航海时代，乐在西葡，在巴塞罗那探寻灵动的高迪建筑，在双悬崖小镇（昆卡，龙达）感受人类挑战大自然的伟大创举，在塞维利亚看一场狂野热情的弗朗明哥舞……历史和艺术，美食和美景，带你一起体验经典', '1', '3', '41997', '/etour/pic/38ea1477751e4505a542e1e9eac90105.jpg');
INSERT INTO `etour_tour` VALUES ('7', '20d3ddebe4ae4824870ef85d788e0885', '德国+法国+瑞士+意大利', '家庭游', '16999', '少女峰，金色山口列车，双高铁，部分荷兰赏花', '西欧大全景，HU海航往返直飞，4-5星住宿，两段高速列车体验，梦境里的童话，德国深度。', '1', '0', '0', '/etour/pic/20d3ddebe4ae4824870ef85d788e0885.jpg');
INSERT INTO `etour_tour` VALUES ('8', '2f0dc9f71a34498b939fce9ab5dd5d05', '海南三亚', '亲子游', '2689', '三亚湾国际五星临海酒店，4500平泳池、室内外儿童乐园，直达沙滩', '★三亚湾国际五星一线海景酒店，步行3分钟至海滩，15分钟车程到市区，景点环绕 ★3000平海景大堂，10万平热带园林，4200平泳池，健身房、网球场、桌球室、乒乓球室齐全 ★567平“HOW FUN童乐汇”室内儿童乐园，专为不同年龄段儿童梦幻打造', '1', '2', '5378', '/etour/pic/2f0dc9f71a34498b939fce9ab5dd5d05.jpg');
INSERT INTO `etour_tour` VALUES ('9', '2de2d60bbea8459c90e6fc63e2a8acbd', '云南-昆明-大理-丽江-香格里拉', '情侣游', '2579', '邂逅海鸥精灵打卡天空之境,享暖冬温泉泡汤,玉龙雪山登顶', '云南滇西北地标景点一览无余，4大5A景点，石林，丽江古城，玉龙雪山大索，香格里拉普达措，拒绝小景点滥竽充数', '1', '0', '0', '/etour/pic/2de2d60bbea8459c90e6fc63e2a8acbd.jpeg');
INSERT INTO `etour_tour` VALUES ('10', '219a64c9be2d4d73882c583ef2617939', '山东曲阜三孔+泰山+济南趵突泉', '家庭游', '1122', '观封禅，说快书，打快板，充足游览时间，泰安市区舒适酒店', '❤含中华泰山封禅大典；让您充分享受心灵和视觉的体验； ❤圣城曲阜、五岳独尊、泉城济南，古城台儿庄，人文景点和自热景点完美融合，山东经典名胜全览。', '1', '0', '0', '/etour/pic/219a64c9be2d4d73882c583ef2617939.jpg');
INSERT INTO `etour_tour` VALUES ('12', '38b8123b37c443129fdb8ddb1b0dba63', '华东五市-苏州园林-杭州-乌镇', '亲子游', '2078', '国际五星酒店+西栅&拈花湾双客栈', '热门景点全包含，深度游览不再匆匆而过留遗憾 国际品牌五星酒店+乌镇西栅景区内+禅意小镇拈花湾客栈', '1', '0', '0', '/etour/pic/38b8123b37c443129fdb8ddb1b0dba63.jpg');
INSERT INTO `etour_tour` VALUES ('13', 'cd2d56ff927744a4ab2bc1455a4a9e2e', '日本东京-富士山-京都-奈良-大阪', '情侣游', '4569', '京都清水寺/奈良公园双古都/东京明治神宫/河口湖赏枫/岚山', '☆漫游京都清水寺，岚山嵯峨野竹林，祗园艺伎街，在奈良梅花鹿公园与小鹿来一张萌萌哒合影！ ☆东京人气景点--浅草寺、明治神宫、银座，感受东京的时尚潮流与浪漫！ ☆东京银座+富士山下御殿场奥特莱斯+大阪心斋桥商业街+综合免税店，满足您购物所需！', '1', '0', '0', '/etour/pic/cd2d56ff927744a4ab2bc1455a4a9e2e.jpg');
INSERT INTO `etour_tour` VALUES ('14', 'da59dfa8410b4643a0c6056cad058cc9', '塞班岛', '情侣游', '6499', '直飞塞班 卡诺亚主楼海景房 军舰岛/跳伞/跑车自驾/蓝洞潜水', '【交通】  往返程飞机票（含机场建设费和燃油附加税）  【接送服务】  机场与酒店之间接送机/站服务  【住宿】  卡诺亚主楼或同级  【用餐】  酒店含早餐  【签证】  塞班岛针对中国免签  【导游服务】  当地中文导游服务，自由活动期间除外  【赠送】  赠送北部环岛观光', '1', '0', '0', '/etour/pic/da59dfa8410b4643a0c6056cad058cc9.jpg');
INSERT INTO `etour_tour` VALUES ('15', '365cda9c0f424b34ac5c1406ccbe0e00', '马尔代夫莫凡彼岛', '亲子游', '15069', '新开六星，超强设计感，私人泳池，海上网床，水屋玻璃地板', '★免费非动力水上项目，巧克力时间内一小时免费巧克力供应 ★所有房型均带私人泳池和大型户外甲板 ★提供儿童俱乐部家庭活动，亲子设施丰富，家庭出游省心省力', '1', '0', '0', '/etour/pic/365cda9c0f424b34ac5c1406ccbe0e00.jpg');
INSERT INTO `etour_tour` VALUES ('16', '57e8f856f7f941999d368e30568890e3', '马尔代夫莉莉岛', '情侣游', '15709', '浮潜A级，可特惠升级水飞接送，丰富的出海活动，可选婚礼婚拍', '★上岛方式多种可选，内飞转快艇60分钟即可到达；水飞25分钟到达，选择水飞的客人可以享受VIP休息室；★ 免费租用潜水设备并可以免费参加无动力水上运动，不用花钱也可以愉快的玩耍；', '1', '0', '0', '/etour/pic/57e8f856f7f941999d368e30568890e3.jpg');
INSERT INTO `etour_tour` VALUES ('17', 'b343941e118847d8b45d3afefa9e67e9', '马尔代夫阿玛瑞岛', '情侣游', '12369', '两项出海，中文服务，浮潜A级，优惠升级AAI，4晚水屋更优惠', '★入住期间每人一次60分钟日落巡航&一次30分钟带领浮潜 ★超大无边泳池，设施完善，浮潜A级，全岛WIFI免费覆盖 ★免费使用健身中心，自带迷你小拖尾沙滩 ★房间设施都很丰富，搭配也很舒适，温馨而浪漫，低调', '1', '0', '0', '/etour/pic/b343941e118847d8b45d3afefa9e67e9.jpg');
INSERT INTO `etour_tour` VALUES ('18', 'aef95b168be14d2a96e953fa1c26453e', '毛里求斯+迪拜', '情侣游', '10989', '爱上双国，体验沙与水，5晚毛求，3晚迪拜，多样当地项目可自选', '原始海岛的蓝白纯净、繁华都市的五彩霓虹、无垠沙漠的漫天金黄，一程集满；浮潜看海豚，冲沙BBQ、跳伞，上天入海，海陆空都有；毛里求斯、迪拜入境免签证，一本护照简单出行。', '1', '0', '0', '/etour/pic/aef95b168be14d2a96e953fa1c26453e.jpg');
INSERT INTO `etour_tour` VALUES ('19', '421daa242004433eb545051ad6617964', '毛里求斯', '家庭游', '16359', '独栋泳池别墅房型/东海岸白沙滩/日出景观/中文服务，可定制行程', '❤东海岸四季度假村，全部独栋泳池别墅房型，私人泳池，私密性更佳。 ❤当地行程可以自己DIY搭配，可以选择经典环岛四日游行程，也可以去跳伞，潜水艇，坐直升机等。', '1', '0', '0', '/etour/pic/421daa242004433eb545051ad6617964.jpg');
INSERT INTO `etour_tour` VALUES ('20', 'b37335067d654dc587b26a21df89457b', '哈哈哈哈哈', '亲子游', '111000', '图兹盐湖/番红花/伊堡自由活动/可升热气球/住洞穴', '搭乘自由女神游船看尽纽约繁华，走进哈佛、麻省体验名校震撼；去马蹄湾、羚羊彩穴留影，去尼亚加拉瀑布听雷霆之声，去渔人码头感受海港情怀，更有拉斯维加斯不夜城等你来挥洒热情。', '0', '0', '0', '/etour/pic/b37335067d654dc587b26a21df89457b.jpg');

-- ----------------------------
-- Table structure for etour_user
-- ----------------------------
DROP TABLE IF EXISTS `etour_user`;
CREATE TABLE `etour_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `save_path` varchar(100) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of etour_user
-- ----------------------------
INSERT INTO `etour_user` VALUES ('1', 'fs', '1', '111111111@qq.com', '5555555555555555', '/etour/pic/c0aea4bf85fb409abe8eb4ee7e0280a0.png', '0');
INSERT INTO `etour_user` VALUES ('2', 'admin', '1', '111111111@qq.com', '4444444444444', '/etour/pic/c0aea4bf85fb409abe8eb4ee7e0280a0.png', '1');
INSERT INTO `etour_user` VALUES ('3', 'cs', '123456', '111111111@qq.com', '1111111111111', '/etour/pic/4a851f37dc6d4988ae4957cd2efb4c0d.jpg', '0');
INSERT INTO `etour_user` VALUES ('4', 'cmy', '123456', '2222222111@qq.com', '3333333333333', '/etour/pic/8ab77246300e4eea917bf227c957840d.jpeg', '0');
