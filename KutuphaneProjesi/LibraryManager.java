import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<LibraryItem> inventory; // Tüm kitaplar ve dergiler burada tutulur

    public LibraryManager() {
        this.inventory = new ArrayList<>();
    }

    // Listeye yeni bir materyal ekleme
    public void addItem(LibraryItem item) {
        inventory.add(item);
        System.out.println("Sisteme eklendi: " + item.getTitle());
    }

    // Tüm envanteri listeleme
    public void showAllItems() {
        System.out.println("\n--- Kütüphane Envanteri ---");
        for (LibraryItem item : inventory) {
            System.out.println(item);
        }
    }

    // ID'ye göre kitap arama
    public LibraryItem findItemById(String id) {
        for (LibraryItem item : inventory) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
