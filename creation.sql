create database librarymanagement;
use librarymanagement;

CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    Phone VARCHAR(15)
);

CREATE TABLE Librarian (
    LibrarianID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Phone VARCHAR(15)
);

CREATE TABLE Book (
    BookID INT PRIMARY KEY,
    Title VARCHAR(150) NOT NULL,
    Author VARCHAR(100),
    Status VARCHAR(20) CHECK (Status IN ('Available', 'Issued'))
);

CREATE TABLE Transaction (
    TransactionID INT PRIMARY KEY,
    StudentID INT,
    BookID INT,
    LibrarianID INT,
    IssueDate DATE NOT NULL,
    DueDate DATE NOT NULL,
    ReturnDate DATE,
    FineAmount DECIMAL(10,2) DEFAULT 0,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (BookID) REFERENCES Book(BookID),
    FOREIGN KEY (LibrarianID) REFERENCES Librarian(LibrarianID)
);

-- Students
INSERT INTO Student VALUES
(1, 'Alice Johnson', 'alice@example.com', '9876543210'),
(2, 'Bob Smith', 'bob@example.com', '9123456780'),
(3, 'Charlie Brown', 'charlie@example.com', '9988776655'),
(4, 'Diana Prince', 'diana@example.com', '9090909090'),
(5, 'Ethan Hunt', 'ethan@example.com', '9112233445');

-- Librarians
INSERT INTO Librarian VALUES
(1, 'Mr. Sharma', '9811567111'),
(2, 'Mrs. Gupta', '9822245982'),
(3, 'Mr. Verma', '9833323486'),
(4, 'Ms. Singh', '9867912444'),
(5, 'Mr. Khan', '9855654785');

-- Books
INSERT INTO Book VALUES
(1, 'Database Systems', 'Elmasri', 'Available'),
(2, 'Operating Systems', 'Silberschatz', 'Issued'),
(3, 'Data Structures', 'Mark Weiss', 'Available'),
(4, 'Computer Networks', 'Tanenbaum', 'Issued'),
(5, 'Machine Learning', 'Tom Mitchell', 'Available');

-- Transactions
INSERT INTO Transaction VALUES
(1, 1, 2, 1, '2025-09-01', '2025-09-10', NULL, 0.00),
(2, 2, 4, 2, '2025-09-02', '2025-09-12', NULL, 0.00),
(3, 3, 1, 3, '2025-08-20', '2025-08-30', '2025-09-05', 50.00),
(4, 4, 3, 4, '2025-09-03', '2025-09-13', NULL, 0.00),
(5, 5, 5, 5, '2025-09-04', '2025-09-14', NULL, 0.00);

