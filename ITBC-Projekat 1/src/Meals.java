import java.util.ArrayList;
import java.util.List;

public class Meals {
    ArrayList<Meal> meals;

    public Meals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public Meals() {
        meals = new ArrayList<>();
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m) {
        if (!(meals.contains(m))) {
            meals.add(m);
            return true;
        }
        return false;
    }

    public void remove(Meal m) {
        meals.remove(m);

    }

    public ArrayList<Meal> search(String s) {
        ArrayList<Meal> mealContainS = new ArrayList<>();
        for (Meal m : meals) {
            if (m.name.contains(s)) {
                mealContainS.add(m);
            }
        }
        return mealContainS;
    }

    public ArrayList<Meal> search(double kcal) {
        ArrayList<Meal> lessKcal = new ArrayList<>();
        for (Meal m : meals) {
            if (m.getKcal() < kcal) {
                lessKcal.add(m);
            }
        }
        return lessKcal;
    }

    public ArrayList<Meal> search(List<Nutriment> nutriments) {
        ArrayList<Meal> canPrepare = new ArrayList<>();
        for (Meal m : meals) {
            if (m.nutriments.equals(nutriments)) {
                canPrepare.add(m);
            }
        }
        return canPrepare;
    }

    public String toString() {
        String rez = "";
        for (Meal m : meals) {
            rez= rez.concat(m.toString());
        }
        return rez;
    }
}
