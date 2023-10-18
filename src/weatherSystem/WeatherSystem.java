package weatherSystem;

public class WeatherSystem {
	private String name;
	private Station[] stations;
	
	public WeatherSystem (String systemName, int maxNumberOfStations) {
		this.name = systemName;
		this.stations = new Station[maxNumberOfStations];
	}
	
	public void addStation(Station s) {
		for (int i = 0; i < this.stations.length; i++) {
			if (this.stations[i] == null) {
				this.stations[i] = s;
				
				return;
			}
		}
	}
	
	public void printCoolestStation() {
		Station coolestStation = this.stations[0];
		
		for (int i = 0; i < this.stations.length; i++) {
			if (this.stations[i] != null) {
				if (this.stations[i].getAverage() <= coolestStation.getAverage()) {
					coolestStation = this.stations[i];
				}
			} else break;
		}
		System.out.println("The Coolest station is: " + coolestStation.getName());
	}
	
	public void printWSInfo() {
		System.out.println("===================================");
		System.out.println("Weather System: " + this.name);
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < this.stations.length; i++) {
			if (this.stations[i] != null) {
				this.stations[i].printStationInfo();
			}
		}
		System.out.println("===================================");
	}
}
