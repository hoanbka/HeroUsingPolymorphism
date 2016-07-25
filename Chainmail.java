package heros;

public class Chainmail extends Armors {

	public Chainmail() {
	}

	public Chainmail(String name, int level, String taunt, int bonusStrength) {
		super(name, level, taunt);
		this.bonusStrength = bonusStrength;
	}

	public void setBonusStrength(int bonusStrength) {
		this.bonusStrength = bonusStrength;
	}

	@Override
	public void setTaunt() {
		this.taunt = "Your mighty chainmail blocks the attack";
	}

}
