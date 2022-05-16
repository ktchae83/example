package Example06;

import java.util.Scanner;

public class Example06 {
    private static Menu [] menus = {
            new Menu("dummy", 0),
            new Menu("김밥", 1000),
            new Menu("계란 김밥", 1500),
            new Menu("충무 김밥", 1000),
            new Menu("떡볶이", 2000)
    };

    public static void main(String [] args) {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");

        int menuNum = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------");
        while(true) {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            for (int i=1; i<menus.length; i++) {
                System.out.printf("%d) %s(%d원)\t", i, menus[i].getName(), menus[i].getPrice());
            }
            System.out.println("");

            menuNum = scan.nextInt();
            if (menuNum < 1 || menuNum >= menus.length)
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.\n");
            else break;
        }

        while(true) {
            System.out.println("------------------------------");
            System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.\n" +
                    "(※ 최대 주문 가능 수량 : 99)");
            count = scan.nextInt();
            if (count < 1 || count > 99) {
                System.out.printf("[경고] %d개는 입력하실 수 없습니다.\n" +
                        "[경고]수량 선택 화면으로 돌아갑니다.\n", count);
            } else break;
        }

        System.out.printf("[안내]주문하신 메뉴의 총 금액은 %,d원 입니다.\n" +
                "[안내]이용해 주셔서 감사합니다.", menus[menuNum].getPrice() * count);

        scan.close();
    }
}
