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
        Hello hello = new Hello();
        System.out.println("JJJJJ");
        int i = 10;
        String name = i == 10 ? "Raman" : "Arun";
        AnotherClass myFirstAnotherClassObject = new AnotherClass();
        int mySummedValue = myFirstAnotherClassObject.doCalulation(10, 15);

        myFirstAnotherClassObject.printME();
        String s = "Raman";
        String myName = myFirstAnotherClassObject.className1;
        String message = "My caluclated valued: " + mySummedValue;
        System.out.println(message);
        MyOtherClass myOtherClass = new MyOtherClass();
    }

}
