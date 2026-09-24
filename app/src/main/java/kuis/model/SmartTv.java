package smarthomemvc.model;

public class SmartTv extends SmartDevice
        implements Connectable, Switchable {

    private int channel;
    private int volume;
    private ConnectionType connection;

    public SmartTv(
            String id,
            String nama,
            double daya,
            int channel,
            int volume,
            ConnectionType connection) {

        super(id, nama, daya);
        this.channel = channel;
        this.volume = volume;
        this.connection = connection;
    }

    public int getChannel() {
        return channel;
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
        System.out.println("smart tv berhasil hubung");
    }

    public void disconnect() {
        System.out.println("smart tv bverhasil outus.");
    }

    public String getDeviceDetails() {

        return "Smart TV [" + getNama() + "]"
                + " *ID: " + getId() + "*"
                + " - Daya: " + getDaya() + "W"
                + " | Status: " + getStatus()
                + " | Koneksi: " + connection
                + " | Channel: " + channel
                + " | Volume:" + volume;
    }
}