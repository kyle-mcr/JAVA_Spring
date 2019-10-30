
public class Samurai extends Human {
	private static int counter;
	public Samurai() {
		health = 200;
		counter++;
	}
	public void deathBlow(Human a) {
		a.health -= a.health;
		health = health/2;
	}
	public void meditate() {
		health += health/2;
	}
	public void howMany() {
		System.out.println("There are this many left " + counter);
	}
}
