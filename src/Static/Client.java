package Static;

public class Client
{
    public static void main(String[] args) {
        System.out.println(Student.static_count);           //initially static count is 0

        System.out.println(Student.getAgeOfAnyStudent());

        Student s1 = new Student(10, 1965);
        Student s2 = new Student(10, 1965);
        Student s3 = new Student(10, 1965);
        Student s4 = new Student(10, 1965);
        Student s5 = new Student(10, 1965);

        System.out.println(s5.non_static_count);
        System.out.println(s5.id);
        System.out.println(Student.static_count);       //call static vari using classname

    }
}
