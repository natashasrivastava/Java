package Basics;

import java.time.LocalDate;
import java.time.Period;

public class Interface {
    public static void main(String[] args) {
        Indian Natasha = new Indian();
        System.out.println(Natasha.age(1995, 6, 1));
        System.out.println(Natasha.bmiCheck(1.53,89));
    }
}

interface Human {

    int age(int year, int month, int date);

}

interface Health {
    String bmiCheck(double height, int weight);
}

class Indian implements Human, Health {
    int dateOfBirth;
    int age;

    @Override
    public int age(int year, int month, int date) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, date);
        Period period = Period.between(birthday, today);
        return period.getYears();
    }

    @Override
    public String bmiCheck(double height, int weight) {
        double bmi = weight / (height * height);

        if (bmi < 18.5)
            return "Underweight";
        if (bmi >= 18.5 && bmi <= 24.9)
            return "Normal Weight";
        if (bmi >= 25 && bmi <= 29.9)
            return "Overweight";
        if (bmi >= 30 && bmi <= 34.9)
            return "Obese Class I";
        if (bmi >= 35 && bmi <= 39.9)
            return "Obese Class II";
        else
            return "Obese Class III";
    }
}

class American implements Human {


    @Override
    public int age(int year, int month, int date) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, date);
        Period period = Period.between(birthday, today);
        return period.getYears();
    }
}
