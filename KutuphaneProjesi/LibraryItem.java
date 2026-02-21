
public abstract class LibraryItem {
    private String id;
    private String title;
    private boolean isAvailable;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true; // Yeni eklenen her kitap varsayılan olarak kütüphanededir
    }

    // Encapsulation
    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    // Polymorphism için abstract bir metod
    public abstract int getLoanPeriod();

    @Override
    public String toString() {
        return "[" + id + "] " + title + (isAvailable ? " (Mevcut)" : " (Ödünçte)");
    }
}
