/*
Navicat MySQL Data Transfer

Source Server         : ddtong_dev_120.78.172.114
Source Server Version : 50622
Source Host           : 120.78.172.114:3306
Source Database       : ddt

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2017-12-09 21:11:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL,
  `user_type` bigint(1) NOT NULL COMMENT '用户类型 1:消费者 2:商家 3:服务商 4:市管理中心 ',
  `act_state` varchar(1) NOT NULL DEFAULT '0' COMMENT '账户状态 0:正常 1:禁用',
  `amt_state` varchar(10) DEFAULT '1,2,3,4' COMMENT '资金状态,已","分开,如"1,2,3,4" 1:正常激励 2:可提现 3:可转赠 4:可消费',
  `total_fb` decimal(16,2) DEFAULT '0.00' COMMENT '累计分宝,该字段只增不减',
  `fb` decimal(16,2) DEFAULT '0.00' COMMENT '当前分宝,当前=可用+冻结',
  `ava_fb` decimal(16,2) DEFAULT '0.00' COMMENT '可用分宝',
  `freeze_fb` decimal(16,2) DEFAULT '0.00' COMMENT '冻结分宝',
  `total_red_integral` decimal(16,2) DEFAULT '0.00' COMMENT '累计红积分',
  `red_integral` decimal(16,2) DEFAULT '0.00' COMMENT '当前总红积分',
  `ava_red_integral` decimal(16,2) DEFAULT '0.00' COMMENT '可用红积分',
  `free_red_integral` decimal(16,2) DEFAULT '0.00' COMMENT '冻结红积分',
  `total_blue_integral` decimal(16,2) DEFAULT '0.00' COMMENT '累计蓝积分',
  `blue_integral` decimal(16,2) DEFAULT '0.00' COMMENT '当前总蓝积分',
  `ava_blue_integral` decimal(16,2) DEFAULT '0.00' COMMENT '可用蓝积分',
  `free_blue_integral` decimal(16,2) DEFAULT '0.00' COMMENT '冻结蓝积分',
  `total_green_integral` decimal(16,2) DEFAULT '0.00' COMMENT '累计绿积分',
  `green_integral` decimal(16,2) DEFAULT '0.00' COMMENT '当前总绿积分',
  `ava_green_integral` decimal(16,2) DEFAULT '0.00' COMMENT '可用绿积分',
  `free_green_integral` decimal(16,2) DEFAULT '0.00' COMMENT '冻结绿积分',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间,除跑批之外变更',
  `runbat_time` varchar(8) DEFAULT NULL COMMENT '跑批时间',
  `ava_fb_use` decimal(16,2) DEFAULT '0.00' COMMENT '当天参与激励的分宝',
  PRIMARY KEY (`id`),
  KEY `user_id_and_type` (`user_id`,`user_type`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='资金账户表';

-- ----------------------------
-- Table structure for t_area_info
-- ----------------------------
DROP TABLE IF EXISTS `t_area_info`;
CREATE TABLE `t_area_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `city_id` bigint(11) DEFAULT NULL,
  `area_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `area_code` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '区域编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3023 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='区域';

-- ----------------------------
-- Table structure for t_award_date
-- ----------------------------
DROP TABLE IF EXISTS `t_award_date`;
CREATE TABLE `t_award_date` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `pay_date` varchar(8) DEFAULT NULL COMMENT '交易日期,格式yyyyMMdd',
  `system_date` datetime DEFAULT NULL COMMENT '系统时间',
  `total_amt` decimal(20,2) DEFAULT '0.00' COMMENT '系统当日总消费金额',
  `custom_total_fb` decimal(20,2) DEFAULT '0.00' COMMENT '消费者分宝总数',
  `merchant_total_fb` decimal(20,2) DEFAULT '0.00' COMMENT '商家分宝总数',
  `custom_regulate` decimal(20,2) DEFAULT '0.00' COMMENT '消费者分宝单价,已调控后的值',
  `custom_not_regulate` decimal(20,2) DEFAULT '0.00' COMMENT '消费者分宝单价,未调控的值',
  `mer_regulate` decimal(20,2) DEFAULT '0.00' COMMENT '商家分宝单价,已调控的值',
  `mer_not_regulate` decimal(20,2) DEFAULT '0.00' COMMENT '商家分宝单价,未调控的值',
  `regulate_state` varchar(1) DEFAULT NULL COMMENT '调控状态 0:已调控 1:未调控',
  `total_discount_amt` decimal(20,2) DEFAULT '0.00' COMMENT '系统让利款金额',
  `use_discount_amt` decimal(20,2) DEFAULT '0.00' COMMENT '参与分配让利款金额',
  `diff_discount_amt` decimal(20,2) DEFAULT '0.00' COMMENT '调配资金池金额,总让利款-参与分配的让利款,如为正放入资金池,为负从资金池减去',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='激励时间';

-- ----------------------------
-- Table structure for t_award_rate
-- ----------------------------
DROP TABLE IF EXISTS `t_award_rate`;
CREATE TABLE `t_award_rate` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `custom_award` decimal(8,2) DEFAULT NULL COMMENT '消费者奖励',
  `merchant_award` decimal(8,2) DEFAULT NULL COMMENT '商家奖励',
  `custom_re_product` decimal(8,2) DEFAULT NULL COMMENT '消费者推荐产品奖励',
  `mer_re_custom` decimal(8,2) DEFAULT NULL COMMENT '商家推荐消费者奖励',
  `agent_re_mer` decimal(8,2) DEFAULT NULL COMMENT '服务商推荐商家奖励',
  `manager_center_award` decimal(8,2) DEFAULT NULL COMMENT '管理中心奖励',
  `fund_award` decimal(8,2) DEFAULT NULL COMMENT '扶贫基金奖励',
  `platform_award` decimal(8,2) DEFAULT NULL COMMENT '平台奖励',
  `pay_poundage` decimal(8,2) DEFAULT NULL COMMENT '支付手续费',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='奖励比例';

-- ----------------------------
-- Table structure for t_bank_info
-- ----------------------------
DROP TABLE IF EXISTS `t_bank_info`;
CREATE TABLE `t_bank_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(50) DEFAULT NULL COMMENT '银行名称',
  `bank_code` varchar(50) DEFAULT NULL COMMENT '银行编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='银行卡信息';

-- ----------------------------
-- Table structure for t_city_info
-- ----------------------------
DROP TABLE IF EXISTS `t_city_info`;
CREATE TABLE `t_city_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `province_id` bigint(11) DEFAULT NULL,
  `city_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `jian_pin` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简拼',
  `quan_pin` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '全拼',
  `is_hot` bigint(1) DEFAULT '0' COMMENT '是否热门 1是 0否',
  `status` bigint(1) DEFAULT '1' COMMENT '1-正常，0-删除',
  `area_code` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '城市编号',
  `sorts` bigint(11) DEFAULT '255' COMMENT '排序,值越大越在最后',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=397 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='城市';

-- ----------------------------
-- Table structure for t_custom
-- ----------------------------
DROP TABLE IF EXISTS `t_custom`;
CREATE TABLE `t_custom` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `phone` varchar(13) DEFAULT NULL COMMENT '手机/电话',
  `cid` varchar(18) DEFAULT NULL COMMENT '身份证',
  `password` varchar(100) DEFAULT NULL COMMENT '登录密码',
  `real_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `state` varchar(1) DEFAULT '0' COMMENT '状态 0:正常 1:停用',
  `source_uid` varchar(100) DEFAULT NULL COMMENT '来源Id,如:unionId,aliId',
  `source_type` varchar(1) DEFAULT NULL COMMENT '来源 1:微信 2:支付宝 3:QQ',
  `head_pic` varchar(200) DEFAULT NULL COMMENT '头像地址',
  `recommend_id` bigint(11) DEFAULT NULL COMMENT '推荐ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `pay_password` varchar(100) DEFAULT NULL COMMENT '支付密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60005002 DEFAULT CHARSET=utf8 COMMENT='消费者信息';

-- ----------------------------
-- Table structure for t_fb_log
-- ----------------------------
DROP TABLE IF EXISTS `t_fb_log`;
CREATE TABLE `t_fb_log` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL DEFAULT '0',
  `user_type` bigint(1) NOT NULL COMMENT '用户类型 1:消费者 2:商家',
  `fb` decimal(16,2) DEFAULT '0.00' COMMENT '当前分宝',
  `change_fb` decimal(16,2) DEFAULT '0.00' COMMENT '变更后分宝',
  `free_fb` decimal(16,2) DEFAULT '0.00' COMMENT '冻结分宝',
  `unfezz_fb` decimal(16,2) DEFAULT '0.00' COMMENT '解冻分宝',
  `act_logno` bigint(11) DEFAULT NULL COMMENT '资金流水ID',
  `trade_log` bigint(11) DEFAULT NULL COMMENT '交易流水',
  `operb_type` varchar(2) DEFAULT NULL COMMENT '操作大类 0:转入 2:转出 4:管理',
  `opers_type` varchar(2) DEFAULT NULL COMMENT '操作小类 01:消费转入 21:消亡 41:冻结分宝 42:解冻分宝',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分宝日志信息';

-- ----------------------------
-- Table structure for t_industry_info
-- ----------------------------
DROP TABLE IF EXISTS `t_industry_info`;
CREATE TABLE `t_industry_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `industry_name` varchar(50) DEFAULT NULL COMMENT '行业名称',
  `industry_icon` varchar(200) DEFAULT NULL COMMENT '行业图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='行业类型';

-- ----------------------------
-- Table structure for t_integral_log
-- ----------------------------
DROP TABLE IF EXISTS `t_integral_log`;
CREATE TABLE `t_integral_log` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL DEFAULT '0',
  `user_type` bigint(1) NOT NULL DEFAULT '1' COMMENT '用户类型 1:消费者 2:商家 3:服务商 4:管理中心',
  `operb_type` varchar(1) DEFAULT NULL COMMENT '操作大类 0:转入 2:转出 4:管理',
  `opers_type` varchar(2) DEFAULT NULL COMMENT '操作小类 01:激励转入 02:获赠转入 03:消费转入 04:推荐转入 05:产品推荐转入 21:提现 22:转赠 23:消费 24:管理费 41:冻结 42:解冻 43:开户 44:其他 ',
  `trade_amt` decimal(16,2) DEFAULT NULL COMMENT '交易金额',
  `fee_amt` decimal(16,2) DEFAULT NULL COMMENT '手续费',
  `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  `oper_id` bigint(11) DEFAULT NULL COMMENT '操作人',
  `oper_status` varchar(1) DEFAULT NULL COMMENT '操作状态 0:成功 1:失败 2:处理中',
  `trade_user_id` bigint(11) DEFAULT NULL COMMENT '交易方ID,如转出应为获赠人ID,转入应为转赠人ID',
  `old_integral` decimal(16,2) DEFAULT NULL COMMENT '变更前积分',
  `new_integral` decimal(16,2) DEFAULT NULL COMMENT '变更后积分',
  `integral` decimal(16,2) DEFAULT NULL COMMENT '当前操作红积分',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `integral_type` varchar(1) DEFAULT NULL COMMENT '积分类型 1:红积分 2:蓝积分 3:绿积分',
  PRIMARY KEY (`id`),
  KEY `idx_ust_Normal` (`user_id`,`user_type`),
  KEY `idx_ot_Normal` (`opers_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='积分日志信息';

-- ----------------------------
-- Table structure for t_integral_rate
-- ----------------------------
DROP TABLE IF EXISTS `t_integral_rate`;
CREATE TABLE `t_integral_rate` (
  `user_type` bigint(1) NOT NULL COMMENT '用户类型 1:消费者 2:商家 3:服务商 4:市管理中心',
  `red_integral_rate` decimal(8,2) DEFAULT '0.00' COMMENT '红积分奖励比例',
  `blue_integral_rate` decimal(8,2) DEFAULT '0.00' COMMENT '蓝积分奖励比例',
  `green_integral_rate` decimal(8,2) DEFAULT '0.00' COMMENT '绿积分奖励比例'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='积分比例';

-- ----------------------------
-- Table structure for t_mer_sales
-- ----------------------------
DROP TABLE IF EXISTS `t_mer_sales`;
CREATE TABLE `t_mer_sales` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) DEFAULT NULL COMMENT '用户编号',
  `sales_amt` decimal(20,2) DEFAULT '0.00' COMMENT '销售额',
  `profit_amt` decimal(20,2) DEFAULT '0.00' COMMENT '让利金额',
  `verify_date` datetime DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='商家日营收';

-- ----------------------------
-- Table structure for t_merchant
-- ----------------------------
DROP TABLE IF EXISTS `t_merchant`;
CREATE TABLE `t_merchant` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `phone` varchar(13) DEFAULT NULL COMMENT '手机/电话',
  `cid` varchar(18) DEFAULT NULL COMMENT '身份证',
  `password` varchar(50) DEFAULT NULL COMMENT '登录密码',
  `real_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `state` varchar(1) DEFAULT NULL COMMENT '状态',
  `source_uid` varchar(100) DEFAULT NULL COMMENT '来源Id,如:unionId,aliId',
  `source_type` varchar(1) DEFAULT NULL COMMENT '来源 1:微信 2:支付宝 3:QQ',
  `head_pic` varchar(200) DEFAULT NULL COMMENT '头像地址',
  `recommend_id` bigint(11) DEFAULT NULL COMMENT '推荐ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  `enterprise_name` varchar(60) DEFAULT NULL COMMENT '企业名称',
  `shop_name` varchar(100) DEFAULT NULL COMMENT '店铺名称',
  `industry_type` varchar(20) DEFAULT NULL COMMENT '行业',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `web_site` varchar(100) DEFAULT NULL COMMENT '网址',
  `province_id` bigint(11) DEFAULT NULL COMMENT '省',
  `city_id` bigint(11) DEFAULT NULL COMMENT '市',
  `area_id` bigint(11) DEFAULT NULL COMMENT '区',
  `longitude` varchar(15) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(15) DEFAULT NULL COMMENT '纬度',
  `enterprise_code` varchar(60) DEFAULT NULL COMMENT '统一信用代码',
  `legal_name` varchar(20) DEFAULT NULL COMMENT '负责人名称',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `business_license` varchar(200) DEFAULT NULL COMMENT '营业执照',
  `positive_idcard` varchar(200) DEFAULT NULL COMMENT '身份证正面',
  `negative_idcard` varchar(200) DEFAULT NULL COMMENT '身份证反面',
  `logo` varchar(200) DEFAULT NULL COMMENT '企业Logo/门头照',
  `main_business` varchar(500) DEFAULT NULL COMMENT '主营业务',
  `pay_password` varchar(100) DEFAULT NULL COMMENT '支付密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=70005001 DEFAULT CHARSET=utf8 COMMENT='商家信息表';

-- ----------------------------
-- Table structure for t_orders
-- ----------------------------
DROP TABLE IF EXISTS `t_orders`;
CREATE TABLE `t_orders` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `custom_id` bigint(11) DEFAULT NULL COMMENT '消费者id',
  `merchant_id` bigint(11) DEFAULT NULL COMMENT '商家用户id',
  `order_no` varchar(25) DEFAULT NULL COMMENT '订单号',
  `order_money` decimal(16,2) DEFAULT '0.00' COMMENT '商品价格',
  `order_ratio` smallint(4) DEFAULT '0' COMMENT '订单让利系数(不含%)',
  `state` smallint(1) DEFAULT NULL COMMENT '订单状态 1让利款待审核 2让利款审核通过 3让利款审核未通过 4撤单 5无效',
  `profit_money` decimal(16,2) DEFAULT '0.00' COMMENT '应让利金额',
  `real_profitmoney` decimal(16,2) DEFAULT '0.00' COMMENT '实付让利金额',
  `custom_fb` decimal(16,2) DEFAULT '0.00' COMMENT '消费者获得的分宝',
  `merchant_fb` decimal(16,2) DEFAULT '0.00' COMMENT '商家获得的分宝',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `check_time` datetime DEFAULT NULL COMMENT '审核时间',
  `check_userid` bigint(11) DEFAULT NULL COMMENT '审核人id',
  `remark` varchar(200) DEFAULT NULL COMMENT '审核备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for t_province_info
-- ----------------------------
DROP TABLE IF EXISTS `t_province_info`;
CREATE TABLE `t_province_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `province_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `area_code` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '省份编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='省份';

-- ----------------------------
-- Table structure for t_run_bat
-- ----------------------------
DROP TABLE IF EXISTS `t_run_bat`;
CREATE TABLE `t_run_bat` (
  `bat_date` varchar(8) DEFAULT NULL COMMENT '跑批日期',
  `bat_code` varchar(50) DEFAULT NULL COMMENT '批处理名称',
  `bat_type` varchar(2) DEFAULT NULL COMMENT '跑批类型 1:计算当日激励分宝 2:统计商家日营业额 3:计算商家营业额峰值 4:统计消费者推荐产品奖励比例 5:计算消费者分宝和商家分宝价值 6:分佣 7:奖励消费者推荐产品 8:奖励消费者分宝 9:奖励商家分宝',
  `bat_state` varchar(1) DEFAULT NULL COMMENT '跑批状态 0:已成功跑批 1:跑批失败 2:初始化',
  `bat_desc` varchar(100) DEFAULT NULL COMMENT '跑批描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='跑批类型统计表';

-- ----------------------------
-- Table structure for t_sys_act_log
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_act_log`;
CREATE TABLE `t_sys_act_log` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `sys_user_id` bigint(11) DEFAULT NULL COMMENT '系统账户id',
  `operb_type` varchar(1) DEFAULT NULL COMMENT '操作大类 0:转入 2:转出',
  `opers_type` varchar(2) DEFAULT NULL COMMENT '操作小类  03:让利款 21:小数点结余 22:扶贫基金 23:平台运营 24:奖励 25:激励 26:税',
  `trade_amt` decimal(20,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统账户日志信息';

-- ----------------------------
-- Table structure for t_sys_config
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_config`;
CREATE TABLE `t_sys_config` (
  `config_key` varchar(30) DEFAULT NULL COMMENT '字典key',
  `config_val` varchar(100) DEFAULT NULL COMMENT '字典值',
  `config_desc` varchar(200) DEFAULT NULL COMMENT '字典描述',
  `config_state` varchar(1) DEFAULT NULL COMMENT '字典状态',
  `config_group` varchar(30) DEFAULT NULL COMMENT '字典组'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统配置信息';

-- ----------------------------
-- Table structure for t_system_account
-- ----------------------------
DROP TABLE IF EXISTS `t_system_account`;
CREATE TABLE `t_system_account` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `us_name` varchar(50) DEFAULT NULL COMMENT '系统英文账户名称',
  `zh_name` varchar(100) DEFAULT NULL COMMENT '系统中文账户名称',
  `total_amt` decimal(20,2) DEFAULT '0.00' COMMENT '累计总金额,只增不减',
  `amt` decimal(20,2) DEFAULT '0.00' COMMENT '当前金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统账户信息';

-- ----------------------------
-- Table structure for t_team_award
-- ----------------------------
DROP TABLE IF EXISTS `t_team_award`;
CREATE TABLE `t_team_award` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `index_start` bigint(10) DEFAULT NULL COMMENT '起始值',
  `index_end` bigint(10) DEFAULT NULL COMMENT '结束值',
  `rate` decimal(8,3) DEFAULT NULL COMMENT '比例',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='团队奖励配置信息';

-- ----------------------------
-- Table structure for t_user_bank
-- ----------------------------
DROP TABLE IF EXISTS `t_user_bank`;
CREATE TABLE `t_user_bank` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL COMMENT '用户id',
  `user_type` bigint(1) DEFAULT NULL COMMENT '用户类型 1:消费者 2:商家 3:服务商 4:管理中心',
  `bank_name` varchar(50) DEFAULT NULL COMMENT '银行名称',
  `bank_address` varchar(200) DEFAULT NULL COMMENT '银行支行信息',
  `card_num` varchar(25) DEFAULT NULL COMMENT '银行卡卡号',
  `card_name` varchar(100) DEFAULT NULL COMMENT '持卡人姓名',
  `card_mobile` varchar(15) DEFAULT NULL COMMENT '银行卡预留手机号',
  `valid_year` varchar(4) DEFAULT NULL COMMENT '信用卡有效日期的年份:YY',
  `valid_month` varchar(2) DEFAULT NULL COMMENT '信用卡有效日期的月份:MM',
  `safe_code` varchar(7) DEFAULT NULL COMMENT '信用卡背面的安全码:3位',
  `cid` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `card_type` varchar(1) DEFAULT NULL COMMENT '卡类型 1:银行卡 2:信用卡',
  `state` varchar(1) DEFAULT NULL COMMENT '状态 0:开启 1:关闭',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户银行绑定信息';

-- ----------------------------
-- Table structure for t_version_info
-- ----------------------------
DROP TABLE IF EXISTS `t_version_info`;
CREATE TABLE `t_version_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `version_code` int(11) DEFAULT NULL,
  `version_no` varchar(30) DEFAULT NULL COMMENT '版本号',
  `update_version_no` varchar(30) DEFAULT NULL COMMENT '要替换的版本号',
  `update_content` varchar(200) DEFAULT NULL COMMENT '更新内容',
  `version_url` varchar(200) DEFAULT NULL COMMENT '下载地址',
  `state` int(1) DEFAULT NULL COMMENT '1强制更新 0推荐更新',
  `create_time` datetime DEFAULT NULL,
  `client` int(1) DEFAULT NULL COMMENT '1用户端 2商户端',
  `client_type` varchar(50) DEFAULT NULL COMMENT 'IOS 或者 ANDROID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='版本控制信息';

-- ----------------------------
-- Table structure for t_withdraw
-- ----------------------------
DROP TABLE IF EXISTS `t_withdraw`;
CREATE TABLE `t_withdraw` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(16) NOT NULL,
  `user_type` bigint(1) NOT NULL COMMENT '用户类型 1:消费者 2:商家 3:服务商 4:管理中心',
  `withdraw_logno` varchar(20) NOT NULL COMMENT '提现流水号',
  `withdraw_type` varchar(1) DEFAULT NULL COMMENT '提现类型 1:积分 2:货款',
  `withdraw_num` decimal(16,2) DEFAULT NULL COMMENT '提现数量(金额)',
  `fee_amt` decimal(16,2) DEFAULT NULL COMMENT '手续费',
  `real_amt` decimal(16,2) DEFAULT NULL COMMENT '实际到账数量',
  `bank_card_num` bigint(50) DEFAULT NULL COMMENT '银行卡号',
  `bank_card_name` varchar(20) DEFAULT NULL COMMENT '收款人名称',
  `bank_name` varchar(20) DEFAULT NULL COMMENT '银行名称',
  `verify_state` varchar(1) DEFAULT NULL COMMENT '状态 0:审核通过 1:审核中 2:审核失败',
  `pay_state` varchar(1) DEFAULT NULL COMMENT '支付状态 0:已支付 1:处理中 2:未支付 3:支付失败',
  `verify_time` datetime DEFAULT NULL COMMENT '审核时间',
  `verify_user_id` bigint(11) DEFAULT NULL,
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `third_logno` varchar(30) DEFAULT NULL COMMENT '第三方流水号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='提现记录';

-- ----------------------------
-- Table structure for t_ysh_user
-- ----------------------------
DROP TABLE IF EXISTS `t_ysh_user`;
CREATE TABLE `t_ysh_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用于系统测试的表',
  `user_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


CREATE TABLE `t_user_login_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `clientId` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '终端应用 ClientApplicationEnum',
  `terminalType` int(2) NOT NULL COMMENT '客户端类型 TerminalTypeEnum',
  `userType` int(2) NOT NULL COMMENT '用户类型 UserTypeEnum',
  `userId` bigint(11) NOT NULL COMMENT '用户id',
  `bsDeviceId` varchar(36) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '设备号',
  `loginState` int(2) NOT NULL COMMENT '登录状态：0-未登录，1-已登录',
  `bsIsLocked` int(2) NOT NULL COMMENT '是否锁定用户（当天内登录错误5次锁定该用户）：0-否，1-是',
  `loginErrorNum` int(2) NOT NULL COMMENT '当天内登录错误次数',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `lastLoginTime` datetime NOT NULL COMMENT '最后登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户登录信息';
