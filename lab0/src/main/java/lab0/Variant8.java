package lab0;

public class Variant8 {

    // 1. Двозначне число. Перестановка цифр.
    public int swapDigits(int number) {
        if (number < 10 || number > 99) {
            throw new IllegalArgumentException("Number must be a two-digit integer.");
        }
        int tens = number / 10;
        int ones = number % 10;
        return ones * 10 + tens;
    }

    // 2. Перевірити істинність: кожне число A і B непарне.
    public boolean bothOdd(int a, int b) {
        return a % 2 != 0 && b % 2 != 0;
    }

    // 3. Вивести спочатку більше, а потім менше з двох чисел.
    public int[] sortTwoNumbers(int a, int b) {
        if (a > b) {
            return new int[]{a, b};
        }
        return new int[]{b, a};
    }

    // 4. Вивести дату, що передує зазначеній.
    public int[] previousDate(int day, int month) {
        if (day <= 0 || month <= 0 || month > 12) {
            throw new IllegalArgumentException("Invalid date.");
        }

        if (day == 1) {
            if (month == 3) { // Березень
                return new int[]{28, 2};
            } else if (month == 1) { // Січень
                return new int[]{31, 12};
            } else if (month == 5 || month == 7 || month == 10 || month == 12) {
                return new int[]{30, month - 1};
            } else {
                return new int[]{31, month - 1};
            }
        }
        return new int[]{day - 1, month};
    }

    // 5. Добуток всіх цілих чисел від A до B включно.
    public int productInRange(int a, int b) {
        if (a >= b) {
            throw new IllegalArgumentException("A must be less than B.");
        }
        int product = 1;
        for (int i = a; i <= b; i++) {
            product *= i;
        }
        return product;
    }

    // 6. Найбільше ціле число K, квадрат якого не перевищує N.
    public int largestSquare(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be greater than 0.");
        }
        int k = 0;
        while (k * k <= n) {
            k++;
        }
        return k - 1;
    }

    // 7. Вивести всі парні пари масиву у порядку спадання індексів.
    public String evenPairs(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] % 2 == 0 && array[i - 1] % 2 == 0) {
                result.append("(").append(array[i - 1]).append(", ").append(array[i]).append(") ");
            }
        }
        return result.toString().trim();
    }

    // 8. Вивести елементи K-го стовпця матриці.
    public int[] columnElements(int[][] matrix, int k) {
        if (k < 1 || k > matrix[0].length) {
            throw new IllegalArgumentException("Invalid column index.");
        }
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][k - 1];
        }
        return column;
    }

    public static void main(String[] args) {
        Variant8 var = new Variant8();

        // 1. Перестановка цифр
        System.out.println("1. Перестановка цифр 23: " + var.swapDigits(23));

        // 2. Чи обидва числа непарні
        System.out.println("2. Чи обидва числа непарні (3, 5): " + var.bothOdd(3, 5));

        // 3. Вивести більше і менше число
        int[] sortedNumbers = var.sortTwoNumbers(5, 2);
        System.out.println("3. Більше і менше з чисел 5 і 2: " + sortedNumbers[0] + " " + sortedNumbers[1]);

        // 4. Попередня дата для 1 березня
        int[] previousDate = var.previousDate(1, 3);
        System.out.println("4. Попередня дата для 1 березня: " + previousDate[0] + "." + previousDate[1]);

        // 5. Добуток чисел в діапазоні від 1 до 4
        System.out.println("5. Добуток чисел від 1 до 4: " + var.productInRange(1, 4));

        // 6. Найбільше ціле число K, квадрат якого не перевищує 17
        System.out.println("6. Найбільше ціле число K, квадрат якого не перевищує 17: " + var.largestSquare(17));

        // 7. Парні пари в масиві
        int[] array = {1, 2, 4, 6, 8};
        System.out.println("7. Парні пари у масиві {1, 2, 4, 6, 8}: " + var.evenPairs(array));

        // 8. Елементи 2-го стовпця матриці
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] column = var.columnElements(matrix, 2);
        System.out.print("8. Елементи 2-го стовпця матриці: ");
        for (int num : column) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
