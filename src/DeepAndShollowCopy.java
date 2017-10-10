import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeepAndShollowCopy {
    int id;
    String name;
    List<String> testlist = new ArrayList<>();

// To performing Shallow Copy
// Note: Here we are not creating any references.
//  public DeepAndShollowCopy(int id, String name, List<String>testlist)
//   {
//
//   System.out.println("Shallow Copy for Object initialization");
//   this.id = id;
//   this.name = name;
//   this.testlist = testlist;
//
//   }

    // To performing Deep Copy
// Note: Here we are creating one references( Al arraylist object ).
    public DeepAndShollowCopy(int id, String name, List<String> testlist) {
        System.out.println("Deep Copy for Object initialization");
        this.id = id;
        this.name = name;
        String item;
        List<String> Al = new ArrayList<>();
        Iterator<String> itr = testlist.iterator();
        while (itr.hasNext()) {
            item = itr.next();
            Al.add(item);
        }
        this.testlist = Al;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Oracle");
        list.add("C++");
        DeepAndShollowCopy copy = new DeepAndShollowCopy(10, "Testing", list);
        list.add("python");
        DeepAndShollowCopy copy1 = new DeepAndShollowCopy(10, "Testing", list);
        System.out.println(copy.toString());
        System.out.println(copy1.toString());
    }

    @Override
    public String toString() {
        return "DeepAndShollowCopy [id=" + id + ", name=" + name + ", testlist=" + testlist + "]";
    }
}
