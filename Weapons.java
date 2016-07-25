package heros;

public abstract class Weapons extends Equipment {
	protected String taunt;
	protected int bonusStrength;
	protected int bonusDexterity;
	protected int bonusIntelligence;

	public Weapons() {
		super();
	}

	public Weapons(String name, int level, String taunt) {
		super(name, level);
		this.taunt = taunt;
	}

	public abstract void setTaunt();

	public String getTaunt() {
		return taunt;
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

}