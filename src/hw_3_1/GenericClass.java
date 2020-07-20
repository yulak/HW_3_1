package hw_3_1;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericClass<T> {

    private T[] obj;

    public GenericClass(T[] obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void infoType(){
        System.out.println(obj.getClass().getName());
    }

    // метод, который преобразует массив в ArrayList
    public ArrayList<T> createArrayList() {
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(obj));
        System.out.println(arrayList);
        return arrayList;
    }
    // метод, который меняет два элемента массива местами
    public void changePositionOfElementsInArray() {
        T x = obj[0];
        obj[0] = obj[1];
        obj[1] = x;
        System.out.println(Arrays.toString(obj));
    }
}
