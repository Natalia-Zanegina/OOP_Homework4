import java.util.ArrayList;
import java.util.Comparator;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits;


    public Box() {
        fruits = new ArrayList<>();
        this.fruits = fruits;
    }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        float boxWeight = 0.0f;
        for (T fruit : fruits){
            boxWeight += fruit.getWeight();
        }
    return boxWeight;
    }

    @Override
    public String toString() {
        return String.format("В коробке %d фруктов. Вес коробки: %f единиц.", fruits.size(), getWeight());
    }
    public boolean compare(Box<?> o) {
        if (this.getWeight() > o.getWeight()) {
            System.out.println("Текущая коробка тяжелее.");
            return true;
        }
        else {
            System.out.println("Текущая коробка не тяжелее.");
            return false;
        }
    }

    public void pour(Box<T> o){
        o.fruits.addAll(fruits);
        fruits.clear();
    }
}
