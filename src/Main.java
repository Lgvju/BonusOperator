public class Main {
    public static void main(String[] args) {
        int startingScore = 100;//сумма начального счета
        int summa = 1100;//сумма пополнения
        //int summa = 300;//или выбрать эту сумму пополнения
        int addition = 100;
        int bonus = 1000;

        if (summa > bonus) {
            int finalScore= summa / addition + summa + startingScore;
            System.out.println("Сумма бонусов = " +  (summa / addition));
            System.out.println("Итоговый счет = " + finalScore + " рублей");
        } else {
            int finalScore = summa + startingScore;
            System.out.println("Сумма бонусов = " + 0);
            System.out.println("Итоговый счет = " + finalScore + "рублей");

        }
    }
}