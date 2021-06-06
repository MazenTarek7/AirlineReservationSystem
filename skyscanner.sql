-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2021 at 10:56 PM
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
-- Database: `skyscanner`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `StaffNo` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`StaffNo`, `Username`, `Password`) VALUES
(3, 'Admin1', 'Admin1010'),
(12, 'Admin2', 'Admin2020'),
(13, 'Admin3', 'Admin3030'),
(14, 'Admin4', 'Admin4040'),
(15, 'Admin5', 'Admin5050'),
(16, 'Admin6', 'Admin6060');

-- --------------------------------------------------------

--
-- Table structure for table `airline`
--

CREATE TABLE `airline` (
  `AirlineCode` int(11) NOT NULL,
  `AirlineName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `airline`
--

INSERT INTO `airline` (`AirlineCode`, `AirlineName`) VALUES
(1, 'Fly Emirates'),
(2, 'EgyptAir'),
(3, 'Turkish Airlines'),
(4, 'Saudi Airlines'),
(5, 'Qatar Airways');

-- --------------------------------------------------------

--
-- Table structure for table `airplane`
--

CREATE TABLE `airplane` (
  `AirplaneNumber` int(11) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Capacity` int(11) NOT NULL,
  `AirlineCode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `airplane`
--

INSERT INTO `airplane` (`AirplaneNumber`, `Type`, `Capacity`, `AirlineCode`) VALUES
(1, 'Boeing 777', 120, 1),
(2, 'Boeing 747', 100, 1),
(3, 'Airbus 600', 150, 3),
(4, 'Airbus 300', 120, 4),
(5, 'Boeing 747', 100, 2),
(6, 'Tristar', 200, 1),
(7, 'Boeing 777', 150, 2),
(8, 'Boeing 777', 150, 5),
(9, 'Boeing 777', 150, 1);

-- --------------------------------------------------------

--
-- Table structure for table `attends`
--

CREATE TABLE `attends` (
  `ScheduleID` int(11) NOT NULL,
  `StaffNo` int(11) NOT NULL,
  `Languages` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attends`
--

INSERT INTO `attends` (`ScheduleID`, `StaffNo`, `Languages`) VALUES
(100, 4, 'English'),
(100, 5, 'English'),
(200, 4, 'French'),
(200, 7, 'Russian'),
(300, 5, 'Arabic'),
(300, 6, 'Korean'),
(300, 7, 'English'),
(300, 8, 'English'),
(400, 6, 'English'),
(500, 8, 'Arabic');

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `FlightNo` int(11) NOT NULL,
  `Price` varchar(50) NOT NULL,
  `Flight_Duration` varchar(50) NOT NULL,
  `Arrival` varchar(50) NOT NULL,
  `Departure` varchar(50) NOT NULL,
  `Direct_Indirect` varchar(50) NOT NULL,
  `AirlineCode` int(11) NOT NULL,
  `ScheduleID` int(11) NOT NULL,
  `Departure_City` varchar(50) DEFAULT NULL,
  `Arrival_City` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`FlightNo`, `Price`, `Flight_Duration`, `Arrival`, `Departure`, `Direct_Indirect`, `AirlineCode`, `ScheduleID`, `Departure_City`, `Arrival_City`) VALUES
(1, '3000', '3', '5:00', '2:00', 'Direct', 1, 100, 'Cairo', 'London'),
(2, '10000', '4', '6:00', '2:00', 'Direct', 2, 200, 'Cairo', 'Berlin'),
(3, '4000', '8', '9:00', '1:00', 'Indirect', 3, 300, 'Jakarta', 'Tokyo'),
(4, '10000', '8', '10:30', '2:30', 'Direct', 1, 400, 'New York', 'Alexandria'),
(5, '7500', '1', '2:00', '1:00', 'Indirect', 5, 500, 'Rome', 'Istanbul'),
(6, '5000', '4', '6:00', '2:00', 'Direct', 2, 300, 'Barcelona', 'London'),
(7, '10000', '3', '5:00', '2:00', 'Direct', 4, 600, 'Paris', 'Jeddah'),
(8, '12000', '3', '7:00', '4:00', 'Direct', 4, 800, 'Paris', 'Jeddah'),
(9, '12000', '3', '7:00', '4:00', 'Direct', 4, 1100, 'Paris', 'Jeddah'),
(10, '17500', '5', '11:00', '6:00', 'Direct', 1, 900, 'Barcelona', 'Cairo'),
(11, '5000', '5', '11:00', '6:00', 'Direct', 1, 1200, 'London', 'Cairo');

