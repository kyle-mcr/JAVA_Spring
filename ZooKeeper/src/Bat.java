
public class Bat {
	int energyLevel = 300;
	public void fly() {
		energyLevel -=50;
		System.out.println("AAAAAAAaaahh that took a lot of energy now all I have is" + energyLevel );
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Yummy humans I now have " + energyLevel );
	}
	public void attackTown() {
		energyLevel -=100;
		System.out.println("AAAAAAAaaahh that took a lot of energy now all I have is" + energyLevel );
	}
}
