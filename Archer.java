package heros;

public class Archer extends Hero {

	public Archer() {
		super();
	}

	public Archer(String name, int level, int strength, int dexterity,
			int intelligence, int attack, int defense, int hp, Armors armors,
			Weapons weapons) {
		super(name, level, strength, dexterity, intelligence, attack, defense,
				hp, armors, weapons);
	}

	@Override
	public void fight() {
		System.out.println("aaaa...");

	}

	@Override
	public String tauntLine() {
		return "Aim twice, shoot once";
	}

	public void setAttack(Weapons weapons) {
		if (weapons == null) {
			this.attack += level;
		} else
			this.attack = this.level + weapons.getLevel()
					+ weapons.getBonusDexterity();
	}


	public void setDefense(Armors armors) {
		if (armors == null) {
			this.armors = null;
			this.defense += level;
		} else
			this.defense = this.level + armors.getLevel()
					+ armors.getBonusDexterity();
	}

}
