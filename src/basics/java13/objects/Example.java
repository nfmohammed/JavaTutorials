package basics.java13.objects;

public class Example {
    public static void main(String[] args) {
        Person john = new Person("John", 30);
        john.printName();

        Person james = new Person("James", 25);
        james.printName();
    }
}

class Person {
    private String name;
    private Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void printName() {
        System.out.println("Name = " + this.name+ ", Age = " + this.age);
    }
}