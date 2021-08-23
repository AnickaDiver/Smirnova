public class HomeWorkApp {
    public static void main(String[] args) {

        Cat [] group = {
                new Cat ("Фима", 15),
                new Cat ("Люся", 5),
                new Cat ("Барсик", 20),
                new Cat("Мурка", 5),
        };
    Plate plate1 = new Plate(30);

    for (Cat cat : group){
        cat.eat(plate1);
    }
    plate1.AddFood(50);

    }


}