/**
 * Created by ashah on 11/7/17.
 */
class BuggyBread {
    public static void main(String[] args) {
        String s2 = "I am unique!";
        String s5 = "I am unique!";
        String s3 = new String("I am unique!");

        System.out.println(s2 == s5);
        System.out.println(s2 == s3);
    }
}
