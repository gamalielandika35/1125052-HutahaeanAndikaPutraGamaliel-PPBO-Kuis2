package smarthomemvc.model;

public class smartdoorlock extends SmartDevice
        implements Lockable {

    private String pin;

    public smartdoorlock(
            String id,
            String nama,
            double daya,
            String pin) {

        super(id, nama, daya);
        this.pin = pin;
        setStatus("Terkunci");
    }

    public String getPin() {
        return pin;
    }

    public void lock() {
        setStatus("Terkunci");
    }

    public void unlock() {
        setStatus("Terbuka");
    }

    public String getDeviceDetails() {

        return "Smart Door Lock :" + getNama()
                + " *ID: " + getId() + "*"
                + " - Daya: " + getDaya() + " w"
                + " | Status:  " + getStatus()
                + " | PIN: **************";
    }
}