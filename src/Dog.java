/**
 * Created by James on 3/2/14.
 */
public class Dog {
    private  String m_name;
    private  String m_breed;
    private  int m_age;
    private  String m_color;
    private  boolean m_has_owner;
    private  boolean m_has_shots;
    private  boolean m_is_deceased;
    public static final String ANIMAL = "Dog";  // Static/Shared constant ANIMAL
    public static int counter = 0;  // Static/Shared global counter

    public Dog()
    {} // Default constructor
    public Dog(String name, int age, String color, String breed)
    {
        this.m_name = name;
        this.m_age = age;
        this.m_color = color;
        this.m_breed = breed;
        counter++;
    }  // Overloaded constructor, different signature

    // This is java, no need for a C++ destructor.



    String g_Name()
    {
        return this.m_name;
    }
    String g_Breed()
    {
        return this.m_breed;
    }

    int g_Age()
    {
        return this.m_age;
    }

    String g_Color()
    {
        return this.m_color;
    }

    boolean g_Owner()
    {
        return this.m_has_owner;
    }

    boolean g_Shots()
    {
        return this.m_has_shots;
    }
    boolean is_Alive()
    {
        return this.m_is_deceased;
    }
}
