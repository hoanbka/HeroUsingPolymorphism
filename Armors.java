package heros;

public abstract class Armors extends Equipment {
	protected String taunt;
	protected int bonusStrength;
	protected int bonusDexterity;
	protected int bonusIntelligence;

	public Armors() {
		super();
	}

	public Armors(String name, int level, String taunt) {
		super(name, level);
		this.taunt = taunt;

	}

	public int getBonusStrength() {
		return bonusStrength;
	}

	public int getBonusDexterity() {
		return bonusDexterity;
	}

	public int getBonusIntelligence() {
		return bonusIntelligence;
	}

	public abstract void setTaunt();

	public String getTaunt() {
		return taunt;
	}
}
