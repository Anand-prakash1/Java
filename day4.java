import java.util.*;
public class day4 {
    public static void main(String[] args) {
        // simple right angle trangle pattern printing
        Scanner sc = new Scanner(System.in);
        int rows = 1;
        for(int i = rows; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
