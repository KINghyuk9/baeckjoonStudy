package backjoon;

import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int before = N;

        while (true){

            N = ((N%10)*10) + (((N/10) + (N %10)) %10);
            count++;

            if(before == N){
                break;
            }
        }
        System.out.println(count);
    }
}
