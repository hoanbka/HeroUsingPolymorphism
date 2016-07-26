package heros;

public class Warrior extends Hero {

	public Warrior() {
		super();
	}

	public Warrior(String name, int level, int strength, int dexterity,
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
		return "I AM MIGHTY";
	}

	public void setAttack(Weapons weapons) {
		this.weapons = weapons;
		if (weapons == null) {
			this.attack = level;
		} else
			this.attack = this.level + weapons.getLevel()
					+ weapons.getBonusStrength();
	}

	public void setDefense(Armors armors) {
		this.armors = armors;
		if (armors == null) {
			this.defense = level;
		} else
			this.defense = this.level + armors.getLevel()
					+ armors.getBonusStrength();
	}


}
