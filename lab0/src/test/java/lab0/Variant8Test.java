package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant8;

public class Variant8Test {

    private final Variant8 var = new Variant8();

    // 1. Перестановка цифр двозначного числа
    @Test(dataProvider = "swapDigitsProvider")
    public void testSwapDigits(int input, int expected) {
        assertEquals(var.swapDigits(input), expected);
    }

    @DataProvider
    public Object[][] swapDigitsProvider() {
        return new Object[][]{
                {23, 32},
                {45, 54},
                {12, 21}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "invalidSwapDigitsProvider")
    public void testInvalidSwapDigits(int input) {
        var.swapDigits(input);
    }

    @DataProvider
    public Object[][] invalidSwapDigitsProvider() {
        return new Object[][]{
                {123},
                {9},
                {-45}
        };
    }

    // 2. Перевірити істинність: кожне з чисел A і B непарне
    @Test(dataProvider = "bothOddProvider")
    public void testBothOdd(int a, int b, boolean expected) {
        assertEquals(var.bothOdd(a, b), expected);
    }

    @DataProvider
    public Object[][] bothOddProvider() {
        return new Object[][]{
                {3, 5, true},
                {2, 3, false},
                {4, 6, false}
        };
    }

    // 3. Вивести більше і менше число
    @Test(dataProvider = "sortTwoNumbersProvider")
    public void testSortTwoNumbers(int a, int b, int[] expected) {
        assertEquals(var.sortTwoNumbers(a, b), expected);
    }

    @DataProvider
    public Object[][] sortTwoNumbersProvider() {
        return new Object[][]{
                {5, 2, new int[]{5, 2}},
                {2, 5, new int[]{5, 2}},
                {10, 10, new int[]{10, 10}}
        };
    }

    // 4. Попередня дата
    @Test(dataProvider = "previousDateProvider")
    public void testPreviousDate(int day, int month, int[] expected) {
        assertEquals(var.previousDate(day, month), expected);
    }

    @DataProvider
    public Object[][] previousDateProvider() {
        return new Object[][]{
                {1, 3, new int[]{28, 2}}, // Перед 1 березня
                {15, 3, new int[]{14, 3}}, // 14 березня
                {1, 1, new int[]{31, 12}} // Перед 1 січня
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "invalidPreviousDateProvider")
    public void testInvalidPreviousDate(int day, int month) {
        var.previousDate(day, month);
    }

    @DataProvider
    public Object[][] invalidPreviousDateProvider() {
        return new Object[][]{
                {32, 13},
                {0, 2},
                {1, 0}
        };
    }

    // 5. Добуток чисел в діапазоні
    @Test(dataProvider = "productInRangeProvider")
    public void testProductInRange(int a, int b, int expected) {
        assertEquals(var.productInRange(a, b), expected);
    }

    @DataProvider
    public Object[][] productInRangeProvider() {
        return new Object[][]{
                {1, 4, 24}, // 1 * 2 * 3 * 4 = 24
                {2, 3, 6}  // 2 * 3 = 6
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "invalidProductInRangeProvider")
    public void testInvalidProductInRange(int a, int b) {
        var.productInRange(a, b);
    }

    @DataProvider
    public Object[][] invalidProductInRangeProvider() {
        return new Object[][]{
                {5, 3},
                {10, 10}
        };
    }

    // 6. Найбільше ціле число K, квадрат якого не перевищує N
    @Test(dataProvider = "largestSquareProvider")
    public void testLargestSquare(int n, int expected) {
        assertEquals(var.largestSquare(n), expected);
    }

    @DataProvider
    public Object[][] largestSquareProvider() {
        return new Object[][]{
                {17, 4}, // 4^2 = 16
                {10, 3}, // 3^2 = 9
                {1, 1}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "invalidLargestSquareProvider")
    public void testInvalidLargestSquare(int n) {
        var.largestSquare(n);
    }

    @DataProvider
    public Object[][] invalidLargestSquareProvider() {
        return new Object[][]{
                {-1},
                {0}
        };
    }

    // 7. Парні пари у масиві
    @Test(dataProvider = "evenPairsProvider")
    public void testEvenPairs(int[] array, String expected) {
        assertEquals(var.evenPairs(array), expected);
    }

    @DataProvider
    public Object[][] evenPairsProvider() {
        return new Object[][]{
                {new int[]{1, 2, 4, 6, 8}, "(6, 8) (4, 6) (2, 4)"},
                {new int[]{10, 12, 14}, "(12, 14) (10, 12)"}
        };
    }

    // 8. Елементи K-го стовпця матриці
    @Test(dataProvider = "columnElementsProvider")
    public void testColumnElements(int[][] matrix, int k, int[] expected) {
        assertEquals(var.columnElements(matrix, k), expected);
    }

    @DataProvider
    public Object[][] columnElementsProvider() {
        return new Object[][]{
                {
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        2,
                        new int[]{2, 5, 8}
                },
                {
                        new int[][]{
                                {10, 11, 12},
                                {13, 14, 15}
                        },
                        3,
                        new int[]{12, 15}
                }
        };
    }

    // Тест на перевірку некоректних даних для вибору K-го стовпця матриці
    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "invalidColumnElementsProvider")
    public void testInvalidColumnElements(int[][] matrix, int k) {
        var.columnElements(matrix, k);
    }
    // Тест на перевірку некоректних даних для вибору K-го стовпця матриці
    @DataProvider
    public Object[][] invalidColumnElementsProvider() {
        return new Object[][]{
                {new int[][]{{1, 2}, {3, 4}}, 3}
        };
    }
}
