package Example05;

import java.util.Scanner;

public class Example05 {
//    private static Unit myUnit, enemyUnit;

    public static void main(String [] args) {
        Unit myUnit, enemyUnit;

        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");

        /* 사용자 입력을 받을 변수 선언 */
        String inputName;
        int attackPower;
        int defencePower;
        int healthPoint;

        Scanner scan = new Scanner(System.in);
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        inputName = scan.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 (Ex 50) : ");
        attackPower = scan.nextInt();
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 (Ex 1) : ");
        defencePower = scan.nextInt();
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 (Ex 100) : ");
        healthPoint = scan.nextInt();

        //입력받은 data로 내 유닛 생성
        myUnit = new Unit(inputName, attackPower, defencePower, healthPoint);
        System.out.println("========================================");
        scan.nextLine(); //입력 버퍼 비우기

        System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.");
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        inputName = scan.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 (Ex 50) : ");
        attackPower = scan.nextInt();
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 (Ex 1) : ");
        defencePower = scan.nextInt();
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 (Ex 100) : ");
        healthPoint = scan.nextInt();

        scan.close(); //scanner close

        //입력받은 data로 상대 유닛 생성
        enemyUnit = new Unit(inputName, attackPower, defencePower, healthPoint);
        System.out.println("========================================");

//        myUnit.attack(enemyUnit);   //내유닛으로 상대유닛 공격 1st
//        myUnit.attack(enemyUnit);   //내유닛으로 상대유닛 공격 2nd
        while(enemyUnit.getHealthPoint() > 0) { //한놈만 제거될때까지 공격
            myUnit.attack(enemyUnit);
        }
    }
}
