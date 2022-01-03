public class Chair {
    private int feet = 4;
    public boolean isMakingChurrSound = true;
    private String chairName;

    public Chair(String _chairName) {
        this.chairName = _chairName;
    }

    public void setFeet(int newFeet) {
        if (newFeet > 8)
            System.out.println("Error, feet cannot be greater than 8");
        else
            feet = newFeet;
    }

    public void sitOnIt() {
        if (isMakingChurrSound) {
            System.out.println("I'm making churrr sound");
        } else {
            System.out.println("I'm not making churrr sound");
        }
    }

    public void showInfo() {
        System.out.println("I'm a chair, my name is " + chairName + " and I've " + feet + " feet");
    }
}
