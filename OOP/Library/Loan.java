public class Loan
{
    private Book book;
    private Patron patron;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(Book book, Patron patron)
    {
        this.book=book;
        this.patron=patron;
        this.borrowBook=localDate.now();
    }

    public Book getBook() {
        return book;
    }

    public Patron getPatron() {
        return patron;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        System.out.println("Book " + book.getTitle() + " returned by " + patron.getName());
    }
}