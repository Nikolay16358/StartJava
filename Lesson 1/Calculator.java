public class Calculator {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        char sign = '+';
        int result = num1 + num2;
        if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            if (num2 > 1) {
                int multiplier = num1;
                for (int i = 2; i <= num2; i++) {
                    result = multiplier * num1;
                    multiplier *= num1;
                }
            } else {
                result = num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }

        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}