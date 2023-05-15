package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        }
        else if (month == 6 || month ==7 || month == 8) {
            System.out.println("Summer");
        }
        else if (month == 11 || month == 12 || month == 1) {
            System.out.println("Winter");
        }
        else {
            System.out.println("wrong number!");
        }


    }
}
