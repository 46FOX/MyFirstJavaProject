package lab2;

public class Lab2 {
    public static void main(String[] args) {
        int result = sum (5,6);
        System.out.println(result);

        double rest = divide(10,11);
        System.out.println(rest);

        int mult = multiplication(2,3);
        System.out.println(mult);

        int min = minus (12,14);
        System.out.println(min);

        printMyName();


        int m = media(1,2,3);
        System.out.println(m);

        double six = rest1(10,8);
        System.out.println(six);

        System.out.println(java);
        System.out.println(robot);



    }
    static int sum (int firstNumber,int secondNumber ) {
        return (firstNumber + secondNumber); }

    static double divide (double number3 , double number4) {
        return (number3 / number4);
    }
    static int multiplication (int a , int b ){
        return (a*b);
    }

    static int minus (int w, int z){
        return (w-z);
    }
    static void printMyName(){
        System.out.println(" Hello \n Paul ");
    }

    static int media (int a , int b , int c){
        return ((a+b+c)/3);
    }

    static double rest1(double m, double n){
        return m%n;
    }

    static String java = "   J    a   v     v  a\n   J   a a   v   v  a a\nJ  J  aaaaa   V V  aaaaa\n JJ  a     a   V  a     a";


    static String robot = "  +\"\"\"\"\"+ \n [| o o |]\n  |  ^  |\n  | '_' |\n  +_____+";
    }
