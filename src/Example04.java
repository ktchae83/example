import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Example04 {
    private static final String YOUTUBE_ID = "admin"; //유튜브 계정 아이디
    private static final String YOUTUBE_PW = "0000"; //유튜브 계정 비밀번호

    public static void main(String[] args) {
        String inputID = "";
        String inputPW = "";
        String inputCaption = "";
        final String[] strNotAllowedWords = {"킹", "시발", "꺼저", "미친"}; //금칙어 리스트
        final String[] strChangedWords = {"열", "사랑", "행운", "희망"}; //순화어 리스트, 금칙어와 1:1 매핑이 안되는 케이스 처리필요
//        final HashMap<String, String> hmBeforeAfterWords = new HashMap<String,String>() {{
//            put("킹", "열");
//            put("시발", "사랑");
//            put("꺼저", "행운");
//            put("미친", "희망");
//        }};

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
            inputID = sc.nextLine();
            System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
            inputPW = sc.nextLine();

            if (YOUTUBE_ID.compareTo(inputID) != 0 || YOUTUBE_PW.compareTo(inputPW) != 0)
                System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
            else
                break;
        }

        System.out.printf("[안내] 안녕하세요 %s 님.\n", inputID);
        System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
        inputCaption = sc.nextLine();
        System.out.println("========================================");
        System.out.print("[");
        System.out.print(Arrays.toString(strNotAllowedWords)); //등록된 금칙어 리스트 출력
        System.out.println("]");
        System.out.println("========================================");

        System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
        for (int i = 0; i<strNotAllowedWords.length; i++) {
            inputCaption = inputCaption.replace(strNotAllowedWords[i], strChangedWords[i]); //금칙어를 순화어로 변경하기
        }
        System.out.printf(">>> %s\n", inputCaption);
        System.out.println("[안내] 프로그램을 종료합니다.");
    }
}
