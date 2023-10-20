-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-09-2023 a las 23:46:55
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
-- Base de datos: `datosacademicos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datosacademicos`
--

CREATE TABLE `datosacademicos` (
  `id` int(11) NOT NULL,
  `documento` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `ingreso` varchar(20) NOT NULL,
  `observacion` varchar(20) NOT NULL,
  `procedencia` varchar(20) NOT NULL,
  `condicion` varchar(20) NOT NULL,
  `grado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `datosacademicos`
--

INSERT INTO `datosacademicos` (`id`, `documento`, `nombre`, `ingreso`, `observacion`, `procedencia`, `condicion`, `grado`) VALUES
(15, '1002243097', 'abel', '02/08/2023', 'faltan papeles', 'san lucas', 'admitido', '11'),
(16, '1000243097', 'abel antonio', '02/08/2023', 'no colombiano', 'san lucas', 'no admitido', '9');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datosacademicos`
--
ALTER TABLE `datosacademicos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datosacademicos`
--
ALTER TABLE `datosacademicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
