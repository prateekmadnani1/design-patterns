package BuilderDP;
public class Bedroom  {
	@Override
	public String toString() {
		return "Bedroom [bedno=" + bedno + ", bedname=" + bedname + "]";
	}

	private int bedno;
	private String bedname;
	
	public Bedroom(int bedno, String bedname) {
		super();
		this.bedno = bedno;
		this.bedname = bedname;
	}
}
