package Operators.Logical_Operators;

public class Main {
    public static void main(String[] args) {
        boolean ram = true;
        boolean laxman = true ;
        // boolean brothers = ram && laxman;
        boolean brother = !ram;
        boolean brothers = ram || laxman;
        System.out.println(brothers);
        System.out.println(brother);
    }
    
}

