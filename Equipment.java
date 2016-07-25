package heros;

public abstract class Equipment {
	protected String name;
	protected int level;

	protected Equipment() {
		super();
	}

	protected Equipment(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
