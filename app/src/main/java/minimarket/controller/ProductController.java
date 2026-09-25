package minimarket.controller;

import java.util.ArrayList;
import java.util.List;

import minimarket.model.Product;
import minimarket.model.Mie;
import minimarket.model.Buah_Buahan;
import minimarket.model.FrozenFood;
import minimarket.model.Jenis;
import minimarket.view.ProductView;

public class ProductController {

    private ProductView view;
    private List<Product> product;

    public ProductController() {
        view = new ProductView();
        product = new ArrayList<>();
    }

    public void run() {

        int pilihan = 0;

        while (pilihan != 3) {

            view.showMainMenu();

            pilihan = view.getInt();

            if (pilihan == 1) {

                tambahPerangkat();

            } else if (pilihan == 2) {

                view.showAllProduct(product);

            } else if (pilihan == 3) {

                view.showExit();

            } else {

                view.showInvalid();
            }
        }

        view.close();
    }

    private void tambahPerangkat() {

        view.showProductMenu();

        int jenis = view.getInt();

        if (jenis == 1) {

            tambahMie();

        } else if (jenis == 2) {

            tambahBuahBuahan();

        } else if (jenis == 3) {

            tambahFrozenFood();

        } else {

            System.out.println("ga caldi");
        }
    }

    private void tambahMie() {

        System.out.print("ID: ");
        String id = view.getString();

        System.out.print("Nama: ");
        String nama = view.getString();

        System.out.print("Harga: ");
        double harga = view.getDouble();

        System.out.print("Stok : ");
        int stok = view.getInt();

        System.out.print("Rasa: ");
        String rasa = view.getString();

        System.out.print("Berat: ");
        double berat = view.getDouble();

        Mie ahh = new Mie(
                id,
                nama,
                harga,
                stok,
                rasa,
                berat);

        product.add(ahh);

        view.showDeviceAdded("MIE");
    }

    private void tambahBuahBuahan() {

        System.out.print("ID: ");
        String id = view.getString();

        System.out.print("Nama: ");
        String nama = view.getString();

        System.out.print("Harga: ");
        double harga = view.getDouble();

        System.out.print("Stok: ");
        int stok = view.getInt();

        System.out.print("Berat: ");
        double berat = view.getDouble();
        System.out.print("Kadaluarsa: ");
        String tgl = view.getString();

        view.showJenisMenu();

        int Senis = view.getInt();

        Jenis jenis;

        if (Senis == 1) {
            jenis = Jenis.LOKAL;
        } else {
            jenis = Jenis.IMPORT;
        }

        Buah_Buahan bbh = new Buah_Buahan(
                id,
                nama,
                harga,
                stok,
                jenis,
                berat,
                tgl);
        product.add(bbh);

        view.showDeviceAdded("buahbuahahahahah");
    }

    private void tambahFrozenFood() {

        System.out.print("ID: ");
        String id = view.getString();

        System.out.print("Nama: ");
        String nama = view.getString();

        System.out.print("Harga: ");
        double harga = view.getDouble();

        System.out.print("Stok: ");
        int stok = view.getInt();

        System.out.print("Suhu: ");
        double suhu = view.getDouble();

        System.out.print("Kadaluarsa : ");
        String tglexp = view.getString();

        FrozenFood ff = new FrozenFood(
                id,
                nama,
                harga,
                stok,
                suhu,
                tglexp);

        product.add(ff);

        view.showDeviceAdded("frozenfood");
    }
}