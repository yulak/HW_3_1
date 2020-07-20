package hw_3_1;

import java.util.ArrayList;
import java.util.Arrays;

// Класс Box, в который можно складывать фрукты.
public class Box<F extends Fruit> {
    //Для хранения фруктов внутри коробки можно использовать ArrayList
    private ArrayList<F> fruits;

    public Box(F... fruits){
        this.fruits = new ArrayList<F>(Arrays.asList(fruits));
    }

    //метод добавления фрукта в коробку
    public void add(F... fruits){
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void remove(F... fruits){
        for (F fruit: fruits) this.fruits.remove(fruit);
    }

    public ArrayList<F> getFruits() {
        return new ArrayList<F>(fruits);
    }

    public void clear(){
        fruits.clear();
    }

    //метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
    public float getWeight() {
        if (fruits.size() == 0) return 0;
        float weight = 0;
        for (F item: fruits) weight += item.getWeight();
        return weight;
    }

    //метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true – если она равны по весу, false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    //метод, который позволяет пересыпать фрукты из текущей коробки в другую
    public void transfer(Box<? super F> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }

}

