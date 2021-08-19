public class HomeWorkApp {
    public static void main(String[] args) {

    Cat cat = new Cat("Мурка", "Рыжая", 8);
    cat.run(15);
    Dog dog = new Dog ("Мелодия", "Черная", 2);
    dog.swim(20);
    cat.swim(40);
    dog.run(60);
    }


}
