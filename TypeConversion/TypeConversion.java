package TypeConversion;

public class TypeConversion {
    public static void main(String[] args) {
        
        //narrow
        double d = 99.9;
        byte a = (byte) d;
        System.out.println(d);
        System.out.println(a);
        // //wide
        // byte a = 8;
        // double d = a;
        // System.out.println(a);
        // System.out.println(d);
    }
    
}
