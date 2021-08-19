public class Cat extends Animal {
    Cat (String name, String color, int age){
        super (name, color, age);
    }
    void swim (int length) {
        System.out.println("Не умеет!");
    }
    void run (int length) {
        if (length > 200) {
            System.out.println(name + " не может столько плыть.");
        }
        else System.out.println(name + " пробежал " + length + "м.");
    }
}
