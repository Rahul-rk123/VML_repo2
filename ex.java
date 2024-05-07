package VML_repo2;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        int s = sd.nextInt();
        int k = sd.nextInt();
        System.out.println("Multiplication is"+mul(s,k));
        System.out.println("Divide is"+divide(s, k));
        sd.close();
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
}
