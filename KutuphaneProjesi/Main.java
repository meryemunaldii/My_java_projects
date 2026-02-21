public class Main {
    public static void main(String[] args) {
        // 1. Sistemi Hazırla
        LibraryManager manager = new LibraryManager();

        // 2. Kitapları Oluştur ve Ekle
        Book book1 = new Book("B01", "Java ile OOP", "James Gosling");
        Book book2 = new Book("B02", "Veri Yapıları", "Robert Sedgewick");

        manager.addItem(book1);
        manager.addItem(book2);

        // 3. Bir Üye Oluştur
        Member member = new Member("M101", "Ayşe");

        // 4. Senaryo: Kitap Ödünç Alma
        manager.showAllItems(); // Önce durumu gör

        System.out.println("\n--- İşlem: Ödünç Alma ---");
        LibraryItem target = manager.findItemById("B01");
        if (target != null) {
            member.borrowItem(target);
        }

        // 5. Son Durumu Kontrol Et
        manager.showAllItems(); // Kitabın durumu "Ödünçte" olarak güncellenmiş olmalı
        member.displayBorrowedItems(); // Üyenin listesinde görünmeli
    }
}
