package semester1.practice03;

import java.util.Locale;
import java.util.Scanner;

/**
 * Практична робота №3
 * Scanner, умовні конструкції (if/else, switch), тернарний оператор,
 * логічні та порозрядні оператори.
 *
 * Запускаєте програму -> вводите номер завдання (1-40) -> виконується це завдання.
 * 0 — вихід з програми.
 */
public class Practice03 {

    // Один спільний Scanner на всю програму (System.in можна закрити лише раз — у кінці main)
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Щоб дробові числа вводились через крапку (3.14), а не через кому
        scanner.useLocale(Locale.US);

        boolean running = true;
        while (running) {
            System.out.println();
            System.out.print("Введіть номер завдання (1-40, 0 — вихід): ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine(); // очищення буфера від залишкового \n
            System.out.println();

            switch (taskNumber) {
                case 1 -> task01();
                case 2 -> task02();
                case 3 -> task03();
                case 4 -> task04();
                case 5 -> task05();
                case 6 -> task06();
                case 7 -> task07();
                case 8 -> task08();
                case 9 -> task09();
                case 10 -> task10();
                case 11 -> task11();
                case 12 -> task12();
                case 13 -> task13();
                case 14 -> task14();
                case 15 -> task15();
                case 16 -> task16();
                case 17 -> task17();
                case 18 -> task18();
                case 19 -> task19();
                case 20 -> task20();
                case 21 -> task21();
                case 22 -> task22();
                case 23 -> task23();
                case 24 -> task24();
                case 25 -> task25();
                case 26 -> task26();
                case 27 -> task27();
                case 28 -> task28();
                case 29 -> task29();
                case 30 -> task30();
                case 31 -> task31();
                case 32 -> task32();
                case 33 -> task33();
                case 34 -> task34();
                case 35 -> task35();
                case 36 -> task36();
                case 37 -> task37();
                case 38 -> task38();
                case 39 -> task39();
                case 40 -> task40();
                case 0 -> running = false;
                default -> System.out.println("Такого завдання немає!");
            }
        }

        scanner.close(); // усе введення завершено — звільняємо ресурс
    }

    // ==================== БЛОК 1: Scanner ====================

    // Завдання 1: особиста картка користувача
    private static void task01() {
        System.out.println("=== Завдання 1 ===");
        System.out.print("Введіть ім'я: ");
        String firstName = scanner.nextLine();
        System.out.print("Введіть прізвище: ");
        String lastName = scanner.nextLine();
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // очищення буфера
        System.out.print("Введіть місто: ");
        String city = scanner.nextLine();

        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Вік: " + age);
        System.out.println("Місто: " + city);
        System.out.println("-------------------");
        System.out.println("Привіт, " + firstName + " " + lastName + " з міста " + city + "! Твій вік: " + age + " р.");
    }

    // Завдання 2: сума, різниця, добуток, остача
    private static void task02() {
        System.out.println("=== Завдання 2 ===");
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Сума: " + (a + b));
        System.out.println("Різниця: " + (a - b));
        System.out.println("Добуток: " + (a * b));
        System.out.println("Остача від ділення: " + (a % b));
    }

    // Завдання 3: конвертер валют
    private static void task03() {
        System.out.println("=== Завдання 3 ===");
        System.out.print("Введіть суму в гривнях (UAH): ");
        double uah = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть курс USD: ");
        double rate = scanner.nextDouble();
        scanner.nextLine();

        double usd = Math.round(uah / rate * 100) / 100.0; // округлення до 2 знаків
        System.out.println("Сума до видачі: " + usd + " USD");
    }

    // Завдання 4: пастка буфера Scanner
    private static void task04() {
        System.out.println("=== Завдання 4 ===");
        System.out.print("Введіть номер квитка: ");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine(); // ОБОВ'ЯЗКОВО: прибираємо залишковий \n після nextInt()
        System.out.print("Введіть повне ім'я студента: ");
        String fullName = scanner.nextLine();
        System.out.print("Введіть спеціальність: ");
        String speciality = scanner.nextLine();

        System.out.println("Студент: " + fullName + ", квиток №" + ticketNumber + ", спеціальність: " + speciality);
    }

