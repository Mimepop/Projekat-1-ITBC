public class Food extends Nutriment {
    private boolean isSweet=false;

    public Food(String name, String company, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(name, company, weight, kcal, proteins, carbohydrates, fats, fiber);
    }
}
