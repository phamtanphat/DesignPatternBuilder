public class Main {



    public static void main(String[] args){

        FastFood fastFood = new FastFood.BuilderFastFood()
                .setChicken(Chicken.CURRY)
                .setHamburger(Hamburger.BUTTER)
                .setWater(Water.PEPSI)
                .build();

        System.out.println(fastFood.getSalad().toString());

    }
}
