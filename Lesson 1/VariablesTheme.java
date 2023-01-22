public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Вывод значений переменных на консоль");
        byte coresCount = 4;
        short ram = 8;
        int bitDepth = 64;
        long memory = 237;
        float baseFrequency = 2.40f;
        double maxFrequency = 4.10;
        boolean isMac = false;
        char processorCipher = 'H';
        System.out.println("Количество ядер процессора равно " + coresCount);
        System.out.println("Оперативная память компьютера составляет " + ram + "ГБ");
        System.out.println("Операционная система является " + bitDepth + "-разрядной");
        System.out.println("Объём памяти на диске C составляет " + memory + "ГБ");
        System.out.println("Базовая тактовая частота процессора составляет " + baseFrequency + "ГГц");
        System.out.println("Максимальная тактовая частота процессора в режиме Turbo составляет " +
                maxFrequency + "ГГц");
        System.out.println("Проверка производства компьютера от Apple: " + isMac);
        System.out.println("Процессор Intel® Core™ i5-9300" + processorCipher);

        System.out.println("\nЗадача 2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        double discountPercent = 0.11;
        int costGoods = penCost + bookCost;
        double discountSum = costGoods * discountPercent;
        double discountCost = costGoods - discountSum;
        System.out.println("Сумма скидки составляет " + discountSum + " руб.");
        System.out.println("Общая стоимость товаров со скидкой составляет " + discountCost + " руб.");

        System.out.println("\nЗадача 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a      \n   J   a a  v   v  a a     \nJ  J  aaaaa" +
                "  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.print("byte: " + maxByte + ", ");
        System.out.println(++maxByte + ", " + --maxByte + ".");
        System.out.print("short: " + maxShort + ", ");
        System.out.println(++maxShort + ", " + --maxShort + ".");
        System.out.print("int: " + maxInt + ", ");
        System.out.println(++maxInt + ", " + --maxInt + ".");
        System.out.print("long: " + maxLong + ", ");
        System.out.println(++maxLong + ", " + --maxLong + ".");


        System.out.println("\nЗадача 5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Метод третьей переменной: исходные значения переменных равны " + num2 +
                ", " + num1 + ". Новые значения переменных равны " + num1 + ", " + num2 + ".");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Метод арифметических операций: исходные значения переменных равны " +
                num2 + ", " + num1 + ". Новые значения переменных равны " + num1 + ", " + num2 + ".");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Метод побитовых операций: исходные значения переменных равны " + num2 +
                ", " + num1 + ". Новые значения переменных равны " + num1 + ", " + num2 + ".");

        System.out.println("\nЗадача 6. Вывод символов и их кодов");
        char symbol35 = '#';
        char symbol38 = '&';
        char symbol64 = '@';
        char symbol94 = '^';
        char symbol95 = '_';
        int codeSymbol35 = (int) symbol35;
        int codeSymbol38 = (int) symbol38;
        int codeSymbol64 = (int) symbol64;
        int codeSymbol94 = (int) symbol94;
        int codeSymbol95 = (int) symbol95;
        System.out.println("Код символа: " + codeSymbol35 + ". Символ из ASCII-таблицы: " +
                symbol35 + ".");
        System.out.println("Код символа: " + codeSymbol38 + ". Символ из ASCII-таблицы: " +
                symbol38 + ".");
        System.out.println("Код символа: " + codeSymbol64 + ". Символ из ASCII-таблицы: " +
                symbol64 + ".");
        System.out.println("Код символа: " + codeSymbol94 + ". Символ из ASCII-таблицы: " +
                symbol94 + ".");
        System.out.println("Код символа: " + codeSymbol95 + ". Символ из ASCII-таблицы: " +
                symbol95 + ".");

        System.out.println("\nЗадача 7. Вывод в консоль ASCII-арт Дюка");
        char forwardSlash = '/';
        char backSlash = '\\';
        char lowHyphen = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + forwardSlash + backSlash + "     ");
        System.out.println("   " + forwardSlash + "  " + backSlash + "    ");
        System.out.println("  " + forwardSlash + lowHyphen + openParenthesis + " " + 
                closeParenthesis + backSlash + "   ");
        System.out.println(" " + forwardSlash + "      " + backSlash + "  ");
        System.out.println(forwardSlash + "" + lowHyphen + lowHyphen + lowHyphen + lowHyphen + 
                forwardSlash + backSlash + lowHyphen + lowHyphen + backSlash);

        System.out.println("\nЗадача 8. Вывод количества сотен, десятков и единиц числа");
        int numeral = 123;
        int hundreds = numeral / 100;
        int dozens = (numeral % 100) / 10;
        int units = numeral % 10;
        int multiplication = hundreds * dozens * units;
        int sum = hundreds + dozens + units;
        System.out.println("Число " + numeral + " содержит: " + hundreds + " сотню, " + dozens + 
                " десятка, " + units + " единицы.");
        System.out.println("Сумма его цифр = " + sum + ", произведение его цифр = " +
                multiplication + ".");

        System.out.println("\nЗадача 9. Вывод времени");
        int secondsTotal = 86399;
        int hours = secondsTotal / 3600;
        int minutes = (secondsTotal % 3600) / 60;
        int seconds = secondsTotal % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}