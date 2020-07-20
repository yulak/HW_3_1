package hw_3_1;

public class Main {

    public static void main(String[] args) {
	// Number 1

        GenericClass<String> catsNames = new GenericClass<String>(new String[]{"Barsik", "Garfild"});
        GenericClass<Integer> ageCats = new GenericClass<Integer>(new Integer[]{5, 7});
        GenericClass<Double> catsWieghts = new GenericClass<Double>(new Double[]{5.5, 7.5});

        System.out.println("\nТип массива: ");
        catsNames.infoType();
        ageCats.infoType();
        catsNames.infoType();

        System.out.println("\nПрежняя версия");
        catsNames.createArrayList();
        ageCats.createArrayList();
        catsWieghts.createArrayList();

        System.out.println("\nМеняем местами");
        catsNames.changePositionOfElementsInArray();
        ageCats.changePositionOfElementsInArray();
        catsWieghts.changePositionOfElementsInArray();



        // Number 2
        System.out.println("\nЗадание 2\n");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> appleBox = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> orangeBox = new Box<Orange>(orange1, orange2);

        System.out.println(appleBox.compare(orangeBox));

        Box<Orange> orangeBox1 = new Box<Orange>();
        orangeBox.transfer(orangeBox1);

    }
}
