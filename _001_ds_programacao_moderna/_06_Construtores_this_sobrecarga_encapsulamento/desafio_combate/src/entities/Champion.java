package entities;

public class Champion {

	private String name;
	private int life;
	private int atack;
	private int armor;

	public Champion() {

	}

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		atack = damage;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAtack() {
		return atack;
	}

	public void setAtack(int atack) {
		this.atack = atack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {

		if (other.atack < armor) {
			life -= 1;
		} else {
			life -= other.atack - armor;
		}

		if (life < 0) {
			life = 0;
		}
	}

	public String status() {
		if (life == 0) {
			return name + ": " + life + " de vida (Morreu)";
		} else {
			return name + ": " + life + " de vida";
		}

	}

}
