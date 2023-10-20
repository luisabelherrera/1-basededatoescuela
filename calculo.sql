-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-09-2023 a las 23:48:11
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `calculo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promedio`
--

CREATE TABLE `promedio` (
  `id` int(11) NOT NULL,
  `documento` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `grado` varchar(20) NOT NULL,
  `nota1` varchar(20) NOT NULL,
  `nota2` varchar(20) NOT NULL,
  `nota3` varchar(20) NOT NULL,
  `promedio` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `promedio`
--

INSERT INTO `promedio` (`id`, `documento`, `nombre`, `grado`, `nota1`, `nota2`, `nota3`, `promedio`, `estado`) VALUES
(11, 'abelito', 'luis abel', '11', '1', '5', '2', '2.6666667', 'reprobado'),
(13, '100243097', 'esteban daniel', '10', '3', '2', '4', '3.0', 'Aprobado'),
(14, '20', 'juan david', '7', '3', '4.5', '2', '3.1666667', 'Aprobado'),
(15, '20', 'juan david', '7', '3', '2', '2', '2.3333333', 'reprobado'),
(16, '20', 'juan david', '7', '3', '2', '4', '3.0', 'Aprobado'),
(17, '20', 'pepe', '7', '5.0', '2', '4', '3.6666667', 'Aprobado'),
(18, '3218344569', 'abelito', '8', '4', '3', '2', '3.0', 'Aprobado'),
(19, '3218344569', 'abelito', '8', '2', '2', '2', '2.0', 'reprobado'),
(20, '1002204031', 'LUIS ABEL', '5', '2', '3', '1', '2.0', 'reprobado'),
(21, '1002204031', 'LUIS ABEL', '5', '3', '3', '4', '3.3333333', 'Aprobado');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `promedio`
--
ALTER TABLE `promedio`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `promedio`
--
ALTER TABLE `promedio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
