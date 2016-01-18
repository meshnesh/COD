package soldier;

public class supersoldier extends soldier {
	//inheritance
	public supersoldier(int lives, int hitpoints) {
		super(lives, hitpoints);
		// TODO Auto-generated constructor stub
	}
	public int takeDamage(int damage){
		damage=damage/2;
		if(getHitpoints() <3000){
			System.out.println("am not gonna die");
		}
		int remainingHitpoints = super.getHitpoints() - damage;
		return remainingHitpoints;
	}
}
