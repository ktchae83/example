package example03;

import java.util.Scanner;

public class Example03_v1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int y = 0;
        int a = 2;
        int b = 1;

        System.out.print("[인공지능 프로그램 V1]\n" +
                "==============================\n" +
                "[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        input = scanner.nextInt();
        scanner.close();

        y = a * input + b;
        System.out.printf("[안내] 입력된 광고비는 %d 원 입니다.\n" +
                "[안내] AI의 예측(클릭 수)은  %d 회 입니다.", input, y);
    }
}
