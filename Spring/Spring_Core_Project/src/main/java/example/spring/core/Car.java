package example.spring.core;

public class Car {
	private String make;
	private String model;
	private int price;
	private Engine engineDetails;
	private MusicSystem musicSystemDetails;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String make, String model, int price, Engine engineDetails, MusicSystem musicSystemDetails) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.engineDetails = engineDetails;
		this.musicSystemDetails = musicSystemDetails;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Engine getEngineDetails() {
		return engineDetails;
	}
	public void setEngineDetails(Engine engineDetails) {
		this.engineDetails = engineDetails;
	}
	public MusicSystem getMusicSystemDetails() {
		return musicSystemDetails;
	}
	public void setMusicSystemDetails(MusicSystem musicSystemDetails) {
		this.musicSystemDetails = musicSystemDetails;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + ", engineDetails=" + engineDetails
				+ ", musicSystemDetails=" + musicSystemDetails + "]";
	}

}
