public class HERO {
    private int heroHealth;
    private int heroDamage;
    String heroSuperpower;

    public HERO(String heroSuperpower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperpower = heroSuperpower;
    }

    public HERO(int heroDamage, int heroHealth) {
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
    }

    public String getHeroSuperpower() {
        return heroSuperpower;
    }


    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }


    }





