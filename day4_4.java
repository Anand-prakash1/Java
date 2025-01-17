public class day4_4 {
    public static void main(String[] args) {
        int n = 5; 
        for(int i = 1; i <= n; i++){ 
            // Print spaces for right alignment
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // Print asterisks with spaces after each for the triangle shape
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}