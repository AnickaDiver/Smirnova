public class Cat {
    private boolean isFull;
    private String name;
    private int appetite;

    Cat(String name, int appetite) {
        isFull = false;
        this.name = name;
        this.appetite = appetite;
    }
    public void eat (Plate plate){
        if (plate.PlateFull(appetite)){
            System.out.println(name + " поел.");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else {
            System.out.println("Еды мало!"+ name + " не поел.");
        }

    }

}
