import folder_second.AnotherClass;
import folder_second.abc.MyOtherClass;

public class AccessIdentifiers {
    float a = 2.0f;
    boolean b = true;
    byte c;
    char d;
    int e;
    String f;

    public static void main(String[] rkj) {
        // Hello hello = new Hello();
        // System.out.println("JJJJJ");
        // String name = i == 10 ? "Raman" : "Arun";
        // AnotherClass myFirstAnotherClassObject = new AnotherClass();
        // int mySummedValue = myFirstAnotherClassObject.doCalulation(10, 15);

        // myFirstAnotherClassObject.printME();
        // String s = "Raman";
        // String myName = myFirstAnotherClassObject.className1;
        // String message = "My caluclated valued: " + mySummedValue;
        // System.out.println(message);
        // for (int j = 0; j < 11; j++)
        // System.out.println("My position is: " + j);

        int i = 4;
        System.out.println("This is the start ");
        while (i < 15) {
            System.out.println("My current value is: " + i);
            i++;
            if (i == 10)
                break;
            System.out.println("This is after continue");
        }
        // continue;
        // break;
        // for (int k = 5; k < 9; k = k + 2) {
        // System.out.println("My current k value is: " + k);
        // }
        // i = 4;
        // do {
        // System.out.println("My current value is: " + i);
        // i++;
        // } while (i > 4);
        System.out.println("This is the end ");
        // MyOtherClass myOtherClass = new MyOtherClass();
    }

}
