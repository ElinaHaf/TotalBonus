public class Main {
    public static void main(String[] args) {

        int payment = 1877; // сумма пополнения
        int initial = 7; // начальный счет
        int totalBonus = payment / 100;

        if (payment > 1000) {
            System.out.println(" Вам зачислено " + (payment / 100) + " бонусных рублей(я) ");
        } else {
            System.out.println(" Бонусов нет ");
        }

        if (payment > 1000) {
            System.out.println(" Итоговая сумма на счету " + (initial + payment + totalBonus) + " рублей(я) ");
        } else {
            System.out.println(" Итоговая сумма на счету " + (initial + payment) + " рублей(я) ");
        }


    }
}