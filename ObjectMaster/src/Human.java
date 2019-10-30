
public class Human {
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	int health = 100;
	public void attack(Human a) {
		this.health -= this.strength;
		System.out.println("Ouch! Your health is now " + health);
	}
}
