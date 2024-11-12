import java.util.*;

public class day2{
    public static void main(String[] args) {
        // conditional statement
        System.out.println("Enter your age:- ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age <= 5) {
            System.out.println("You are a child");
        }
        else if(age > 5){
            System.out.println("you are in school");
        }
        else if(age >= 18){
            System.out.println("you are a adult");
        }
        else{
            System.out.println("Invalid");
        }
    }
}