public class Main {
    public static void main(String[] args) {

        int balance=100;
        int bonus_point=0;
        int pay = 65231;

        if (pay >= 1100)
        {
            bonus_point = (pay/100);
            balance = balance + pay + bonus_point;
        }
        else if (pay<1100)
        {
            balance = balance + pay;
        }

        System.out.println(balance);
        System.out.println(bonus_point);
    }
}