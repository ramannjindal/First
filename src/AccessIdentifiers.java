import folder_second.AnotherClass;
import folder_second.abc.MyOtherClass;

public class AccessIdentifiers {
    public static void main(String[] rkj) {
        Hello hello=new Hello();
        System.out.println("JJJJJ");
        AnotherClass myFirstAnotherClassObject = new AnotherClass();
        int mySummedValue = myFirstAnotherClassObject.doCalulation(10, 15);
        myFirstAnotherClassObject.printME();
        String myName = myFirstAnotherClassObject.className1;
        String message="My caluclated valued: " + mySummedValue;
        System.out.println(message);
        MyOtherClass myOtherClass=new MyOtherClass();
    }
}
