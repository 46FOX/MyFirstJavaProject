package Lab5;

import java.util.stream.IntStream;

public class lab5 {
    public static void main(String[] args) {
        Logic5 logic = new Logic5();

        //int[] myArray = logic.setConsecutiveValuesToArray(1,100);

        // logic.printArray(myArray);
        System.out.println(logic.checkSum(12, 23));
        System.out.println(logic.checkSum(1, 2, 3));
        System.out.println(logic.checkSum(5, 6, 7, 8));


        //        3.


        int[] array = new int[101];
        //  array = logic.valoriPare(array);

        // logic.printArray(array);


        //        4.media
        logic.populateArrayWithValues(array, 5);

        System.out.println(logic.media(array));

        // 5.

        String[] clasa = {"Ovi", "Mihai", "Cristi"};
        System.out.println(logic.checkString(clasa, "Alex"));

        //       6
        int[] numere = IntStream.range(3, 7).toArray();

        //       logic.checkNumber(numere, 2);


        String[] myArray = logic.setArrayMinus(7);
        logic.printMinus(myArray);
        logic.printMinus2(myArray, 6);

        int[] thirdArray = {1, 6, 12, 24, 7, 2};
        int[] emptyArray = new int[thirdArray.length];

//        8.
        int Value = 24;
        logic.arrayWithoutValue(thirdArray, Value);


 //       9.
        logic.secondminArray(thirdArray);

        //10.
               logic.copyArray(thirdArray,emptyArray);

    }

}
