package VML_repo2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the String:: rahul");
        System.out.println("Enter the String:: heloooooo");
        String str = sd.next();
        System.out.println(fir(str));
        sd.close();
    }
    public static String fir(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        return s;
    }
}
