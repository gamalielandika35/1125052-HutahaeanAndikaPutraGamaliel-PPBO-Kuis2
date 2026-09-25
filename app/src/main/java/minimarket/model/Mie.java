package minimarket.model;

public class Mie extends Product
        implements Discountable{

    private String rasa;
    private double berat;

    public Mie(
            String id,
            String nama,
            double harga,
            int stok,
            String rasa,
            double berat) {

        super(id, nama, harga, stok);
        this.rasa = rasa;
        this.berat = berat;
    }

    public String getRasa() {
        return rasa;
    }

    public double getBerat() {
        return berat;
    }

    public double calculateDiscount(int amount) {
        if (amount >= 20) {
            return getHarga() * amount * 0.1; 
        } else if (amount >= 10 && amount < 20){
            return getHarga() * amount * 0.05;
        } else {
            return 0;
        }
    }

    public double calculateSubTotal(int amount){
        double subtotal = getHarga() * amount;
        double discount = calculateDiscount(amount);
        return subtotal - discount;
    }

    public String getProductDetails() {

        return "Mie :" + getNama()
                + " *ID: " + getId() + "*"
                + " - Harga: " + getHarga() + " "
                + " | Stok:  " + getStok()
                + " | Rasa: " + getRasa()
                + " | Berat: " + getBerat() + " gr";
    }
}