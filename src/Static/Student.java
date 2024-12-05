package Static;

public class Student
{
    private int age;
    private int gradYear;

    static int static_count;
    int id;
    int non_static_count;

    public Student(int age, int gradYear){
        this.age = age;
        this.gradYear = gradYear;
        static_count++;
        id = static_count;
        non_static_count++;
    }

    //from non-static method we can access static variable,bcz only 1 static vari is there so compiler know its val
    public int getCount(){
        return static_count;
    }

    // but from static method we cant access non-static variables. bcz non-static vari is obj level So, compiler dont know which 1 to call
    public static void doSomething(){
//        age += 20;
    }

    public static int getAgeOfAnyStudent(){
        return 0;
//        return age;
    }

}
