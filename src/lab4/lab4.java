package lab4;

public class lab4 {


    public static void main(String[] args) {
        int x = 95;

        Logic logic = new Logic();
//        logic.printToHundred(x);


//       1. Write a java program to count backwards
//        from a given number to a lower given number




        //             logic.countToOneHundred(46);


        //       logic.countToMinus(46);


        //       logic.countBetween(46,47);


//        logic.ascendingCount(46, 47);


//        logic.allNumbers();


        //       logic.oddNumbers();

        //       System.out.println(logic.getSum(99));


        System.out.println(logic.getMedia(99));


        logic.asterix();


        While aWhile = new While();

        // print to 100

        aWhile.printToOneHundred(46);

        // print to -100

        aWhile.countToMinus(146);

       // count x to y

        aWhile.countXToY(46,9);

      // count ascending

      aWhile.countAscending(23 ,46);

       // even number 1 to 100

        aWhile.evenNumber();

        // odd number 1 to 100

        aWhile.oddNumber();

        // fibonacci

        aWhile.fibonacci();


        // sum 111/8899

        aWhile.getSum();

       // media numerelor divizibile cu 7

        System.out.println(aWhile.between(46,9));

       // CozaLozaWoza

        aWhile.coza();

    }
}
