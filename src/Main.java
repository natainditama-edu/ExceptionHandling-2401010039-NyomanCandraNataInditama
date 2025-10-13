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

            do {
                System.out.println(" ===== Menu pilihan ==== ");
                System.out.println("1. Lihat saldo");
                System.out.println("2. Debit saldo");
                System.out.println("3. Kredit Saldo");
                System.out.println("4. Keluar program");

                System.out.print("Masukkan pilihan menu: ");
                pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo saat ini: " + rekening.getSaldo());
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah debit: ");
                        double debit = sc.nextDouble();
                        rekening.debitSaldo(debit);
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah kredit: ");
                        double kredit = sc.nextDouble();
                        rekening.creditSaldo(kredit);
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan layanan kami.");
                        break;
                    default:
                        System.out.println("Pilihan menu tidak valid.");
                        break;
                }
            } while (pilihan != 4);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}