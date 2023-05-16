package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double clear = 0;
        if (salary > 0 && salary <= 10000){
            clear = salary - (salary / 100) * 15;
            System.out.println(clear);
        }else if (salary > 10000 && salary <= 20000){
            clear = salary - (salary / 100) * 18;
            System.out.println(clear);
        }else if (salary > 20000){
            clear = salary - (salary / 100) * 20;
            System.out.println(clear);
        } else{
            System.out.println("wrong input!");
        }
    }
}
