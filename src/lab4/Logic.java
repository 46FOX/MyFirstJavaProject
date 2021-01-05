package lab4;


public class Logic {

    public void printToHundred(int startValue) {
        for (int i = startValue; i <= 100; i++) {
            System.out.println(i);
        }
    }


// count to 100

    public void countToOneHundred (int startValue) {
        if (startValue < 100) {
            for(int i = startValue; i<= 100; i++) {
                System.out.println(i);
            }
        } else{
            for (int i = startValue; i >= 100; i--) {
                System.out.println(i);
            }
        }

    }

// count to -100


    public void countToMinus(double q) {
        if (q <= 100) {
            for (double i = q; i >= -100; i--){
                System.out.println(i);

            }
        }
    }
// 3.
   public void countBetween (int x , int y) {
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= y ; i--) {
                System.out.println(i);
            }
        }

    }
// 4.

   public void ascendingCount (int a , int b ) {
        if (a<=b) {
            for (int i = a; i <= b; i++){
                System.out.println(i);
            }
        } else {
            for (int i= b; i <= a ; i++){
                System.out.println(i);
            }
        }
   }

// 5.

   public void allNumbers () {
        int number = 100;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
   }


// 6.

    public void oddNumbers() {
        int number = 100;
        for (int i = 1; i<= number ; i ++){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }



// 7.

   public int getSum(int first) {
        int sum = 0;
        for(int i = first; i <= 100 ; i++) {
            sum = i + sum;

        }
        return sum ;
   }


// 8.
    public double getMedia(double first) {
        double rez = 0;
        int j = 0;

        for (double i = first; i <= 100; i++) {
            rez += i;
            j++;
        }
        System.out.println(j);
        System.out.println(rez);
        double c = rez / j;
        return c;

        }

 // 9.
    public void asterix () {

        for (int i = 6 ; i >= 0; i--) {
            System.out.println("");
            for (int j = i ; j >= 0 ; j--) {
                System.out.print("*");
            }
        }
    }


    }


