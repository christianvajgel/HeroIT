-- -- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
-- --
-- -- Host: 127.0.0.1    Database: heroit
-- -- ------------------------------------------------------
-- -- Server version	8.0.19
--
-- /*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
-- /*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
-- /*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
-- /*!50503 SET NAMES utf8 */;
-- /*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
-- /*!40103 SET TIME_ZONE='+00:00' */;
-- /*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
-- /*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
-- /*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- /*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
--
-- --
-- -- Table structure for table `heroes`
-- --
--
-- DROP TABLE IF EXISTS `heroes`;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!50503 SET character_set_client = utf8mb4 */;
-- CREATE TABLE `heroes` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `heroName` varchar(45) NOT NULL,
--   `power` varchar(45) NOT NULL,
--   `universe` varchar(45) NOT NULL,
--   `creationDate` varchar(45) NOT NULL,
--   `deleted` int DEFAULT '0',
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
-- /*!40101 SET character_set_client = @saved_cs_client */;
--
-- --
-- -- Dumping data for table `heroes`
-- --
--
-- LOCK TABLES `heroes` WRITE;
-- /*!40000 ALTER TABLE `heroes` DISABLE KEYS */;
-- INSERT INTO `heroes` VALUES (1,'Hero 1','Power 1','Universe 1','14/03/2020',1),(2,'Hero 2','Power 2','Universe 2','14/03/2020',1),(3,'Hero 3','Power 3','Universe 3','14/03/2020',0),(4,'Hero 4','Power 4','Universe 4','14/03/2020',0),(5,'Hero 5','Power 5','Universe 5','14/03/2020',0),(6,'Hero 6','Power 6','Universe 6','14/03/2020',0),(7,'Hero 7','Power 7','Universe 7','14/03/2020',0),(8,'Hero 8','Power 8','Universe 8','14/03/2020',0),(9,'Hero 9','Power 9','Universe 9','14/03/2020',0),(10,'Hero 10','Power 10','Universe 10','14/03/2020',0),(11,'SUPER','POWER','UNIVERSE','15/03/2020',0);
-- /*!40000 ALTER TABLE `heroes` ENABLE KEYS */;
-- UNLOCK TABLES;
--
-- --
-- -- Table structure for table `powers`
-- --
--
-- DROP TABLE IF EXISTS `powers`;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!50503 SET character_set_client = utf8mb4 */;
-- CREATE TABLE `powers` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `power` varchar(45) NOT NULL,
--   `deleted` int NOT NULL DEFAULT '0',
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
-- /*!40101 SET character_set_client = @saved_cs_client */;
--
-- --
-- -- Dumping data for table `powers`
-- --
--
-- LOCK TABLES `powers` WRITE;
-- /*!40000 ALTER TABLE `powers` DISABLE KEYS */;
-- INSERT INTO `powers` VALUES (1,'Code completion',0),(2,'Coffee deploy',0),(3,'Double braces',0),(4,'Find lost flash drive',0),(5,'Locate open functions',0),(6,'Quick printer fix',0);
-- /*!40000 ALTER TABLE `powers` ENABLE KEYS */;
-- UNLOCK TABLES;
--
-- --
-- -- Table structure for table `universes`
-- --
--
-- DROP TABLE IF EXISTS `universes`;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!50503 SET character_set_client = utf8mb4 */;
-- CREATE TABLE `universes` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `universe` varchar(45) NOT NULL,
--   `deleted` int NOT NULL DEFAULT '0',
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
-- /*!40101 SET character_set_client = @saved_cs_client */;
--
-- --
-- -- Dumping data for table `universes`
-- --
--
-- LOCK TABLES `universes` WRITE;
-- /*!40000 ALTER TABLE `universes` DISABLE KEYS */;
-- INSERT INTO `universes` VALUES (1,'EY Comics',0),(2,'Trainee Comics',0),(3,'Others',0);
-- /*!40000 ALTER TABLE `universes` ENABLE KEYS */;
-- UNLOCK TABLES;
--
-- --
-- -- Dumping events for database 'heroit'
-- --
--
-- --
-- -- Dumping routines for database 'heroit'
-- --
-- /*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
--
-- /*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
-- /*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
-- /*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
-- /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
-- /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
-- /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
-- /*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
--
-- -- Dump completed on 2020-03-16 19:41:48
