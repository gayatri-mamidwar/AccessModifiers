package DeepVsShallow;

public class Exam
{
    int exam_id;
    int score;

    public Exam(int exam_id, int score){
        this.exam_id = exam_id;
        this.score = score;
    }

    public Exam(Exam other){
        this.exam_id = other.exam_id;
        this.score = other.score;
    }
//
//    public int getExam_id() {
//        return exam_id;
//    }
//
//    public void setExam_id(int exam_id) {
//        this.exam_id = exam_id;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
}
