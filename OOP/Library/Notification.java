public class Notification {
    public void sendDueDateReminder(Patron patron, Book book) {
        System.out.println("Reminder: " + patron.getName() + ", the book " + book.getTitle() + " is due soon.");

    }
}
