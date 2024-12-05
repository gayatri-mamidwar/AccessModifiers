package DeepVsShallow;

public class Client
{
    public static void main(String[] args) {
        Exam exam = new Exam(12345, 97);
        Student s1 = new Student(100, 1997, exam);
        System.out.println("s1 age= "+s1.getAge());

        Student s2 = new Student(s1);
        System.out.println("s2 age= "+s2.getAge());
    }
}
