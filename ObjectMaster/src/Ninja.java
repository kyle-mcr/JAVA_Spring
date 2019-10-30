
public class Ninja extends Human{
	public Ninja() {
		stealth = 10;
	}
	public void steal(Human a) {
		a.health -= stealth;
		stealth += stealth;
	}
	public void runAway() {
		health -= 10;
	}
}
