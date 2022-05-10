public class Example01 {
    static double[] unit = {60.7, 125.9, 187.9, 280.6, 417.7, 670.6};
    static double calculate(int amount) {
        double ret = 0;
        int level = amount / 100; //총 사용량이 몇백 KWh 대 인지 확인

        ret = (amount % 100) * unit[level]; //해당 KHw 대의 요금으로 100 미만의 요금 계산
        for (int i=level-1; i>=0; i--) {    //요금구간 별로 반복
            ret += (unit[i] * 100);         //해당 요금 구간 단가 * 100으로 요금에 누적
        }
        return ret;
    }

    public static void main(String args[]) {
        System.out.println("====================");
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("====================");

        int [] inputs = {99, 150, 250, 301, 450, 510};

        for (int i=0; i<inputs.length; i++) {
            System.out.println(inputs[i] + "KWh의 전기 요금은 " + calculate(inputs[i]) + "원 입니다.");
        }
    }
}
