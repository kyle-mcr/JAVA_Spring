
public class Wizard  extends Human {
	public Wizard() {
		health = 50;
		intelligence = 8;
	}
		public void heal(Human a) {
			a.health += intelligence;
	}
		public void fireball(Human a){
			a.health -= (intelligence * 3);
		}
}
