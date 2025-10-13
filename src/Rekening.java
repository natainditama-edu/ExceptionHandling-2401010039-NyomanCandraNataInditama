public class Rekening {
    private String nama;
    private String nomor;
    private double saldo;

    public Rekening(String nama, String nomor, double saldo) {
        this.nama = nama;
        this.nomor = nomor;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public double getSaldo() {
        return saldo;
    }
}
