public class FastFood {
    private Hamburger hamburger;
    private Salad salad;
    private Chicken chicken;
    private Water water;

    // alt + insert

    public FastFood(Hamburger hamburger, Salad salad, Chicken chicken, Water water) {
        this.hamburger = hamburger;
        this.salad = salad;
        this.chicken = chicken;
        this.water = water;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Salad getSalad() {
        return salad;
    }

    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    public Chicken getChicken() {
        return chicken;
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
