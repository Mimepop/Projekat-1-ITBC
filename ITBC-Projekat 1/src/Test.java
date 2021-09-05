import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime nutrijenta: ");
        String nameInput = sc.next();

        System.out.println("Unesite kompaniju nutrijenta: ");
        String companyInput = sc.next();

        System.out.println("Unesite  tezinu nutrijenta: ");
        Double weightInput = sc.nextDouble();

        System.out.println("Unesite  kilokalorije: ");
        Double kcalInput = sc.nextDouble();

        System.out.println("Unesite proteine: ");
        Double proteinInput = sc.nextDouble();

        System.out.println("Unesite ugljene hidrate: ");
        Double carbInput = sc.nextDouble();

        System.out.println("Unesite masti: ");
        Double fatInput = sc.nextDouble();

        System.out.println("Unesite vlakna: ");
        Double fiberInput = sc.nextDouble();

        Nutriment nutrimentFromInput = new Nutriment(nameInput, companyInput, weightInput, kcalInput, proteinInput, carbInput, fatInput, fiberInput);
        ArrayList<Nutriment> nut = new ArrayList<>();
        nut.add(nutrimentFromInput);

        System.out.println("Unesite ime vaseg jela: ");
        String mealNameFromInput = sc.next();

        Meal meal1 = new Meal(nut, mealNameFromInput);

        Fridge f=new Fridge();
        System.out.println(meal1.nutriments);
        System.out.println(f.getNutriments());
    }
    /* Meals m = new Meals();
        Nutriment n = new Nutriment("jaje", "premia", 150, 80, 40, 3, 7, 1);
        Nutriment y = new Nutriment("mleko", "imlek", 250, 50, 70, 1, 3, 2);
        Nutriment d = new Nutriment("pasteta", "carnex", 300, 20, 80, 0, 6, 8);

        Nutriment n1 = new Nutriment("hleb", "premia", 150, 80, 40, 3, 7, 1);
        Nutriment y1 = new Nutriment("majonez", "imlek", 250, 50, 70, 1, 3, 2);
        Nutriment d1 = new Nutriment("kobasica", "carnex", 300, 20, 80, 0, 6, 8);

        ArrayList<Nutriment> nut = new ArrayList<>();
        ArrayList<Nutriment> nut2 = new ArrayList<>();

        nut.add(n);
        nut.add(y);
        nut.add(d);

        nut2.add(n1);
        nut2.add(y1);
        nut2.add(d1);

        Meal ml = new Meal(nut, "SUPA");
        Meal ml1 = new Meal(nut2, "sendvic");
        m.add(ml1);
        m.add(ml);
        System.out.println(m);
        System.out.println(m.getMeals());
        System.out.println(m.search("sen"));
        Fridge f=new Fridge();
        f.add(n);
        f.add(y);
        f.add(y);
        f.add(d);
        f.remove(n,20);
        System.out.println(f.getNutriments());
        System.out.println(m.search(nut2));

        System.out.println(ml.nutriments);
      }
    */
}