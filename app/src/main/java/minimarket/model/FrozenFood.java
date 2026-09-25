package minimarket.model;

public class FrozenFood extends Product
        implements Discountable, Expireable {

    private String tglexp;
    private double suhu;

    public FrozenFood(
            String id,
            String nama,
            double harga,
            int stok,
            double suhu,
        String tglexp) {

        super(id, nama, harga, stok);
        this.suhu = suhu;
        this.tglexp = tglexp;
       
    }
    public double getSuhu (){
        return suhu;
    }
    public String gettglexp(){
        return tglexp;
    }

    public double calculateDiscount(int amount) {
        if (amount >= 8) {
            return getHarga() * amount * 0.08; 
        } else if (amount >= 4 && amount < 8){
            return getHarga() * amount * 0.04;
        } else {
            return 0;
        }
    }

    public double calculateSubTotal(int amount){
        double subtotal = getHarga() * amount;
        double discount = calculateDiscount(amount);
        return subtotal - discount;
    }

    public String getExpDate(){
        return gettglexp();
    }

    public String getProductDetails() {

        return "FF [" + getNama() + "]"
                + " *ID: " + getId() + "*"
                + " - Harga: " + getHarga()
                + " | Stok: " + getStok()
                + " | Suhu: " + getSuhu() + "'C" 
                + " | Expired: " + getExpDate();
    }
}