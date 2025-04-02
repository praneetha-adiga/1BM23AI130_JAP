import java.util.Scanner;
class Student{
    int marks;
}
public class lab4b {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            final int NUM_STUDENTS = 5;
            Student[] obj = new Student[NUM_STUDENTS];
            for(int i=0;i<NUM_STUDENTS;i++){
                obj[i] = new Student();
                obj[i].marks= scanner.nextInt();
                System.out.println("Student1 marks is:"+obj[i].marks);
                obj[i].marks = scanner.nextInt();
            }
            int sum = 0;
            int highest_score = obj[0].marks;
            for (int i = 0; i < NUM_STUDENTS; i++) {
                sum += obj[i].marks;
                if (obj[i].marks > highest_score) {
                    highest_score = obj[i].marks;
                }
            }
            System.out.println("Total sum of marks: " + sum);
            System.out.println("Highest score: " + highest_score);

            scanner.close();


        }
}
