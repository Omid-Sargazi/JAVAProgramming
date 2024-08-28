import java.time.LocalDate;
import java.util.List;

public class Report {
    public void generateOverdueReport(List<Loan> loans) {
        System.out.println("Overdue Books Report:");
        for (Loan loan : loans) {
            if (loan.getReturnDate() == null && loan.getBorrowDate().plusWeeks(2).isBefore(LocalDate.now())) {
                System.out.println(
                        "Overdue: " + loan.getBook().getTitle() + " borrowed by " + loan.getPatron().getName());
            }
        }

    }
}
