public class logical {
    public static void main(String[] args) {
        boolean a = true ;
        boolean b = false;
        if (a && b)
        {
            System.out.println("y");
        }
        else
        {
            System.out.println("n");
            System.out.println("for logical and ");
        }

        System.out.println("for logical OR");
        boolean a1 = true ;
        boolean b1 = false;
        if (a1 || b1)
        {
            System.out.println("y");
        }
        else
        {
            System.out.println("n");
        }

        System.out.println("for logical not ");
        System.out.println("NOT(A) is");
        System.out.println(!a1);
        System.out.println("for logical not ");
        System.out.println("FOR(B) is ");
        System.out.println(!b1);


    }
}
// the '&' operator returns tue when both the booleans are returninjg tue value . if such a case is there where both the boolean are 
//    retruning false also at that time also  the output will shgow "N"
/*
 * not operator only chamge the decision from true to false and vice versa
 */


 