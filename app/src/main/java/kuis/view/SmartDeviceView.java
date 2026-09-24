package smarthomemvc.view;

import java.util.List;
import java.util.Scanner;

import smarthomemvc.model.SmartDevice;

public class SmartDeviceView {

    private Scanner scanner;

    public SmartDeviceView() {
        scanner = new Scanner(System.in);
    }

    public void showMainMenu() {
        System.out.println();
        System.out.println(" SMART HOMOK");
        System.out.println("1. Tambah Perangkat");
        System.out.println("2. Print Semua Perangkat");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
    }

    public void showDeviceMenu() {
        System.out.println();
        System.out.println("1. Smart TV");
        System.out.println("2. Smart Speaker");
        System.out.println("3. Smart Door Lock");
        System.out.print("Pilih perangkat: ");
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

    public void showConnectionMenu() {
        System.out.println("1. WIFI");
        System.out.println("2. BLUETOOTH");
        System.out.print("Koneksi: ");
    }

    public void showAllDevices(List<SmartDevice> devices) {
        System.out.println();
        System.out.println(" semua ");

        if (devices.isEmpty()) {
            System.out.println("belum ada apa apa");
        } else {
            for (SmartDevice device : devices) {
                System.out.println(device.getDeviceDetails());
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