public class Dog extends Animal {

    Dog(String name, String color, int age) {
        super (name, color, age);
    }

    void run (int length) {
        if (length > 500) {
            System.out.println(name + " не может столько бежать");
        }
        else System.out.println(name + " пробежал " + length + "м.");
    }
    void swim (int length) {
        if (length > 10) {
            System.out.println(name + " не может столько плыть");
        }
        else System.out.println(name + " проплыл " + length + "м.");
    }
}
