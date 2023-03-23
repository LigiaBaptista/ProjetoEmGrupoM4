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
-- Table structure for table `midia`
--

DROP TABLE IF EXISTS `midia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `midia` (
  `dtype` varchar(31) NOT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ano` int DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `poster_url` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `diretor` varchar(255) DEFAULT NULL,
  `duracao` int DEFAULT NULL,
  `produtor` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `artista` varchar(255) DEFAULT NULL,
  `notas` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `midia`
--

LOCK TABLES `midia` WRITE;
/*!40000 ALTER TABLE `midia` DISABLE KEYS */;
INSERT INTO `midia` VALUES ('Filme',1,2004,'comédia','https://m.media-amazon.com/images/M/MV5BMTY3OTg2OTM3OV5BMl5BanBnXkFtZTYwNzY5OTA3._V1_SX300.jpg','As Branquelas','Keenen Ivory Wayans',109,NULL,'longa',NULL,NULL),('Filme',2,2004,'desenho','https://m.media-amazon.com/images/M/MV5BMTQ1MjQwMTE5OF5BMl5BanBnXkFtZTgwNjk3MTcyMDE@._V1_SX300.jpg','Frozen','Chris Buck, Jennifer Lee',102,NULL,'longa',NULL,NULL),('Filme',3,1999,'drama','https://m.media-amazon.com/images/M/MV5BNDIzNDU0YzEtYzE5Ni00ZjlkLTk5ZjgtNjM3NWE4YzA3Nzk3XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_SX300.jpg','Clube da Luta','David Fincher',139,NULL,'longa',NULL,NULL),('Filme',4,1985,'drama, comédia','https://m.media-amazon.com/images/M/MV5BOTM5N2ZmZTMtNjlmOS00YzlkLTk3YjEtNTU1ZmQ5OTdhODZhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg','O Clube dos Cinco','John Hughes',139,NULL,'longa',NULL,NULL),('Filme',5,2006,'comédia','https://m.media-amazon.com/images/M/MV5BMTA1MTUxNDY4NzReQTJeQWpwZ15BbWU2MDE3ODAxNw@@._V1_SX300.jpg','Click','Frank Coraci',107,NULL,'longa',NULL,NULL),('Filme',6,2001,'aventura','https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg','Senhor dos Anéis','Ralph Bakshi',132,NULL,'longa',NULL,NULL),('Filme',7,2016,'animação','https://m.media-amazon.com/images/M/MV5BMjI4MzU5NTExNF5BMl5BanBnXkFtZTgwNzY1MTEwMDI@._V1_SX300.jpg','Moana','Ron Clements, John Musker, Don Hall',132,NULL,'longa',NULL,NULL),('Filme',8,2017,'animação','https://m.media-amazon.com/images/M/MV5BYjQ5NjM0Y2YtNjZkNC00ZDhkLWJjMWItN2QyNzFkMDE3ZjAxXkEyXkFqcGdeQXVyODIxMzk5NjA@._V1_SX300.jpg','Viva a Vida é Uma Festa','Lee Unkrich, Adrian Molina',132,NULL,'longa',NULL,NULL),('Filme',9,2006,'drama, romance','https://m.media-amazon.com/images/M/MV5BMDM0MjFlOGYtNTg2ZC00MmRkLTg5OTQtM2U5ZjUyYTgxZThiXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg','Orgulho e Preconceito',NULL,327,NULL,'longa',NULL,NULL),('Filme',10,2005,'ação, ficção','https://m.media-amazon.com/images/M/MV5BODZiMzAxNTctZjdiZC00OGY5LTg2NDAtNWJhNmQwZTcyMWQ2XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_SX300.jpg','Constantine','Francis Lawrence',121,NULL,'longa',NULL,NULL),('Musica',11,2021,'Synth-pop',NULL,'Save Your Tears',NULL,3,NULL,NULL,'Bruno Mars',10),('Musica',12,2016,'pop','https://upload.wikimedia.org/wikipedia/pt/thumb/3/32/Capa_de_Needed_Me.png/220px-Capa_de_Needed_Me.png','Needed Me',NULL,3,NULL,NULL,'Rihanna',10),('Musica',13,2013,'Hip-hop','','Bound 2',NULL,3,NULL,NULL,'Kanye West',10),('Musica',14,2016,'Hip-hop, Gospel','','Father Stretch My Hands Pt.1',NULL,2,NULL,NULL,'Kanye West',10);
/*!40000 ALTER TABLE `midia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-23 12:51:14
