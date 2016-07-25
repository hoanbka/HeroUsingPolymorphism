package heros;

public class Staff extends Weapons {

	public Staff() {
		super();

	}

	public Staff(String name, int level, String taunt, int bonusIntelligence) {
		super(name, level, taunt);
		this.bonusIntelligence = bonusIntelligence;
	}

	public void setBonusIntelligence(int bonusIntelligence) {
		this.bonusIntelligence = bonusIntelligence;
	}

	public void setTaunt() {
		this.taunt = "you cast a spell for";
	}

}
