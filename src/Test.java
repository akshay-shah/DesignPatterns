import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by ashah on 11/7/17.
 */
public class Test {

    /**
     * method(null) will call method(String s) rather method(object o)
     */
    //    public static void main(String[] args) {
//        method(null);

    /**
     * L in the end will convert the value to long, while with no L at the end it will truncate the integer value
     */
//        long longWithL = 1000*60*60*24*365L;
//        long longWithoutL = 1000*60*60*24*365;
//        System.out.println(longWithL);
//        System.out.println(longWithoutL);
//    }
//    public static void method(Object o) {
//        System.out.println("Object impl");
//    }
//    public static void method(String s) {
//        System.out.println("String impl");
//    }

//pu1blic static void main(String[] args) { System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); }
//    static int n;

//    public static void main(String[] args) {

        /*
        IN try catch block return statement executes finally block but system.exit does not execute finally block
         */

//        try {
//            System.out.println(n);
////            return;
//            System.exit(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("I am here");
//        }

    /**
     * You cannot overide private and static methods
     */
//        A a = new B();

//    }

    /**
     * this will print unicode values for "akshay"
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) throws Exception {
//        char[] chars = new char[]{'\u0097'};
//        String str = new String(chars);
//        byte[] bytes = "akshay".getBytes();
//        System.out.println(Arrays.toString(bytes));
//    }


    /**
     * Exceptions which are explicitly declared will be caught directly without entering super class other exceptions will go to Super class
     *
     * @param args
     */
//    public static void main(String[] args){
//        try{
//            int i = 1/0;
//            throw new NullPointerException();
//        }catch (NullPointerException e){
//            System.out.println("Null Pointer Catch");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("Exception Catch");
//        }finally {
//            System.out.println("Hello");
//        }
//    }

    /**
     * Hashmap cannot insert duplicate values, if tried to insert duplicates it will not show error but would replace corresponding value
     *
     * @param args
     */
//    public static void main(String[] args) {
//        try {
//            HashMap<String, String> a = new HashMap();
//            a.put("k", "v");
//            a.put("k", "h");
//            Set<String> set = a.keySet();
//            for(String k : set){
//                System.out.println("key :"+k);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//

//    public static void main(String[] args)
//    {
//        // the line below this gives an output
        // \u000d
    // System.out.println("comment executed");
//    }
    public static void main(String[] args) {
        System.out.println(String.valueOf(200.0));
    }
}
