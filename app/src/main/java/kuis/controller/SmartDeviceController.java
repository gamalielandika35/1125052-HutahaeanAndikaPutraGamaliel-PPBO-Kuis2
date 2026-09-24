package smarthomemvc.controller;

import java.util.ArrayList;
import java.util.List;

import smarthomemvc.model.ConnectionType;
import smarthomemvc.model.SmartDevice;
import smarthomemvc.model.smartdoorlock;
import smarthomemvc.model.smartspeaker;
import smarthomemvc.model.SmartTv;
import smarthomemvc.view.SmartDeviceView;

public class SmartDeviceController {

    private SmartDeviceView view;
    private List<SmartDevice> devices;

    public SmartDeviceController() {
        view = new SmartDeviceView();
        devices = new ArrayList<>();
    }

    public void run() {

        int pilihan = 0;

        while (pilihan != 3) {

            view.showMainMenu();

            pilihan = view.getInt();

            if (pilihan == 1) {

                tambahPerangkat();

            } else if (pilihan == 2) {

                view.showAllDevices(devices);

            } else if (pilihan == 3) {

                view.showExit();

            } else {

                view.showInvalid();
            }
        }

        view.close();
    }

    private void tambahPerangkat() {

        view.showDeviceMenu();

        int jenis = view.getInt();

        if (jenis == 1) {

            tambahSmartTV();

        } else if (jenis == 2) {

            tambahSmartSpeaker();

        } else if (jenis == 3) {

            tambahSmartDoorLock();

        } else {

            System.out.println("ga caldi");
        }
    }

    private void tambahSmartTV() {

        System.out.print("ID: ");
        String id = view.getString();

        System.out.print("Nama: ");
        String nama = view.getString();

        System.out.print("Daya: ");
        double daya = view.getDouble();

        System.out.print("Channel: ");
        int channel = view.getInt();

        System.out.print("Volume: ");
        int volume = view.getInt();

        view.showConnectionMenu();

        int koneksi = view.getInt();

        ConnectionType connection;

        if (koneksi == 1) {
            connection = ConnectionType.WIFI;
        } else {
            connection = ConnectionType.BLUETOOTH;
        }

        SmartTv tv = new SmartTv(
                id,
                nama,
                daya,
                channel,
                volume,
                connection);

        devices.add(tv);

        view.showDeviceAdded("smarttv");
    }

    private void tambahSmartSpeaker() {

        System.out.print("ID: ");
        String id = view.getString();

        System.out.print("Nama: ");
        String nama = view.getString();

        System.out.print("Daya: ");
        double daya = view.getDouble();

        System.out.print("Volume: ");
        int volume = view.getInt();

        view.showConnectionMenu();

        int koneksi = view.getInt();

        ConnectionType connection;

        if (koneksi == 1) {
            connection = ConnectionType.WIFI;
        } else {
            connection = ConnectionType.BLUETOOTH;
        }

        smartspeaker speaker = new smartspeaker(
                id,
                nama,
                daya,
                volume,
                connection);

        devices.add(speaker);

        view.showDeviceAdded("smartspeaker");
    }

    private void tambahSmartDoorLock() {

        System.out.print("ID: ");
        String id = view.getString();

        System.out.print("Nama: ");
        String nama = view.getString();

        System.out.print("Daya: ");
        double daya = view.getDouble();

        System.out.print("PIN: ");
        String pin = view.getString();

        smartdoorlock doorLock = new smartdoorlock(
                id,
                nama,
                daya,
                pin);

        devices.add(doorLock);

        view.showDeviceAdded("smartdoorlock");
    }
}