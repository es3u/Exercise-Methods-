import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//1 - Write a Java method to find the smallest number among three numbers.
//Test Data:
//Input the first number: 25 Input the Second number: 37 Input the third number: 29 Expected Output:
//The smallest value is 25.0
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number ");
        double x = in.nextDouble();
        System.out.println("Enter second number ");
        double y = in.nextDouble();
        System.out.println("Enter third number ");
        double z = in.nextDouble();

        System.out.println("he smallest value is: " + small(x , y , z ));
        ///////////////////////////end Q1

        //2 - Write a Java method that check if the entered number is negative or positive or zero.
        System.out.println(" Enter your number ");
        int num = in.nextInt();
        check(num);
        ///////////////////////////end Q2

        //3 - Write a Java method to check whether a string is a valid password. Password rules:
        //A password must have at least ten characters. A
        //password consists of only letters and digits. A
        //password must contain at least two digits.
            int i ;
        String s ="";

            System.out.println("1. A password must have at least eight characters. \n2. A password consists of only letters and digits.\n" +
                    "3. A password must contain at least two digits \nInput a password (You are agreeing to the above Terms and " +
                    "Conditions.)");

            s = in.nextLine();

            checkPass(s);

        System.out.println("  THE END  ");














    }

    public static double small(double x ,double y , double z){ ///////Q-1

        if(x < y && x < z)
            return x ;
        else if(y < x && y < z )
            return y;
        else
            return z;
    }

    public static void check(int x){ /////////Q-2
        if(x>0)
            System.out.println("is positive ");
        else if (x<0)
            System.out.println("is negative ");
        else
            System.out.println("is zero ");
    }

   public static void checkPass(String s){////////Q3
    int count= 0 ;
        for(char a : s.toCharArray()){
            if(Character.isDigit(a))
                count++;
        }


        if(s.length() >= 10) {
            if(count > 1)
                System.out.println("Password is valid:" + s);

        } else System.out.println("Password is  not valid:" + s);




   }


}
