package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	private static int nbDigitalVideoDiscs = 0;

	private int id;

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;

		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;

		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;

		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;

		nbDigitalVideoDiscs += 1;
		this.id = nbDigitalVideoDiscs;
	}

	public boolean isMatch(String title) {
		return this.title.equals(title);
	}

	public String toString() {
		
		return "DVD" + "-" + this.title + "-" + this.category + "-" + this.director + "-" + String.valueOf(this.length) + ": " + String.valueOf(this.cost) + "$";
	}

	// Temporarily setter for Lab_03
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
}