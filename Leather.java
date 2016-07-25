package heros;

public class Leather extends Armors {

	public Leather() {
	}

	public Leather(String name, int level, String taunt, int bonusDexterity) {
		super(name, level, taunt);
		this.bonusDexterity = bonusDexterity;
	}

	public void setBonusDexterity(int bonusDexterity) {
		this.bonusDexterity = bonusDexterity;
	}

	@Override
	public void setTaunt() {
		this.taunt = "your sneaky armor allow you to dodge the attack";
	}

}
