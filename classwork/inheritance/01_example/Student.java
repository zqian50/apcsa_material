public class Student extends Person{
    private int grade;

    public Student (String fName, String lName, String addr, int gr) {
        grade = gr;
    }

    public int getGrade () {
        return grade;
    }

    public void setGrade (int newInput) {
        grade = newInput;
    }

}
