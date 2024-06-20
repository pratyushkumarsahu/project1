public class strings_methods {
    public static void main(String[] args) {
        String name="Pratyush";
       // System.out.println(name);
       int value = name.length();  
       System.out.println(value);

       String lname = name.toLowerCase();  
       System.out.println(lname);

       
       String uname = name.toUpperCase();  
       System.out.println(uname);

       String nonTrimmedString = "   Pratyush    ";
       System.out.println(nonTrimmedString);
       
       String TrimmedString = nonTrimmedString.trim();
       System.out.println(TrimmedString);
       
    }
}
