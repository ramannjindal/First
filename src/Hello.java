
public class Hello {
    public static void main(String[] args) {
        Chair workChair = new Chair();
        Chair studyChair = new Chair();
        Chair maintainceChair = new Chair();
        Chair kitchenChair = new Chair();
        studyChair.setFeet(8);
        workChair.showInfo();
        studyChair.showInfo();
        kitchenChair.isMakingChurrSound = false;
        kitchenChair.sitOnIt();
        studyChair.sitOnIt();
    }
}