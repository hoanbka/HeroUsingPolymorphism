package heros;

public abstract class Hero {
	protected String name;
	protected int level;
	protected int strength;
	protected int dexterity;
	protected int intelligence;
	protected int attack;
	protected int defense;
	protected int hp = 100;// health point
	protected Armors armors;
	protected Weapons weapons;

	public Hero() {
	}

	public Hero(String name, int level, int strength, int dexterity,
			int intelligence, int attack, int defense, int hp, Armors armors,
			Weapons weapons) {
		super();
		this.name = name;
		this.level = level;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.attack = attack;
		this.defense = defense;
		this.hp = hp;
		this.armors = armors;
		this.weapons = weapons;
	}

	public String tauntLine() {
		return "I'm ready for anything..";
	}

	public abstract void fight();

	public abstract void setAttack(Weapons weapons);

	public abstract void setDefense(Armors armors);

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getStrength() {
		return strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public void changeArmors(Armors armors) {
		this.armors = armors;
	}

	public void changeWeapons(Weapons weapons) {
		this.weapons = weapons;
	}

	public void setLevel(int level) {
		this.attack = this.attack - this.level + level;
		this.defense = this.defense - this.level + level;
		this.level = level;

	}

}
