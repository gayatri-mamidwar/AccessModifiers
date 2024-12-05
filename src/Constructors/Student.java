package Constructors;

public class Student {
    private int age;
    private int gradYear;

    //Default constructor. only 1 default constructor is allowed for one class
//    public Student(){
//        age = 100;
//        gradYear = 1900;
//    }

    //Copy constructor. in this we are copying values of other object
    public Student(Student other){
        this.age = other.age;
        this.gradYear = other.gradYear;
    }

    //constructor overloading
    //Parameterized Constructor
    public Student(int age, int gradYear){
        this.age = age;                                 //if instance vari and cls vari names are same then use 'this'
        this.gradYear = gradYear;            //'this' is must to refer to current object. if we don't use 'this' will get default d.t values by java
    }

    /* In constructor overloading,compiler checks for datatype sequence. if d.t are same in 2 constructor it will show err.
    bcz in this and above example it don't know which constructor to call based on provided values.

    public Student(int gradYear, int age){
        this.gradYear = gradYear;
        this.age = age;
    }
    */


    //Generate getters and setters for private variables
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
