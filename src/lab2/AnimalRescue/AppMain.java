package lab2.AnimalRescue;

import java.net.Socket;

public class AppMain {

    public static void main(String[] args){
        Dog mydog = new Dog();

        System.out.println(mydog.age);
        System.out.println(mydog.getName());
        mydog.bark();
        mydog.setName("becs");
        System.out.println(mydog.name);


        Dog mySecondDog = new Dog();
        mySecondDog.name = "tex";
        System.out.println(mySecondDog.name);

        Girl myGirl = new Girl();
        System.out.println(myGirl.name);


        Recreation myRecreation1 = new Recreation();
        System.out.println(myRecreation1.recreation1);

        DogFood mydogFood = new DogFood();
        System.out.println(mydogFood.food);
        System.out.println(mydogFood.weight);

        Vet myVet = new Vet();
        System.out.println(myVet.name);
        System.out.println(myVet.age);



    }


}
