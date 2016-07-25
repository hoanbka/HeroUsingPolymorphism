package heros;

public class Axe extends Weapons {

	public Axe() {
	}

	public Axe(String name, int level, String taunt, int bonusStrength) {
		super(name, level, taunt);
		this.bonusStrength = bonusStrength;
	}

	public void setBonusStrength(int bonusStrength) {
		this.bonusStrength = bonusStrength;
	}

	@Override
	public void setTaunt() {
		this.taunt = "You swing your mighty axe for";
	}

}
