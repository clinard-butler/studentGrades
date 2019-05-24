import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student Bob = new Student("Bob White", new ArrayList<>());
        Bob.addGrade(90);
        Bob.addGrade(80);
        Bob.addGrade(70);
        Bob.addGrade(85);

        Student John = new Student("John", new ArrayList<>());
        John.addGrade(80);
        John.addGrade(70);
        John.addGrade(87);
        John.addGrade(84);

        Student Sally = new Student("Sally", new ArrayList<>());
        Sally.addGrade(97);
        Sally.addGrade(82);
        Sally.addGrade(65);
        Sally.addGrade(80);

        Student Tom = new Student("Tom", new ArrayList<>());
        Tom.addGrade(94);
        Tom.addGrade(77);
        Tom.addGrade(66);
        Tom.addGrade(78);

        students.put("BobWhite", Bob);
        students.put("JohnDoe", John);
        students.put("SallyMae", Sally);
        students.put("TomRiddle", Tom);

        chooseGit(students);

    }

    public static void chooseGit(HashMap<String, Student> students) {
        String response;
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Welcome \n");
        System.out.println("Here are the GitHub usernames of our students: \n +" +
                students.keySet() + "\n Please enter one if the usernmaes: \n");
        response = nameInput.nextLine();

        switch(response){
            case "BobWhite":
                return;
                break;
            case "JohnDoe":
                return;
                break;
            case "SallyMae":
                return;
                break;
            case "TomRiddle":
                return;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + response);
        }
        System.out.println();
    }
}
