package backjoon;

import java.util.Scanner;

public class B4299 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if((A+B)%2 != 0 || A<B){
            System.out.println(-1);
        }else {
            System.out.println((((A+B)/2) + " " + (((A+B)/2) - B)));
        }
    }
}
