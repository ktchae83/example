package Example07;

import java.util.Scanner;

public class Example07_v4 {
    static int inputCnt;

    public static int getUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        int ret = scan.nextInt();
        scan.close();

        return ret;
    }

    public static void getFibonacci(int [] fibo) {
        //1, 2번째 초기 값 입력
        if (inputCnt > 0) fibo[1] = 1;
        if (inputCnt > 1) fibo[2] = 1;
        for (int i=3; i<=inputCnt; i++) {   // 이후의 값을 아래 점화식으로 채워넣기
            fibo[i] = fibo[i-2] + fibo[i-1];
        }
    }

    public static void printNumbers(int [] fibo) {
        System.out.println("[피보나치 수열 출력]");
        for (int i=1; i<=inputCnt; i++) {   // 수열을 형식에 맞게 출력
            System.out.println(fibo[i]);
        }
    }

    public static void main(String [] args) {
        inputCnt = getUserInput();
        int [] result = new int[inputCnt+1]; //피보나치 수열의 값들을 계산해서 넣을 배열

        //수열 구하기
        getFibonacci(result);
        
        //결과 출력
        printNumbers(result);
    }
}
