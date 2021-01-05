package lab2.AnimalRescue;

public class Dog {
    public void setName(String name) {
        this.name = name;
    }

    String name = "Rex";
    int age = 3;
    double weight = 3.7;
    String color = "Brown";
    double height = 1.5;

    public String getName() {
        return name;
    }




    void bark() {
        System.out.println("Ham!");
    }

    void eat() {
        System.out.println("eating dogfood");

    }

    void sleep() {
        System.out.println("zzz..snore");
    }

}
