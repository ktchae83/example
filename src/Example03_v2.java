import java.util.Scanner;

public class Example03_v2 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double input[] = {580.0, 700.0, 810.0, 840.0};
        double y = 0;
        int a = 2;
        int b = 1;

        System.out.print("[인공지능 프로그램 V2]\n" +
                "==============================\n" +
                "[System] a 값을 입력하여 주세요 : ");
        a = scanner.nextInt();
        System.out.print("[System] b 값을 입력하여 주세요 : ");
        b = scanner.nextInt();
        scanner.close();
        System.out.println("==============================");

        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다.");
        for (int i=0; i<input.length; i++) {
            System.out.printf("%d 번째) %.1f원\t", i+1, input[i]);
        }
        System.out.println();

        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");

        for (int i=0; i<input.length; i++) {
            y = a * input[i] + b;
            System.out.printf("%d 번째 예측) %.1f회 방문\n", i, y);
        }
    }
}
