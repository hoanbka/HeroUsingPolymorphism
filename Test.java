package heros;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Weapons weapons1 = new Bow("Japan sword", 22, "", 8899);
		Weapons weapons2 = new Staff("US gun", 11, "hehe", 55);

		Armors armors1 = new Leather("Anti-gun armor", 100, "", 1000);
		Armors armors2 = new Robes("Japan sword", 4, "", 99);

		Hero hero1 = new Archer("Amen", 1, 10, 2, 3, 5, 4, 20, armors1,
				weapons1);

		hero1.setAttack(weapons1);
		weapons1.setTaunt();
		armors1.setTaunt();
		System.out.println("attack = " + hero1.getAttack());
		System.out.println("defense = " + hero1.getDefense());
		System.out.println("attack combat line = " + weapons1.getTaunt());
		System.out.println("defense combat line = " + armors1.getTaunt());

		hero1.setLevel(12);
		System.out.println("new attack = " + hero1.getAttack());
		System.out.println("new defense = " + hero1.getDefense());

		System.out.println("============================");
		Hero hero2 = new Mage("Mage", 1, 2, 3, 4, 5, 6, 100, armors2, weapons2);
		hero2.setAttack(weapons2);
		hero2.setDefense(armors2);
		weapons2.setTaunt();

		System.out.println("attack = " + hero2.getAttack());
		System.out.println("defense = " + hero2.getDefense());
		System.out.println("combat line = " + weapons2.getTaunt());

		System.out.println("============================");
		hero2.setAttack(weapons1);
		hero2.setDefense(armors1);
		System.out.println("attack = " + hero2.getAttack());
		System.out.println("defense = " + hero2.getDefense());

	}

}
