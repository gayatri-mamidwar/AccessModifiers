package Constructors;

public class Client
{
    public static void main(String[] args) {
        Student s1 = new Student(200, 2000);

        /* If u try to use default constructor below parameterized constructor Java won't allow you. Java only provide default
        constructor if you do not have any one constructor that is either default/parameterized constructor.

        Student s = new Student();
        */

        System.out.println("age = "+ s1.getAge());
        System.out.println("gradYear= "+ s1.getGradYear());

        Student s2 = new Student(s1);                           //copy constructor. Here we are coping values of s1 by passing it as arg
        System.out.println("age= "+s2.getAge());
        System.out.println("gradYear= "+s2.getGradYear());

    }
}
