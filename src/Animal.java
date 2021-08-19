public abstract class Animal {
    String name;
    String color;
    int age;

    Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    int length;

    void run (int length) {
        System.out.println(name + " пробежал " + length + "м.");
    }
    void swim (int length){
        System.out.println(name + " проплыл " + length + "м.");
    }
}
