package com.company;

public class Main {

    public static void main(String[] args) {
        /* -------------Main-Calculator--------- */

        Calculator math = new Calculator(2, 4);
        System.out.println(math.getX());
        System.out.println(math.getY());
        System.out.println(math.getSum());
        System.out.println(math.getSubtraction());
        System.out.println(math.getMultiplication());
        System.out.println(math.getDivision());

        /* -------------Main-Bmi-void method--------- */
        bmi_1();

        /* -------------Main-Bmi-double method--------- */
        System.out.println("Your BMI2 is " + bmi_2());

        /* -------------Main-Bmi-parameter method--------- */
        System.out.println("Your BMI3 is " + bmi_3(1.74, 74));
    }


    public static void bmi_1() {
        double height = 1.74;
        double weight = 74;
        double bmi1 = Math.round(weight / (height * height) * 100d) / 100d;
        System.out.println("Your BMI1 is " + bmi1);
    }

    public static double bmi_2() {
        double height = 1.56;
        double weight = 66;
        double bmi2 = Math.round(weight / (height * height) * 100d) / 100d;
        return bmi2;
    }

    public static double bmi_3(double height, double weight) {
        if (weight > 0 && height > 0) {
            double bmi3 = Math.round(weight / (height * height) * 100d) / 100d;
            return bmi3;
        } return -1;

    }
}
