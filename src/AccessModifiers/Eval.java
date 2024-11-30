package AccessModifiers;

import IntroToOOPs.Student;

public class Eval {
    public static void main(String args[]){

        Student student = new Student();
        student.name = "Pooja";
    }
}


/*
    student.attendClass();    //if attendClass is 'default' we can't access outside pkg
    student.psp = 100;   //..we can't access psp bcz its default modifier & accessible within same pkg only
 */