
public class Hello {
    public static void main(String[] args) {
        Chair workChair = new Chair("Working chair");
        Chair studyChair = new Chair("Study chair");
        Chair maintainceChair = new Chair("Ghar ka kaam chair");
        Chair kitchenChair = new Chair("Kitchen chair");
        studyChair.setFeet(8);
        workChair.showInfo();
        studyChair.showInfo();
        kitchenChair.isMakingChurrSound = false;
        kitchenChair.sitOnIt();
        studyChair.sitOnIt();
    }
}