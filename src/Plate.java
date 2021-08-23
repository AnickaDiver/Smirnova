public class Plate {
    private int food;

    Plate (int food) {
        this.food = food;
    }
    public void decreaseFood (int appetite) {
        if (!PlateFull(appetite)){
            System.out.println("Еды маловато");
        }

        else this.food -= appetite;
    }

    public void info() {
        System.out.println("plate: "+ food);
    }

    public boolean PlateFull (int appetite){
    return appetite < food;
    }

    public void AddFood (int NewFood){
        this.food += NewFood;
        System.out.println("Добавили " + NewFood);
    }
}
