package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Animals implements Cloneable {
    private List<String> animalList;

    public Animals() {
        animalList = new ArrayList<>();
    }

    public Animals(List<String> animalList) {
        this.animalList = animalList;
    }

    public void loadData() {
        animalList.add("dog");
        animalList.add("cat");
        animalList.add("elephant");
    }

    public List<String> getAnimalList() {
        return animalList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getAnimalList()) {
            temp.add(s);
        }
        return new Animals(temp);
    }
}
