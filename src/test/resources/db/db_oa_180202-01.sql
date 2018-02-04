/*
 Navicat Premium Data Transfer

 Source Server         : oa系统连接
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : db_oa

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 02/02/2018 23:16:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_announcement
-- ----------------------------
DROP TABLE IF EXISTS `t_announcement`;
CREATE TABLE `t_announcement` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `author` varchar(50) DEFAULT NULL COMMENT '作者',
  `content` text COMMENT '内容',
  `desc` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` int(3) DEFAULT NULL COMMENT '状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `flag` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告表';

-- ----------------------------
-- Table structure for t_department
-- ----------------------------
DROP TABLE IF EXISTS `t_department`;
CREATE TABLE `t_department` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '备注',
  `type` int(3) DEFAULT NULL COMMENT '类型',
  `status` int(3) DEFAULT NULL COMMENT '状态',
  `flag` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Table structure for t_employee_communication
-- ----------------------------
DROP TABLE IF EXISTS `t_employee_communication`;
CREATE TABLE `t_employee_communication` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT,
  `employee_no` varchar(18) NOT NULL COMMENT '员工编号',
  `employee_id` bigint(18) DEFAULT NULL COMMENT '员工id',
  `type` int(3) DEFAULT NULL COMMENT '类型',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `desc` varchar(50) DEFAULT NULL COMMENT '备注',
  `relationship_type` int(3) DEFAULT NULL COMMENT '与员工关系类型',
  `sort_no` int(3) DEFAULT NULL,
  `flag` int(3) DEFAULT NULL COMMENT 'flag',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工通讯录表';

-- ----------------------------
-- Table structure for t_employee_info
-- ----------------------------
DROP TABLE IF EXISTS `t_employee_info`;
CREATE TABLE `t_employee_info` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `employee_no` varchar(18) NOT NULL COMMENT '员工编号',
  `name` varchar(20) DEFAULT NULL COMMENT '员工姓名',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `birth_year` varchar(10) DEFAULT NULL COMMENT '出生年份',
  `birth_month` varchar(10) DEFAULT NULL COMMENT '出生月份',
  `birth_day` varchar(10) DEFAULT NULL COMMENT '出生日期',
  `birth_date` date DEFAULT NULL COMMENT '出生日期',
  `join_date` datetime DEFAULT NULL COMMENT '入职日期',
  `leave_date` datetime DEFAULT NULL COMMENT '离职日期',
  `status` int(3) DEFAULT NULL COMMENT '员工状态',
  `flag` int(1) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工信息表';

-- ----------------------------
-- Table structure for t_power
-- ----------------------------
DROP TABLE IF EXISTS `t_power`;
CREATE TABLE `t_power` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) DEFAULT NULL COMMENT '权限名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '备注',
  `status` int(3) DEFAULT NULL COMMENT '状态',
  `sort_no` int(3) DEFAULT NULL COMMENT '序号',
  `flag` int(3) DEFAULT NULL COMMENT 'flag',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `status` int(3) DEFAULT NULL COMMENT '状态',
  `sort_no` int(3) DEFAULT NULL COMMENT '序号',
  `flag` int(3) DEFAULT NULL COMMENT 'flag',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for t_role_power_relations
-- ----------------------------
DROP TABLE IF EXISTS `t_role_power_relations`;
CREATE TABLE `t_role_power_relations` (
  `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` bigint(18) DEFAULT NULL COMMENT '角色id',
  `power_id` bigint(18) DEFAULT NULL COMMENT '权限id',
  `flag` int(3) DEFAULT NULL COMMENT 'flag',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限关系表';

SET FOREIGN_KEY_CHECKS = 1;
