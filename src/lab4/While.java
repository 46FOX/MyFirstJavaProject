package lab4;

public class While {


// 1.

    public void printToOneHundred (int start) {
        while (start <= 100) {
            System.out.println(start);
            start++;
        }
    }


 // 2.

    public void countToMinus(int first) {
        if (first <= -100) {
            while (first <+ -100) {
                System.out.println(first);
                first++;

            }
        } else {
            while (first>=-100) {
                System.out.println(first);
                first--;
            }
        }
    }


 // 3.

    public void countXToY(int x ,int y) {
        if(x <= y) {
            while (x<=y) {
                System.out.println(x);
                x++ ;

            }
        } else {
            while (x>=y){
                System.out.println(x);
                x--;
            }
        }
    }


    // 4.

    public void countAscending(int x , int y) {
        if (x<=y) {
            while (x<=y) {
                System.out.println(x);
                x++ ;

            }
        } else {
            while(y<=x) {
                System.out.println(y);
                y++ ;
            }
        }
    }

   // 5.

    public void evenNumber() {
        int number = 1;
        while (number <= 100) {
            if ((number % 2) ==0) {
                System.out.println(number);
            }
        }   number++ ;
    }

    // 6.

    public void oddNumber () {
        int numbers = 1 ;
        while (numbers <= 100 ) {
            if ((numbers % 2 ) != 0) {
                System.out.println(numbers);
            }
        }   numbers++;

    }

    // fibonacci

    public void fibonacci() {
        int i = 1, n = 20 , t1 = 0 , t2 = 1 ;
        System.out.println("First" + n + "terms:");

        while (i <= n ) {
            System.out.println(t1 + " - ");

            int sum = t1 + t2 ;
            t1 = t2 ;
            t2 = sum ;

            i++;
        }
    }


    // 7.

    public void getSum() {
        int j = 111; double sum = 0; int count = 0;

        while (j>=111 && j <+8899) {
            sum += j ;
            j++;
            count++;

        }
        System.out.println(count);

        double media = sum/count ;
        System.out.println(media);
    }

    // 8.

    public double between (int f , int g ) {
        int j = f ; double sum = 0; int i=0;
        while (j>= f && j <= g) {
            if (j % 7 == 0) {
                sum += j;
                i++;

            } j++;
        } double d = sum/i;
        return d;
    }


    // 10.

    public void coza () {
        int number = 1;
        while (number <=100) {

            // number % 3 == 0 => Coza
            //      number % 5 == 0 => Loza
            //      number % 7 == 0 => Woza
            //      number % 3==0 && number % 5 == 0 => CozaLoza
            //      number % 3 == 0 && number % 7 == 0 => CozaWoza
            //      numer % 5 == 0 && number % 7 == 0 => WozaLoza
            //      number % 3 == 0 && number % 7 == 0 && number % 5 == 0 => CozaLozaWoza

            if (number % 3 == 0 && number % 7 == 0 && number % 5 == 0 ) {
                System.out.println("CozaLozaWoza" + "");

          //  } else if (number % 5 == && number % 7 == 0 ) {
                System.out.println("WozaLoza");
            //} else if (number % 3 == 0 & number % 7 = 0 ) ; {
                System.out.println("CozaWoza" + "");
           // } else if  (number 3 % == 0 && number % 5 == 0 ) {
                System.out.println("CozaLoza" + "");
           // } else if  ( number % 7 == 0) {
                System.out.println("Woza" + "");
          //  } else if (number % 5 == 0 ) {
                System.out.println("Loza" + "");
          //  } else if (number % 3 == 0 ) {
                System.out.println("Coza" + "");
          //  } else {
                System.out.println(number + "");
            }
          //  if (number % 11== 0) {
                System.out.println();
            }
          //  number ++;
        }
    }


