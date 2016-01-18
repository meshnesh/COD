package soldier;

public class soldier {

	private int lives;
	private int hitpoints;
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getHitpoints() {
		return hitpoints;
	}
	public soldier(int lives, int hitpoints) {
		//super();
		this.lives = lives;
		this.hitpoints = hitpoints;
	}
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}
	
	public int takeDamage(int damage){
		int remainingHitpoints;
		remainingHitpoints= hitpoints-damage;
		return remainingHitpoints;
		
		
	}
}
