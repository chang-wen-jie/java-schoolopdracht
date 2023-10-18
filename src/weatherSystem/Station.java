package weatherSystem;

public class Station {
	private String name;
	private int[] measurements;
	
	public Station(String stationName) {
		this.name = stationName;
		this.measurements = new int[10];
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addMeasurement(int m) {
		for (int i = 0; i < this.measurements.length; i++) {
			if (this.measurements[i] == 0) {
				this.measurements[i] = m;
				
				return;
			}
		}
	}
	
	public float getAverage() {
		int count = 0;
		float sum = 0;
		
		for (int i = 0; i < this.measurements.length; i++) {
			if (this.measurements[i] != 0) {
				count++;
				sum += this.measurements[i];
			}
		}
		return sum / count;
	}
	
	public void printStationInfo() {
		if (getAverage() == 0) {
			System.out.println("(no average)");
		} else {
			System.out.println(getName() + " | " + getAverage() + " oC");
			
			for (int i = 0; i < this.measurements.length; i++) {
				if (this.measurements[i] != 0) {
					System.out.println(".. " + this.measurements[i] + " oC");
				}
			}
		}
	}
}
