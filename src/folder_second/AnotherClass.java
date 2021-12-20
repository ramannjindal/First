package folder_second;

import folder_second.abc.MyOtherClass;

public class AnotherClass {

    public String className1 = "my name is AnotherClass";

    public AnotherClass() {
        MyOtherClass asdfghjk = new MyOtherClass();
    }

    public AnotherClass(String first) {

    }

    public static void printMeThis() {
        System.out.println("I'm inside AnotherClass now");
    }

    public static void printMeThis2() {
        System.out.println("I'm inside AnotherClass now");
    }

    public void printME() {
        System.out.println("I'm inside AnotherClass now");
    }

    public int doCalulation(int firstValue, int secondValue) {
        int sum = firstValue + secondValue;
        return sum;
    }
}
