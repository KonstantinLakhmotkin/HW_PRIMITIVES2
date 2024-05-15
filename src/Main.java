public class Main {
    public static void main(String[] args) {

        int startBalance = 100;                         // начальный счёт
        int amount = 1412;                              // сумма пополнения


        int bonus = amount > 1000 ? amount / 100 : 0;   // бонус


        int balance = startBalance + amount + bonus;    // итоговая сумма

            System.out.println("Итоговый счет:" + balance + " руб."+ ", количество бонусов:" + bonus);


        }



    }
