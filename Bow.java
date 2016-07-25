package heros;

public class Bow extends Weapons {

	public Bow() {
		super();
	}

	public Bow(String name, int level, String taunt, int bonusDexterity) {
		super(name, level, taunt);
		this.bonusDexterity = bonusDexterity;

	}

	public void setBonusDexterity(int bonusDexterity) {
		this.bonusDexterity = bonusDexterity;
	}

	public void setTaunt() {
		this.taunt = "you shoot an arrow for";
	}

}
