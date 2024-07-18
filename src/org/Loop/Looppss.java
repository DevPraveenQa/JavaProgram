package org.Loop;

public class Looppss {

    public static void main(String[] args) {
        int a;
        innerloop:
        for (int i = 1; i <= 5; i++) {
            outerloop:
            for (int j = 1; j <= 6; j++) {
              
                System.out.print("P");
                if (i == 2 && j == 2)
                    break outerloop;
               
 if (i == 4 && j == 2)
                    break outerloop;

              
                if (i == 5 && j == 2)
                    break outerloop;
            }
            System.out.println();
        }

    }

}

