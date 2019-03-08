package com.romellpineda.phone;

public class IPhone extends Phone implements Ringable {
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "marimba";
    }
    @Override
    public String unlock() {
        return "facial recognition";
    }
    
}
