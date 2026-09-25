package minimarket.view;

import java.util.List;
import java.util.Scanner;

import minimarket.model.Product;

public class ProductView {

    private Scanner scanner;

    public ProductView() {
        scanner = new Scanner(System.in);
    }

    public void showMainMenu() {
        System.out.println();
        System.out.println(" Mini Market ");
        System.out.println("1. Tambah Product");
        System.out.println("2. Print Semua Product");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
    }

    public void showProductMenu() {
        System.out.println();
        System.out.println("1. Mie");
        System.out.println("2. Buah Buahan");
        System.out.println("3. Frozen Food");
        System.out.print("Pilih product: ");
    }

    public int getInt() {
        return InputUtil.getInt(scanner);
    }

    public String getString() {
        return InputUtil.getString(scanner);
    }

    public double getDouble() {
        return InputUtil.getDouble(scanner);
    }

    public void showJenisMenu() {
        System.out.println("1. IMPORT");
        System.out.println("2. LOKAL");
        System.out.print("JENIS: ");
    }

    public void showAllProduct(List<Product> products) {
        System.out.println();
        System.out.println(" semua ");

        if (products.isEmpty()) {
            System.out.println("belum ada apa apa");
        } else {
            for (Product device : products) {
                System.out.println(device.getProductDetails());
            }
        }
    }

    public void showDeviceAdded(String nama) {
        System.out.println(nama + " sdh ditambahkan");
    }

    public void showExit() {
        System.out.println("keluar");
    }

    public void showInvalid() {
        System.out.println("ga valid ");
    }

    public void close() {
        scanner.close();
    }
    
}