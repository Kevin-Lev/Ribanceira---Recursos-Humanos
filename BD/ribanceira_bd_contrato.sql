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
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contrato` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `carga_horaria` float NOT NULL,
  `horas_extras` float NOT NULL,
  `comissao` float NOT NULL,
  `duracao` float NOT NULL,
  `experiencia` tinyint(1) NOT NULL,
  `ferias` int(11) NOT NULL,
  `abono_pecuniario` tinyint(1) NOT NULL,
  `vale_transporte` tinyint(1) NOT NULL,
  `vale_refeicao` tinyint(1) NOT NULL,
  `empresa` int(11) NOT NULL,
  `funcionario` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `empresa_idx` (`empresa`),
  KEY `experiencia_idx` (`experiencia`),
  KEY `vale_transporte_idx` (`vale_transporte`),
  KEY `vale_refeicao_idx` (`vale_refeicao`),
  KEY `abono_pecuniario_idx` (`abono_pecuniario`),
  KEY `cont_funcionario_idx` (`funcionario`),
  CONSTRAINT `cont_funcionario` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`empresa`) REFERENCES `empresa` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-06 18:33:49
