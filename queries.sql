use librarymanagement;
show tables;

-- show the values inside the tables
select * from book;
select * from librarian;
select * from student;
select * from transaction;

/* Show all students */
SELECT * FROM Student;

/* Show all available books */
SELECT * FROM Book WHERE Status = 'Available';

/* Find student details by email */
SELECT * FROM Student WHERE Email = 'alice@example.com';



-- JOIN QUERIES
/* Show all issued books with their due dates */
SELECT b.Title, s.Name AS Borrower, t.DueDate
FROM Transaction t
JOIN Book b ON t.BookID = b.BookID
JOIN Student s ON t.StudentID = s.StudentID
WHERE t.ReturnDate IS NULL;

/* List books borrowed by “Bob Smith” */
SELECT b.Title, t.IssueDate, t.DueDate
FROM Transaction t
JOIN Book b ON t.BookID = b.BookID
JOIN Student s ON t.StudentID = s.StudentID
WHERE s.Name = 'Bob Smith';

/* Show students with fines greater than 0 */
SELECT s.Name, t.FineAmount
FROM Transaction t
JOIN Student s ON t.StudentID = s.StudentID
WHERE t.FineAmount > 0;

/* Find the number of transactions handled by each librarian */
SELECT l.Name, COUNT(t.TransactionID) AS TotalTransactions
FROM Transaction t
JOIN Librarian l ON t.LibrarianID = l.LibrarianID
GROUP BY l.Name;

-- Show issued books with student and librarian details
SELECT t.TransactionID, s.Name AS Student, b.Title AS Book, l.Name AS Librarian, t.IssueDate
FROM Transaction t
JOIN Student s ON t.StudentID = s.StudentID
JOIN Book b ON t.BookID = b.BookID
JOIN Librarian l ON t.LibrarianID = l.LibrarianID
WHERE b.Status = 'Issued';



-- SUBQUERIES
-- Find students who have not returned any book yet
SELECT Name FROM Student WHERE StudentID IN (SELECT StudentID FROM Transaction WHERE ReturnDate IS NULL);

-- aggregate functions
/* Find the total fine collected from all students */
SELECT SUM(FineAmount) AS TotalFineCollected
FROM Transaction;

/* Find the average fine amount */
SELECT AVG(FineAmount) AS AverageFine
FROM Transaction;

/* Find the highest fine paid */
SELECT MAX(FineAmount) AS HighestFine FROM Transaction;

/* Find the lowest fine paid */
SELECT MIN(FineAmount) AS LowestFine FROM Transaction;

/* Count how many books are currently issued */
SELECT COUNT(*) AS TotalIssuedBooks FROM Book WHERE Status = 'Issued';

/* Find how many transactions each student has made */
SELECT s.Name, COUNT(t.TransactionID) AS TransactionCount
FROM Transaction t
JOIN Student s ON t.StudentID = s.StudentID
GROUP BY s.Name;

/* Find the average number of transactions handled by each librarian */
SELECT l.Name, AVG(FineAmount) AS AvgFineCollected
FROM Transaction t
JOIN Librarian l ON t.LibrarianID = l.LibrarianID
GROUP BY l.Name;


-- DML queries

-- Update book status when returned
UPDATE Book SET Status = 'Available' WHERE BookID = 2;

-- Delete a transaction (if wrong entry made)
DELETE FROM Transaction WHERE TransactionID = 5;

-- Insert new student
INSERT INTO Student VALUES (6, 'Fiona Blake', 'fiona@example.com', '9876500000');


