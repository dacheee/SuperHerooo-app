import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SuperHeroApp {

    // Function to add x in arr
    public static String[] addX(String heroArray[], String newHeroName) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));
        // Add the new element
        arrlist.add(newHeroName);
        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        // return the array
        return heroArray;
    }

    // Function to remove a hero from an array
    public static String[] removeX(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        // return the array
        return heroArray;
    }

    public static void main(String[] args) {


//  Variable Section
        String heroName, heroName2, heroName3, heroName4;
        String heroCity, hero2City, hero3City, hero4City;

        String heroPower1, heroPower2, heroPower3, hero2Power, hero2Power2;

        boolean isEvil;

        String heroSalary;
        String heroRealName;
        String universe;
        double newSalary;


//  Variable assignment

//        Hero number 1 info
        heroName = "SUPER SINGER";
        heroCity = "Karaoke world";
        heroPower1 = "super sexy";
        heroPower2 = "the most beautifil voice";
        isEvil = false;
        heroSalary = "all the money";
        heroRealName = "Juris";
        universe = "our";
        newSalary = 1289.99;
        String[] heroList = {"Super Singer", "Mr. Bubbles", "Garbage Man", "Manly Man", "Girly Girl"};


        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Hello User!");

        do {

            System.out.println("Please see your options below - choose a number!");
            System.out.println("1 - See all superheros!");
            System.out.println("2 - See information about " + heroName);
            System.out.println("3 - Add a superhero!");
            System.out.println("4 - Delete a superhero! :( ");
            System.out.println("0 - EXIT the application! Bye!");
            option = scanner.nextInt();




            switch (option) {
                case 1:
                    System.out.println("***** SUPERHERO List *****");
                    for (String heroNames : heroList) {
                        System.out.println(heroNames);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter hero's name: ");
                    String newHeroName = scanner.next().toString();
                    heroList = addX(heroList, newHeroName);
                    break;
                case 3:
                    System.out.println("***********************");
                    System.out.println("***** HERO INFO*****");
                    System.out.println("***********************");
                    System.out.println("Hero name :   " + heroName);
                    System.out.println("--------------------");
                    System.out.println("Hero lives in :   " + heroCity);
                    System.out.println(universe + " universe");
                    System.out.println("--------------------");
                    System.out.println("Hero Superpower :    ");
                    System.out.println(heroPower1);
                    System.out.println(heroPower2);
                    System.out.println("Hero earns " + heroSalary);
                    System.out.println();
                    System.out.println("Hero hides his identity, but his real name is " + heroRealName);
                    System.out.println();
                    System.out.println("Evil? " + isEvil);
                    System.out.println();
                    System.out.println("***********************");
                    System.out.println("***** HERO INFO*****");
                    System.out.println("***********************");
                    heroCity = "Metropolis";

                    switch (heroCity) {
                        case "New York":
                            newSalary = 2000;
                            break;
                        case "Riga":
                            newSalary  = 1200.91;
                            break;
                        case "Metropolis":
                            newSalary  = 1000000;
                            break;
                        default:
                            newSalary  = 100;
                    }

                    System.out.println("Hero's new salary: " + newSalary );
                    // How many cookies can superhero purchase for his /her salary
                    // 1 cookie costs = 1.29 euro
                    System.out.println("**********************************");
                    System.out.println("********** Financials ***************");
                    int numOfCookies = (int)Math.floor(newSalary  / 1.29);
                    System.out.println(" Hero can purchase " + numOfCookies + " cookies");
                    double averageDailySalary = Math.round( (newSalary  / 30 * 100)  ) / 100;
                    System.out.println(" Hero average daily salary is " + averageDailySalary + " euro");
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Bye!");
            }
        }
        while (option != 0);

    }
}
