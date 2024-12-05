package DeepVsShallow;

public class Student
{
    private int age;
    private int gradYear;
    Exam enrollmentExam;

    public Student(int age, int gradYear, Exam enrollmentExam){
        this.age = age;
        this.gradYear = gradYear;
        this.enrollmentExam = enrollmentExam;
    }

    public Student(Student other){
        this.age = other.age;
        this.gradYear = other.gradYear;

        /* shallow copy: copying the reference to the exam variable. when u debug and see addr of enrollmentexam will be same for
        every object i.e s1, s2,,s3... */
//        this.enrollmentExam = other.enrollmentExam;

        //deep copy: creating a different object of Exam. addr of enrollmentexam will be diff for every object.
        this.enrollmentExam = new Exam(other.enrollmentExam);
    }

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
