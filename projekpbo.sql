-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 04, 2021 at 09:34 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projekpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenis_iphone`
--

CREATE TABLE `jenis_iphone` (
  `id` int(55) NOT NULL,
  `Tipe` varchar(55) NOT NULL,
  `input_by` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jenis_iphone`
--

INSERT INTO `jenis_iphone` (`id`, `Tipe`, `input_by`) VALUES
(1, 'iPhone 6/6s', 1),
(2, 'iPhone 6 Plus/6s', 1),
(3, 'iPhone 7', 1),
(4, 'iPhone 7 Plus', 1),
(5, 'iPhone 8', 1),
(6, 'iPhone 8 Plus', 1),
(7, 'iPhone X', 1),
(8, 'iPhone XR', 1),
(9, 'iPhone XS', 1),
(10, 'iPhone XS Max', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pay`
--

CREATE TABLE `pay` (
  `id` int(11) NOT NULL,
  `payment` varchar(225) NOT NULL,
  `no_rek` varchar(225) NOT NULL,
  `atas_nama` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pay`
--

INSERT INTO `pay` (`id`, `payment`, `no_rek`, `atas_nama`) VALUES
(1, 'OVO', '087829932133', 'Kintan KH'),
(2, 'Dana', '0878233240922', 'Rangga P'),
(3, 'Bayar Langsung ', 'Silakan Berikan Uang Pada Karyawan Kami', 'iRepair');

-- --------------------------------------------------------

--
-- Table structure for table `pesannan`
--

CREATE TABLE `pesannan` (
  `id` int(225) NOT NULL,
  `nama` varchar(225) NOT NULL,
  `no` varchar(225) NOT NULL,
  `alamat` varchar(225) NOT NULL,
  `pesanan` varchar(225) NOT NULL,
  `harga` int(225) NOT NULL,
  `pembayaran` varchar(225) NOT NULL,
  `id_Pembeli` varchar(225) NOT NULL,
  `status` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesannan`
--

INSERT INTO `pesannan` (`id`, `nama`, `no`, `alamat`, `pesanan`, `harga`, `pembayaran`, `id_Pembeli`, `status`) VALUES
(16, 'Muhamad Rifqi', '087809924118', 'Jalan Kebon Bawang no2s', 'LCD iPhone 6 Plus/6s	425000	1\r\nBatrai iPhone 6 Plus/6s	125000	1\r\nFLEXIBLE ON/OFF iPhone 6 Plus/6s 175000	1\r\nBuzzer speaker iPhone 6 Plus/6s	200000	1\r\n', 925000, 'OVO', 'rifqi21', 'Sedang Di Proses');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(225) NOT NULL,
  `nama` varchar(225) NOT NULL,
  `username` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `no_hp` varchar(225) DEFAULT NULL,
  `jeniskelamin` varchar(225) DEFAULT NULL,
  `alamat` varchar(225) DEFAULT NULL,
  `password` varchar(225) NOT NULL,
  `role` enum('Admin','Pengguna') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `username`, `email`, `no_hp`, `jeniskelamin`, `alamat`, `password`, `role`) VALUES
(1, 'Muhamad Rifqi', 'rifqi21', 'dsdasdWS@gmail.com', '087809924118', 'Laki - Laki', 'Jalan Kebon Bawang no2s', '1', 'Pengguna'),
(2, 'Rangga Pujangga', 'rangga.pujangga', 'rangga.pujangga@yarsi.ac.id', '08782673212', '', 'Jln.Setatus Tak Kunjung Ada', '50118339514', 'Pengguna'),
(3, 'Rangg', 'rangga110', 'ranggapujangga110@gmail.com', '081287263286', 'Pilih Jenis Kelamin', 'yarsi', 'Yuhaririz', 'Pengguna'),
(4, 'Sukijan', 'rancu2', 'story.jnt.jne@skut.se', '0', '0', '0', '949072214522', 'Pengguna');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenis_iphone`
--
ALTER TABLE `jenis_iphone`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Tipe` (`Tipe`),
  ADD KEY `input_by` (`input_by`);

--
-- Indexes for table `pay`
--
ALTER TABLE `pay`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pesannan`
--
ALTER TABLE `pesannan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `status` (`status`),
  ADD KEY `id_Pembeli` (`id_Pembeli`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jenis_iphone`
--
ALTER TABLE `jenis_iphone`
  MODIFY `id` int(55) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `pay`
--
ALTER TABLE `pay`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pesannan`
--
ALTER TABLE `pesannan`
  MODIFY `id` int(225) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(225) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jenis_iphone`
--
ALTER TABLE `jenis_iphone`
  ADD CONSTRAINT `jenis_iphone_ibfk_1` FOREIGN KEY (`input_by`) REFERENCES `user` (`id`);

--
-- Constraints for table `pesannan`
--
ALTER TABLE `pesannan`
  ADD CONSTRAINT `pesannan_ibfk_1` FOREIGN KEY (`id_Pembeli`) REFERENCES `user` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
