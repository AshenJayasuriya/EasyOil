-- phpMyAdmin SQL Dump
-- version 3.5.8.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 28, 2013 at 12:35 PM
-- Server version: 5.5.34-0ubuntu0.13.04.1
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

-- --------------------------------------------------------

--
-- Table structure for table `Currency`
--

CREATE TABLE IF NOT EXISTS `Currency` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `type` varchar(10) NOT NULL,
  `usd_value` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `Currency`
--

INSERT INTO `Currency` (`id`, `name`, `type`, `usd_value`) VALUES
(1, 'Sri Lanka Rupee', 'LKR', 131),
(2, 'U.S. Dollar', 'USD', 1),
(3, 'Omani Rial', 'OMR', 0.35),
(4, 'Euro', 'EUR', 0.74);

-- --------------------------------------------------------

--
-- Table structure for table `News`
--

CREATE TABLE IF NOT EXISTS `News` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `cost` double NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `headline` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `timestmp` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `News`
--

INSERT INTO `News` (`id`, `content`, `cost`, `date`, `headline`, `user_id`, `timestmp`) VALUES
(1, 'The owners of private buses plying between Colombo and Kalutara are engaged in a strike action.\n\nThey protest against the time table stipulated by the SLTB.\n\nThey have warned that buses plying between Kalutra – Aluthgama and Kalutara.', 1000, NULL, '"Kalutara Colombo private bus strike" ', '1', '2013-11-27 12:27:44'),
(2, 'asdfsadfasdf', 120, NULL, 'asdfasdf', '1', '2013-11-28 12:26:06');

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
  `authorized` tinyint(1) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `user_Id` (`user_id`),
  KEY `username_2` (`username`),
  KEY `username_3` (`username`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `StdUser`
--

INSERT INTO `StdUser` (`user_id`, `first_name`, `last_name`, `e_mail`, `username`, `password`, `administrator`, `currency`, `authorized`) VALUES
(1, 'Amal', 'Gunadasa', 'Amal@gmail.com', 'asd', '202cb962ac59075b964b07152d234b70', 1, '2', 1),
(2, 'Blan', 'Kumara', 'Kumara@gmail.com', 'qwe', 'd81f9c1be2e08964bf9f24b15f0e4900', 1, '1', 1),
(3, 'kasun', 'kumara', 'kumara@gmail.com', 'qq', '6512bd43d9caa6e02c990b0a82652dca', 0, '1', 1),
(4, 'John', 'Smith', 'johnsmith@gmail.com', 'jsmith', 'e99a18c428cb38d5f260853678922e03', 0, '1', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
