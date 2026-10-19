import java.util.Scanner;

public class Practice04 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Запускайте потрібне завдання, прибравши // перед його назвою.
        // Наприклад:
        // task1();
        // task2();
        // task3();

        task1(); // Змініть номер на потрібне завдання від 1 до 40.
    }

    // Завдання 1
    static void task1() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
    }

    // Завдання 2
    static void task2() {
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "] " + text);
        }
    }

    // Завдання 3
    static void task3() {
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += 500;
            System.out.println("Місяць " + month + ": " + balance + " грн");
        }
    }

    // Завдання 4
    static void task4() {
        System.out.print("Введіть курс євро до гривні: ");
        double rate = scanner.nextDouble();
        for (int euro = 10; euro <= 100; euro += 10) {
            System.out.printf("%d євро = %.2f грн%n", euro, euro * rate);
        }
    }

    // Завдання 5
    static void task5() {
        System.out.print("Введіть ширину рамки: ");
        int width = scanner.nextInt();
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // Завдання 6
    static void task6() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("Поїхали! Ракета запущена!");
    }

    // Завдання 7
    static void task7() {
        int sum = 0;
        System.out.print("Введіть число (0 для завершення): ");
        int number = scanner.nextInt();
        while (number != 0) {
            sum += number;
            System.out.print("Введіть число (0 для завершення): ");
            number = scanner.nextInt();
        }
        System.out.println("Сума: " + sum);
    }

    // Завдання 8
    static void task8() {
        System.out.print("Введіть M: ");
        int m = scanner.nextInt();
        int power = 1;
        while (power <= m) {
            System.out.print(power + " ");
            if (power > Integer.MAX_VALUE / 2) {
                break;
            }
            power *= 2;
        }
        System.out.println();
    }

    // Завдання 9
    static void task9() {
        System.out.print("Введіть додатне число N: ");
        int n = scanner.nextInt();
        int temp = n;
        int count = 0;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            count++;
            temp /= 10;
        }
        System.out.println("Кількість цифр: " + count);
        System.out.println("Сума цифр: " + sum);
    }

    // Завдання 10
    static void task10() {
        System.out.print("Введіть додатне число: ");
        int number = scanner.nextInt();
        int temp = number;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Число навпаки: " + reverse);
    }

    // Завдання 11
    static void task11() {
        System.out.print("Початкова сума S: ");
        double s = scanner.nextDouble();
        System.out.print("Відсоток P: ");
        double p = scanner.nextDouble();

        if (s <= 0 || p <= 0) {
            System.out.println("Сума та відсоток мають бути більшими за 0.");
            return;
        }

        double capital = s;
        int years = 0;
        while (capital < s * 2) {
            capital += capital * p / 100;
            years++;
        }
        System.out.println("Потрібно років: " + years);
        System.out.printf("Капітал: %.2f грн%n", capital);
    }

    // Завдання 12
    static void task12() {
        System.out.print("Введіть N > 1: ");
        int n = scanner.nextInt();
        int divisor = 2;
        while (n % divisor != 0) {
            divisor++;
        }
        System.out.println("Найменший дільник: " + divisor);
    }

    // Завдання 13
    static void task13() {
        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        while (guess != secret) {
            System.out.print("Вгадайте число від 1 до 100: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Більше!");
            } else if (guess > secret) {
                System.out.println("Менше!");
            }
        }
        System.out.println("Правильно! Кількість спроб: " + attempts);
    }

    // Завдання 14
    static void task14() {
        int choice;
        do {
            System.out.println("\n1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Розпочинаємо нову гру!");
                case 2 -> System.out.println("Завантаження збереження...");
                case 3 -> System.out.println("Відкрито налаштування.");
                case 0 -> System.out.println("Вихід із меню.");
                default -> System.out.println("Невірний пункт меню.");
            }
        } while (choice != 0);
    }

    // Завдання 15
    static void task15() {
        int age;
        do {
            System.out.print("Введіть вік (1-120): ");
            age = scanner.nextInt();
        } while (age < 1 || age > 120);

        System.out.println("Вік підтверджено: " + age);
    }

    // Завдання 16
    static void task16() {
        final int correctPin = 1234;
        int pin;
        int attempts = 0;

        do {
            System.out.print("Введіть PIN-код: ");
            pin = scanner.nextInt();
            attempts++;

            if (pin == correctPin) {
                System.out.println("Доступ надано");
                return;
            } else {
                System.out.println("Неправильний PIN.");
            }
        } while (attempts < 3);

        System.out.println("Карту заблоковано!");
    }

    // Завдання 17
    static void task17() {
        char answer;
        do {
            System.out.print("Введіть два числа: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Сума: " + (a + b));

            System.out.print("Бажаєте продовжити? (y/n): ");
            answer = scanner.next().toLowerCase().charAt(0);
        } while (answer == 'y');
    }

    // Завдання 18
    static void task18() {
        int die1;
        int die2;
        int attempts = 0;

        do {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            attempts++;
            System.out.println("Кидок " + attempts + ": " + die1 + " і " + die2);
        } while (die1 != die2);

        System.out.println("Випав дубль! Кількість спроб: " + attempts);
    }

    // Завдання 19
    static void task19() {
        System.out.print("Введіть чисельник: ");
        double numerator = scanner.nextDouble();
        double denominator;

        do {
            System.out.print("Введіть знаменник (не 0): ");
            denominator = scanner.nextDouble();
        } while (denominator == 0);

        System.out.println("Результат: " + numerator / denominator);
    }

    // Завдання 20
    static void task20() {
        int count = 0;
        int sum = 0;
        int score;

        do {
            System.out.print("Введіть бал (0-100, від'ємне число для завершення): ");
            score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                sum += score;
                count++;
            } else if (score > 100) {
                System.out.println("Некоректний бал. Спробуйте ще раз.");
            }
        } while (score >= 0);

        if (count > 0) {
            System.out.printf("Середній бал: %.2f%n", (double) sum / count);
        } else {
            System.out.println("Оцінки не введені.");
        }
    }

    // Завдання 21
    static void task21() {
        System.out.print("Введіть A та B (A <= B): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Завдання 22
    static void task22() {
        System.out.print("Введіть N (0-20): ");
        int n = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }

    // Завдання 23
    static void task23() {
        System.out.printf("%-10s%-12s%-10s%n", "Число", "Квадрат", "Куб");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10d%-12d%-10d%n", i, i * i, i * i * i);
        }
    }

    // Завдання 24
    static void task24() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Завдання 25
    static void task25() {
        for (int i = 100; i <= 200; i++) {
            if (i % 13 == 0 && i % 7 == 0) {
                System.out.println("Перше число: " + i);
                break;
            }
        }
    }

    // Завдання 26
    static void task26() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " — код: " + (int) c);
        }
    }

    // Завдання 27
    static void task27() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("Сума ряду: " + sum);
    }

    // Завдання 28
    static void task28() {
        System.out.print("Введіть перший член a1, різницю d та кількість n: ");
        int a1 = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value = a1 + i * d;
            System.out.print(value + " ");
            sum += value;
        }
        System.out.println("\nСума: " + sum);
    }

    // Завдання 29
    static void task29() {
        byte b = 125;
        for (int i = 1; i <= 6; i++) {
            b = (byte) (b + 1);
            System.out.println("Крок " + i + ": " + b);
        }
        System.out.println("Після 127 значення byte переходить до -128 через переповнення.");
    }

    // Завдання 30
    static void task30() {
        System.out.print("Скільки чисел N? ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Число " + i + ": ");
            sum += scanner.nextInt();
        }

        if (n > 0) {
            double exactAverage = (double) sum / n;
            double integerAverage = sum / n;
            System.out.println("Середнє без приведення: " + integerAverage);
            System.out.println("Середнє з приведенням: " + exactAverage);
        } else {
            System.out.println("N має бути більшим за 0.");
        }
    }

    // Завдання 31
    static void task31() {
        System.out.print("Введіть слово з 5 символів: ");
        String word = scanner.next();
        String encrypted = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            encrypted += (char) (ch + 1);
        }
        System.out.println("Зашифроване слово: " + encrypted);
    }

    // Завдання 32
    static void task32() {
        double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};
        int wholeSum = 0;
        double centsSum = 0;

        for (double price : prices) {
            int whole = (int) price;
            wholeSum += whole;
            centsSum += price - whole;
        }

        System.out.println("Сума цілих гривень: " + wholeSum);
        System.out.printf("Сума відкинутих копійок: %.2f грн%n", centsSum);
        System.out.printf("У копійках: %.0f коп.%n", centsSum * 100);
    }

    // Завдання 33
    static void task33() {
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }
    }

    // Завдання 34
    static void task34() {
        long bigNumber = 3_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("Початкове long: " + bigNumber);
        System.out.println("Після приведення до int: " + smallNumber);
        System.out.println("Значення змінилося, бо число не входить у діапазон int.");
    }

    // Завдання 35
    static void task35() {
        System.out.println("Цикл із double:");
        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println(d);
        }

        System.out.println("Правильний варіант із int:");
        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println(val);
        }
    }

    // Завдання 36
    static void task36() {
        System.out.print("    ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    // Завдання 37
    static void task37() {
        System.out.print("Введіть висоту H та ширину W: ");
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || i == h || j == 1 || j == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Завдання 38
    static void task38() {
        System.out.print("Введіть висоту трикутника N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Завдання 39
    static void task39() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();

        for (int number = 2; number <= n; number++) {
            boolean prime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Завдання 40
    static void task40() {
        System.out.print("Введіть розмір дошки N: ");
        int n = scanner.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
