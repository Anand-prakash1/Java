import java.util.*
;
public class day3_6 {
    public static void main(String[] args) {
        System.out.println("Enter any number and get their table: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(a * i);
        }
    }
}
