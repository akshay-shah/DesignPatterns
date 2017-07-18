/**
 * Created by ashah on 11/7/17.
 */
class BuggyBread2 {

    private static int counter = 0;

    BuggyBread2() {
        counter = 5;
    }

    BuggyBread2(int x){
        counter = x;
    }

    public static void main(String[] args) {
        BuggyBread2 bg = new BuggyBread2();
        System.out.println(counter);
    }
}