package smarthomemvc.model;

public class smartspeaker extends SmartDevice
        implements Connectable, Switchable {

    private int volume;
    private ConnectionType connection;

    public smartspeaker(
            String id,
            String nama,
            double daya,
            int volume,
            ConnectionType connection) {

        super(id, nama, daya);
        this.volume = volume;
        this.connection = connection;
    }

    public int getVolume() {
        return volume;
    }

    public ConnectionType getConnection() {
        return connection;
    }

    public void turnOn() {
        setStatus("Menyala");
    }

    public void turnOff() {
        setStatus("Mati");
    }

    public void connect() {
        System.out.println("smartspeaker terhubung");
    }

    public void disconnect() {
        System.out.println("terputus smartspeaker");
    }

    public String getDeviceDetails() {

        return "Smart Speaker [" + getNama() + "]"
                + " *ID: " + getId() + "*"
                + " - Daya: " + getDaya() + "w"
                + " | Status: " + getStatus()
                + " | Koneksi : " + connection
                + " | Volume : " + volume;
    }
}