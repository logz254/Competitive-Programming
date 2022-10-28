import java.util.Scanner;

public class DominoPilling{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int domino=2;
        int squares=(m*n)/domino;
        System.out.println(squares);
    }
    
    
}