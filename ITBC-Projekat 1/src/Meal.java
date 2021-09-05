import java.util.ArrayList;
import java.util.UUID;

public class Meal implements Energy {
    private UUID id;
    ArrayList<Nutriment> nutriments;
    String name;

    public Meal(ArrayList<Nutriment> nutriments, String name) {
        this.nutriments = nutriments;
        this.name = name;
        this.id = UUID.randomUUID();
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
        nutriments.remove(n);
    }

    public void remove(Nutriment n, double weight) {
        if (nutriments.contains(n)) {
            int index = nutriments.indexOf(n);
            nutriments.get(index).decreaseWeight(weight);
        }
    }

    public double getKcal() {
        double sum = 0;
        for (Nutriment n : nutriments) {
            sum += n.getKcal();
        }
        return sum;
    }

    public double getProteins() {
        double sumProteins = 0;
        for (Nutriment n : nutriments) {
            sumProteins += n.getTotalProteins();

        }
        return sumProteins;
    }

    public double getCarbohydrates() {
        double sumCarbohydrates = 0;
        for (Nutriment n : nutriments) {
            sumCarbohydrates += n.getTotalCarbohydrates();

        }
        return sumCarbohydrates;
    }

    public double getFats() {
        double sumFats = 0;
        for (Nutriment n : nutriments) {
            sumFats += n.getTotalFats();

        }
        return sumFats;
    }

    public double getFiber() {
        double sumFiber = 0;
        for (Nutriment n : nutriments) {
            sumFiber += n.getTotalFiber();

        }
        return sumFiber;
    }

    public boolean equals(Meal m) {
        return id.equals(m.id);

    }

    public String toString() {
        return "[ " + id + " ]" + " | " + "Name: " + name + "\n";
    }
}
