import id.ac.polban.model.Koperasi;
import id.ac.polban.service.MenuService;

public class Main {
    public static void main(String[] args) {
        Koperasi koperasi = new Koperasi();
        int pilihan;
        do {
            pilihan = MenuService.tampilkanMenu();   
            MenuService.jalankanPilihan(pilihan, koperasi);
        } while (pilihan != 0);
    }
}
