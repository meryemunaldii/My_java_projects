
public class Book extends LibraryItem {
    private String author;

    public Book(String id, String title, String author) {
        super(id, title); // Üst sınıfın (LibraryItem) constructor'ını çağırır
        this.author = author;
    }

    @Override
    public int getLoanPeriod() {
        return 15; // Kitaplar 15 gün ödünç verilebilir
    }

    @Override
    public String toString() {
        return super.toString() + " - Yazar: " + author;
    }
}
