import java.util.*;
public class day4_2 {
    public static void main(String[] args) {
        // Inverted right angle trangle pattern printing
        System.out.println("Enter any number between 1 to 10: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
