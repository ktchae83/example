package Example05;

import java.util.Scanner;

public class Example05 {
//    private static Unit myUnit, enemyUnit;

    public static Unit createUnit(Scanner scan) {
        //사용자 입력을 받아 유닛을 생성한다.
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        String inputName = scan.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 (Ex 50) : ");
        int attackPower = scan.nextInt();
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 (Ex 1) : ");
        int defencePower = scan.nextInt();
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 (Ex 100) : ");
        int healthPoint = scan.nextInt();

        return new Unit(inputName, attackPower, defencePower, healthPoint);
    }
    public static void main(String [] args) {
        Unit myUnit, enemyUnit;
        Scanner scan = new Scanner(System.in);

        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");

        myUnit = createUnit(scan); //내 유닛 생성
        System.out.println("========================================");
        scan.nextLine(); //입력 버퍼 비우기

        System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.");
        enemyUnit = createUnit(scan); //상대 유닛 생성
        scan.close(); //scanner close

        System.out.println("========================================");

        while(enemyUnit.getHealthPoint() > 0) { //한놈만 제거될때까지 공격
            myUnit.attack(enemyUnit);
        }
    }
}
