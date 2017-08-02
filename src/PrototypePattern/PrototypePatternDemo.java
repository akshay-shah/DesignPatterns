package PrototypePattern;

import java.util.List;

/**
 * @author ashah
 * Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.
 * So this pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.
 * This pattern uses java cloning to copy the object.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animals animals = new Animals();
        animals.loadData();
        Animals newAnimal = (Animals) animals.clone();
        Animals newAnimal1 = (Animals) animals.clone();
        List<String> list = newAnimal.getAnimalList();
        list.add("mouse");
        List<String> list1 = newAnimal1.getAnimalList();
        list1.remove("elephant");
        System.out.println("emps List: " + animals.getAnimalList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }
}
