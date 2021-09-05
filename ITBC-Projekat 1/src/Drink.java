public class Drink extends Nutriment{
    private boolean isCarbonated=false;

    public Drink(String name, String company, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(name, company, weight, kcal, proteins, carbohydrates, fats, fiber);
    }
}
