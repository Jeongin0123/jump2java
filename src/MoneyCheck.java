import java.util.ArrayList;

public class MoneyCheck {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("2000");
        pocket.add("card");

        int money = getMoney(pocket);

        if (pocket.contains("card")) {
            System.out.println("택시");
        } else if (money >= 3000) {
            System.out.println("택시");
        } else {
            System.out.println("걸어간다");
        }
    }
    private static int getMoney(ArrayList<String> pocket) {
        int maxMoney = 0;
        for (String s : pocket) {
            try {
                int val = Integer.parseInt(s); // 숫자로 바꾸기
                if (val > maxMoney) maxMoney = val;
            } catch (NumberFormatException ignore) {
                // "card" 같은 숫자 아님 → 무시
            }
        }
        return maxMoney;
    }
}