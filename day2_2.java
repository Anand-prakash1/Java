import java.util.*;

public class day2_2 {
    public static void main(String[] args) {
        System.out.println("Enter any number to check whether is even or odd:- ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
