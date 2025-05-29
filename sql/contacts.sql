-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: veneno-database
-- Generation Time: Mar 30, 2025 at 06:18 PM
-- Server version: 11.7.2-MariaDB-ubu2404
-- PHP Version: 8.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `veneno`
--

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE `contacts` (
  `id` int(11) NOT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_uca1400_ai_ci;

--
-- Dumping data for table `contacts`
--

INSERT INTO `contacts` (`id`, `email_address`, `first_name`, `last_name`, `message`, `subject`) VALUES
(1, 'fake email', 'fake name', 'fake last name', 'fake message', 'fake subject'),
(2, 'john.doe@example.com', 'John', 'Doe', 'Hello, this is a test message.', 'Test Subject 1'),
(3, 'jane.smith@example.com', 'Jane', 'Smith', 'Inquiry about your services.', 'Service Inquiry'),
(4, 'peter.jones@example.com', 'Peter', 'Jones', 'Regarding the recent update.', 'Update Feedback'),
(5, 'mary.brown@example.com', 'Mary', 'Brown', 'Just wanted to say hi!', 'Friendly Greeting'),
(6, 'david.wilson@example.com', 'David', 'Wilson', 'Request for more information.', 'Info Request'),
(7, 'sarah.davis@example.com', 'Sarah', 'Davis', 'Feedback on the website.', 'Website Feedback'),
(8, 'michael.garcia@example.com', 'Michael', 'Garcia', 'Problem with my account.', 'Account Issue'),
(9, 'jennifer.rodriguez@example.com', 'Jennifer', 'Rodriguez', 'Looking forward to the meeting.', 'Meeting Confirmation'),
(10, 'christopher.martinez@example.com', 'Christopher', 'Martinez', 'Question about the product.', 'Product Question'),
(11, 'amanda.anderson@example.com', 'Amanda', 'Anderson', 'Thank you for your help.', 'Gratitude Message'),
(12, 'matthew.thomas@example.com', 'Matthew', 'Thomas', 'Need assistance with payment.', 'Payment Help'),
(13, 'elizabeth.jackson@example.com', 'Elizabeth', 'Jackson', 'Interested in a partnership.', 'Partnership Inquiry'),
(14, 'joseph.white@example.com', 'Joseph', 'White', 'Follow up on our conversation.', 'Follow Up'),
(15, 'stephanie.harris@example.com', 'Stephanie', 'Harris', 'Information about upcoming events.', 'Event Info'),
(16, 'brian.martin@example.com', 'Brian', 'Martin', 'Complaint about the delivery.', 'Delivery Complaint'),
(17, 'nicole.thompson@example.com', 'Nicole', 'Thompson', 'Request for a quote.', 'Quote Request'),
(18, 'anthony.garrett@example.com', 'Anthony', 'Garrett', 'Feedback on the customer service.', 'Customer Service Feedback'),
(19, 'heather.edwards@example.com', 'Heather', 'Edwards', 'Question regarding the invoice.', 'Invoice Question'),
(20, 'kevin.peterson@example.com', 'Kevin', 'Peterson', 'Just checking in.', 'Checking In'),
(21, 'angela.collins@example.com', 'Angela', 'Collins', 'Inquiry about job openings.', 'Job Inquiry');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contacts`
--
ALTER TABLE `contacts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
