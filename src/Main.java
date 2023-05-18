public class Main {
    public static void main(String[] args) {
        int sachet = 100;//сумма начального счета
        //int summa = 1100;//сумма пополнения
        int summa = 300;//или выбрать эту сумму пополнения
        int boncuff = 100;
        int bonus = 1000;

        if (summa > bonus) {
            int totsumma = summa / boncuff + summa + sachet;
            System.out.println("Сумма бонусов = " +  (summa / boncuff));
            System.out.println("Общая сумма = " + totsumma + "рублей");
        } else {
            int totsumma = summa + sachet;
            System.out.println("Сумма бонусов = " + 0);
            System.out.println("Общая сумма = " + totsumma + "рублей");

        }
    }
}