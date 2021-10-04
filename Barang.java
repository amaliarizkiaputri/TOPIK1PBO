public class Barang {
    private String idProduk, nama;
    private double harga;

    Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }
    public String getIdProduk() {
        return idProduk;
    }
    public void print() {
        System.out.println(getIdProduk() + " => " + getNama() + " => " + getHarga());
    }
}
class Main1 {
    public static void main(String[] args) {
        Barang bg1 = new Barang("BRG-001","Tas Gucci");
        bg1.setHarga(1200);

        Barang bg2 = new Barang("BRG-002","Printer Epson L355");
        bg2.setHarga(200);

        bg1.print();

        Barang bg3 = new Barang("BRG-003","Koper",150);
        Barang bg4 = new Barang("BRG-004","Helm",20);

        bg3.print();
        bg4.print();

        System.out.print("Harga Total = ");
        System.out.println(bg1.getHarga()+bg3.getHarga()+ bg4.getHarga());
    }
}