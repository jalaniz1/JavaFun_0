/**
 * Created by James on 3/1/14.
 */
public class Main {


    public static void main(String []args){
        System.out.println("Hello");
        int mod = -3;
        int result = 10%mod;
        for(int i = 10%mod; i < 10; i++)
        {
            System.out.println(i);
        }
        System.out.println(result);
        System.out.println("Now accessing a dog instance!");
       
        Dog dog2 = new Dog(); // Default constructor
        dog2 = new Dog("Charlie",3,"Brown","Terrier"); // Overwrite
        Dog dog3 = new Dog("C", 2,"B", "C");

        System.out.println("New " + Dog.ANIMAL +"\n"+dog2.g_Name()+"\n"+dog2.g_Age()
                + "\n" + dog2.g_Color() +"\n"+dog2.g_Breed());
        System.out.println("Done with "+Dog.ANIMAL);
        System.out.println("Number of dogs that currently exist: " + Dog.counter);

    }
}
