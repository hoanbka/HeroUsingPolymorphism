package heros;

public class Robes extends Armors {

	public Robes() {
	}

	public Robes(String name, int level, String taunt, int bonusIntelligence) {
		super(name, level, taunt);
		this.bonusIntelligence = bonusIntelligence;
	}

	public void setBonusIntelligence(int bonusIntelligence) {
		this.bonusIntelligence = bonusIntelligence;
	}

	@Override
	public void setTaunt() {
		this.taunt = "your magical robes protect you from the attack";
	}

}
