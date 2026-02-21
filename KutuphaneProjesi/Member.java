import java.util.ArrayList;
import java.util.List;


public class Member {
    private String memberId;
    private String name;
    private List<LibraryItem> borrowedItems; // Composition: Üyenin kitap listesi

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.setAvailable(false);
            borrowedItems.add(item);
            System.out.println(name + ", '" + item.getTitle() + "' kitabını aldı.");
        } else {
            System.out.println("Üzgünüz, bu kitap şu an başkasında.");
        }
    }

    public void displayBorrowedItems() {
        System.out.println("--- " + name + " Tarafından Ödünç Alınanlar ---");
        for (LibraryItem item : borrowedItems) {
            System.out.println(item);
        }
    }
}
