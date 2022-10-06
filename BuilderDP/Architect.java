package BuilderDP;

public class Architect {
	public static void main(String[] args) {
		BedroomBuilder room = new BedroomBuilder().setBedname("Giant").setBedno(10);
		Bedroom bed = room.getBetBedroom();
		System.out.println(bed);
		
	}
}
