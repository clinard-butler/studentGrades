import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList <Integer> grades;

    public Student(String studentName, ArrayList<Integer> grades) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getGrades(){
        String allGrades = "";
        for (Integer grade: grades){
            allGrades += grade + "/n";
        }
        return allGrades;
    }
    public int gradeSum(){
        int sum = 0;
        for (Integer grade: grades){
            sum += grade;
        }
        return sum;
    }

    // returns the student's name
    public String getName(){
        return this.studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }


    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student Bob = new Student("Bob", new ArrayList<>());
        Bob.addGrade(90);
        Bob.addGrade(80);
        Bob.addGrade(70);
        Bob.addGrade(85);
        System.out.println(Bob.getGradeAverage());
    }
}
