public class Employee {
    String name;
    String job;
    String email;
    String phone;
    int salary;
    int age;

    Employee (String name, String job, String email, String phone, int salary, int age){
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void info (){
        System.out.println(name + ", " + job + ", " + email + ", " + phone + ", Зарплата " + salary + ", Возраст " + age );

    }

}
