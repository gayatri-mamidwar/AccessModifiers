package IntroToOOPs;

public class Client {
    public static void main(String args[]){

        Student student1 = new Student();
        student1.name = "Gayatri";
//        student1.psp = 100;                   //when psp modifier is 'default' we can call like this

        student1.setPsp(100);               //when psp modifier is 'private' using setter we can set the value
//        student1.setPsp(-100);            //in case -ve psp it will throw exception
        student1.attendClass();

        //bcz of 'new' keyword new address allocated to student2
        Student student2 = new Student();
        student2.name = "Pritam";
        student2.attendClass();

        //here, student3 is refernce created from student2. i.e same m/m location. So,it will override values of student2
        Student student3 = student2;
        student3.name = "Yogesh";
        student3.attendClass();
    }
}
