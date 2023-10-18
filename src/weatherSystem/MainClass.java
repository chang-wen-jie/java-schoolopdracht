package weatherSystem;

public class MainClass {

	public static void main(String[] args) {
		WeatherSystem cityWeather = new WeatherSystem("City Weather", 10);
		
		Station central = new Station("Central");
		Station lowside = new Station("Lowside");
		Station forrest = new Station("Forrest");

		cityWeather.addStation(central);
		cityWeather.addStation(lowside);
		cityWeather.addStation(forrest);
		
		central.addMeasurement(19);
		central.addMeasurement(22);
		central.addMeasurement(25);
		
		lowside.addMeasurement(18);
		lowside.addMeasurement(18);
		lowside.addMeasurement(18);
		
		forrest.addMeasurement(19);
		forrest.addMeasurement(20);
		forrest.addMeasurement(21);
		
		cityWeather.printWSInfo();
		cityWeather.printCoolestStation();
	}
}
