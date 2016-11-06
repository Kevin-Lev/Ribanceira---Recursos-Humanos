CREATE DATABASE  IF NOT EXISTS `ribanceira_bd` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ribanceira_bd`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: 127.0.0.1    Database: ribanceira_bd
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aviso_previo`
--

DROP TABLE IF EXISTS `aviso_previo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aviso_previo` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `data_aviso` varchar(20) NOT NULL,
  `data_rescisao` varchar(20) NOT NULL,
  `justificado` tinyint(1) NOT NULL,
  `motivo` varchar(45) NOT NULL,
  `funcionario` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `data_aviso_idx` (`data_aviso`),
  KEY `data_rescisao_idx` (`data_rescisao`),
  KEY `justificado_idx` (`justificado`),
  KEY `ap_funcionario_idx` (`funcionario`),
  CONSTRAINT `ap_funcionario` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aviso_previo`
--

LOCK TABLES `aviso_previo` WRITE;
/*!40000 ALTER TABLE `aviso_previo` DISABLE KEYS */;
/*!40000 ALTER TABLE `aviso_previo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-06 18:33:48
