package BuilderDP;

public class BedroomBuilder {
	
	private int bedno;
	private String bedname;
	
	public BedroomBuilder setBedno(int bedno) {
		this.bedno = bedno;
		return this;
	}
	
	public BedroomBuilder setBedname(String bedname) {
		this.bedname = bedname;
		return this;
	}
	
	public Bedroom getBetBedroom() {
		return new Bedroom(bedno,bedname);
	}
	
}