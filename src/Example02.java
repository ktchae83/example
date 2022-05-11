import java.util.Scanner;

public class Example02 {
    public static final int MIN_NUM = 2;
    public static final int MAX_NUM = 9;

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");
        int num = scan.nextInt(); //숫자 입력, 문자입력일 경우 예외처리?
        scan.close(); //scanner close
        System.out.printf("%d단 이 입력되었습니다.\n", num);

        if (num < MIN_NUM || num > MAX_NUM) { //구구단 기능제한 (2단~9단)
            System.out.printf("[경고]구구단은 %d단 ~ %d단 까지만 선택할 수 있습니다.\n" +
                    "프로그램을 종료합니다.", MIN_NUM, MAX_NUM);
            System.exit(0); //재입력 받지 않고 프로그램 종료
        }

        for (int i = 1; i < 10; i++) { //입력한 숫자의 구구단 출력
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}
