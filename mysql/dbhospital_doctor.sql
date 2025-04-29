-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2025 at 10:00 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `dbhospital_doctor`
--
CREATE DATABASE IF NOT EXISTS `dbhospital_doctor` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `dbhospital_doctor`;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--
CREATE TABLE `doctor` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `specialization` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `available` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--
INSERT INTO `doctor` (`id`, `name`, `specialization`, `description`, `available`) VALUES
(1, 'Dr. Ahmad', 'Cardiology', 'Spesialis jantung berpengalaman', 1),
(2, 'Dr. Siti', 'Pediatrics', 'Spesialis anak-anak', 1),
(3, 'Dr. Budi', 'Orthopedics', 'Spesialis tulang dan sendi', 0);

-- 
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

COMMIT;
