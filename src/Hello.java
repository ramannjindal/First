import java.io.File;

public class Hello {
    public String myName;
public static String myLastName="Jindal";

public Hello(String name){
    this.myName=name;
}
public Hello(){

}

    public void changeName(String newName){
        // String tmpName="";
        this.myName=newName;
    }
    public int sumThese(int newName,int second){
        myName="Raman";
        // tmpName="Kumar";
        return newName+second;
    }
     public static void main(String[] args) {
        // System.out.println("I'm Raman here");
        Hello sweta = new Hello("Sweta");
        Hello arun = new Hello();

        // arun.myName="Arun";
        arun.changeName("Arun");

        sweta.myLastName="Aggarwal";

        System.out.println(sweta.myName);
        System.out.println(arun.myName);

        System.out.println(sweta.myLastName);
        System.out.println(arun.myLastName);
        System.out.println(arun.sumThese(10, 20)+"");
File file=new File("s");
    }
}