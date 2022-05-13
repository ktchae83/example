package example03;

import java.util.Scanner;

public class Example03_v3 {
    public static void main(String [] args) {
 //       Scanner scanner = new Scanner(System.in); // 쓰지 않는 코드 주석처리
        double input[] = {580.0, 700.0, 810.0, 840.0}; // 광고비
        double real[] = {374.0, 385.0, 375.0, 401.0}; // 실제 방문자수
        double y[] = new double[input.length]; // 예측 방문자수
        double diff[] = new double[input.length];
        double diffSum = 0;
        int a = 2;
        int b = 1;

        System.out.print("[인공지능 프로그램 V3]\n" +
                "==============================\n");
//        System.out.print("[System] a 값을 입력하여 주세요 : ");
//        a = scanner.nextInt();
//        System.out.print("[System] b 값을 입력하여 주세요 : ");
//        b = scanner.nextInt();
//        scanner.close();
//        System.out.println("==============================");

        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");
        for (int i=0; i<input.length; i++) {
            y[i] = a * input[i] + b;
        }

        for (int i=0; i<input.length; i++) {
            System.out.printf("%d 번째 데이터) [실제값]웹 페이지 방문자 수 : %.1f  [인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n",
                    i+1, real[i], y[i]);
            diff[i] = real[i] - y[i]; //  출력값과 동일하게 하기 위해 큰 값을 빼주는걸로 수정.
            diffSum += Math.pow(diff[i], 2);
        }

        System.out.println();

        for (int i=0; i<input.length; i++) {
            System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n", i+1, diff[i]);
            System.out.printf("[안내] 오차의 제곱 : %.1f\n", Math.pow(diff[i], 2));
            System.out.println();
        }
        System.out.println("==============================");
        System.out.printf("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : %.1f\n", diffSum);

    }
}