    // Завдання 5: індекс маси тіла
    private static void task05() {
        System.out.println("=== Завдання 5 ===");
        System.out.print("Ваш зріст (м): ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ваша вага (кг): ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        double bmi = weight / Math.pow(height, 2);
        System.out.println("Розрахований BMI: " + Math.round(bmi * 100) / 100.0);
    }

    // Завдання 6: зчитування символу
    private static void task06() {
        System.out.println("=== Завдання 6 ===");
        System.out.print("Введіть символ: ");
        char ch = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println("Символ: " + ch + " | Код символу: " + (int) ch);
    }

    // Завдання 7: прямокутний трикутник
    private static void task07() {
        System.out.println("=== Завдання 7 ===");
        System.out.print("Катет A: ");
        double legA = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Катет B: ");
        double legB = scanner.nextDouble();
        scanner.nextLine();

        double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        double perimeter = legA + legB + hypotenuse;
        double area = legA * legB / 2;

        System.out.println("Гіпотенуза: " + hypotenuse);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площа: " + area);
    }

    // Завдання 8: чек супермаркету
    private static void task08() {
        System.out.println("=== Завдання 8 ===");
        System.out.print("Товар: ");
        String productName = scanner.nextLine();
        System.out.print("Ціна: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Кількість: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        double total = price * quantity;
        double vat = total * 0.20;
        System.out.println("Товар: " + productName);
        System.out.println("Ціна: " + price);
        System.out.println("Кількість: " + quantity);
        System.out.println("Загальна сума: " + total + " грн (з них ПДВ 20%: " + vat + " грн)");
    }

    // ==================== БЛОК 2: if / else ====================

    // Завдання 9: знак числа
    private static void task09() {
        System.out.println("=== Завдання 9 ===");
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number > 0) {
            System.out.println("Число додатне.");
        } else if (number < 0) {
            System.out.println("Число від'ємне.");
        } else {
            System.out.println("Число дорівнює нулю.");
        }
    }

    // Завдання 10: парність з особливим статусом нуля
    private static void task10() {
        System.out.println("=== Завдання 10 ===");
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 0) {
            System.out.println("Число є нулем");
        } else if (number % 2 == 0) {
            System.out.println("Число " + number + " є парним.");
        } else {
            System.out.println("Число " + number + " є непарним.");
        }
    }

