public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1. Вывод значений переменных на консоль");
        byte num1 = 4;
        short num2 = 8;
        int num3 = 64;
        long num4 = 237;
        float num5 = 2.40f;
        double num6 = 4.10;
        boolean isMac = false;
        char sym = 'H';
        String verOfWin = "Windows 10 Pro";
        System.out.println("Количество ядер процессора равно " + num1);
        System.out.println("Оперативная память компьютера составляет " + num2 + "ГБ");
        System.out.println("Операционная система является " + num3 + "-разрядной");
        System.out.println("Объём памяти на диске C составляет " + num4 + "ГБ");
        System.out.println("Базовая тактовая частота процессора составляет " + num5 + "ГГц");
        System.out.println("Максимальная тактовая частота процессора в режиме Turbo составляет " + 
                num6 + "ГГц");
        System.out.println("Проверка производства компьютера от Apple: " + isMac);
        System.out.println("Процессор Intel® Core™ i5-9300" + sym);
        System.out.println("Установленная версия Windows на компьютере: " + verOfWin);

        System.out.println("\nЗадача 2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        double discountInPercent = 0.11;
        int resultCost = penCost + bookCost;
        double discount = resultCost * discountInPercent;
        double discountCost = resultCost - discount;
        System.out.println("Сумма скидки составляет " + discount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой составляет " + discountCost + " руб.");

        System.out.println("\nЗадача 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a      \n   J   a a  v   v  a a     \nJ  J  aaaaa" + 
                "  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4. Вывод min и max значений целых числовых типов");
        byte num1 = 127;
        short num2 = 32_767;
        int num3 = 2_147_483_647;
        long num4 = 9_223_372_036_854_775_807L;
        System.out.print("byte: " + num1 + ", ");
        byte num11 = ++num1;
        System.out.print(num11 + ", ");
        byte num12 = --num11;
        System.out.println(num12);
        System.out.print("short: " + num2 + ", ");
        short num21 = ++num2;
        System.out.print(num21 + ", ");
        short num22 = --num21;
        System.out.println(num22);
        System.out.print("int: " + num3 + ", ");
        int num31 = ++num3;
        System.out.print(num31 + ", ");
        int num32 = --num31;
        System.out.println(num32);
        System.out.print("long: " + num4 + ", ");
        long num41 = ++num4;
        System.out.print(num41 + ", ");
        long num42 = --num41;
        System.out.println(num42);

        System.out.println("\nЗадача 5. Перестановка значений переменных");
        int num1 = 2, num2 = 5, num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Метод третьей переменной: исходные значения переменных равны " + num2 + 
            ", " + num1 + ". Новые значения переменных равны " + num1 + ", " + num2 + ".");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Метод арифмитических операций: исходные значения переменных равны " + 
            num2 + ", " + num1 + ". Новые значения переменных равны " + num1 + ", " + num2 + ".");
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        System.out.println("Метод побитовых операций: исходные значения переменных равны " + num2 + 
            ", " + num1 + ". Новые значения переменных равны " + num1 + ", " + num2 + ".");

        System.out.println("\nЗадача 6. Вывод символов и их кодов");
        char ch35 = '#', ch38 = '&', ch64 = '@', ch94 = '^', ch95 = '_';
        int num31 = (int) ch35;
        int num38 = (int) ch38;
        int num64 = (int) ch64;
        int num94 = (int) ch94;
        int num95 = (int) ch95;
        System.out.println("Код символа: " + num31 + ". Символ из ASCII-таблицы: " + ch35 + ".");
        System.out.println("Код символа: " + num38 + ". Символ из ASCII-таблицы: " + ch38 + ".");
        System.out.println("Код символа: " + num64 + ". Символ из ASCII-таблицы: " + ch64 + ".");
        System.out.println("Код символа: " + num94 + ". Символ из ASCII-таблицы: " + ch94 + ".");
        System.out.println("Код символа: " + num95 + ". Символ из ASCII-таблицы: " + ch95 + ".");

        System.out.println("\nЗадача 7. Вывод в консоль ASCII-арт Дюка");
        char ch1 = '·', ch2 = '/', ch3 = '\\', ch4 = '_', ch5 = '(', ch6 = ')', ch7 = '¤';
        System.out.println(ch1 + "" + ch1 + "" + ch1 + "" + ch1 + "" + ch2 + "" + ch3 + "" + ch1 + 
            "" + ch1 + "" + ch1 + "" + ch1 + "" + ch1);
        System.out.println(ch1 + "" + ch1 + "" + ch1 + "" + ch2 + "" + ch1 + "" + ch1 + "" + ch3 + 
            "" + ch1 + "" + ch1 + "" + ch1 + "" +ch1);
        System.out.println(ch1 + "" + ch1 + "" + ch2 + "" + ch4 + "" + ch5 + "" + ch1 + "" + ch6 + 
            "" + ch3 + "" + ch1 + "" + ch1 + "" + ch1);
        System.out.println(ch1 + "" + ch2 + "" + ch1 + "" + ch1 + "" + ch1 + "" + ch1 + "" + ch1 + 
            "" + ch1 + "" + ch3 + "" + ch1 + "" + ch1);
        System.out.println(ch2 + "" + ch4 + "" + ch4 + "" + ch4 + "" + ch4 + "" + ch2 + "" + ch3 + 
            "" + ch4 + "" + ch4 + "" + ch3 + "" + ch7);

        System.out.println("\nЗадача 8. Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int x = n / 100;
        int y = (n % 100) / 10;
        int z = n % 10;
        int multiplication = x * y * z;
        int sum = x + y + z;
        System.out.println("Число " + n + " содержит: " + x + " сотню, " + y + " десятка, " + z + " единицы.");
        System.out.println("Cумма его цифр = " + sum + ", произведение его цифр = " + multiplication + ".");

        System.out.println("\nЗадача 9. Вывод времени");
        int sec = 86399;
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = 86399 % 60;
        System.out.println("Текущее время: " + hours + ":" + minutes + ":" + seconds);

    }
}