-- --------------------------------------------------------

--
-- Table structure for table `flightattendant`
--

CREATE TABLE `flightattendant` (
  `StaffNo` int(11) NOT NULL,
  `Languages` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flightattendant`
--

INSERT INTO `flightattendant` (`StaffNo`, `Languages`) VALUES
(4, 'English'),
(4, 'French'),
(5, 'Arabic'),
(5, 'English'),
(5, 'Korean'),
(6, 'English'),
(6, 'Korean'),
(7, 'English'),
(7, 'Russian'),
(8, 'Arabic'),
(8, 'English');

-- --------------------------------------------------------

--
-- Table structure for table `flightschedule`
--

CREATE TABLE `flightschedule` (
  `ScheduleID` int(11) NOT NULL,
  `Flight_Date` varchar(25) NOT NULL,
  `Tno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flightschedule`
--

INSERT INTO `flightschedule` (`ScheduleID`, `Flight_Date`, `Tno`) VALUES
(100, '2/12/2021', 3),
(200, '12/10/2021', 4),
(300, '15/11/2021', 5),
(400, '24/15/2021', 6),
(500, '2/12/2021', 7),
(600, '04/20/2001', NULL),
(700, '04/20/2001', 12),
(800, '12/15/2021', 11),
(900, '15/11/2021', 1),
(1000, '15/12/2021', NULL),
(1100, '12/26/2021', 13),
(1200, '04/22/2001', 14);

-- --------------------------------------------------------

--
-- Table structure for table `operates`
--

CREATE TABLE `operates` (
  `ScheduleID` int(11) NOT NULL,
  `StaffNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `operates`
--

INSERT INTO `operates` (`ScheduleID`, `StaffNo`) VALUES
(100, 1),
(200, 2),
(300, 9),
(400, 10),
(500, 11);

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `PassportNo` int(11) NOT NULL,
  `Fname` varchar(50) NOT NULL,
  `Lname` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Nationality` varchar(50) NOT NULL,
  `DOB` varchar(25) NOT NULL,
  `Gender` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passenger`
--

INSERT INTO `passenger` (`PassportNo`, `Fname`, `Lname`, `Username`, `Password`, `Nationality`, `DOB`, `Gender`) VALUES
(100, 'Ahmed', 'Mohamed', 'Ahmed1', 'Ahmed123', 'Egyptian', '1994/05/01', 'Male'),
(101, 'Mahmoud', 'Ahmed', 'Mahmoud222', 'Mahmoud212', 'Egyptian', '1996/02/01', 'Male'),
(102, 'Hala', 'Mamdouh', 'Hala_Mamdouh', 'Hala992', 'Lebanese', '2000/06/07', 'Female'),
(103, 'Suhaila', 'Ahmed', 'Suhailaaa', 'Suhaila222', 'Syrian', '2001/10/24', 'Female'),
(104, 'Reem', 'Saeed', 'ReemtheDream', 'Reem432', 'Egyptian', '2002/08/11', 'Female'),
(105, 'Jana', 'Mahmoud', 'JanaMahmoud', 'JanaJana', 'Brazil', '2002/3/21', 'Female'),
(106, 'Mohamed', 'Tarek', 'MohamedT', 'MohamedT124', 'Turkish', '1992/05/07', 'Male'),
(107, 'Omar', 'Osama', 'OmarOO', 'Omar12', 'Egyptian', '2000/12/05', 'Male'),
(108, 'Mostafa', 'Osama', 'MostafaO', 'Mostafa123', 'Lebanese', '15/02/1999', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `passenger_contact`
--

CREATE TABLE `passenger_contact` (
  `PassportNo` int(11) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `PhoneNo` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passenger_contact`
--

INSERT INTO `passenger_contact` (`PassportNo`, `Email`, `PhoneNo`) VALUES
(100, 'ahmed@gmail.com', '01220000007'),
(101, 'mahmoud2@gmail.com', '01221100006'),
(101, 'mahmoud@gmail.com', '01220000006'),
(102, 'hala212@gmail.com', '01223300006'),
(103, 'suhaila212@gmail.com', '01223300016'),
(104, 'reemthedream@gmail.com', '01223303316'),
(105, 'jana@gmail.com', '01223301616'),
(106, 'MohamedT@gmail.com', '01100014200'),
(107, 'OmarO@gmail.com', '01201214213'),
(108, 'MostafaOO@gmail.com', '01100202034');

-- --------------------------------------------------------

--
-- Table structure for table `pilot`
--

CREATE TABLE `pilot` (
  `StaffNo` int(11) NOT NULL,
  `Certification_Date` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pilot`
--

INSERT INTO `pilot` (`StaffNo`, `Certification_Date`) VALUES
(1, '2018/04/22'),
(2, '2019/08/03'),
(9, '2020/11/07'),
(10, '2010/02/01'),
(11, '2018/12/08');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `StaffNo` int(11) NOT NULL,
  `Fname` varchar(50) NOT NULL,
  `Lname` varchar(50) NOT NULL,
  `DOB` varchar(25) NOT NULL,
  `City` varchar(25) NOT NULL,
  `Country` varchar(25) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Job_Type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`StaffNo`, `Fname`, `Lname`, `DOB`, `City`, `Country`, `Gender`, `Job_Type`) VALUES
(1, 'Amr', 'Daba', '2001/10/21', 'Giza', 'Egypt', 'Male', 'Pilot'),
(2, 'Mazen', 'Tarek', '2001/04/12', 'Fayoum', 'Egypt', 'Male', 'Pilot'),
(3, 'Sherif', 'Hesham', '2001/03/22', 'Cairo', 'Egypt', 'Male', 'Admin'),
(4, 'Mohamed', 'Medhat', '2000/04/10', 'Cairo', 'Egypt', 'Male', 'Flight Attendant'),
(5, 'Mamdouh', 'ElGhataty', '2001/01/01', 'Kafr El Sheikh', 'Egypt', 'Male', 'Flight Attendant'),
(6, 'Jina', 'Mohamed', '2002/01/30', 'Cairo', 'Egypt', 'Female', 'Flight Attendant'),
(7, 'Mariam', 'Yehia', '2001/04/28', 'Giza', 'Egypt', 'Female', 'Flight Attendant'),
(8, 'Jack', 'Wilson', '1999/06/26', 'New York', 'United States', 'Male', 'Flight Attendant'),
(9, 'Mustafa', 'Magdy', '2001/05/22', 'Alexandria', 'Egypt', 'Male', 'Pilot'),
(10, 'Saif', 'Samy', '2001/11/01', 'Luxor', 'Egypt', 'Male', 'Pilot'),
(11, 'Nada', 'Mohamed', '2001/10/20', 'New York', 'United States', 'Female', 'Pilot'),
(12, 'Vladmir', 'Rublev', '2000/08/04', 'Zenit', 'Russia', 'Male', 'Admin'),
(13, 'Mahmoud', 'Saeed', '2001/09/13', 'Giza', 'Egypt', 'Male', 'Admin'),
(14, 'Abdelrahman', 'Sameh', '2001/03/15', 'Moscow', 'Russia', 'Male', 'Admin'),
(15, 'Salma', 'Ahmed', '2002/02/03', 'Jeddah', 'Saudi Arabia', 'Female', 'Admin'),
(16, 'Romero', 'Gonzalez', '1998/05/24', 'Malaga', 'Spain', 'Male', 'Admin'),
(17, 'Osama', 'Mahmoud', '1997/10/20', 'Beirut', 'Lebanon', 'Male', 'Pilot');

-- --------------------------------------------------------

--
-- Table structure for table `staff_phone`
--

CREATE TABLE `staff_phone` (
  `StaffNo` int(11) NOT NULL,
  `PhoneNo` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_phone`
--

INSERT INTO `staff_phone` (`StaffNo`, `PhoneNo`) VALUES
(1, '01200432555'),
(2, '01200014400'),
(2, '01200014402'),
(3, '01219632599'),
(4, '01200432322'),
(5, '01216663272'),
(6, '01002474246'),
(7, '01004548871'),
(8, '01004547777'),
(9, '01004543246'),
(10, '01004549940'),
(11, '01204543337'),
(12, '01037543246'),
(13, '01024543247'),
(14, '01004543255'),
(15, '01004533246'),
(17, '01234543357');

-- --------------------------------------------------------

--
-- Table structure for table `tickets`
--

CREATE TABLE `tickets` (
  `TicketNo` int(11) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Reservation_Status` varchar(50) NOT NULL,
  `BookingID` int(11) NOT NULL,
  `PassportNo` int(11) DEFAULT NULL,
  `AdminNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tickets`
--

INSERT INTO `tickets` (`TicketNo`, `Type`, `Reservation_Status`, `BookingID`, `PassportNo`, `AdminNo`) VALUES
(1, 'Economy', 'Pending', 7, NULL, 13),
(2, 'Business', 'Accepted', 6, 104, 13),
(3, 'Economy', 'Declined', 1, NULL, 3),
(4, 'First Class', 'Accepted', 2, 100, 16),
(5, 'Business', 'Declined', 5, 103, 15),
(6, 'Economy', 'Accepted', 3, 101, 14),
(7, 'Business', 'Accepted', 4, 102, 12),
(8, 'Economy', 'Accepted', 8, 102, 13),
(9, 'First Class', 'Accepted', 9, 103, 13),
(10, 'First Class', 'Declined', 10, 104, 3),
(11, 'First Class', 'Pending', 11, NULL, 3),
(12, 'First Class', 'Pending', 12, 100, 3),
(13, 'Business', 'Pending', 13, NULL, 14),
(14, 'First Class', 'Pending', 14, NULL, 15);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`StaffNo`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- Indexes for table `airline`
--
ALTER TABLE `airline`
  ADD PRIMARY KEY (`AirlineCode`);

--
-- Indexes for table `airplane`
--
ALTER TABLE `airplane`
  ADD PRIMARY KEY (`AirplaneNumber`),
  ADD KEY `AirlineCode` (`AirlineCode`);

--
-- Indexes for table `attends`
--
ALTER TABLE `attends`
  ADD PRIMARY KEY (`ScheduleID`,`StaffNo`,`Languages`),
  ADD KEY `StaffNo` (`StaffNo`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`FlightNo`),
  ADD KEY `ScheduleID` (`ScheduleID`),
  ADD KEY `AirlineCode` (`AirlineCode`);

--
-- Indexes for table `flightattendant`
--
ALTER TABLE `flightattendant`
  ADD PRIMARY KEY (`StaffNo`,`Languages`);

--
-- Indexes for table `flightschedule`
--
ALTER TABLE `flightschedule`
  ADD PRIMARY KEY (`ScheduleID`),
  ADD KEY `Tno` (`Tno`);

--
-- Indexes for table `operates`
--
ALTER TABLE `operates`
  ADD PRIMARY KEY (`ScheduleID`,`StaffNo`),
  ADD KEY `StaffNo` (`StaffNo`);

--
-- Indexes for table `passenger`
--
ALTER TABLE `passenger`
  ADD PRIMARY KEY (`PassportNo`,`Username`),
  ADD UNIQUE KEY `PassportNo` (`PassportNo`,`Username`);

--
-- Indexes for table `passenger_contact`
--
ALTER TABLE `passenger_contact`
  ADD PRIMARY KEY (`PassportNo`,`Email`,`PhoneNo`),
  ADD UNIQUE KEY `Email` (`Email`,`PhoneNo`);

--
-- Indexes for table `pilot`
--
ALTER TABLE `pilot`
  ADD PRIMARY KEY (`StaffNo`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`StaffNo`);

--
-- Indexes for table `staff_phone`
--
ALTER TABLE `staff_phone`
  ADD PRIMARY KEY (`StaffNo`,`PhoneNo`),
  ADD UNIQUE KEY `PhoneNo` (`PhoneNo`);

--
-- Indexes for table `tickets`
--
ALTER TABLE `tickets`
  ADD PRIMARY KEY (`TicketNo`),
  ADD UNIQUE KEY `BookingID` (`BookingID`),
  ADD KEY `AdminNo` (`AdminNo`),
  ADD KEY `tickets_ibfk_1` (`PassportNo`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`StaffNo`) REFERENCES `staff` (`StaffNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `airplane`
--
ALTER TABLE `airplane`
  ADD CONSTRAINT `airplane_ibfk_1` FOREIGN KEY (`AirlineCode`) REFERENCES `airline` (`AirlineCode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `attends`
--
ALTER TABLE `attends`
  ADD CONSTRAINT `attends_ibfk_1` FOREIGN KEY (`ScheduleID`) REFERENCES `flightschedule` (`ScheduleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `attends_ibfk_2` FOREIGN KEY (`StaffNo`) REFERENCES `flightattendant` (`StaffNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `flight`
--
ALTER TABLE `flight`
  ADD CONSTRAINT `flight_ibfk_1` FOREIGN KEY (`ScheduleID`) REFERENCES `flightschedule` (`ScheduleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `flight_ibfk_2` FOREIGN KEY (`AirlineCode`) REFERENCES `airline` (`AirlineCode`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `flightattendant`
--
ALTER TABLE `flightattendant`
  ADD CONSTRAINT `flightattendant_ibfk_1` FOREIGN KEY (`StaffNo`) REFERENCES `staff` (`StaffNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `flightschedule`
--
ALTER TABLE `flightschedule`
  ADD CONSTRAINT `flightschedule_ibfk_1` FOREIGN KEY (`Tno`) REFERENCES `tickets` (`TicketNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `operates`
--
ALTER TABLE `operates`
  ADD CONSTRAINT `operates_ibfk_1` FOREIGN KEY (`ScheduleID`) REFERENCES `flightschedule` (`ScheduleID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `operates_ibfk_2` FOREIGN KEY (`StaffNo`) REFERENCES `pilot` (`StaffNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `passenger_contact`
--
ALTER TABLE `passenger_contact`
  ADD CONSTRAINT `passenger_contact_ibfk_1` FOREIGN KEY (`PassportNo`) REFERENCES `passenger` (`PassportNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pilot`
--
ALTER TABLE `pilot`
  ADD CONSTRAINT `pilot_ibfk_1` FOREIGN KEY (`StaffNo`) REFERENCES `staff` (`StaffNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `staff_phone`
--
ALTER TABLE `staff_phone`
  ADD CONSTRAINT `staff_phone_ibfk_1` FOREIGN KEY (`StaffNo`) REFERENCES `staff` (`StaffNo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tickets`
--
ALTER TABLE `tickets`
  ADD CONSTRAINT `tickets_ibfk_1` FOREIGN KEY (`PassportNo`) REFERENCES `passenger` (`PassportNo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tickets_ibfk_2` FOREIGN KEY (`AdminNo`) REFERENCES `admin` (`StaffNo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
