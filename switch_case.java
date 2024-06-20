import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age)
        {
          case 18:
          System.out.println("your are an adult");
          break;
          case 23: 
          System.out.println("you are eligible for job");
          break;
          case 60:
          System.out.println("you are goiung to retire");
          break;
          default:
          System.out.print("enkjoy ur life");
        } 
    }
}
