public class Main{
    public static void main (String[] args){
        int a = 55;
        int b = 45;
        int c = 52;
        int result;
        result
        = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
    System.out.println("Max of three numbers = "
                       + result);
    }
}
