public class GradeGetterRunner {
    public static void main(String[] args) {
        GradeGetter grader = new GradeGetter();
        String grade = grader.letterGrade(10000);
        System.out.println("The grade is " + grade);
    }
}