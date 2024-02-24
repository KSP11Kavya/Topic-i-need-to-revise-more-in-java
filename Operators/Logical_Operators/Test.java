package Operators.Logical_Operators;

public class Test {
   //&&
   // ||
   // !
public static void main(String[] args) {
    boolean snackFinished = true;
    boolean roomCleaned = true;
    // boolean playAllowed = snackFinished && roomCleaned;
    // System.out.println(playAllowed);
    boolean playAllowed = snackFinished || roomCleaned;
    System.out.println(playAllowed);

    boolean  tired = false;
    boolean keepPlaying = !tired;
    System.out.println(keepPlaying);
}

}

