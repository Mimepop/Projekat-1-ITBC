public class Nutriment extends Grocery {
    private double weight;
    private double kcal;
    private double proteins;
    private double carbohydrates;
    private double fats;
    private double fiber;

    public Nutriment(String name, String company, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(name, company);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment updateNutriment(String name, String company, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        if (name != null) {
            this.setName(name);
        }
        if (company != null) {
            this.setCompany(company);
        }
        if (weight != null) {
            this.weight = weight;
        }
        if (kcal != null) {
            this.kcal = kcal;
        }
        if (proteins != null) {
            this.proteins = proteins;
        }
        if (carbohydrates != null) {
            this.carbohydrates = carbohydrates;
        }
        if (fats != null) {
            this.fats = fats;
        }
        if (fiber != null) {
            this.fiber = fiber;
        }
        return this;
    }

    public double getProteins() {
        return proteins;
    }

    public double getWeight() {
        return weight;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getFiber() {
        return fiber;
    }

    @Override
    public double getKcal() {
        return getTotal(kcal);
    }

    public double getTotal(double n) {
        return (weight / 100) * n;

    }

    public double getTotalProteins() {
        return getTotal(proteins);
    }

    public double getTotalCarbohydrates() {
        return getTotal(carbohydrates);
    }

    public double getTotalFats() {
        return getTotal(fats);
    }

    public double getTotalFiber() {
        return getTotal(fiber);
    }

    public double increaseWeight(double w) {
        weight += w;
        return weight;
    }

    public double decreaseWeight(double w) {
        weight -= w;
        return weight;
    }


    public String toString() {
        return "Company: " + getCompany() + "\n" +
                "Name: " + getName() + "\n" +
                "Weight: 100g" + "\n" +
                "kcal: " + kcal + "\n" +
                "Proteins: " + proteins + " %" + "\n" +
                "Carbohydrates: " + carbohydrates + " %" + "\n" +
                "Fats: " + fats + " %" + "\n" +
                "Fiber:" + fiber + " %";
    }

    public String totalNutrientTable() {
        return "Company: " + getCompany() + "\n" +
                "Name: " + getName() + "\n" +
                "Weight: " + weight + "\n" +
                "kcal: " + kcal + "\n" +
                "Proteins: " + getTotalProteins() + "g" + "\n" +
                "Carbohydrates: " + getTotalCarbohydrates() + "g" + "\n" +
                "Fats: " + getTotalFats() + "g" + "\n" +
                "Fiber:" + getTotalFiber() + "g";

    }
}
