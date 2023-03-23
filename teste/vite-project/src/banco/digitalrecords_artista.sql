-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: digitalrecords
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `artista`
--

DROP TABLE IF EXISTS `artista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `artista` (
  `dtype` varchar(31) NOT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data_nascimento` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `premiacoes` varchar(255) DEFAULT NULL,
  `formacao` varchar(255) DEFAULT NULL,
  `atuacao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artista`
--

LOCK TABLES `artista` WRITE;
/*!40000 ALTER TABLE `artista` DISABLE KEYS */;
INSERT INTO `artista` VALUES ('Musico',1,'1981-09-04','Pop','Beyoncé','28 Grammys',NULL,'Cantora e compositora'),('Musico',2,'1991-02-17','Pop','Ed Sheeran','4 Grammys',NULL,'Cantor, compositor e instrumentista'),('Musico',3,'1987-06-17','Hip-hop','Kendrick Lamar','13 Grammys',NULL,'Rapper e produtor musical'),('Musico',4,'1988-05-05','Pop','Adele','15 Grammys',NULL,'Cantora e compositora'),('Musico',5,'1977-10-16','Pop rock','John Mayer','7 Grammys',NULL,'Cantor, compositor e instrumentista'),('Musico',6,'1950-05-13','Soul','Stevie Wonder','25 Grammys',NULL,'Cantor, compositor, instrumentista e produtor musical'),('Musico',7,'1985-10-08','Pop','Bruno Mars','11 Grammys',NULL,'Cantor, compositor, instrumentista e produtor musical'),('Musico',8,'1990-02-16','R&B, Pop, Hip-hop','The Weeknd','4 Grammys',NULL,'Cantor, compositor e produtor musical'),('Musico',9,'1988-02-20','Pop, R&B, Hip-hop, Reggae','Rihanna','9 Grammys',NULL,'Cantora, compositora, atriz e empresária'),('Musico',10,'1977-06-08','Hip-hop, Pop','Kanye West','22 Grammys',NULL,'Rapper, produtor musical, designer e empresário'),('Ator',11,'1980-05-20','Masculino','John Smith','Melhor Ator','Bacharel em Artes Dramáticas',NULL),('Ator',12,'1959-04-15','Feminino','Emma Thompson','Oscar','Bacharel em Literatura Inglesa',NULL),('Ator',13,'1974-11-11','Masculino','Leonardo DiCaprio','Oscar','Teatro',NULL),('Ator',14,'1949-06-22',NULL,'Meryl Streep','Oscar','Bacharel em Artes Dramáticas',NULL),('Ator',15,'1956-07-09','Masculino','Tom Hanks','Oscar','Bacharel em Teatro',NULL),('Ator',16,'1969-05-14','Feminino','Cate Blanchett','Oscar','Bacharel em Artes Dramáticas',NULL),('Ator',17,'1943-08-17','Masculino','Robert De Niro','Globo de Ouro','Teatro',NULL),('Ator',18,'1962-11-19','Feminino','Jodie Foster','Oscar','Teatro',NULL),('Ator',19,'1954-12-28','Masculino','Denzel Washington','Oscar','Artes Cênicas',NULL);
/*!40000 ALTER TABLE `artista` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-23 12:51:13
