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
  `hora_entrada` time(6) DEFAULT NULL,
  `hora_saida` time(6) DEFAULT NULL,
  `horas_extras` float DEFAULT NULL,
  `comissao` float DEFAULT NULL,
  `duracao` float DEFAULT NULL,
  `experiencia` tinyint(1) NOT NULL,
  `ferias` int(11) NOT NULL,
  `vale_transporte` tinyint(1) NOT NULL,
  `vale_refeicao` tinyint(1) NOT NULL,
  `base_salarial` float DEFAULT NULL,
  `ativo` tinyint(1) NOT NULL DEFAULT '1',
  `empresa` int(11) NOT NULL,
  `funcionario` int(11) NOT NULL,
  `impostos` float DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `empresa_idx` (`empresa`),
  KEY `experiencia_idx` (`experiencia`),
  KEY `vale_transporte_idx` (`vale_transporte`),
  KEY `vale_refeicao_idx` (`vale_refeicao`),
  KEY `cont_funcionario_idx` (`funcionario`),
  CONSTRAINT `cont_funcionario` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`empresa`) REFERENCES `empresa` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
INSERT INTO `contrato` VALUES (1,6,NULL,NULL,2,0.13,4,0,7,0,1,NULL,1,1,1,NULL),(2,10,NULL,NULL,5,0.31,12,0,10,0,0,NULL,1,4,2,NULL),(3,40,NULL,NULL,5,0.3,24,0,30,1,0,NULL,1,1,5,NULL);
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

-- Dump completed on 2017-01-09 21:44:34
