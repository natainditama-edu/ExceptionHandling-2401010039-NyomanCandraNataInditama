import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {            
            Scanner sc = new Scanner(System.in);
            Rekening rekening = new Rekening("", "", 0);
            int pilihan = 0;
            
            System.out.println(" ===== Rekening ===== ");
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            rekening.setNama(nama);

            System.out.print("Masukkan nomor rekening: ");
            String nomor = sc.nextLine();
            rekening.setNomor(nomor);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}