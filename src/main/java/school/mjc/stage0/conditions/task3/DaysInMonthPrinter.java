package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month == 2){
            System.out.println("28");
        }else if (month > 0 && month <= 12 && month % 2 == 0){
            System.out.println("30");
        } else if (month > 0 && month <= 12 && month % 2 != 0) {
            System.out.println("31");
        }else {
            System.out.println("wrong number!");
        }

    }
}
