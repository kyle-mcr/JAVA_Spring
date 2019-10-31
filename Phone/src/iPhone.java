
public class iPhone extends Phone implements Ringable {
    public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return getRingTone();
    }
    @Override
    public String unlock() {
    	String str = "Unlock phone";
    	return str;
    }
    @Override
    public void displayInfo() {
        String info = this.getClass().getSimpleName();
        System.out.print(info + " " + getVersionNumber());
        System.out.println(" from " +getCarrier());
    }
}