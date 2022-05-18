package Example06_v2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk_Program {
    String name = "키오스크";
    private ArrayList<Menu> menus = new ArrayList<>();
    Scanner scan;

    Kiosk_Program(String name) {
        this.name = name;
        create_menu();
    }

    private void create_menu() {
        menus.add(new Menu(1, "김밥", 1000));
        menus.add(new Menu(2, "계란 김밥", 1500));
        menus.add(new Menu(3, "충무 김밥", 1000));
        menus.add(new Menu(4, "떡볶이", 2000));
    }
    public void start() {
        input_print();

        scan = new Scanner(System.in);
        int num = select_menu();
        int count = count();
        scan.close();
        int sum = cost(num, count);
        output_print(sum);
    }

    public void input_print() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");
    }

    public int select_menu() {
        int menuNum = 0;
        System.out.println("------------------------------");
        while(true) {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            for (Menu m : menus) {
                System.out.printf("%d) %s(%d원)\t", m.getNum(), m.getName(), m.getPrice());
            }
            System.out.println("");

            menuNum = scan.nextInt();
            if (menuNum < 1 || menuNum > menus.size())
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.\n");
            else break;
        }
        return menuNum;
    }
    public int count() {
        int count = 0;
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
        return count;
    }

    public int cost(int number, int count) {
        int sum = menus.get(number-1).getPrice() * count;
        return sum;
    }

    public void output_print(int sum) {
        System.out.printf("[안내]주문하신 메뉴의 총 금액은 %,d원 입니다.\n" +
                "[안내]이용해 주셔서 감사합니다.", sum);
    }
}
