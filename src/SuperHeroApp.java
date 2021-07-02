public class SuperHeroApp {

    public static void main(String[] args) {
//  Variable Section
        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;

        double heroSalary;
        String heroRealName;
        String universe;




//  Variable assignment
        heroName = "AliExpress Man";
        heroCity = "Beijing";
        heroPower1 = "super cheap";
        heroPower2 = "many items";
        isEvil = false;
        heroSalary = 0.99;
        heroRealName = "Hjang Hjong";
        universe = "our";
//  Print out Hero info card

        System.out.println("***********************");
        System.out.println("***** HERO INFO*****");
        System.out.println("***********************");
        System.out.println("Hero name :   " +     heroName);
        System.out.println("--------------------");
        System.out.println("Hero lives in :   " + heroCity+ universe + "universe");
        System.out.println("--------------------");
        System.out.println("Hero Superpower :    ");
        System.out.println(heroPower1);
        System.out.println(heroPower2);
        System.out.println("Hero earns :   " + heroSalary + "EUR");
        System.out.println();
        System.out.println("Hero hides his identity, but his real name is" +heroRealName);




    }
}
