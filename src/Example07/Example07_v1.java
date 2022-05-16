package Example07;

import java.util.Scanner;

public class Example07_v1 {
    public static void main(String [] args) {
        int inputCnt;
        Scanner scan = new Scanner(System.in);
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        inputCnt = scan.nextInt();

        int [] result = new int[inputCnt+1];
        if (inputCnt > 0) result[1] = 1;
        if (inputCnt > 1) result[2] = 1;
        for (int i=3; i<=inputCnt; i++) {
            result[i] = result[i-2] + result[i-1];
        }
        System.out.println("[피보나치 수열 출력]");
        for (int i=1; i<=inputCnt; i++) {
            System.out.println(result[i]);
        }

        scan.close();
    }
}
