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


    public static class BuilderFastFood implements Builder{
        private Hamburger hamburger;
        private Salad salad;
        private Chicken chicken;
        private Water water;

        @Override
        public Builder setHamburger(Hamburger hamburger) {
            this.hamburger = hamburger;
            return this;
        }

        @Override
        public Builder setSalad(Salad salad) {
            this.salad = salad;
            return this;
        }

        @Override
        public Builder setChicken(Chicken chicken) {
            this.chicken = chicken;
            return this;
        }

        @Override
        public Builder setWater(Water water) {
            this.water = water;
            return this;
        }

        @Override
        public FastFood build() {
            return new FastFood(hamburger,salad,chicken,water);
        }
    }
}
