public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void takeDamage(Champion other) {
        if (this.armor <= other.attack && this.life > other.attack) {
            this.life = (this.life + this.armor) - other.attack;
            status();
        } else if (this.armor <= other.attack && this.life < other.attack) {
            this.life = 0;
            status();
        } else {
            this.life = this.life - 1;
            status();
        }
    }
    public String status() {
        if (getLife() <= 0) {
            return getName() + ": " + getLife() + " de vida (morreu)";
        } else {
            return getName() + ": " + getLife() + " de vida";
        }

    }
}

