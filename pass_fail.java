import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        byte m1, m2 ,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in sub 1 ");
        m1 = sc.nextByte();
        System.out.println("enter your marks in sub 2 ");
        m2=sc.nextByte();
        System.out.println("enter your marks in sub 3 ");
        m3=sc.nextByte();
        
        float avg = (m1+m2+m3)/3.0f;
        System.out.print("your overal percentage is " + avg);
        if(avg>40 &&  m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("\n congrats you have been promoted");
        }
        else
        {
            System.out.println("\n you are not promooted ");
        }

    }
}