    // Завдання 11: вікові категорії
    private static void task11() {
        System.out.println("=== Завдання 11 ===");
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age < 0 || age > 120) {
            System.out.println("Некоректний вік");
        } else if (age <= 12) {
            System.out.println("Дитина");
        } else if (age <= 17) {
            System.out.println("Підліток");
        } else if (age <= 64) {
            System.out.println("Дорослий");
        } else {
            System.out.println("Пенсіонер");
        }
    }

    // Завдання 12: шкала оцінок ECTS
    private static void task12() {
        System.out.println("=== Завдання 12 ===");
        System.out.print("Введіть підсумковий бал (0-100): ");
        int score = scanner.nextInt();
        scanner.nextLine();

        if (score < 0 || score > 100) {
            System.out.println("Помилка: некоректний бал!");
        } else if (score >= 90) {
            System.out.println("Відмінно (A)");
        } else if (score >= 82) {
            System.out.println("Дуже добре (B)");
        } else if (score >= 74) {
            System.out.println("Добре (C)");
        } else if (score >= 64) {
            System.out.println("Задовільно (D)");
        } else if (score >= 60) {
            System.out.println("Достатньо (E)");
        } else {
            System.out.println("Незадовільно (F)");
        }
    }

    // Завдання 13: максимум та мінімум із трьох чисел (без Math.max / Math.min)
    private static void task13() {
        System.out.println("=== Завдання 13 ===");
        System.out.print("Введіть 3 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);
    }

    // Завдання 14: чверть координатної площини
    private static void task14() {
        System.out.println("=== Завдання 14 ===");
        System.out.print("Введіть X: ");
        double x = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Введіть Y: ");
        double y = scanner.nextDouble();
        scanner.nextLine();

        if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у I чверті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у II чверті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у III чверті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV чверті.");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться на початку координат.");
        } else {
            System.out.println("Точка (" + x + "; " + y + ") лежить на осі координат.");
        }
    }

    // Завдання 15: проблема «завислого else» (Dangling Else)
    @SuppressWarnings("all")
    private static void task15() {
        System.out.println("=== Завдання 15 ===");
        int x = 5;
        int y = 20;

        // 1) Без фігурних дужок. Відступи ОБМАНЮЮТЬ: else прив'язується до НАЙБЛИЖЧОГО if,
        //    тобто до if (y > 10), а не до if (x > 10).
        //    x = 5, тому зовнішній if (x > 10) хибний і ВЕСЬ вкладений блок (разом із else) пропускається.
        //    Тому нічого не виведеться, хоча здається, що else мав би спрацювати.
        System.out.println("Варіант без дужок:");
        if (x > 10)
            if (y > 10)
                System.out.println("x > 10 і y > 10");
            else
                System.out.println("else (насправді належить до if (y > 10))");

        // 2) Виправлено дужками: else належить до зовнішнього if (x > 10)
        System.out.println("Варіант із дужками:");
        if (x > 10) {
            if (y > 10) {
                System.out.println("x > 10 і y > 10");
            }
        } else {
            System.out.println("x не більше 10 (else належить зовнішньому if)");
        }
    }

    // Завдання 16: прогресивний тариф електроенергії
    private static void task16() {
        System.out.println("=== Завдання 16 ===");
        System.out.print("Введіть спожито кВт·год: ");
        int kwh = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Спожито: " + kwh + " кВт·год");
        if (kwh <= 100) {
            double sum = Math.round(kwh * 2.64 * 100) / 100.0;
            System.out.println("Сума до сплати: " + kwh + " * 2.64 = " + sum + " грн");
        } else {
            int extra = kwh - 100;
            double sum = Math.round((100 * 2.64 + extra * 4.32) * 100) / 100.0;
            System.out.println("Сума до сплати: 100 * 2.64 + " + extra + " * 4.32 = " + sum + " грн");
        }
    }

    // ==================== БЛОК 3: Тернарний оператор ====================

    // Завдання 17: більше з двох чисел
    private static void task17() {
        System.out.println("=== Завдання 17 ===");
        System.out.print("Введіть x: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть y: ");
        int y = scanner.nextInt();
        scanner.nextLine();

        int max = (x > y) ? x : y;
        System.out.println("Більше число: " + max);
    }

    // Завдання 18: модуль числа
    private static void task18() {
        System.out.println("=== Завдання 18 ===");
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int abs = (n < 0) ? -n : n;
        System.out.println("Модуль числа: " + abs);
    }

    // Завдання 19: парне чи непарне
    private static void task19() {
        System.out.println("=== Завдання 19 ===");
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        String result = (number % 2 == 0) ? "Парне" : "Непарне";
        System.out.println("Результат: " + result);
    }

    // Завдання 20: статус заліку
    private static void task20() {
        System.out.println("=== Завдання 20 ===");
        System.out.print("Введіть бал: ");
        int score = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Результат: " + ((score >= 60) ? "Зараховано" : "Незараховано"));
    }

    // Завдання 21: вкладений тернарний оператор
    private static void task21() {
        System.out.println("=== Завдання 21 ===");
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
        System.out.println("Число " + n + ": " + status);
    }

    // Завдання 22: знижка магазину
    private static void task22() {
        System.out.println("=== Завдання 22 ===");
        System.out.print("Сума покупки: ");
        double sum = scanner.nextDouble();
        scanner.nextLine();

        double discountPercent = (sum > 1000) ? 10 : 2;
        double finalSum = Math.round(sum * (1 - discountPercent / 100) * 100) / 100.0;
        System.out.println("Сума покупки: " + sum + " грн");
        System.out.println("До сплати зі знижкою: " + finalSum + " грн");
    }

    // Завдання 23: безпечне ділення
    private static void task23() {
        System.out.println("=== Завдання 23 ===");
        System.out.print("Введіть ділене a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть дільник b: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println((b != 0) ? "Результат: " + ((double) a / b) : "Помилка: ділення на нуль неможливе!");
    }

    // Завдання 24: узгодження слів
    private static void task24() {
        System.out.println("=== Завдання 24 ===");
        System.out.print("Введіть кількість помилок: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println((count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок");
    }

    // ==================== БЛОК 4: && / & та || / | ====================

    // Завдання 25: безпечний short-circuit AND
    private static void task25() {
        System.out.println("=== Завдання 25 ===");
        int x = 10;
        int divisor = 0;

        // divisor != 0 повертає false, а && — «лінивий» оператор: якщо ліва частина false,
        // права частина (x / divisor > 1) НЕ обчислюється взагалі.
        // Тому ділення на нуль не відбувається і ArithmeticException не виникає.
        if (divisor != 0 && (x / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }
    }

    // Завдання 26: && проти &
    private static void task26() {
        System.out.println("=== Завдання 26 ===");
        int counter1 = 0;
        int counter2 = 0;

        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);

        // && лінивий: ліва частина false -> права не виконується -> counter1 залишається 0.
        // &  жадібний: завжди обчислює ОБИДВІ частини -> ++counter2 виконується -> counter2 = 1.
        System.out.println("b1 = " + b1 + ", counter1 = " + counter1);
        System.out.println("b2 = " + b2 + ", counter2 = " + counter2);
    }

    // Завдання 27: short-circuit OR
    private static void task27() {
        System.out.println("=== Завдання 27 ===");
        int number = 5;

        // number > 0 уже true, а || — «лінивий»: якщо ліва частина true, результат вже відомий,
        // тому права частина (10 / 0 == 0) не обчислюється і помилки ділення на нуль немає.
        if (number > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }
    }

    // Завдання 28: || проти |
    private static void task28() {
        System.out.println("=== Завдання 28 ===");
        int counterA = 0;
        int counterB = 0;

        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);

        // || лінивий: ліва частина true -> права пропускається -> counterA = 0.
        // |  жадібний: обчислює обидві частини -> ++counterB виконується -> counterB = 1.
        System.out.println("test1 = " + test1 + ", counterA = " + counterA);
        System.out.println("test2 = " + test2 + ", counterB = " + counterB);
    }

    // Завдання 29: валідація часу
    private static void task29() {
        System.out.println("=== Завдання 29 ===");
        System.out.print("Введіть години (0-23): ");
        int hours = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть хвилини (0-59): ");
        int minutes = scanner.nextInt();
        scanner.nextLine();

        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
        if (isValidTime) {
            String hh = (hours < 10) ? "0" + hours : "" + hours;
            String mm = (minutes < 10) ? "0" + minutes : "" + minutes;
            System.out.println("Час: " + hh + ":" + mm);
        } else {
            System.out.println("Помилка: некоректний час!");
        }
    }

    // Завдання 30: нерівність трикутника
    private static void task30() {
        System.out.println("=== Завдання 30 ===");
        System.out.print("Введіть сторони a b c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.nextLine();

        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println("Сторони: " + a + ", " + b + ", " + c + " -> Трикутник існує: " + exists);
    }

    // Завдання 31: парність через побітове &
    private static void task31() {
        System.out.println("=== Завдання 31 ===");
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        boolean isEvenBitwise = (n & 1) == 0;
        boolean isEvenModulo = n % 2 == 0;
        System.out.println("Число " + n + " у двійковому вигляді: " + Integer.toBinaryString(n));
        System.out.println("n & 1 = " + (n & 1) + " (побітове І залишає лише останній біт числа)");
        System.out.println("Парне через (n & 1) == 0: " + isEvenBitwise);
        System.out.println("Парне через n % 2 == 0: " + isEvenModulo);
        System.out.println("Якщо останній біт 0 — число парне, якщо 1 — непарне.");
    }

    // Завдання 32: багатофакторний дозвіл на зняття коштів
    private static void task32() {
        System.out.println("=== Завдання 32 ===");
        final int CORRECT_PIN = 1234;
        final double DAILY_LIMIT = 20000.0;

        System.out.print("Введіть PIN-код: ");
        int pin = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Картка активна? (true/false): ");
        boolean isCardActive = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Баланс картки: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Вже знято сьогодні: ");
        double withdrawnToday = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Сума зняття: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        boolean isPinCorrect = (pin == CORRECT_PIN);
        boolean hasSufficientBalance = (balance >= amount);
        boolean isDailyLimitExceeded = (withdrawnToday + amount > DAILY_LIMIT);

        if (isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded) {
            System.out.println("Транзакцію дозволено.");
        } else {
            System.out.println("Транзакцію відхилено.");
        }
    }

    // ==================== БЛОК 5: switch ====================

    // Завдання 33: класичний switch з break
    private static void task33() {
        System.out.println("=== Завдання 33 ===");
        System.out.print("Введіть номер дня (1-7): ");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
    }

    // Завдання 34: навмисний fall-through
    private static void task34() {
        System.out.println("=== Завдання 34 ===");
        System.out.print("Введіть номер дня (1-7): ");
        int day = scanner.nextInt();
        scanner.nextLine();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: // break немає між case 1..4 — виконання «провалюється» до println нижче
                System.out.println("Будній (робочий) день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
    }

    // Завдання 35: modern switch із групуванням case через кому
    private static void task35() {
        System.out.println("=== Завдання 35 ===");
        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();
        scanner.nextLine();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        if (days == 0) {
            System.out.println("Такого місяця не існує!");
        } else {
            System.out.println("Кількість днів у місяці: " + days);
        }
    }

    // Завдання 36: пора року (switch-вираз зі String)
    private static void task36() {
        System.out.println("=== Завдання 36 ===");
        System.out.print("Введіть місяць: ");
        String month = scanner.nextLine();

        String season = switch (month.toLowerCase()) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Невідомий місяць";
        };
        System.out.println("Пора року: " + season);
    }

    // Завдання 37: switch-вираз з yield
    private static void task37() {
        System.out.println("=== Завдання 37 ===");
        System.out.print("Спосіб доставки (1 — Самовивіз, 2 — Кур'єр, 3 — Поштомат): ");
        int delivery = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Вага товару (кг): ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        int cost = switch (delivery) {
            case 1 -> 0;
            case 2 -> {
                if (weight > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };

        if (cost == -1) {
            System.out.println("Некоректний вибір способу доставки!");
        } else {
            System.out.println("Вартість доставки: " + cost + " грн");
        }
    }

    // Завдання 38: міні-калькулятор
    private static void task38() {
        System.out.println("=== Завдання 38 ===");
        System.out.print("Число 1: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Число 2: ");
        double b = scanner.nextDouble();
        scanner.nextLine();

        if (op == '/' && b == 0) {
            System.out.println("Помилка: ділення на нуль неможливе!");
        } else {
            double result = switch (op) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> a / b;
                default -> Double.NaN;
            };

            if (Double.isNaN(result)) {
                System.out.println("Невідома операція!");
            } else {
                System.out.println("Результат: " + result);
            }
        }
    }

    // Завдання 39: ⭐ equals проти == та switch зі String
    private static void task39() {
        System.out.println("=== Завдання 39 ===");
        System.out.print("Введіть команду (start, pause, stop, exit): ");
        String command = scanner.nextLine();

        // 1) Порівняння через == порівнює АДРЕСИ об'єктів у пам'яті, а не текст.
        //    Рядок зі Scanner — новий об'єкт у Heap, а літерал "start" лежить у String Pool,
        //    тому адреси різні і результат false, навіть якщо ввели саме start.
        System.out.println("command == \"start\": " + (command == "start"));

        // 2) Правильне порівняння змісту (без урахування регістру)
        System.out.println("command.equalsIgnoreCase(\"start\"): " + command.equalsIgnoreCase("start"));

        // 3) Обробка всіх команд через сучасний switch (switch порівнює рядки через equals/hashCode)
        switch (command.toLowerCase()) {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Систему призупинено.");
            case "stop" -> System.out.println("Систему зупинено.");
            case "exit" -> System.out.println("Вихід із програми.");
            default -> System.out.println("Невідома команда!");
        }
    }

    // Завдання 40: консольний банківський термінал
    private static void task40() {
        System.out.println("================ БАНКОМАТ ================");
        final int CORRECT_PIN = 1234;

        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();
        scanner.nextLine();

        if (pin != CORRECT_PIN) {
            System.out.println("Невірний PIN-код! Роботу завершено.");
            return;
        } else {
            System.out.println("Авторизація успішна!");
        }

        double balance = 5000.0;
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.print("Оберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> System.out.println("Ваш баланс: " + balance + " грн");
                case 2 -> {
                    System.out.print("Введіть суму поповнення: ");
                    double deposit = scanner.nextDouble();
                    scanner.nextLine();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Рахунок поповнено. Баланс: " + balance + " грн");
                    } else {
                        System.out.println("Сума поповнення має бути більшою за 0!");
                    }
                }
                case 3 -> {
                    System.out.print("Введіть суму зняття: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    // «Лінива» перевірка: якщо amount <= 0, друга частина не обчислюється
                    if (amount > 0 && amount <= balance) {
                        double commission = (amount > 1000) ? Math.round(amount * 0.01 * 100) / 100.0 : 0;
                        if (amount + commission <= balance) {
                            balance = balance - amount - commission;
                            System.out.println("Комісія операції: " + commission + " грн");
                            System.out.println("Видано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                        } else {
                            System.out.println("Недостатньо коштів для сплати комісії " + commission + " грн!");
                        }
                    } else {
                        System.out.println("Некоректна сума або недостатньо коштів!");
                    }
                }
                case 4 -> {
                    System.out.println("Дякуємо, що скористалися нашим банкоматом!");
                    running = false;
                }
                default -> System.out.println("Невідома дія!");
            }
        }
        System.out.println("==========================================");
    }
}
