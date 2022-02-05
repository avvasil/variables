package pro.sky;

public class Main {

    public static void main(String[] args) {

        //task 1

        byte numberByte = -127;
        short numberShort = 32767;
        int numberInt = 123_456_789_0;
        long numberLong = 1_234_567_890_123_456_789L;

        float numberFloat = -3.14E+38f;
        double numberDouble = 1.4142E-39;

        char characterAscii = 77;
        char characterChar = '?';

        boolean isItTrue = false;

        //task 2

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float commonBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        float differenceBoxersWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println();
        System.out.println("Задача 2.");
        System.out.println("Общий вес двух боксёров " + commonBoxersWeight + " кг.");
        System.out.println("Разница в весе двух боксёров " + Math.abs(differenceBoxersWeight) + " кг.");
        System.out.println();

        //task 3

        int bananaWeight = 80;
        int bananasQuantity = 5;
        float milkWeight = 1.05f;
        int milkVolume = 200;
        int iceCreamWeight = 100;
        int iceCreamQuantity = 2;
        int rawWggsWeight = 70;
        int rawEggsQuantity = 4;
        float sportBreakfastWeight = bananasQuantity * bananaWeight + milkVolume * milkWeight + iceCreamQuantity * iceCreamWeight + rawEggsQuantity * rawWggsWeight;
        System.out.println("Задача 3.");
        System.out.println("Вес спортивного завтрака " + sportBreakfastWeight / 1000 + " кг.");
        System.out.println();

        //task 4

        int weightToLose = 7;
        int firstDietLoss = 250;
        int secondDietLoss = 500;
        int daysOnFirstDiet = 7000 / firstDietLoss;
        int daysOnSecondDiet = 7000 / secondDietLoss;
        System.out.println("Задача 4.");
        System.out.println("На первой диете потребуется в среднем " + daysOnFirstDiet + " дней.");
        System.out.println("На второй диете потребуется в среднем " + daysOnSecondDiet + " дней.");
        System.out.println();

        //task 5

        int currentMashaSalary = 67_760;
        int currentDenisSalary = 83_690;
        int currentCristinaSalary = 76_230;
        int salaryRaising = 10;
        int raisedMashaSalary = currentMashaSalary * (100 + salaryRaising) / 100;
        int raisedDenisSalary = currentDenisSalary * (100 + salaryRaising) / 100;
        int raisedCristinaSalary = currentCristinaSalary * (100 + salaryRaising) / 100;
        int newMashaYearIncome = (raisedMashaSalary - currentMashaSalary) * 12;
        int newDenisYearIncome = (raisedDenisSalary - currentDenisSalary) * 12;
        int newCristinaYearIncome = (raisedCristinaSalary - currentCristinaSalary) * 12;
        System.out.println("Задача 5.");
        System.out.println("Маша теперь получает " + raisedMashaSalary + " рублей. Годовой доход вырос на " + newMashaYearIncome + " рублей.");
        System.out.println("Денис теперь получает " + raisedDenisSalary + " рублей. Годовой доход вырос на " + newDenisYearIncome + " рублей.");
        System.out.println("Кристина теперь получает " + raisedCristinaSalary + " рублей. Годовой доход вырос на " + newCristinaYearIncome + " рублей.");

    }
}
