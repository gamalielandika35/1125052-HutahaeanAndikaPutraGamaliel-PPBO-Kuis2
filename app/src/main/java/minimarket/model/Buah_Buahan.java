package minimarket.model;

public class Buah_Buahan extends Product
        implements Discountable, Expireable {

    private double berat;
    private Jenis jenis;
    private String tgl;

    public Buah_Buahan(
            String id,
            String nama,
            double harga,
            int stok,
            Jenis jenis,
            double berat,
            String tgl) {

        super(id, nama, harga, stok);
        this.jenis = jenis;
        this.berat = berat;
        this.tgl = tgl;
    }

    public Jenis getJenis() {
        return jenis;
    }

    public double getBerat() {
        return berat;
    }

    public String getTgl() {
        return tgl;
    }

    public double calculateDiscount(int amount) {
        if (amount >= 15) {
            return getHarga() * amount * 0.05;
        } else if (amount >= 10 && amount < 15) {
            return getHarga() * amount * 0.03;
        } else if (amount >= 5 && amount < 10) {
            return getHarga() * amount * 0.02;
        } else {
            return 0;
        }
    }

    public double calculateSubTotal(int amount) {
        double subtotal = getHarga() * amount;
        double discount = calculateDiscount(amount);
        return subtotal - discount;
    }

    public String getExpDate() {
        return getTgl();
    }

    public String getProductDetails() {

        return "Smart Speaker [" + getNama() + "]"
                + " *ID: " + getId() + "*"
                + " - Harga: " + getHarga() + "w"
                + " | Stok: " + getStok()
                + " | Jenisi : " + getJenis()
                + " | Berat : " + getBerat()
                + " | Kadaluarsa : " + getExpDate();
    }
}