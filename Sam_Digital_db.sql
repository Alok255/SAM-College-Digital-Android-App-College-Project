
-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 09, 2018 at 08:24 AM
-- Server version: 10.1.24-MariaDB
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `u714338846_samdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `admin` text NOT NULL,
  `upass` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `admin`, `upass`) VALUES
(2, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `alok`
--

CREATE TABLE IF NOT EXISTS `alok` (
  `enroll` int(11) NOT NULL,
  `present` int(11) NOT NULL,
  `absent` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `anurag`
--

CREATE TABLE IF NOT EXISTS `anurag` (
  `enrollment` varchar(151) NOT NULL,
  `present` varchar(15) NOT NULL,
  `absent` varchar(14) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `application`
--

CREATE TABLE IF NOT EXISTS `application` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `lenrollment` text NOT NULL,
  `form` text NOT NULL,
  `to` text NOT NULL,
  `sub` text NOT NULL,
  `name` text NOT NULL,
  `date` text NOT NULL,
  `pending` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `application`
--

INSERT INTO `application` (`id`, `lenrollment`, `form`, `to`, `sub`, `name`, `date`, `pending`) VALUES
(5, '0188cs141047', 'Alok', 'Sir', 'Project', 'Shatrughna Kumar', '2017-04-24', 'Approvals'),
(6, '0188cs141003', 'Hello', 'Sir', 'Model', 'Alok Raj Singh', '2017-12-22', 'pending');

-- --------------------------------------------------------

--
-- Table structure for table `ashish`
--

CREATE TABLE IF NOT EXISTS `ashish` (
  `enroll` int(11) NOT NULL,
  `present` int(11) NOT NULL,
  `absent` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `campus`
--

CREATE TABLE IF NOT EXISTS `campus` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `cname` text NOT NULL,
  `equalification` text NOT NULL,
  `location` text NOT NULL,
  `job_role` text NOT NULL,
  `job_discription` text NOT NULL,
  `bracnch` text NOT NULL,
  `data` text NOT NULL,
  `time` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `campus`
--

INSERT INTO `campus` (`id`, `cname`, `equalification`, `location`, `job_role`, `job_discription`, `bracnch`, `data`, `time`) VALUES
(4, 'HCL', 'BE', 'Bhopal', 'Developer', 'SW Developer', 'CSE', '2017-02-07', '22:21'),
(5, 'HCL', 'BE', 'Bhopal', 'Developer', 'SW Developer', 'CSE', '2017-02-07', '22:21'),
(6, 'HCL', 'BE', 'Bhopal', 'Developer', 'Android Developer', 'CSE', '2017-02-28', '22:28'),
(7, 'HCL', 'BE', 'Bhopal', 'Developer', 'Android & WEB Developer', 'CSE', '2017-02-28', '22:28'),
(8, 'Software Company  ', 'BE', 'Bhopal', 'Engg', 'Engg ', 'ME', '2017-10-02', '02:22'),
(9, 'Software Company  ', 'BE', 'Bhopal', 'Engg', 'Engg ', 'ME', '2017-10-02', '02:22'),
(10, 'HP', 'BE', 'Bhopal', 'Softwaer', 'Software Developer', 'CSE', '2015-02-01', '10:10');

-- --------------------------------------------------------

--
-- Table structure for table `degree`
--

CREATE TABLE IF NOT EXISTS `degree` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` text NOT NULL,
  `dob` text NOT NULL,
  `address` text NOT NULL,
  `email` text NOT NULL,
  `mobile` text NOT NULL,
  `degree` text NOT NULL,
  `pic` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `degree`
--

INSERT INTO `degree` (`id`, `name`, `dob`, `address`, `email`, `mobile`, `degree`, `pic`) VALUES
(1, 'Sir', '1987-01-01', 'Bhopal', 'sir@gmail.com', '9876543218', 'Degree', 'aicon.png'),
(4, 'Sir2', '1988-10-01', 'Bhopal', 'sir2@gmsil.com', '9876541589', 'Phd', 'thinking.png');

-- --------------------------------------------------------

--
-- Table structure for table `file`
--

CREATE TABLE IF NOT EXISTS `file` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `fname` text NOT NULL,
  `fdate` text NOT NULL,
  `file` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `file`
--

