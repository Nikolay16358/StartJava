package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Перевод псевдокода на язык Java");
        int age = 25;
        if (age > 20) {
            System.out.println("Человек взрослый");
        } else {
            System.out.println("Человек еще юный или ребенок");
        }

        boolean isMale = true;
        if (!isMale) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        float height = 1.92f;
        if (height < 1.80) {
            System.out.println("Этому парню придется тяжело в баскетболе");
        } else {
            System.out.println("У этого парня хорошие данные для баскетбола");
        }

        char firstLetterOfName = "Nick".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Его имя начинается на букву M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Его имя начинается на букву I");
        } else {
            System.out.println("Его имя начинается не на букву M или I");
        }

        System.out.println("\nЗадача 2. Поиск max и min числа");
        int num1 = 5;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println("Максимальное число равно " + num1 +
                    ". Минимальное число равно " + num2 + ".");
        } else if (num1 < num2) {
            System.out.println("Максимальное число равно " + num2 +
                    ". Минимальное число равно " + num1 + ".");
        } else {
            System.out.println("Числа равны между собой. Их значения равны " + num1 + ".");
        }

        System.out.println("\nЗадача 3. Проверка числа");
        int srcNum = 11;
        System.out.print("Исходное число равно " + srcNum + ".");
        if (srcNum != 0) {
            if (srcNum % 2 == 0) {
                System.out.print(" Это число четное и ");
            } else {
                System.out.print(" Это число нечетное и ");
            }

            if (srcNum > 0) {
                System.out.println("положительное.");
            } else {
                System.out.println("отрицательное.");
            }
        } else {
            System.out.print("\n");
        }

        System.out.println("\nЗадача 4. Поиск одинаковых цифр в числах");
        int srcNum1 = 124;
        int srcNum2 = 123;
        int hundreds1 = srcNum1 / 100;
        int hundreds2 = srcNum2 / 100;
        int tens1 = srcNum1 / 10 % 10;
        int tens2 = srcNum2 / 10 % 10;
        int ones1 = srcNum1 % 10;
        int ones2 = srcNum2 % 10;
        System.out.println("Исходные числа: " + srcNum1 + " и " + srcNum2 + ".");
        if (ones1 == ones2) {
            System.out.println("У них одинаковые значения в 1 разряде единиц, которые равны " + 
                    ones1 + ".");
        }

        if (tens1 == tens2) {
            System.out.println("У них одинаковые значения во 2 разряде десятков, которые равны " + 
                    tens1 + ".");
        }

        if (hundreds1 == hundreds2) {
            System.out.println("У них одинаковые значения в 3 разряде сотен, которые равны " + 
                    hundreds1 + ".");
        }

        if (ones1 != ones2 && tens1 != tens2 && hundreds1 != hundreds2) {
            System.out.println("У них значения в разрядах единиц, десятков и сотен различные.");
        }

        System.out.println("\nЗадача 5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.print("Исходный символ: " + symbol + ".");
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(" Это маленькая буква.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(" Это большая буква.");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(" Это число.");
        } else {
            System.out.println(" Это не буква и не число.");
        }

        System.out.println("\nЗадача 6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        float bankRate = 0.07f;
        if (deposit < 100_000) {
            bankRate = 0.05f;
        } else if (deposit > 300_000) {
            bankRate = 0.10f;
        }

        System.out.println("Сумма вклада равна " + deposit + " рублей. " +
                "Начисленный банком процент равен " + deposit * bankRate + " рублей. " +
                "Итоговая сумма вклада с учетом процентов равна " + (deposit + deposit * bankRate) + 
                " рублей.");

        System.out.println("\nЗадача 7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyMark = 2;
        int programmingMark = 2;
        if (historyPercent > 91) {
            historyMark = 5;
        } else if (historyPercent > 73) {
            historyMark = 4;
        } else if (historyPercent > 60) {
            historyMark = 3;
        }

        if (programmingPercent > 91) {
            programmingMark = 5;
        } else if (programmingPercent > 73) {
            programmingMark = 4;
        } else if (programmingPercent > 60) {
            programmingMark = 3;
        }

        float avgMark = (float) (historyMark + programmingMark) / 2;
        float avgPercent = (float) (historyPercent + programmingPercent) / 2;
        System.out.println(historyMark + " по Истории");
        System.out.println(programmingMark + " по Программированию");
        System.out.println("Средний балл оценок по предметам равен " + avgMark);
        System.out.println("Средний % по предметам равен " + avgPercent);

        System.out.println("\nЗадача 8. Расчет прибыли за год");
        int rent = 5_000;
        int sales = 13_000;
        int netCost = 9_000;
        int monthsCount = 12;
        int totalIncome = (sales - netCost - rent) * monthsCount;
        if (totalIncome > 0) {
            System.out.println("Прибыль за год: +" + totalIncome + " рублей.");
        } else {
            System.out.println("Прибыль за год: " + totalIncome + " рублей.");
        }

        System.out.println("\nЗадача 9. Подсчет количества банкнот");
        int sum = 567;
        int sumToCheck = sum;
        int totalSum;
        int banknotesInAtm100 = 10;
        int banknotesInAtm10 = 5;
        int banknotesInAtm1 = 50;
        int requiredBanknotes100 = sum / 100;
        int requiredBanknotes10;
        int requiredBanknotes1;
        int banknotesResult100 = banknotesInAtm100;
        int banknotesResult10 = banknotesInAtm10;
        int banknotesResult1 = banknotesInAtm1;
        if (requiredBanknotes100 <= banknotesInAtm100) {
            banknotesResult100 = requiredBanknotes100;
        }

        sum -= banknotesResult100 * 100;
        requiredBanknotes10 = sum / 10;
        if (requiredBanknotes10 <= banknotesInAtm10) {
            banknotesResult10 = requiredBanknotes10;
        }

        sum -= banknotesResult10 * 10;
        requiredBanknotes1 = sum;
        if (requiredBanknotes1 <= banknotesInAtm1) {
            banknotesResult1 = requiredBanknotes1;
        }

        sum -= banknotesResult1;
        if (sum != 0) {
            System.out.println("В банкомате не хватает купюр для выдачи средств.");
        } else {
            totalSum = banknotesResult100 * 100 + banknotesResult10 * 10 + banknotesResult1;
            if (sumToCheck == totalSum) {
                System.out.println("В банкомате достаточно купюр для выдачи средств.");
                System.out.println("Выдано: купюр 100$ - " + banknotesResult100 + " штук, " +
                        "купюр 10$ - " + banknotesResult10 + " штук, купюр 1$ - " + banknotesResult1 + 
                        " штук.");
                System.out.println("Выдано: " + totalSum + "$.");
            }
        }
    }
}