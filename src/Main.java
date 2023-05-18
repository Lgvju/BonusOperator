public class Main {
    public static void main(String[] args) {
        int sachet = 100;//сумма начального счета
        //int summa = 1100;//сумма пополнения
        int summa = 300;//или выбрать эту сумму пополнения
        int bonusCuff = 100;
        int bonus = 1000;

        if (summa > bonus) {
            int TotalSumma = summa / bonusCuff + summa + sachet;
            System.out.println("Сумма бонусов = " +  (summa / bonusCuff));
            System.out.println("Общая сумма = " + TotalSumma + "рублей");
        } else {
            int TotalSumma = summa + sachet;
            System.out.println("Сумма бонусов = " + 0);
            System.out.println("Общая сумма = " + TotalSumma + "рублей");

        }
    }
}