INSERT INTO `file` (`id`, `fname`, `fdate`, `file`) VALUES
(7, 'sdfs', 'Sun-Apr-2017', 'coffee-iphone-laptop-notebook1.jpg'),
(10, 'File Test', 'Tue-Apr-2017', 'Computer Network PPT.pptx'),
(11, 'Video', 'Wed-Apr-2017', 'vlc-record-2016-11-05-01h49m22s-RSY-Encoder +923004626651-.ts'),
(12, 'n ksk', 'Wed-Apr-2017', '46.CustomList.apk'),
(13, ' cn kxjncxkjnjk', 'Wed-Apr-2017', 'vlc-record-2016-11-05-01h51m13s-RSY-Encoder +923004626651-.ts'),
(14, 'XNIAInk', 'Wed-Apr-2017', 'Mere Rashke Qamar-(Mr-Jatt.com).mp3'),
(15, 'Text Video', 'Wed-Apr-2017', '17132747_508739012847437_2210638728316059648_n.mp4'),
(16, 'gffghfg', 'Wed-Apr-2017', '17132747_508739012847437_2210638728316059648_n.mp4'),
(17, 'vfhgb', 'Wed-Apr-2017', '14733.mp4'),
(18, 'HEloo 32534', 'Thu-Apr-2017', '152. BKWSU_HIndi-English_Murli_Glossary.pdf'),
(19, 'Hello Student', 'Sun-Apr-2017', 'A REVIEW PAPER ABOUT.docx'),
(20, 'CN PPT', 'Wed-Apr-2017', 'laptop.png');

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

CREATE TABLE IF NOT EXISTS `notice` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `sub` text NOT NULL,
  `date` text NOT NULL,
  `details` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`id`, `sub`, `date`, `details`) VALUES
(2, 'Alok2', 'Sun-Apr-2017', 'sdvsdvsdvdsvdsvdsvds'),
(4, 'Alok2', 'Sun-Apr-2017', 'sdvsdvsdvdsvdsvdsvds'),
(5, 'Model Making', 'Tue-Apr-2017', 'sdcvasvsdhjbsdjsd'),
(6, 'Rajeev', 'Fri-Apr-2017', 'vdfkmjdsvnsjldvsdvds'),
(8, 'Model ', 'Wed-Apr-2017', 'Students Model Making'),
(9, 'Model ', 'Wed-Apr-2017', 'Students Model Making');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `sname` text NOT NULL,
  `sdate` text NOT NULL,
  `sadd` text NOT NULL,
  `semail` text NOT NULL,
  `senrolmentno` varchar(200) NOT NULL,
  `spass` text NOT NULL,
  `spic` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=35 ;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `sname`, `sdate`, `sadd`, `semail`, `senrolmentno`, `spass`, `spic`) VALUES
(26, 'Alok Raj Singh', '20/02/1996', 'Bhopal', 'chahat@gmail.com', '0188cs141003', '12345', 'aa (2).jpg'),
(31, 'Shatrughna Kumar', '2017-02-02', 'Bhopal', 'shatru@gmail.com', '0188cs141047', '12345', 'aaa copy.jpg'),
(32, 'Shatrughna Kumar', '1996-10-10', 'Bhopal', 'alokrajsingh255@gmail.com', '0188cs141049', '12345', 'BeautyPlus_20170404093014_fast.jpg'),
(33, 'Rajeev', '2007-10-02', 'Bhopal', 'alok@gmail.com', '0188cs141038', '12345', 'Capture.PNG'),
(34, 'Ravindra', '1998-10-01', 'Bhopal', 'ravi@gmail.com', '0188cs141039', '12345', 'IMG_20170328_110106.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE IF NOT EXISTS `subject` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `sname` text NOT NULL,
  `tname` text NOT NULL,
  `sem` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`id`, `sname`, `tname`, `sem`) VALUES
(1, 'SW CSE 603', 'CN', '6th');

-- --------------------------------------------------------

--
-- Table structure for table `tb_attendance`
--

CREATE TABLE IF NOT EXISTS `tb_attendance` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `subname` text NOT NULL,
  `date` text NOT NULL,
  `time` text NOT NULL,
  `studentname` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `tb_attendance`
--

INSERT INTO `tb_attendance` (`id`, `subname`, `date`, `time`, `studentname`) VALUES
(1, 'SW CSE 603', '26/04/2017', '04:10:28am', 'Alok Raj Singh,</br>,Daily</br>,Shatrughna Kumar,</br>,Daily</br>'),
(2, 'SW CSE 603', '26/04/2017', '12:40:36pm', 'Alok Raj Singh,</br>,Shatrughna Kumar,</br>,Shatrughna Kumar,</br>'),
(3, 'SW CSE 603', '26/04/2017', '10:31:21pm', 'Alok Raj Singh,</br>,Shatrughna Kumar,</br>,Rajeev,</br>');

-- --------------------------------------------------------

--
-- Table structure for table `video`
--

CREATE TABLE IF NOT EXISTS `video` (
  `v_id` int(11) NOT NULL AUTO_INCREMENT,
  `video_name` varchar(255) NOT NULL,
  `file_name` text NOT NULL,
  `vdate` text NOT NULL,
  PRIMARY KEY (`v_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `video`
--

INSERT INTO `video` (`v_id`, `video_name`, `file_name`, `vdate`) VALUES
(13, 'Hello3', 'Wed-Apr-2017', 'vlc-record-2017-04-19-09h10m30s-Adobe Spark Video(1).mp4-.mp4'),
(20, 'Hello Android ', 'Wed-Apr-2017', 'vlc-record-2017-04-19-09h10m30s-Adobe Spark Video(1).mp4-.mp4');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
