package Operators.Relational_Operators;

public class Test {
    //==
    //!=
    //<
    //<=
    //>
    //>=

    public static void main(String[] args) {
    // ==
        int tower1Height = 10;
    int tower2Height = 10;
    boolean sameHeight = tower1Height == tower2Height;
    System.out.println(sameHeight);
    // !=
    int myBridges =2;
    int friendBridges = 3;
    boolean differentBridges = myBridges != friendBridges;
    System.out.println(differentBridges);
    // >
    int myDragonSize = 5;
    int friendDragonSize = 3;
    boolean biggerDragon = myDragonSize > friendDragonSize;
    System.out.println(biggerDragon);
    // <
    int gatehouseSize = 2;
    int mainHallSize = 4;
    boolean smallerGatehouse = gatehouseSize < mainHallSize;
    System.out.println(smallerGatehouse);
    //>=
        int towerHeight =10;
        int wallHeight=10;
        boolean tallTowers = towerHeight >= wallHeight;
            System.out.println(tallTowers);
        //<=

    int windowBricks = 4;
    int maxBricks = 5;
    boolean smallWindows = windowBricks <= maxBricks;

        
    }
    
}

