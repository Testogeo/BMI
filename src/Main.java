import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double height = 1.87; // Рост в метрах
        double weight = 98;  // Вес в кг

        int bmi = (int) service.calculate(weight, height); // Приводим к целому типу

        System.out.println("BMI=" + bmi); // Печать результата в консоль
    }
}
