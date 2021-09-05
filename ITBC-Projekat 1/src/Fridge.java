import java.util.ArrayList;

public class Fridge {
    ArrayList<Nutriment> nutriments;

    public Fridge(ArrayList<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public Fridge() {
        nutriments = new ArrayList<>();
    }

    public void add(Nutriment n) {
        if (!(nutriments.contains(n))) {
            nutriments.add(n);
        } else {
            int index = nutriments.indexOf(n);
            nutriments.get(index).increaseWeight(n.getWeight());
        }

    }

    public void remove(Nutriment n) {
        if (nutriments.contains(n)) {
            nutriments.remove(n);
        }
    }

    public void remove(Nutriment n, double weight) {
        if (nutriments.contains(n)) {
            int index = nutriments.indexOf(n);
            nutriments.get(index).decreaseWeight(weight);
        }

    }

    public ArrayList<String> getNutriments() {
        ArrayList<String> allNutriments = new ArrayList<>();
        for (Nutriment n : nutriments) {
            allNutriments.add(n.totalNutrientTable());
        }

        return allNutriments;
    }
}
