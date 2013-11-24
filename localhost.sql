-- phpMyAdmin SQL Dump
-- version 3.5.8.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 24, 2013 at 10:08 PM
-- Server version: 5.5.32-0ubuntu0.13.04.1
-- PHP Version: 5.4.9-4ubuntu2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `easy_fuel`
--
CREATE DATABASE `easy_fuel` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `easy_fuel`;

-- --------------------------------------------------------

--
-- Table structure for table `News`
--

CREATE TABLE IF NOT EXISTS `News` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `cost` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `headline` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `timestmp` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `News`
--

INSERT INTO `News` (`id`, `content`, `cost`, `date`, `headline`, `user_id`, `timestmp`) VALUES
(1, 'go go not goyt ', '10222222', NULL, 'first newa again ', '1', '3913-11-10 10:10:10');

-- --------------------------------------------------------

--
-- Table structure for table `StdUser`
--

CREATE TABLE IF NOT EXISTS `StdUser` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `e_mail` varchar(30) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `administrator` tinyint(1) NOT NULL,
  `currency` varchar(5) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `user_Id` (`user_id`),
  KEY `username_2` (`username`),
  KEY `username_3` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `StdUser`
--

INSERT INTO `StdUser` (`user_id`, `first_name`, `last_name`, `e_mail`, `username`, `password`, `administrator`, `currency`) VALUES
(1, 'Amal', 'Gunadasa', 'Amal@gmail.com', 'asd', '123', 1, 'USD'),
(2, 'Blan', 'Kumara', 'Kumara@gmail.com', 'qwe', '345', 1, 'RS'),
(3, 'kasun', 'kumara', 'kumara@gmail.com', 'qq', '11', 0, 'Rs');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
