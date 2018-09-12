package utilities;

public enum DriverType {
	
	Chrome("Chrome"),
	IE("Internet Explorer"),
	FireFox("FireFox");
	
	private final String value;

	DriverType(final String newValue){
		value = newValue;
	}

	public String getValue() { return value; }
}

