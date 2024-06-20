import java.util.Scanner;
public class marks5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("maximum mark is 100 .");
        System.out.println("enter mark 1");
       float a = sc.nextFloat();
        System.out.println("enter mark 2");
        float b= sc.nextFloat();
        System.out.println("enter mark 3");
        float c = sc.nextFloat();
        System.out.println("enter mark 4");
        float d = sc.nextFloat();
        System.out.println("enter mark 5");
        float e = sc.nextFloat();
        float sum = ((a+b+c+d+e)/500.0f)*100;
        System.out.print("the total marks is:");
        System.out.println(sum);
        
        
    }
}
