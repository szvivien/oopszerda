package szoftvertech;

public class Auto {
	
	private final int dateOfCreation;
	private String manufacturer;
	private String Type;
	private String engineType;
	private String fuelType;
	private double averageFuelConsumption;
	
	public Auto(int dateOfCreation, String manufacturer, String type, String engineType) {
		this.dateOfCreation = dateOfCreation;
		this.manufacturer = manufacturer;
		this.Type = type;
		this.engineType = engineType;
		this.fuelType = fuelType;
		this.averageFuelConsumption = calculateFuelConsumption(engineType);
	}


	public Auto(int dateOfCreation, String manufacturer, String type, String engineType, String fuelType,
			double averageFuelConsumption) {
		this.dateOfCreation = dateOfCreation;
		this.manufacturer = manufacturer;
		Type = type;
		this.engineType = engineType;
		this.fuelType = fuelType;
		this.averageFuelConsumption = averageFuelConsumption;
	}

	public double calculateFuelConsumption(String motorType){
		switch (motorType) {
		case "1.4":
			return 6.5;
		case "1.8":
			return 7.0;
		case "2.0":
			return 8.0;
		default:
			return 0;
		}
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getAverageFuelConsumption() {
		return averageFuelConsumption;
	}

	public void setAverageFuelConsuption(double averageFuelConsumption) {
		this.averageFuelConsumption = averageFuelConsumption;
	}

	public int getDateOfCreation() {
		return dateOfCreation;
	}
	
	
	public void changeMotor(String engineType, String fuelType, double fuelConsumption) {
		this.engineType = engineType;
		this.fuelType = fuelType;
		this.averageFuelConsumption = fuelConsumption;
	}
		
	public double calculateActualConsumption(double addedFuel, double travelDistanceKM){
		return addedFuel / travelDistanceKM * 100;
	}
	
	public boolean isActualConsumptionLowerThanAverage(double addedFuel, double travelDistanceKM){
		return calculateActualConsumption(addedFuel, travelDistanceKM)< getAverageFuelConsumption();
	}
	
	public double calcuateTravelPrice(double fuelPrice, double travelDistanceKM){
		return getAverageFuelConsumption()*travelDistanceKM*fuelPrice/100;
	}


	@Override
	public String toString() {
		return "Auto [dateOfCreation=" + dateOfCreation + ", manufacturer=" + manufacturer + ", Type=" + Type
				+ ", engineType=" + engineType + ", fuelType=" + fuelType + ", averageFuelConsumption="
				+ averageFuelConsumption + "]";
	}
	
	
}

