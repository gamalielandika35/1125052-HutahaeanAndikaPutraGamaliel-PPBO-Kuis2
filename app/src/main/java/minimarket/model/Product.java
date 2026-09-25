package minimarket.model;

public abstract class Product {

    private String id;
    private String nama;
    private double harga;
    private int stok;

    public Product(String id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    protected void setStok(int stok) {
        this.stok = stok;
    }

    public abstract String getProductDetails();

    public abstract double calculateSubTotal(int amount);
}