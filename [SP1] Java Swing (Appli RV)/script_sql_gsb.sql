-- MySQL dump 10.13  Distrib 5.5.54, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: GSBB
-- ------------------------------------------------------
-- Server version	5.5.54-0+deb8u1

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
-- Table structure for table `ACTIVITE_COMPL`
--

DROP TABLE IF EXISTS `ACTIVITE_COMPL`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ACTIVITE_COMPL` (
  `AC_NUM` int(11) NOT NULL DEFAULT '0',
  `AC_DATE` date DEFAULT NULL,
  `AC_LIEU` varchar(50) DEFAULT NULL,
  `AC_THEME` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`AC_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ACTIVITE_COMPL`
--

LOCK TABLES `ACTIVITE_COMPL` WRITE;
/*!40000 ALTER TABLE `ACTIVITE_COMPL` DISABLE KEYS */;
INSERT INTO `ACTIVITE_COMPL` VALUES (1,'2015-01-01','Paris','Entretien'),(2,'2016-02-02','Marseille','Entretien'),(3,'2017-03-03','Caen','Entretien'),(4,'2018-04-04','Olonne','Entretien'),(5,'2015-05-05','Mont saint michelle','Entretien'),(6,'2016-06-06','Toulouse','Entretien'),(7,'2017-07-07','Dijon','Entretien'),(8,'2018-08-08','Doubs','Entretien'),(9,'2015-09-09','Lyon','Entretien'),(10,'2016-10-10','Lille','Entretien'),(11,'2017-11-11','Paris','Entretien'),(12,'2018-12-12','Marseille','Entretien'),(13,'2015-01-13','Caen','Entretien'),(14,'2016-02-14','Olonne','Entretien'),(15,'2017-03-15','Mont saint michelle','Entretien'),(16,'2018-04-16','Toulouse','Entretien'),(17,'2015-05-17','Dijon','Entretien'),(18,'2016-06-18','Doubs','Entretien'),(19,'2017-07-19','Lyon','Entretien'),(20,'2018-08-20','Lille','Entretien'),(21,'2015-09-21','Paris','Entretien'),(22,'2016-10-22','Marseille','Entretien'),(23,'2017-11-23','Caen','Entretien'),(24,'2018-12-24','Olonne','Entretien'),(25,'2015-01-25','Mont saint michelle','Entretien'),(26,'2016-02-26','Toulouse','Entretien'),(27,'2017-03-27','Dijon','Entretien'),(28,'2018-04-28','Doubs','Entretien'),(29,'2015-05-29','Lyon','Entretien'),(30,'2016-06-30','Lille','Entretien'),(31,'2017-07-01','Paris','Entretien'),(32,'2018-08-02','Marseille','Entretien'),(33,'2015-09-03','Caen','Entretien'),(34,'2016-10-04','Olonne','Entretien'),(35,'2017-11-05','Mont saint michelle','Entretien'),(36,'2018-12-06','Toulouse','Entretien'),(37,'2015-01-07','Dijon','Entretien'),(38,'2016-02-08','Doubs','Entretien'),(39,'2017-03-09','Lyon','Entretien'),(40,'2018-04-10','Lille','Entretien'),(41,'2015-05-11','Paris','Entretien'),(42,'2016-06-12','Marseille','Entretien'),(43,'2017-07-13','Caen','Entretien'),(44,'2018-08-14','Olonne','Entretien'),(45,'2015-09-15','Mont saint michelle','Entretien'),(46,'2016-10-16','Toulouse','Entretien'),(47,'2017-11-17','Dijon','Entretien'),(48,'2018-12-18','Doubs','Entretien'),(49,'2015-01-19','Lyon','Entretien'),(50,'2016-02-20','Lille','Entretien'),(51,'2017-03-21','Paris','Entretien'),(52,'2018-04-22','Marseille','Entretien'),(53,'2015-05-23','Caen','Entretien'),(54,'2016-06-24','Olonne','Entretien'),(55,'2017-07-25','Mont saint michelle','Entretien'),(56,'2018-08-26','Toulouse','Entretien'),(57,'2015-09-27','Dijon','Entretien'),(58,'2016-10-28','Doubs','Entretien'),(59,'2017-11-29','Lyon','Entretien'),(60,'2018-12-30','Lille','Entretien');
/*!40000 ALTER TABLE `ACTIVITE_COMPL` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `COMPOSANT`
--

DROP TABLE IF EXISTS `COMPOSANT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `COMPOSANT` (
  `CMP_CODE` varchar(8) NOT NULL DEFAULT '',
  `CMP_LIBELLE` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CMP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `COMPOSANT`
--

LOCK TABLES `COMPOSANT` WRITE;
/*!40000 ALTER TABLE `COMPOSANT` DISABLE KEYS */;
/*!40000 ALTER TABLE `COMPOSANT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CONSTITUER`
--

DROP TABLE IF EXISTS `CONSTITUER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CONSTITUER` (
  `MED_DEPOTLEGAL` varchar(20) NOT NULL DEFAULT '',
  `CMP_CODE` varchar(8) NOT NULL DEFAULT '',
  `CST_QTE` float DEFAULT NULL,
  PRIMARY KEY (`MED_DEPOTLEGAL`,`CMP_CODE`),
  KEY `FK_CONSTITUER_COMPOSANT` (`CMP_CODE`),
  CONSTRAINT `FK_CONSTITUER_COMPOSANT` FOREIGN KEY (`CMP_CODE`) REFERENCES `COMPOSANT` (`CMP_CODE`),
  CONSTRAINT `FK_CONSTITUER_MEDICAMENT` FOREIGN KEY (`MED_DEPOTLEGAL`) REFERENCES `MEDICAMENT` (`MED_DEPOTLEGAL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONSTITUER`
--

LOCK TABLES `CONSTITUER` WRITE;
/*!40000 ALTER TABLE `CONSTITUER` DISABLE KEYS */;
/*!40000 ALTER TABLE `CONSTITUER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DOSAGE`
--

DROP TABLE IF EXISTS `DOSAGE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DOSAGE` (
  `DOS_CODE` varchar(20) NOT NULL DEFAULT '',
  `DOS_QUANTITE` varchar(20) DEFAULT NULL,
  `DOS_UNITE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`DOS_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DOSAGE`
--

LOCK TABLES `DOSAGE` WRITE;
/*!40000 ALTER TABLE `DOSAGE` DISABLE KEYS */;
/*!40000 ALTER TABLE `DOSAGE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FAMILLE`
--

DROP TABLE IF EXISTS `FAMILLE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FAMILLE` (
  `FAM_CODE` varchar(6) NOT NULL DEFAULT '',
  `FAM_LIBELLE` varchar(160) DEFAULT NULL,
  PRIMARY KEY (`FAM_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FAMILLE`
--

LOCK TABLES `FAMILLE` WRITE;
/*!40000 ALTER TABLE `FAMILLE` DISABLE KEYS */;
INSERT INTO `FAMILLE` VALUES ('AA','Antalgiques en association'),('AAA','Antalgiques antipyrétiques en association'),('AAC','Antidépresseur d\'\'action centrale'),('AAH','Antivertigineux antihistaminique H1'),('ABA','Antibiotique antituberculeux'),('ABC','Antibiotique antiacnéique local'),('ABP','Antibiotique de la famille des béta-lactamines (pénicilline A)'),('AFC','Antibiotique de la famille des cyclines'),('AFM','Antibiotique de la famille des macrolides'),('AH','Antihistaminique H1 local'),('AIM','Antidépresseur imipraminique (tricyclique)'),('AIN','Antidépresseur inhibiteur sélectif de la recapture de la sérotonine'),('ALO','Antibiotique local (ORL)'),('ANS','Antidépresseur IMAO non sélectif'),('AO','Antibiotique ophtalmique'),('AP','Antipsychotique normothymique'),('AUM','Antibiotique urinaire minute'),('CRT','Corticoïde, antibiotique et antifongique à usage local'),('HYP','Hypnotique antihistaminique'),('PSA','Psychostimulant, antiasthénique');
/*!40000 ALTER TABLE `FAMILLE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `FORMULER`
--

DROP TABLE IF EXISTS `FORMULER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FORMULER` (
  `MED_DEPOTLEGAL` varchar(20) NOT NULL DEFAULT '',
  `PRE_CODE` varchar(4) NOT NULL DEFAULT '',
  PRIMARY KEY (`MED_DEPOTLEGAL`,`PRE_CODE`),
  KEY `FK_FORMULER_PRESENTATION` (`PRE_CODE`),
  CONSTRAINT `FK_FORMULER_MEDICAMENT` FOREIGN KEY (`MED_DEPOTLEGAL`) REFERENCES `MEDICAMENT` (`MED_DEPOTLEGAL`),
  CONSTRAINT `FK_FORMULER_PRESENTATION` FOREIGN KEY (`PRE_CODE`) REFERENCES `PRESENTATION` (`PRE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `FORMULER`
--

LOCK TABLES `FORMULER` WRITE;
/*!40000 ALTER TABLE `FORMULER` DISABLE KEYS */;
/*!40000 ALTER TABLE `FORMULER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `INTERAGIR`
--

DROP TABLE IF EXISTS `INTERAGIR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `INTERAGIR` (
  `MED_PERTURBATEUR` varchar(20) NOT NULL DEFAULT '',
  `MED_PERTURBE` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`MED_PERTURBATEUR`,`MED_PERTURBE`),
  KEY `FK_INTERAGIR_PERTURBE_MEDICAMENT` (`MED_PERTURBE`),
  CONSTRAINT `FK_INTERAGIR_PERTURBATEUR_MEDICAMENT` FOREIGN KEY (`MED_PERTURBATEUR`) REFERENCES `MEDICAMENT` (`MED_DEPOTLEGAL`),
  CONSTRAINT `FK_INTERAGIR_PERTURBE_MEDICAMENT` FOREIGN KEY (`MED_PERTURBE`) REFERENCES `MEDICAMENT` (`MED_DEPOTLEGAL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `INTERAGIR`
--

LOCK TABLES `INTERAGIR` WRITE;
/*!40000 ALTER TABLE `INTERAGIR` DISABLE KEYS */;
/*!40000 ALTER TABLE `INTERAGIR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `INVITER`
--

DROP TABLE IF EXISTS `INVITER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `INVITER` (
  `AC_NUM` int(11) NOT NULL DEFAULT '0',
  `PRA_NUM` int(11) NOT NULL DEFAULT '0',
  `SPECIALISATION` char(1) DEFAULT NULL,
  PRIMARY KEY (`AC_NUM`,`PRA_NUM`),
  KEY `FK_INVITER_PRATICIEN` (`PRA_NUM`),
  CONSTRAINT `FK_INVITER_ACTIVITE_COMPL` FOREIGN KEY (`AC_NUM`) REFERENCES `ACTIVITE_COMPL` (`AC_NUM`),
  CONSTRAINT `FK_INVITER_PRATICIEN` FOREIGN KEY (`PRA_NUM`) REFERENCES `PRATICIEN` (`PRA_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `INVITER`
--

LOCK TABLES `INVITER` WRITE;
/*!40000 ALTER TABLE `INVITER` DISABLE KEYS */;
INSERT INTO `INVITER` VALUES (1,1,NULL),(1,61,NULL),(2,2,NULL),(2,62,NULL),(3,3,NULL),(3,63,NULL),(4,4,NULL),(4,64,NULL),(5,5,NULL),(5,65,NULL),(6,6,NULL),(6,66,NULL),(7,7,NULL),(7,67,NULL),(8,8,NULL),(8,68,NULL),(9,9,NULL),(9,69,NULL),(10,10,NULL),(10,70,NULL),(11,11,NULL),(11,71,NULL),(12,12,NULL),(12,72,NULL),(13,13,NULL),(13,73,NULL),(14,14,NULL),(14,74,NULL),(15,15,NULL),(15,75,NULL),(16,16,NULL),(16,76,NULL),(17,17,NULL),(17,77,NULL),(18,18,NULL),(18,78,NULL),(19,19,NULL),(19,79,NULL),(20,20,NULL),(20,80,NULL),(21,21,NULL),(21,81,NULL),(22,22,NULL),(22,82,NULL),(23,23,NULL),(23,83,NULL),(24,24,NULL),(24,84,NULL),(25,25,NULL),(25,85,NULL),(26,26,NULL),(26,86,NULL),(27,1,NULL),(27,27,NULL),(28,2,NULL),(28,28,NULL),(29,3,NULL),(29,29,NULL),(30,4,NULL),(30,30,NULL),(31,5,NULL),(31,31,NULL),(32,6,NULL),(32,32,NULL),(33,7,NULL),(33,33,NULL),(34,8,NULL),(34,34,NULL),(35,9,NULL),(35,35,NULL),(36,10,NULL),(36,36,NULL),(37,11,NULL),(37,37,NULL),(38,12,NULL),(38,38,NULL),(39,13,NULL),(39,39,NULL),(40,14,NULL),(40,40,NULL),(41,15,NULL),(41,41,NULL),(42,16,NULL),(42,42,NULL),(43,17,NULL),(43,43,NULL),(44,18,NULL),(44,44,NULL),(45,19,NULL),(45,45,NULL),(46,20,NULL),(46,46,NULL),(47,21,NULL),(47,47,NULL),(48,22,NULL),(48,48,NULL),(49,23,NULL),(49,49,NULL),(50,24,NULL),(50,50,NULL),(51,25,NULL),(51,51,NULL),(52,26,NULL),(52,52,NULL),(53,27,NULL),(53,53,NULL),(54,28,NULL),(54,54,NULL),(55,29,NULL),(55,55,NULL),(56,30,NULL),(56,56,NULL),(57,31,NULL),(57,57,NULL),(58,32,NULL),(58,58,NULL),(59,33,NULL),(59,59,NULL),(60,34,NULL),(60,60,NULL);
/*!40000 ALTER TABLE `INVITER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LABORATOIRE`
--

DROP TABLE IF EXISTS `LABORATOIRE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LABORATOIRE` (
  `LAB_CODE` varchar(4) NOT NULL DEFAULT '',
  `LAB_NOM` varchar(20) DEFAULT NULL,
  `LAB_CHEFVENTE` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`LAB_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LABORATOIRE`
--

LOCK TABLES `LABORATOIRE` WRITE;
/*!40000 ALTER TABLE `LABORATOIRE` DISABLE KEYS */;
INSERT INTO `LABORATOIRE` VALUES ('BC','Bichat','Suzanne Terminus'),('GY','Gyverny','Marcel MacDouglas'),('SW','Swiss Kane','Alain Poutre');
/*!40000 ALTER TABLE `LABORATOIRE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MEDICAMENT`
--

DROP TABLE IF EXISTS `MEDICAMENT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MEDICAMENT` (
  `MED_DEPOTLEGAL` varchar(20) NOT NULL DEFAULT '',
  `MED_NOMCOMMERCIAL` varchar(50) DEFAULT NULL,
  `FAM_CODE` varchar(6) DEFAULT NULL,
  `MED_COMPOSITION` varchar(510) DEFAULT NULL,
  `MED_EFFETS` varchar(510) DEFAULT NULL,
  `MED_CONTREINDIC` varchar(510) DEFAULT NULL,
  `MED_PRIXECHANTILLON` float DEFAULT NULL,
  PRIMARY KEY (`MED_DEPOTLEGAL`),
  KEY `FK_MEDICAMENT_FAMILLE` (`FAM_CODE`),
  CONSTRAINT `FK_MEDICAMENT_FAMILLE` FOREIGN KEY (`FAM_CODE`) REFERENCES `FAMILLE` (`FAM_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MEDICAMENT`
--

LOCK TABLES `MEDICAMENT` WRITE;
/*!40000 ALTER TABLE `MEDICAMENT` DISABLE KEYS */;
INSERT INTO `MEDICAMENT` VALUES ('3MYC7','TRIMYCINE','CRT','Triamcinolone (acétonide) + Néomycine + Nystatine','Ce médicament est un corticoïde à activité forte ou très forte associé à un antibiotique et un antifongique, utilisé en application locale dans certaines atteintes cutanées surinfectées.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants, d\'\'infections de la peau ou de parasitisme non traités, d\'\'acné. Ne pas appliquer sur une plaie, ni sous un pansement occlusif.',NULL),('ADIMOL9','ADIMOL','ABP','Amoxicilline + Acide clavulanique','Ce médicament, plus puissant que les pénicillines simples, est utilisé pour traiter des infections bactériennes spécifiques.','Ce médicament est contre-indiqué en cas d\'\'allergie aux pénicillines ou aux céphalosporines.',NULL),('AMOPIL7','AMOPIL','ABP','Amoxicilline','Ce médicament, plus puissant que les pénicillines simples, est utilisé pour traiter des infections bactériennes spécifiques.','Ce médicament est contre-indiqué en cas d\'\'allergie aux pénicillines. Il doit être administré avec prudence en cas d\'\'allergie aux céphalosporines.',NULL),('AMOX45','AMOXAR','ABP','Amoxicilline','Ce médicament, plus puissant que les pénicillines simples, est utilisé pour traiter des infections bactériennes spécifiques.','La prise de ce médicament peut rendre positifs les tests de dépistage du dopage.',NULL),('AMOXIG12','AMOXI Gé','ABP','Amoxicilline','Ce médicament, plus puissant que les pénicillines simples, est utilisé pour traiter des infections bactériennes spécifiques.','Ce médicament est contre-indiqué en cas d\'\'allergie aux pénicillines. Il doit être administré avec prudence en cas d\'\'allergie aux céphalosporines.',NULL),('APATOUX22','APATOUX Vitamine C','ALO','Tyrothricine + Tétracène + Acide ascorbique (Vitamine C)','Ce médicament est utilisé pour traiter les affections de la bouche et de la gorge.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants, en cas de phénylcétonurie et chez l\'\'enfant de moins de 6 ans.',NULL),('BACTIG10','BACTIGEL','ABC','Erythromycine','Ce médicament est utilisé en application locale pour traiter l\'\'acné et les infections cutanées bactériennes associées.','Ce médicament est contre-indiqué en cas d\'\'allergie aux antibiotiques de la famille des macrolides ou des lincosanides.',NULL),('BACTIV13','BACTIVIL','AFM','Erythromycine','Ce médicament est utilisé pour traiter des infections bactériennes spécifiques.','Ce médicament est contre-indiqué en cas d\'\'allergie aux macrolides (dont le chef de file est l\'\'érythromycine).',NULL),('BITALV','BIVALIC','AAA','Dextropropoxyphène + Paracétamol','Ce médicament est utilisé pour traiter les douleurs d\'\'intensité modérée ou intense.','Ce médicament est contre-indiqué en cas d\'\'allergie aux médicaments de cette famille, d\'\'insuffisance hépatique ou d\'\'insuffisance rénale.',NULL),('CARTION6','CARTION','AAA','Acide acétylsalicylique (aspirine) + Acide ascorbique (Vitamine C) + Paracétamol','Ce médicament est utilisé dans le traitement symptomatique de la douleur ou de la fièvre.','Ce médicament est contre-indiqué en cas de troubles de la coagulation (tendances aux hémorragies), d\'\'ulcère gastroduodénal, maladies graves du foie.',NULL),('CLAZER6','CLAZER','AFM','Clarithromycine','Ce médicament est utilisé pour traiter des infections bactériennes spécifiques. Il est également utilisé dans le traitement de l\'\'ulcère gastro-duodénal, en association avec d\'\'autres médicaments.','Ce médicament est contre-indiqué en cas d\'\'allergie aux macrolides (dont le chef de file est l\'\'érythromycine).',NULL),('DEPRIL9','DEPRAMIL','AIM','Clomipramine','Ce médicament est utilisé pour traiter les épisodes dépressifs sévères, certaines douleurs rebelles, les troubles obsessionnels compulsifs et certaines énurésies chez l\'\'enfant.','Ce médicament est contre-indiqué en cas de glaucome ou d\'\'adénome de la prostate, d\'\'infarctus récent, ou si vous avez reçu un traitement par IMAO durant les 2 semaines précédentes ou en cas d\'\'allergie aux atidépresseurs imipraminiques.',NULL),('DIMIRTAM6','DIMIRTAM','AAC','Mirtazapine','Ce médicament est utilisé pour traiter les épisodes dépressifs sévères.','La prise de ce produit est contre-indiquée en cas de d\'\'allergie à l\'\'un des constituants.',NULL),('DOLRIL7','DOLORIL','AAA','Acide acétylsalicylique (aspirine) + Acide ascorbique (Vitamine C) + Paracétamol','Ce médicament est utilisé dans le traitement symptomatique de la douleur ou de la fièvre.','Ce médicament est contre-indiqué en cas d\'\'allergie au Paracétamol ou aux salicylates.',NULL),('DORNOM8','NORMADOR','HYP','Doxylamine','Ce médicament est utilisé pour traiter l\'\'insomnie chez l\'\'adulte.','Ce médicament est contre-indiqué en cas de glaucome, de certains troubles urinaires (rétention urinaire) et chez l\'\'enfant de moins de 15 ans.',NULL),('EQUILARX6','EQUILAR','AAH','Méclozine','Ce médicament est utilisé pour traiter les vertiges et pour prévenir le mal des transports.','Ce médicament ne doit pas être utilisé en cas d\'\'allergie au produit, en cas de glaucome ou de rétention urinaire.',NULL),('EVILR7','EVEILLOR','PSA','Adrafinil','Ce médicament est utilisé pour traiter les troubles de la vigilance et certains symptomes neurologiques chez le sujet agé.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants.',NULL),('INSXT5','INSECTIL','AH','Diphénydramine','Ce médicament est utilisé en application locale sur les piqûres d\'\'insecte et l\'\'urticaire.','Ce médicament est contre-indiqué en cas d\'\'allergie aux antihistaminiques.',NULL),('JOVAI8','JOVENIL','AFM','Josamycine','Ce médicament est utilisé pour traiter des infections bactériennes spécifiques.','Ce médicament est contre-indiqué en cas d\'\'allergie aux macrolides (dont le chef de file est l\'\'érythromycine).',NULL),('LIDOXY23','LIDOXYTRACINE','AFC','Oxytétracycline +Lidocaïne','Ce médicament est utilisé en injection intramusculaire pour traiter certaines infections spécifiques.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants. Il ne doit pas être associé aux rétinoïdes.',NULL),('LITHOR12','LITHORINE','AP','Lithium','Ce médicament est indiqué dans la prévention des psychoses maniaco-dépressives ou pour traiter les états maniaques.','Ce médicament ne doit pas être utilisé si vous êtes allergique au lithium. Avant de prendre ce traitement, signalez à votre Médecin traitant si vous souffrez d\'\'insuffisance rénale, ou si vous avez un régime sans sel.',NULL),('PARMOL16','PARMOCODEINE','AA','Codéine + Paracétamol','Ce médicament est utilisé pour le traitement des douleurs lorsque des antalgiques simples ne sont pas assez efficaces.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants, chez l\'\'enfant de moins de 15 Kg, en cas d\'\'insuffisance hépatique ou respiratoire, d\'\'asthme, de phénylcétonurie et chez la femme qui allaite.',NULL),('PHYSOI8','PHYSICOR','PSA','Sulbutiamine','Ce médicament est utilisé pour traiter les baisses d\'\'activité physique ou psychique, souvent dans un contexte de dépression.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants.',NULL),('PIRIZ8','PIRIZAN','ABA','Pyrazinamide','Ce médicament est utilisé, en association à d\'\'autres antibiotiques, pour traiter la tuberculose.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants, d\'\'insuffisance rénale ou hépatique, d\'\'hyperuricémie ou de porphyrie.',NULL),('POMDI20','POMADINE','AO','Bacitracine','Ce médicament est utilisé pour traiter les infections oculaires de la surface de l\'\'oeil.','Ce médicament est contre-indiqué en cas d\'\'allergie aux antibiotiques appliqués localement.',NULL),('TROXT21','TROXADET','AIN','Paroxétine','Ce médicament est utilisé pour traiter la dépression et les troubles obsessionnels compulsifs. Il peut également être utilisé en prévention des crises de panique avec ou sans agoraphobie.','Ce médicament est contre-indiqué en cas d\'\'allergie au produit.',NULL),('TXISOL22','TOUXISOL Vitamine C','ALO','Tyrothricine + Acide ascorbique (Vitamine C)','Ce médicament est utilisé pour traiter les affections de la bouche et de la gorge.','Ce médicament est contre-indiqué en cas d\'\'allergie à l\'\'un des constituants et chez l\'\'enfant de moins de 6 ans.',NULL),('URIEG6','URIREGUL','AUM','Fosfomycine trométamol','Ce médicament est utilisé pour traiter les infections urinaires simples chez la femme de moins de 65 ans.','La prise de ce médicament est contre-indiquée en cas d\'\'allergie à l\'\'un des constituants et d\'\'insuffisance rénale.',NULL);
/*!40000 ALTER TABLE `MEDICAMENT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MOTIF_VISITE`
--

DROP TABLE IF EXISTS `MOTIF_VISITE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MOTIF_VISITE` (
  `MOT_ID` varchar(50) NOT NULL DEFAULT '',
  `MOT_LIBELLE` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`MOT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MOTIF_VISITE`
--

LOCK TABLES `MOTIF_VISITE` WRITE;
/*!40000 ALTER TABLE `MOTIF_VISITE` DISABLE KEYS */;
INSERT INTO `MOTIF_VISITE` VALUES ('00','Rencontre praticien (périodicité)'),('01','Rencontre praticien (nouveautés)'),('02','Rencontre pracicien (remontage)'),('03','Sollicitation praticien'),('04','Autre');
/*!40000 ALTER TABLE `MOTIF_VISITE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OFFRIR`
--

DROP TABLE IF EXISTS `OFFRIR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OFFRIR` (
  `VIS_MATRICULE` varchar(20) NOT NULL DEFAULT '',
  `RAP_NUM` int(11) NOT NULL DEFAULT '0',
  `MED_DEPOTLEGAL` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`VIS_MATRICULE`,`RAP_NUM`,`MED_DEPOTLEGAL`),
  CONSTRAINT `FK_OFFRIR_VISITEUR` FOREIGN KEY (`VIS_MATRICULE`) REFERENCES `VISITEUR` (`VIS_MATRICULE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OFFRIR`
--

LOCK TABLES `OFFRIR` WRITE;
/*!40000 ALTER TABLE `OFFRIR` DISABLE KEYS */;
INSERT INTO `OFFRIR` VALUES ('a17',4,'3MYC7'),('a17',4,'AMOX45');
/*!40000 ALTER TABLE `OFFRIR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `POSSEDER`
--

DROP TABLE IF EXISTS `POSSEDER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `POSSEDER` (
  `PRA_NUM` int(11) NOT NULL DEFAULT '0',
  `SPE_CODE` varchar(10) NOT NULL DEFAULT '',
  `POS_DIPLOME` varchar(20) DEFAULT NULL,
  `POS_COEFPRESCRIPTION` float DEFAULT NULL,
  PRIMARY KEY (`PRA_NUM`,`SPE_CODE`),
  KEY `FK_POSSEDER_SPECIALITE` (`SPE_CODE`),
  CONSTRAINT `FK_POSSEDER_PRATICIEN` FOREIGN KEY (`PRA_NUM`) REFERENCES `PRATICIEN` (`PRA_NUM`),
  CONSTRAINT `FK_POSSEDER_SPECIALITE` FOREIGN KEY (`SPE_CODE`) REFERENCES `SPECIALITE` (`SPE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `POSSEDER`
--

LOCK TABLES `POSSEDER` WRITE;
/*!40000 ALTER TABLE `POSSEDER` DISABLE KEYS */;
INSERT INTO `POSSEDER` VALUES (1,'SXL',NULL,573.4),(2,'TXA',NULL,455.4),(3,'RHU',NULL,45.4),(4,'RDT',NULL,758.4),(5,'RAD',NULL,575.4),(6,'PSC',NULL,757.4),(7,'PME',NULL,57.4),(8,'PEA',NULL,76.4),(9,'OPH',NULL,767.4),(10,'NRL',NULL,68.4),(11,'NRC',NULL,768.4),(12,'MDT',NULL,786.4),(13,'EM',NULL,546.4),(14,'CPR',NULL,456.4),(15,'CAC',NULL,125.4),(16,'ACP',NULL,45.4),(17,'SXL',NULL,746.4),(18,'TXA',NULL,418.4),(19,'RHU',NULL,145.4),(20,'RDT',NULL,453.4),(21,'RAD',NULL,458.4),(22,'PSC',NULL,222.4),(23,'PME',NULL,478.4),(24,'PEA',NULL,45.4),(25,'OPH',NULL,126.4),(26,'NRL',NULL,254.4),(27,'NRC',NULL,555.4),(28,'MDT',NULL,667.4),(29,'EM',NULL,126.4),(30,'CPR',NULL,325.4),(31,'CAC',NULL,126.4),(32,'ACP',NULL,126.4),(33,'SXL',NULL,325.4),(34,'TXA',NULL,48.4),(35,'RHU',NULL,45.4),(36,'RDT',NULL,45.4),(37,'RAD',NULL,69.4),(38,'PSC',NULL,74.4),(39,'PME',NULL,858.4),(40,'PEA',NULL,254.4),(41,'OPH',NULL,24.4),(42,'NRL',NULL,75.4),(43,'NRC',NULL,41.4),(44,'MDT',NULL,3.4),(45,'EM',NULL,78.4),(46,'CPR',NULL,68.4),(47,'CAC',NULL,56.4),(48,'ACP',NULL,74.4),(49,'SXL',NULL,126.4),(50,'TXA',NULL,444.4),(51,'RHU',NULL,145.4),(52,'RDT',NULL,325.4),(53,'RAD',NULL,555.4),(54,'PSC',NULL,145.4),(55,'PME',NULL,126.9),(56,'PEA',NULL,666.8),(57,'OPH',NULL,325.7),(58,'NRL',NULL,126.6),(59,'NRC',NULL,145.5),(60,'MDT',NULL,28.4),(61,'EM',NULL,325.4),(62,'CPR',NULL,224.3),(63,'CAC',NULL,124.2),(64,'ACP',NULL,426.1),(65,'SXL',NULL,324),(66,'TXA',NULL,227.2),(67,'RHU',NULL,129.3),(68,'RDT',NULL,424.4),(69,'RAD',NULL,325.6),(70,'PSC',NULL,222.5),(71,'PME',NULL,141.7),(72,'PEA',NULL,134.8),(73,'OPH',NULL,145.9),(74,'NRL',NULL,152.5),(75,'NRC',NULL,186.6),(76,'MDT',NULL,468.4),(77,'EM',NULL,716.7),(78,'CPR',NULL,127.48),(79,'CAC',NULL,415.5),(80,'ACP',NULL,126.6),(81,'TXA',NULL,174.4),(82,'RHU',NULL,141.7),(83,'RDT',NULL,194.8),(84,'RAD',NULL,326.4),(85,'PSC',NULL,113.6),(86,'PME',NULL,233.4);
/*!40000 ALTER TABLE `POSSEDER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PRATICIEN`
--

DROP TABLE IF EXISTS `PRATICIEN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRATICIEN` (
  `PRA_NUM` int(11) NOT NULL DEFAULT '0',
  `PRA_NOM` varchar(50) DEFAULT NULL,
  `PRA_PRENOM` varchar(50) DEFAULT NULL,
  `PRA_ADRESSE` varchar(100) DEFAULT NULL,
  `PRA_CP` varchar(10) DEFAULT NULL,
  `PRA_VILLE` varchar(50) DEFAULT NULL,
  `PRA_COEFNOTORIETE` float DEFAULT NULL,
  `TYP_CODE` varchar(6) NOT NULL DEFAULT '',
  PRIMARY KEY (`PRA_NUM`,`TYP_CODE`),
  KEY `FK_PRATICIEN_TYPE_PRATICIEN` (`TYP_CODE`),
  CONSTRAINT `FK_PRATICIEN_TYPE_PRATICIEN` FOREIGN KEY (`TYP_CODE`) REFERENCES `TYPE_PRATICIEN` (`TYP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRATICIEN`
--

LOCK TABLES `PRATICIEN` WRITE;
/*!40000 ALTER TABLE `PRATICIEN` DISABLE KEYS */;
INSERT INTO `PRATICIEN` VALUES (1,'Notini','Alain','114 r Authie','85000','LA ROCHE SUR YON',290.03,'MH'),(2,'Gosselin','Albert','13 r Devon','41000','BLOIS',307.49,'MV'),(3,'Delahaye','André','36 av 6 Juin','25000','BESANCON',185.79,'PS'),(4,'Leroux','André','47 av Robert Schuman','60000','BEAUVAIS',172.04,'PH'),(5,'Desmoulins','Anne','31 r St Jean','30000','NIMES',94.75,'PO'),(6,'Mouel','Anne','27 r Auvergne','80000','AMIENS',45.2,'MH'),(7,'Desgranges-Lentz','Antoine','1 r Albert de Mun','29000','MORLAIX',20.07,'MV'),(8,'Marcouiller','Arnaud','31 r St Jean','68000','MULHOUSE',396.52,'PS'),(9,'Dupuy','Benoit','9 r Demolombe','34000','MONTPELLIER',395.66,'PH'),(10,'Lerat','Bernard','31 r St Jean','59000','LILLE',257.79,'PO'),(11,'Marçais-Lefebvre','Bertrand','86Bis r Basse','67000','STRASBOURG',450.96,'MH'),(12,'Boscher','Bruno','94 r Falaise','10000','TROYES',356.14,'MV'),(13,'Morel','Catherine','21 r Chateaubriand','75000','PARIS',379.57,'PS'),(14,'Guivarch','Chantal','4 av Gén Laperrine','45000','ORLEANS',114.56,'PH'),(15,'Bessin-Grosdoit','Christophe','92 r Falaise','6000','NICE',222.06,'PO'),(16,'Rossa','Claire','14 av Thiès','6000','NICE',529.78,'MH'),(17,'Cauchy','Denis','5 av Ste Thérèse','11000','NARBONNE',458.82,'MV'),(18,'Gaffé','Dominique','9 av 1ère Armée Française','35000','RENNES',213.4,'PS'),(19,'Guenon','Dominique','98 bd Mar Lyautey','44000','NANTES',175.89,'PH'),(20,'Prévot','Dominique','29 r Lucien Nelle','87000','LIMOGES',151.36,'PO'),(21,'Houchard','Eliane','9 r Demolombe','49100','ANGERS',436.96,'MH'),(22,'Desmons','Elisabeth','51 r Bernières','29000','QUIMPER',281.17,'MV'),(23,'Flament','Elisabeth','11 r Pasteur','35000','RENNES',315.6,'PS'),(24,'Goussard','Emmanuel','9 r Demolombe','41000','BLOIS',40.72,'PH'),(25,'Desprez','Eric','9 r Vaucelles','33000','BORDEAUX',406.85,'PO'),(26,'Coste','Evelyne','29 r Lucien Nelle','19000','TULLE',441.87,'MH'),(27,'Lefebvre','Frédéric','2 pl Wurzburg','55000','VERDUN',573.63,'MV'),(28,'Lemée','Frédéric','29 av 6 Juin','56000','VANNES',326.4,'PS'),(29,'Martin','Frédéric','Bât A 90 r Bayeux','70000','VESOUL',506.06,'PH'),(30,'Marie','Frédérique','172 r Caponière','70000','VESOUL',313.31,'PO'),(31,'Rosenstech','Geneviève','27 r Auvergne','75000','PARIS',366.82,'MH'),(32,'Pontavice','Ghislaine','8 r Gaillon','86000','POITIERS',265.58,'MV'),(33,'Leveneur-Mosquet','Guillaume','47 av Robert Schuman','64000','PAU',184.97,'PS'),(34,'Blanchais','Guy','30 r Authie','8000','SEDAN',502.48,'PH'),(35,'Leveneur','Hugues','7 pl St Gilles','62000','ARRAS',7.39,'PO'),(36,'Mosquet','Isabelle','22 r Jules Verne','76000','ROUEN',77.1,'MH'),(37,'Giraudon','Jean-Christophe','1 r Albert de Mun','38100','VIENNE',92.62,'MV'),(38,'Marie','Jean-Claude','26 r Hérouville','69000','LYON',120.1,'PS'),(39,'Maury','Jean-François','5 r Pierre Girard','71000','CHALON SUR SAONE',13.73,'PH'),(40,'Dennel','Jean-Louis','7 pl St Gilles','28000','CHARTRES',550.69,'PO'),(41,'Ain','Jean-Pierre','4 résid Olympia','2000','LAON',5.59,'MH'),(42,'Chemery','Jean-Pierre','51 pl Ancienne Boucherie','14000','CAEN',396.58,'MV'),(43,'Comoz','Jean-Pierre','35 r Auguste Lechesne','18000','BOURGES',340.35,'PS'),(44,'Desfaudais','Jean-Pierre','7 pl St Gilles','29000','BREST',71.76,'PH'),(45,'Phan','Jérôme','9 r Clos Caillet','79000','NIORT',451.61,'PO'),(46,'Riou','Line','43 bd Gén Vanier','77000','MARNE LA VALLEE',193.25,'MH'),(47,'Chubilleau','Louis','46 r Eglise','17000','SAINTES',202.07,'MV'),(48,'Lebrun','Lucette','178 r Auge','54000','NANCY',410.41,'PS'),(49,'Goessens','Marc','6 av 6 Juin','39000','DOLE',548.57,'PH'),(50,'Laforge','Marc','5 résid Prairie','50000','SAINT LO',265.05,'PO'),(51,'Millereau','Marc','36 av 6 Juin','72000','LA FERTE BERNARD',430.42,'MH'),(52,'Dauverne','Marie-Christine','69 av Charlemagne','21000','DIJON',281.05,'MV'),(53,'Vittorio','Myriam','3 pl Champlain','94000','BOISSY SAINT LEGER',356.23,'PS'),(54,'Lapasset','Nhieu','31 av 6 Juin','52000','CHAUMONT',107,'PH'),(55,'Plantet-Besnier','Nicole','10 av 1ère Armée Française','86000','CHATELLEREAULT',369.94,'PO'),(56,'Chubilleau','Pascal','3 r Hastings','15000','AURRILLAC',290.75,'MH'),(57,'Robert','Pascal','31 r St Jean','93000','BOBIGNY',162.41,'MV'),(58,'Jean','Pascale','114 r Authie','49100','SAUMUR',375.52,'PS'),(59,'Chanteloube','Patrice','14 av Thiès','13000','MARSEILLE',478.01,'PH'),(60,'Lecuirot','Patrice','résid St Pères 55 r Pigacière','54000','NANCY',239.66,'PO'),(61,'Gandon','Patrick','47 av Robert Schuman','37000','TOURS',599.06,'MH'),(62,'Mirouf','Patrick','22 r Puits Picard','74000','ANNECY',458.42,'MV'),(63,'Boireaux','Philippe','14 av Thiès','10000','CHALON EN CHAMPAGNE',454.48,'PS'),(64,'Cendrier','Philippe','7 pl St Gilles','12000','RODEZ',164.16,'PH'),(65,'Duhamel','Philippe','114 r Authie','34000','MONTPELLIER',98.62,'PO'),(66,'Grigy','Philippe','15 r Mélingue','44000','CLISSON',285.1,'MH'),(67,'Linard','Philippe','1 r Albert de Mun','81000','ALBI',486.3,'MV'),(68,'Lozier','Philippe','8 r Gaillon','31000','TOULOUSE',48.4,'PS'),(69,'Dechêtre','Pierre','63 av Thiès','23000','MONTLUCON',253.75,'PH'),(70,'Goessens','Pierre','22 r Jean Romain','40000','MONT DE MARSAN',426.19,'PO'),(71,'Leménager','Pierre','39 av 6 Juin','57000','METZ',118.7,'MH'),(72,'Née','Pierre','39 av 6 Juin','82000','MONTAUBAN',72.54,'MV'),(73,'Guyot','Pierre-Laurent','43 bd Gén Vanier','48000','MENDE',352.31,'PS'),(74,'Chauchard','Roger','9 r Vaucelles','13000','MARSEILLE',552.19,'PH'),(75,'Mabire','Roland','11 r Boutiques','67000','STRASBOURG',422.39,'PO'),(76,'Leroy','Soazig','45 r Boutiques','61000','ALENCON',570.67,'MH'),(77,'Guyot','Stéphane','26 r Hérouville','46000','FIGEAC',28.85,'MV'),(78,'Delposen','Sylvain','39 av 6 Juin','27000','DREUX',292.01,'PS'),(79,'Rault','Sylvie','15 bd Richemond','2000','SOISSON',526.6,'PH'),(80,'Renouf','Sylvie','98 bd Mar Lyautey','88000','EPINAL',425.24,'PO'),(81,'Alliet-Grach','Thierry','14 av Thiès','7000','PRIVAS',451.31,'MH'),(82,'Bayard','Thierry','92 r Falaise','42000','SAINT ETIENNE',271.71,'MV'),(83,'Gauchet','Thierry','7 r Desmoueux','38100','GRENOBLE',406.1,'PS'),(84,'Bobichon','Tristan','219 r Caponière','9000','FOIX',218.36,'PH'),(85,'Duchemin-Laniel','Véronique','130 r St Jean','33000','LIBOURNE',265.61,'PO'),(86,'Laurent','Younès','34 r Demolombe','53000','MAYENNE',496.1,'MH');
/*!40000 ALTER TABLE `PRATICIEN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PRESCRIRE`
--

DROP TABLE IF EXISTS `PRESCRIRE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRESCRIRE` (
  `MED_DEPOTLEGAL` varchar(20) NOT NULL DEFAULT '',
  `TIN_CODE` varchar(10) NOT NULL DEFAULT '',
  `DOS_CODE` varchar(20) NOT NULL DEFAULT '',
  `PRE_POSOLOGIE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`MED_DEPOTLEGAL`,`TIN_CODE`,`DOS_CODE`),
  KEY `FK_PRESCRIRE_TYPE_INDIVIDU` (`TIN_CODE`),
  KEY `FK_PRESCRIRE_DOSAGE` (`DOS_CODE`),
  CONSTRAINT `FK_PRESCRIRE_DOSAGE` FOREIGN KEY (`DOS_CODE`) REFERENCES `DOSAGE` (`DOS_CODE`),
  CONSTRAINT `FK_PRESCRIRE_MEDICAMENT` FOREIGN KEY (`MED_DEPOTLEGAL`) REFERENCES `MEDICAMENT` (`MED_DEPOTLEGAL`),
  CONSTRAINT `FK_PRESCRIRE_TYPE_INDIVIDU` FOREIGN KEY (`TIN_CODE`) REFERENCES `TYPE_INDIVIDU` (`TIN_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRESCRIRE`
--

LOCK TABLES `PRESCRIRE` WRITE;
/*!40000 ALTER TABLE `PRESCRIRE` DISABLE KEYS */;
/*!40000 ALTER TABLE `PRESCRIRE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PRESENTATION`
--

DROP TABLE IF EXISTS `PRESENTATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PRESENTATION` (
  `PRE_CODE` varchar(4) NOT NULL DEFAULT '',
  `PRE_LIBELLE` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`PRE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PRESENTATION`
--

LOCK TABLES `PRESENTATION` WRITE;
/*!40000 ALTER TABLE `PRESENTATION` DISABLE KEYS */;
/*!40000 ALTER TABLE `PRESENTATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RAPPORT_VISITE`
--

DROP TABLE IF EXISTS `RAPPORT_VISITE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RAPPORT_VISITE` (
  `VIS_MATRICULE` varchar(20) NOT NULL DEFAULT '',
  `RAP_NUM` int(11) NOT NULL DEFAULT '0',
  `PRA_NUM` int(11) DEFAULT NULL,
  `RAP_BILAN` varchar(510) DEFAULT '',
  `RAP_VU` varchar(3) DEFAULT 'non',
  `RAP_DATE` date DEFAULT NULL,
  `RAP_MOTIF` varchar(510) DEFAULT NULL,
  `RAP_COEFCONFIANCE` int(11) DEFAULT '0',
  PRIMARY KEY (`VIS_MATRICULE`,`RAP_NUM`),
  KEY `FK_RAPPORT_VISITE_PRATICIEN` (`PRA_NUM`),
  CONSTRAINT `FK_RAPPORT_VISITE_PRATICIEN` FOREIGN KEY (`PRA_NUM`) REFERENCES `PRATICIEN` (`PRA_NUM`),
  CONSTRAINT `FK_RAPPORT_VISITE_VISITEUR` FOREIGN KEY (`VIS_MATRICULE`) REFERENCES `VISITEUR` (`VIS_MATRICULE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RAPPORT_VISITE`
--

LOCK TABLES `RAPPORT_VISITE` WRITE;
/*!40000 ALTER TABLE `RAPPORT_VISITE` DISABLE KEYS */;
INSERT INTO `RAPPORT_VISITE` VALUES ('b25',4,4,'Amélioration attendue','non','2017-10-15','med',1),('b25',5,5,'manque dhygiène','non','2017-10-29','med',0),('b25',20,20,'Amélioration attendue','non','2017-10-15','med',1),('b25',21,21,'manque dhygiène','non','2017-10-29','med',0),('b25',36,36,'Amélioration attendue','non','2017-10-15','med',1),('b25',37,37,'manque dhygiène','non','2017-10-29','med',1),('b25',53,53,'Amélioration attendue','non','2017-10-15','med',1),('b25',54,54,'manque dhygiène','non','2017-10-29','med',0),('b25',69,69,'Amélioration attendue','non','2017-10-15','med',1),('b25',70,70,'manque dhygiène','non','2017-10-29','med',0),('b25',86,86,'Amélioration attendue','non','2017-10-15','med',1),('b25',87,1,'manque dhygiène','oui','2017-10-29','med',1),('b28',6,6,'hygiène au top','non','2017-11-29','med',3),('b28',7,7,'recommandé','non','2017-11-14','med',2),('b28',8,8,'satisfait','non','2017-11-06','med',1),('b28',9,9,'beaucoup de qualité','non','2017-11-14','med',2),('b28',22,22,'hygiène au top','non','2017-11-29','med',3),('b28',23,23,'recommandé','non','2017-11-14','med',2),('b28',24,24,'satisfait','non','2017-11-06','med',2),('b28',25,25,'beaucoup de qualité','non','2017-11-14','med',3),('b28',38,38,'hygiène au top','non','2017-11-29','med',3),('b28',39,39,'recommandé','non','2017-11-14','med',2),('b28',40,40,'satisfait','non','2017-11-06','med',2),('b28',41,41,'beaucoup de qualité','non','2017-11-14','med',3),('b28',55,55,'hygiène au top','non','2017-11-29','med',3),('b28',56,56,'recommandé','non','2017-11-14','med',2),('b28',57,57,'satisfait','non','2017-11-06','med',1),('b28',58,58,'beaucoup de qualité','non','2017-11-14','med',2),('b28',71,71,'hygiène au top','non','2017-11-29','med',3),('b28',72,72,'recommandé','non','2017-11-14','med',2),('b28',73,73,'satisfait','non','2017-11-06','med',2),('b28',74,74,'beaucoup de qualité','non','2017-11-14','med',3),('b28',88,2,'hygiène au top','non','2017-11-29','med',3),('b28',89,3,'recommandé','non','2017-11-14','med',2),('b28',90,4,'satisfait','non','2017-11-06','med',2),('b28',91,5,'beaucoup de qualité','non','2017-11-14','med',3),('e39',10,10,'équipe et explication à la hauteur des attentes','non','2017-07-15','med',2),('e39',11,11,'Rien à dir, parfait','non','2017-07-29','med',3),('e39',12,12,'méthode parfaite','non','2017-07-27','med',3),('e39',13,13,'médicaments à recommander','non','2017-07-30','med',2),('e39',26,26,'équipe et explication à la hauteur des attentes','non','2017-07-15','med',3),('e39',27,27,'Rien à dir, parfait','non','2017-07-29','med',3),('e39',28,28,'méthode parfaite','non','2017-07-27','med',3),('e39',29,29,'médicaments à recommander','non','2017-07-30','med',2),('e39',42,42,'équipe et explication à la hauteur des attentes','non','2017-07-15','med',2),('e39',43,43,'Rien à dir, parfait','non','2017-07-29','med',3),('e39',44,44,'méthode parfaite','non','2017-07-27','med',2),('e39',45,45,'médicaments à recommander','non','2017-07-30','med',2),('e39',59,59,'équipe et explication à la hauteur des attentes','non','2017-07-15','med',2),('e39',60,60,'Rien à dir, parfait','non','2017-07-29','med',3),('e39',61,61,'méthode parfaite','non','2017-07-27','med',3),('e39',62,62,'médicaments à recommander','non','2017-07-30','med',2),('e39',75,75,'équipe et explication à la hauteur des attentes','non','2017-07-15','med',3),('e39',76,76,'Rien à dir, parfait','non','2017-07-29','med',3),('e39',77,77,'méthode parfaite','non','2017-07-27','med',3),('e39',78,79,'médicaments à recommander','non','2017-07-30','med',2),('e39',92,6,'équipe et explication à la hauteur des attentes','non','2017-07-15','med',2),('e39',93,7,'Rien à dir, parfait','non','2017-07-29','med',3),('e39',94,8,'méthode parfaite','non','2017-07-27','med',2),('e39',95,9,'médicaments à recommander','non','2017-07-30','med',2),('g30',14,14,'particules dangereuse','non','2017-09-29','med',0),('g30',15,15,'médicaments hors normes','non','2017-09-04','med',0),('g30',16,16,'pratique de stérilisation à revoir','non','2017-09-08','med',1),('g30',17,17,'déçu, ne reviendrais plus','non','2017-09-18','med',0),('g30',30,30,'particules dangereuse','non','2017-09-29','med',0),('g30',31,31,'médicaments hors normes','non','2017-09-04','med',0),('g30',32,32,'pratique de stérilisation à revoir','non','2017-09-08','med',0),('g30',33,33,'déçu, ne reviendrais plus','non','2017-09-18','med',0),('g30',46,46,'particules dangereuse','non','2017-09-29','med',0),('g30',47,47,'médicaments hors normes','non','2017-09-04','med',0),('g30',48,48,'pratique de stérilisation à revoir','non','2017-09-08','med',1),('g30',49,49,'déçu, ne reviendrais plus','non','2017-09-18','med',0),('g30',63,63,'particules dangereuse','non','2017-09-29','med',0),('g30',64,64,'médicaments hors normes','non','2017-09-04','med',0),('g30',65,65,'pratique de stérilisation à revoir','non','2017-09-08','med',1),('g30',66,66,'déçu, ne reviendrais plus','non','2017-09-18','med',0),('g30',80,80,'particules dangereuse','non','2017-09-29','med',0),('g30',81,81,'médicaments hors normes','non','2017-09-04','med',0),('g30',82,82,'pratique de stérilisation à revoir','non','2017-09-08','med',0),('g30',83,83,'déçu, ne reviendrais plus','non','2017-09-18','med',0),('g30',96,10,'particules dangereuse','non','2017-09-29','med',0),('g30',97,17,'médicaments hors normes','non','2017-09-04','med',0),('g30',98,18,'pratique de stérilisation à revoir','non','2017-09-08','med',1),('g30',99,19,'déçu, ne reviendrais plus','non','2017-09-18','med',0),('t47',1,1,'Bonjour, je suis satisfait :p','non','2017-09-28','med',2),('t47',2,2,'Fabrication et recherche de qualité','non','2017-09-29','med',2),('t47',3,3,'Très satisfaisant','non','2017-08-15','med',3),('t47',18,18,'Fabrication et recherche de qualité','non','2017-09-29','med',2),('t47',19,19,'Très satisfaisant','non','2017-08-15','med',3),('t47',34,34,'Fabrication et recherche de qualité','non','2017-09-29','med',3),('t47',35,35,'Très satisfaisant','non','2017-08-15','med',3),('t47',50,50,'Bonjour, je suis satisfait :p','non','2017-09-28','med',2),('t47',51,51,'Fabrication et recherche de qualité','non','2017-09-29','med',2),('t47',52,52,'Très satisfaisant','non','2017-08-15','med',3),('t47',67,67,'Fabrication et recherche de qualité','non','2017-09-29','med',2),('t47',68,68,'Très satisfaisant','non','2017-08-15','med',3),('t47',84,84,'Fabrication et recherche de qualité','non','2017-09-29','med',3),('t47',85,85,'Très satisfaisant','non','2017-08-15','med',3);
/*!40000 ALTER TABLE `RAPPORT_VISITE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `REALISER`
--

DROP TABLE IF EXISTS `REALISER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `REALISER` (
  `AC_NUM` int(11) NOT NULL DEFAULT '0',
  `VIS_MATRICULE` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`AC_NUM`,`VIS_MATRICULE`),
  KEY `FK_REALISER_VISITEUR` (`VIS_MATRICULE`),
  CONSTRAINT `FK_REALISER_ACTIVITE_COMPL` FOREIGN KEY (`AC_NUM`) REFERENCES `ACTIVITE_COMPL` (`AC_NUM`),
  CONSTRAINT `FK_REALISER_VISITEUR` FOREIGN KEY (`VIS_MATRICULE`) REFERENCES `VISITEUR` (`VIS_MATRICULE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `REALISER`
--

LOCK TABLES `REALISER` WRITE;
/*!40000 ALTER TABLE `REALISER` DISABLE KEYS */;
INSERT INTO `REALISER` VALUES (1,'a131'),(25,'a131'),(29,'a131'),(53,'a131'),(57,'a131'),(2,'a17'),(26,'a17'),(30,'a17'),(54,'a17'),(58,'a17'),(3,'a55'),(27,'a55'),(31,'a55'),(55,'a55'),(59,'a55'),(4,'a93'),(28,'a93'),(32,'a93'),(56,'a93'),(60,'a93'),(1,'b13'),(5,'b13'),(29,'b13'),(33,'b13'),(57,'b13'),(2,'b16'),(6,'b16'),(30,'b16'),(34,'b16'),(58,'b16'),(3,'b19'),(7,'b19'),(31,'b19'),(35,'b19'),(59,'b19'),(4,'b25'),(8,'b25'),(32,'b25'),(36,'b25'),(60,'b25'),(5,'b28'),(9,'b28'),(33,'b28'),(37,'b28'),(6,'b34'),(10,'b34'),(34,'b34'),(38,'b34'),(7,'b4'),(11,'b4'),(35,'b4'),(39,'b4'),(8,'b50'),(12,'b50'),(36,'b50'),(40,'b50'),(9,'b59'),(13,'b59'),(37,'b59'),(41,'b59'),(10,'c14'),(14,'c14'),(38,'c14'),(42,'c14'),(11,'c3'),(15,'c3'),(39,'c3'),(43,'c3'),(12,'c54'),(16,'c54'),(40,'c54'),(44,'c54'),(13,'d13'),(17,'d13'),(41,'d13'),(45,'d13'),(14,'d51'),(18,'d51'),(42,'d51'),(46,'d51'),(15,'e22'),(19,'e22'),(43,'e22'),(47,'e22'),(16,'e24'),(20,'e24'),(44,'e24'),(48,'e24'),(17,'e39'),(21,'e39'),(45,'e39'),(49,'e39'),(18,'e49'),(22,'e49'),(46,'e49'),(50,'e49'),(19,'e5'),(23,'e5'),(47,'e5'),(51,'e5'),(20,'e52'),(24,'e52'),(48,'e52'),(52,'e52'),(21,'f21'),(25,'f21'),(49,'f21'),(53,'f21'),(22,'f39'),(26,'f39'),(50,'f39'),(54,'f39'),(23,'f4'),(27,'f4'),(51,'f4'),(55,'f4'),(24,'g19'),(28,'g19'),(52,'g19'),(56,'g19');
/*!40000 ALTER TABLE `REALISER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `REGION`
--

DROP TABLE IF EXISTS `REGION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `REGION` (
  `REG_CODE` varchar(4) NOT NULL DEFAULT '',
  `SEC_CODE` varchar(2) DEFAULT NULL,
  `REG_NOM` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`REG_CODE`),
  KEY `FK_REGION_SECTEUR` (`SEC_CODE`),
  CONSTRAINT `FK_REGION_SECTEUR` FOREIGN KEY (`SEC_CODE`) REFERENCES `SECTEUR` (`SEC_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `REGION`
--

LOCK TABLES `REGION` WRITE;
/*!40000 ALTER TABLE `REGION` DISABLE KEYS */;
INSERT INTO `REGION` VALUES ('AL','E','Alsace Lorraine'),('AQ','S','Aquitaine'),('AU','P','Auvergne'),('BG','O','Bretagne'),('BN','O','Basse Normandie'),('BO','E','Bourgogne'),('CA','N','Champagne Ardennes'),('CE','P','Centre'),('FC','E','Franche Comté'),('HN','N','Haute Normandie'),('IF','P','Ile de France'),('LG','S','Languedoc'),('LI','P','Limousin'),('MP','S','Midi Pyrénée'),('NP','N','Nord Pas de Calais'),('PA','S','Provence Alpes Cote d\'\'Azur'),('PC','O','Poitou Charente'),('PI','N','Picardie'),('PL','O','Pays de Loire'),('RA','E','Rhone Alpes'),('RO','S','Roussilon'),('VD','O','Vendée');
/*!40000 ALTER TABLE `REGION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SECTEUR`
--

DROP TABLE IF EXISTS `SECTEUR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SECTEUR` (
  `SEC_CODE` varchar(2) NOT NULL DEFAULT '',
  `SEC_LIBELLE` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`SEC_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SECTEUR`
--

LOCK TABLES `SECTEUR` WRITE;
/*!40000 ALTER TABLE `SECTEUR` DISABLE KEYS */;
INSERT INTO `SECTEUR` VALUES ('E','Est'),('N','Nord'),('O','Ouest'),('P','Paris centre'),('S','Sud');
/*!40000 ALTER TABLE `SECTEUR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SPECIALITE`
--

DROP TABLE IF EXISTS `SPECIALITE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SPECIALITE` (
  `SPE_CODE` varchar(10) NOT NULL DEFAULT '',
  `SPE_LIBELLE` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`SPE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SPECIALITE`
--

LOCK TABLES `SPECIALITE` WRITE;
/*!40000 ALTER TABLE `SPECIALITE` DISABLE KEYS */;
INSERT INTO `SPECIALITE` VALUES ('ACP','anatomie et cytologie pathologiques'),('AMV','angéiologie, Médecine vasculaire'),('ARC','anesthésiologie et réanimation chirurgicale'),('BM','biologie médicale'),('CAC','cardiologie et affections cardio-vasculaires'),('CCT','chirurgie cardio-vasculaire et thoracique'),('CG','chirurgie générale'),('CMF','chirurgie maxillo-faciale'),('COM','cancérologie, oncologie médicale'),('COT','chirurgie orthopédique et traumatologie'),('CPR','chirurgie plastique reconstructrice et esthétique'),('CU','chirurgie urologique'),('CV','chirurgie vasculaire'),('DN','diaBâtologie-nutrition, nutrition'),('DV','dermatologie et vénéréologie'),('EM','endocrinologie et métabolismes'),('ETD','évaluation et traitement de la douleur'),('GEH','gastro-entérologie et hépatologie (appareil digestif)'),('GMO','gynécologie médicale, obstétrique'),('GO','gynécologie-obstétrique'),('HEM','maladies du sang (hématologie)'),('MBS','Médecine et biologie du sport'),('MDT','Médecine du travail'),('MMO','Médecine manuelle - ostéopathie'),('MN','Médecine nucléaire'),('MPR','Médecine physique et de réadaptation'),('MTR','Médecine tropicale, pathologie infectieuse et tropicale'),('NEP','néphrologie'),('NRC','neurochirurgie'),('NRL','neurologie'),('ODM','orthopédie dento maxillo-faciale'),('OPH','ophtalmologie'),('ORL','oto-rhino-laryngologie'),('PEA','psychiatrie de l\'\'enfant et de l\'\'adolescent'),('PME','pédiatrie maladies des enfants'),('PNM','pneumologie'),('PSC','psychiatrie'),('RAD','radiologie (radiodiagnostic et imagerie médicale)'),('RDT','radiothérapie (oncologie option radiothérapie)'),('RGM','reproduction et gynécologie médicale'),('RHU','rhumatologie'),('STO','stomatologie'),('SXL','sexologie'),('TXA','toxicomanie et alcoologie');
/*!40000 ALTER TABLE `SPECIALITE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TRAVAILLER`
--

DROP TABLE IF EXISTS `TRAVAILLER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TRAVAILLER` (
  `VIS_MATRICULE` varchar(20) NOT NULL DEFAULT '',
  `JJMMAA` date NOT NULL DEFAULT '0000-00-00',
  `REG_CODE` varchar(4) NOT NULL DEFAULT '',
  `TRA_ROLE` varchar(22) DEFAULT NULL,
  PRIMARY KEY (`VIS_MATRICULE`,`JJMMAA`,`REG_CODE`),
  KEY `FK_TRAVAILLER_REGION` (`REG_CODE`),
  CONSTRAINT `FK_TRAVAILLER_REGION` FOREIGN KEY (`REG_CODE`) REFERENCES `REGION` (`REG_CODE`),
  CONSTRAINT `FK_TRAVAILLER_VISITEUR` FOREIGN KEY (`VIS_MATRICULE`) REFERENCES `VISITEUR` (`VIS_MATRICULE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TRAVAILLER`
--

LOCK TABLES `TRAVAILLER` WRITE;
/*!40000 ALTER TABLE `TRAVAILLER` DISABLE KEYS */;
INSERT INTO `TRAVAILLER` VALUES ('a131','2014-01-05','BN','Visiteur'),('a131','2014-03-03','BG','Visiteur'),('a17','2014-01-05','RA','Visiteur'),('a55','2014-03-02','RO','Visiteur'),('a93','2008-02-10','PC','Visiteur'),('b13','2014-03-03','AL','Visiteur'),('b16','2014-04-04','BG','Visiteur'),('b19','2008-02-10','PL','Visiteur'),('b25','2001-01-00','PL','Délégué'),('b25','2014-03-02','PL','Visiteur'),('b28','2008-02-10','LG','Visiteur'),('b34','2014-01-20','CE','Délégué'),('b4','2003-03-01','AQ','Visiteur'),('b50','2003-03-01','PA','Visiteur'),('b59','2014-03-02','RA','Visiteur'),('c14','2003-03-01','PA','Responsable'),('c14','2014-04-04','PA','Délégué'),('c3','2014-01-05','CA','Visiteur'),('c54','2014-01-05','AL','Visiteur'),('d13','2014-01-05','PL','Visiteur'),('d51','2003-03-01','FC','Responsable'),('e22','2014-03-12','AL','Visiteur'),('e24','2008-02-10','AL','Responsable'),('e39','2014-03-12','IF','Visiteur'),('e49','2014-03-03','MP','Visiteur'),('e5','2003-03-01','AQ','Responsable'),('e52','2014-01-05','HN','Visiteur'),('f21','2014-01-20','RA','Visiteur'),('f39','2014-04-04','RA','Visiteur'),('f4','2014-03-02','MP','Visiteur'),('g19','2014-03-03','IF','Visiteur'),('g30','2003-03-01','PI','Responsable'),('g53','2014-02-20','BG','Visiteur'),('g7','2014-03-03','LI','Visiteur'),('h13','2014-01-20','LI','Visiteur'),('h30','2003-03-01','IF','Visiteur'),('h35','2014-01-20','AU','Visiteur'),('h40','2014-01-05','CA','Visiteur'),('j45','2003-03-01','CA','Responsable'),('j50','2014-01-05','NP','Visiteur'),('j8','2008-02-10','IF','Responsable'),('k4','2014-03-03','LG','Visiteur'),('k53','2014-01-05','AL','Délégué'),('k53','2014-02-20','CA','Visiteur'),('l14','2014-03-02','PL','Visiteur'),('l23','2014-03-02','PC','Visiteur'),('l46','2014-03-03','PL','Visiteur'),('l56','2014-03-03','FC','Visiteur'),('m35','2014-03-12','MP','Visiteur'),('m45','2014-03-12','AL','Visiteur'),('n42','2014-03-03','HN','Visiteur'),('n58','2014-01-05','CE','Visiteur'),('n59','2014-03-02','PI','Visiteur'),('o26','2014-03-02','LG','Visiteur'),('p32','2014-01-20','IF','Visiteur'),('p40','2008-02-10','BN','Responsable'),('p41','2008-02-10','PC','Visiteur'),('p42','2014-03-02','PI','Visiteur'),('p49','2014-02-20','CE','Visiteur'),('p6','0000-00-00','AQ','Visiteur'),('p7','2014-03-12','RO','Visiteur'),('p8','2014-01-05','BO','Visiteur'),('q17','2003-03-01','BN','Visiteur'),('r24','2014-02-20','BN','Visiteur'),('r58','2014-03-12','BG','Visiteur'),('s10','2014-03-03','FC','Visiteur'),('s21','2014-01-05','LI','Visiteur'),('t43','2014-03-02','BO','Visiteur'),('t47','2004-05-02','PI','Visiteur'),('t55','2014-03-02','MP','Visiteur'),('t60','2014-03-12','CE','Visiteur');
/*!40000 ALTER TABLE `TRAVAILLER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TYPE_INDIVIDU`
--

DROP TABLE IF EXISTS `TYPE_INDIVIDU`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TYPE_INDIVIDU` (
  `TIN_CODE` varchar(10) NOT NULL DEFAULT '',
  `TIN_LIBELLE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`TIN_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TYPE_INDIVIDU`
--

LOCK TABLES `TYPE_INDIVIDU` WRITE;
/*!40000 ALTER TABLE `TYPE_INDIVIDU` DISABLE KEYS */;
/*!40000 ALTER TABLE `TYPE_INDIVIDU` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TYPE_PRATICIEN`
--

DROP TABLE IF EXISTS `TYPE_PRATICIEN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TYPE_PRATICIEN` (
  `TYP_CODE` varchar(6) NOT NULL DEFAULT '',
  `TYP_LIBELLE` varchar(50) DEFAULT NULL,
  `TYP_LIEU` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`TYP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TYPE_PRATICIEN`
--

LOCK TABLES `TYPE_PRATICIEN` WRITE;
/*!40000 ALTER TABLE `TYPE_PRATICIEN` DISABLE KEYS */;
INSERT INTO `TYPE_PRATICIEN` VALUES ('MH','Médecin Hospitalier','Hopital ou clinique'),('MV','Médecine de Ville','Cabinet'),('PH','Pharmacien Hospitalier','Hopital ou clinique'),('PO','Pharmacien Officine','Pharmacie'),('PS','Personnel de santé','Centre paramédical');
/*!40000 ALTER TABLE `TYPE_PRATICIEN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `VISITEUR`
--

DROP TABLE IF EXISTS `VISITEUR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `VISITEUR` (
  `VIS_MATRICULE` varchar(20) NOT NULL DEFAULT '',
  `VIS_NOM` varchar(50) DEFAULT NULL,
  `VIS_PRENOM` varchar(100) DEFAULT NULL,
  `VIS_ADRESSE` varchar(100) DEFAULT NULL,
  `VIS_CP` varchar(10) DEFAULT NULL,
  `VIS_VILLE` varchar(60) DEFAULT NULL,
  `VIS_DATEEMBAUCHE` date DEFAULT NULL,
  `SEC_CODE` varchar(2) DEFAULT NULL,
  `LAB_CODE` varchar(4) DEFAULT NULL,
  `VIS_MDP` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`VIS_MATRICULE`),
  KEY `FK_VISITEUR_SECTEUR` (`SEC_CODE`),
  KEY `FK_VISITEUR_LABORATOIRE` (`LAB_CODE`),
  CONSTRAINT `FK_VISITEUR_LABORATOIRE` FOREIGN KEY (`LAB_CODE`) REFERENCES `LABORATOIRE` (`LAB_CODE`),
  CONSTRAINT `FK_VISITEUR_SECTEUR` FOREIGN KEY (`SEC_CODE`) REFERENCES `SECTEUR` (`SEC_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `VISITEUR`
--

LOCK TABLES `VISITEUR` WRITE;
/*!40000 ALTER TABLE `VISITEUR` DISABLE KEYS */;
INSERT INTO `VISITEUR` VALUES ('a131','Villechalane','Louis','8 cours Lafontaine','29000','BREST','2012-11-08',NULL,'SW','azerty'),('a17','Andre','David','1 rue Aimon de Chissee','38100','GRENOBLE','2008-06-19',NULL,'GY','azerty'),('a55','Bedos','Christian','1 rue Bénédictins','65000','TARBES','2007-09-07',NULL,'GY','test'),('a93','Tusseau','Louis','22 rue Renou','86000','POITIERS','2001-02-09',NULL,'SW','azerty'),('b13','Bentot','Pascal','11 avenue 6 Juin','67000','STRASBOURG','2003-11-06',NULL,'GY','azerty'),('b16','Bioret','Luc','1 rue Linne','35000','RENNES','2003-01-06',NULL,'SW','azerty'),('b19','Bunisset','Francis','10 rue Nicolas Chorier','85000','LA ROCHE SUR YON','2013-09-23',NULL,'GY','azerty'),('b25','Bunisset','Denise','1 rue Lionne','49100','ANGERS','2007-03-04',NULL,'SW','azerty'),('b28','Cacheux','Bernard','114 rue Authie','34000','MONTPELLIER','2008-02-10',NULL,'GY','azerty'),('b34','Cadic','Eric','123 rue Caponière','41000','BLOIS','2012-06-03','P','SW','azerty'),('b4','Charoze','Catherine','100 place Géants','33000','BORDEAUX','2009-05-07',NULL,'SW','azerty'),('b50','Clepkens','Christophe','12 rue Fédérico Garcia Lorca','13000','MARSEILLE','2011-08-18',NULL,'SW','azerty'),('b59','Cottin','Vincenne','36 square Capucins','5000','GAP','2010-12-19',NULL,'GY','azerty'),('c14','Daburon','François','13 rue Champs Elysées','6000','NICE','2012-01-20','S','SW','azerty'),('c3','De','Philippe','13 rue Charles Peguy','10000','TROYES','2005-05-29',NULL,'SW','azerty'),('c54','Debelle','Michel','181 rue Caponière','88000','EPINAL','2004-09-19',NULL,'SW','azerty'),('d13','Debelle','Jeanne','134 rue Stalingrad','44000','NANTES','2012-05-25',NULL,'SW','azerty'),('d51','Debroise','Michel','2 avenue 6 Juin','70000','VESOUL','2011-08-17','E','GY','azerty'),('e22','Desmarquest','Nathalie','14 rue Fédérico Garcia Lorca','54000','NANCY','2013-04-18',NULL,'GY','azerty'),('e24','Desnost','Pierre','16 rue Barral de Montferrat','55000','VERDUN','2013-04-18','E','SW','azerty'),('e39','Dudouit','Frédéric','18 quai Xavier Jouvin','75000','PARIS','2013-04-18',NULL,'GY','azerty'),('e49','Duncombe','Claude','19 avenue Alsace Lorraine','9000','FOIX','2012-09-16',NULL,'GY','azerty'),('e5','Enault-Pascreau','Céline','25B rue Stalingrad','40000','MONT DE MARSAN','2012-09-16','S','GY','azerty'),('e52','Eynde','Valérie','3 rue Henri Moissan','76000','ROUEN','2012-09-16',NULL,'GY','azerty'),('f21','Finck','Jacques','route Montreuil Bellay','74000','ANNECY','2012-09-16',NULL,'SW','azerty'),('f39','Frémont','Fernande','4 rue Jean Giono','69000','LYON','2005-05-29',NULL,'GY','azerty'),('f4','Gest','Alain','30 rue Authie','46000','FIGEAC','2005-05-29',NULL,'GY','azerty'),('g19','Gheysen','Galassus','32 boulevard Mar Foch','75000','PARIS','2005-05-29',NULL,'SW','azerty'),('g30','Girard','Yvon','31 avenue du 6 Juin','80000','AMIENS','2012-05-25','N','GY','azerty'),('g53','Gombert','Luc','32 rue Emile Gueymard','56000','VANNES','2012-05-25',NULL,'GY','azerty'),('g7','Guindon','Caroline','40 rue Mar Montgomery','87000','LIMOGES','2012-05-25',NULL,'GY','azerty'),('h13','Guindon','François','44 rue Picotière','19000','TULLE','2012-05-25',NULL,'SW','azerty'),('h30','Igigabel','Guy','33 rue Arlequin','94000','CRETEIL','2008-06-19',NULL,'SW','azerty'),('h35','Jourdren','Pierre','34 avenue Jean Perrot','15000','AURRILLAC','2008-06-19',NULL,'GY','azerty'),('h40','Juttard','Pierre-Raoul','34 cours Jean Jaurès','8000','SEDAN','2008-06-19',NULL,'GY','azerty'),('j45','Euré-Morel','Saout','38 cours Berriat','52000','CHAUMONT','2008-06-19','N','SW','azerty'),('j50','LAndré','Philippe','4 avenue du Général Laperrine','59000','LILLE','2000-05-01',NULL,'GY','azerty'),('j8','Langeard','Hugues','39 avenue Jean Perrot','93000','BAGNOLET','2000-05-01','P','GY','azerty'),('k4','Lanne','Bernard','4 rue Bayeux','30000','NIMES','2000-05-01',NULL,'SW','azerty'),('k53','Le','Noêl','4 avenue Beauvert','68000','MULHOUSE','2000-05-01',NULL,'SW','azerty'),('l14','Le','Jean','39 rue Raspail','53000','LAVAL','2000-05-01',NULL,'SW','azerty'),('l23','Leclercq','Servane','11 rue Quinconce','18000','BOURGES','1998-11-23',NULL,'SW','azerty'),('l46','Lecornu','Jean-Bernard','4 boulevard du Maréchal Foch','72000','LA FERTE BERNARD','1998-11-23',NULL,'GY','azerty'),('l56','Lecornu','Ludovic','4 rue Abel Servien','25000','BESANCON','1998-11-23',NULL,'SW','azerty'),('m35','Lejard','Agnès','4 rue Anthoard','82000','MONTAUBAN','1998-11-23',NULL,'SW','azerty'),('m45','Lesaulnier','Pascal','47 rue Thiers','57000','METZ','1998-11-23',NULL,'SW','azerty'),('n42','Letessier','Stéphane','5 chemin de Capuche','27000','EVREUX','1998-11-23',NULL,'GY','azerty'),('n58','Loirat','Didier','12 avenue Bourg la Croix','45000','ORLEANS','1998-11-23',NULL,'GY','azerty'),('n59','Maffezzoli','Thibaud','5 rue Chateaubriand','2000','LAON','2005-12-21',NULL,'SW','azerty'),('o26','Mancini','Anne','5 rue D\'\'Agier','48000','MENDE','2005-12-21',NULL,'GY','azerty'),('p32','Marcouiller','Gérard','7 place St Gilles','91000','ISSY LES MOULINEAUX','2005-12-21',NULL,'GY','azerty'),('p40','Michel','Jean-Claude','5 rue Gabriel Péri','61000','FLERS','2005-12-21','O','SW','azerty'),('p41','Montecot','Françoise','6 rue Paul Valéry','17000','SAINTES','2005-12-21',NULL,'GY','azerty'),('p42','Notini','Veronique','5 rue du Lieutenant Chabal','60000','BEAUVAIS','2005-12-21',NULL,'SW','azerty'),('p49','Onfroy','Den','5 rue Sidonie Jacolin','37000','TOURS','2005-12-21',NULL,'GY','azerty'),('p6','Pascreau','Charles','57 boulevard Mar Foch','64000','PAU','1997-03-30',NULL,'SW','azerty'),('p7','Pernot','Claude-Noël','6 rue Alexandre 1 de Yougoslavie','11000','NARBONNE','2003-01-02',NULL,'SW','azerty'),('p8','Perrier','Maêtre','6 rue Aubert Dubayet','71000','CHALON SUR SAONE','2006-06-23',NULL,'GY','azerty'),('q17','Petit','Jean-Louis','7 rue Ernest Renan','50000','SAINT LO','2009-06-07',NULL,'GY','azerty'),('r24','Piquery','Patrick','9 rue Vaucelles','14000','CAEN','2007-04-29','O','GY','azerty'),('r58','Quiquandon','Joêll','7 rue Ernest Renan','29000','QUIMPER','2006-09-30',NULL,'GY','azerty'),('s10','Retailleau','Josselin','88 bis rue Saumuroise','39000','DOLE','2011-12-05',NULL,'SW','azerty'),('s21','Retailleau','Pascal','32 boulevard Ayrault','23000','MONTLUCON','2009-05-09',NULL,'SW','azerty'),('t43','Souron','Maryse','7B rue Gay Lussac','21000','DIJON','2003-09-03',NULL,'SW','azerty'),('t47','Tiphagne','Patrick','7B rue Gay Lussac','62000','ARRAS','1997-08-29',NULL,'SW','azerty'),('t55','Tréhet','Alain','7D chemin Barral','12000','RODEZ','1994-11-29',NULL,'SW','azerty'),('t60','Tusseau','Josselin','63 rue Bon Repos','28000','CHARTRES','1991-03-29',NULL,'GY','azerty');
/*!40000 ALTER TABLE `VISITEUR` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-02 21:30:50
