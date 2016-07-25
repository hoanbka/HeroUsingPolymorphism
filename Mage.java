package heros;

public class Mage extends Hero {

	public Mage() {
		super();
	}

	public Mage(String name, int level, int strength, int dexterity,
			int intelligence, int attack, int defense, int hp, Armors armors,
			Weapons weapons) {
		super(name, level, strength, dexterity, intelligence, attack, defense,
				hp, armors, weapons);
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub

	}

	@Override
	public String tauntLine() {
		return "Mind over matter";
	}

	public void setAttack(Weapons weapons) {
		if (weapons == null) {
			this.attack += this.level;
		} else
			this.attack = this.level + weapons.getLevel()
					+ weapons.getBonusIntelligence();
	}

	public void setDefense(Armors armors) {
		if (weapons == null) {
			this.defense += this.level;
		} else
			this.defense = this.level + armors.getLevel()
					+ armors.getBonusIntelligence();

	}

}
