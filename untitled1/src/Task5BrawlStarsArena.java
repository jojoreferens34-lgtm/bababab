

import java.util.Scanner;

public class Task5BrawlStarsArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("           ⭐ BRAWL STARS: BOSS FIGHT ⭐");
        System.out.println("======================================================");


        System.out.println("Оберіть свого бійця:");
        System.out.println("1. Шеллі (Shelly)     - HP: 4000 | Атака: 1200 | Супер: 2800");
        System.out.println("2. Кольт (Colt)       - HP: 3000 | Атака: 1600 | Супер: 3600");
        System.out.println("3. Ель Прімо (Primo)  - HP: 6000 | Атака: 1100 | Супер: 2200");
        System.out.print("Ваш вибір (1-3): ");

        int choice = scanner.nextInt();

        String brawlerName = "";
        int maxHp = 0;
        int baseAttack = 0;
        int superAttack = 0;

        switch (choice) {
            case 1:
                brawlerName = "Шеллі";
                maxHp = 4000;
                baseAttack = 1200;
                superAttack = 2800;
                break;
            case 2:
                brawlerName = "Кольт";
                maxHp = 3000;
                baseAttack = 1600;
                superAttack = 3600;
                break;
            case 3:
                brawlerName = "Ель Прімо";
                maxHp = 6000;
                baseAttack = 1100;
                superAttack = 2200;
                break;
            default:
                System.out.println("Невірний вибір! Автоматично обрано Шеллі.");
                brawlerName = "Шеллі";
                maxHp = 4000;
                baseAttack = 1200;
                superAttack = 2800;
                break;
        }

        System.out.println("Ви обрали бійця: " + brawlerName + "! Бій починається!\n");


        int playerHp = maxHp;
        int ammo = 3;
        int superCharge = 0;
        int powerCubes = 0;


        int bossMaxHp = 10000;
        int bossHp = bossMaxHp;
        int bossBaseDamage = 700;

        int round = 1;


        while (playerHp > 0 && bossHp > 0) {
            System.out.println("-------------------- РАУНД " + round + " --------------------");


            int currentBossDamage = bossBaseDamage;
            String bossPhase = "СПОКІЙНИЙ";
            double bossHpPercent = ((double) bossHp / bossMaxHp) * 100;

            if (bossHpPercent < 30) {
                bossPhase = "⚠️ ENRAGED / GOD MODE! (+70% атаки)";
                currentBossDamage = (int) (bossBaseDamage * 1.7);
            } else if (bossHpPercent <= 60) {
                bossPhase = "⚠️ ANGRY! (+30% атаки)";
                currentBossDamage = (int) (bossBaseDamage * 1.3);
            }


            int playerBars = (int) (((double) playerHp / maxHp) * 10);
            if (playerBars < 0) playerBars = 0;
            System.out.print(String.format("[%-10s] HP: [", brawlerName));
            for (int i = 0; i < playerBars; i++) System.out.print("█");
            for (int i = 0; i < (10 - playerBars); i++) System.out.print("░");
            System.out.println("] " + playerHp + "/" + maxHp + " | Набої: " + ammo + "/3 | Супер: " + superCharge + "%" + (superCharge >= 100 ? " (ГОТОВИЙ!)" : ""));


            int bossBars = (int) (((double) bossHp / bossMaxHp) * 10);
            if (bossBars < 0) bossBars = 0;
            System.out.print("[Робо-Бос]  HP: [");
            for (int i = 0; i < bossBars; i++) System.out.print("█");
            for (int i = 0; i < (10 - bossBars); i++) System.out.print("░");
            System.out.println("] " + bossHp + "/" + bossMaxHp + " | Фаза: " + bossPhase);
            System.out.println("Куби підсилення: " + powerCubes + " шт. (+" + (powerCubes * 15) + "% до атаки)\n");


            System.out.println("Оберіть дію:");
            System.out.println("1 - Базова атака (-1 набій)");
            System.out.println("2 - СУПЕР АТАКА " + (superCharge >= 100 ? "(ДОСТУПНО!)" : "(Не заряджено!)"));
            System.out.println("3 - Захисний маневр (відновлення набоїв та +15% HP)");
            System.out.println("4 - Ризик: пошук Енергетичного куба (Power Cube)");
            System.out.print("Ваш хід: ");

            int action = scanner.nextInt();
            System.out.println();


            boolean bossStunned = false;
            boolean bossWeakened = false;


            double damageMultiplier = 1.0 + (powerCubes * 0.15);

            switch (action) {
                case 1:
                    if (ammo >= 1) {
                        ammo--;
                        int damageDealt = (int) (baseAttack * damageMultiplier);
                        bossHp -= damageDealt;
                        superCharge += 35;
                        System.out.println("💥 " + brawlerName + " влучно атакує! Завдано " + damageDealt + " шкоди!");
                        System.out.println("🔋 Заряд супера: +35% (Поточний: " + superCharge + "%)");
                    } else {
                        System.out.println("❌ Немає набоїв! Хід втрачено через перезарядку!");
                    }
                    break;

                case 2:
                    if (superCharge >= 100) {
                        superCharge = 0; // Скидаємо заряд
                        int superDamageDealt = (int) (superAttack * damageMultiplier);
                        bossHp -= superDamageDealt;
                        System.out.println("💣💣💣 СУПЕР-АТАКА! Потужний удар від " + brawlerName + "!");
                        System.out.println("Шкода босу: " + superDamageDealt + "!");


                        if (choice == 1) {
                            bossWeakened = true;
                            System.out.println("💨 Вибух відкинув боса! Його наступна атака зменшена на 50%!");
                        } else if (choice == 3) {
                            bossStunned = true;
                            System.out.println("💫 Метеорний стрибок оглушив боса! Він пропускає наступний хід!");
                        }
                    } else {
                        System.out.println("❌ Супер ще не заряджений! Ви промахуєтесь від розгубленості.");
                    }
                    break;

                case 3:
                    ammo += 2;
                    if (ammo > 3) ammo = 3;
                    int healAmount = (int) (maxHp * 0.15);
                    playerHp += healAmount;
                    if (playerHp > maxHp) playerHp = maxHp;
                    System.out.println("🛡️ " + brawlerName + " відступає у захист, відновлює набої (+2) та регенерує +" + healAmount + " HP!");
                    break;

                case 4:
                    if (Math.random() < 0.6) {
                        powerCubes++;
                        System.out.println("🟩 Успіх! Знайдено Енергетичний куб (Power Cube)! Вся шкода назавжди зросла на +15%!");
                    } else {
                        System.out.println("💨 Пусто... Ви нічого не знайшли, лише змарнували час.");
                    }
                    break;

                default:
                    System.out.println("❌ Невідома команда! Боєць заплутався в кнопках і пропустив хід.");
                    break;
            }


            ammo++;
            if (ammo > 3) ammo = 3;


            if (bossHp > 0) {
                if (bossStunned) {
                    System.out.println("\n🤖 Хід Боса:\nБос приголомшений і не може атакувати!");
                } else {
                    System.out.println("\n🤖 Хід Боса:");


                    if (Math.random() < 0.15) {
                        System.out.println("🤸 " + brawlerName + " робить кувирок та ефектно ухиляється від удару боса! Шкоди не отримано!");
                    } else {

                        if (bossWeakened) {
                            currentBossDamage = currentBossDamage / 2;
                        }
                        playerHp -= currentBossDamage;
                        System.out.println("Робо-Бос завдає удару механічним кулаком! " + brawlerName + " отримує " + currentBossDamage + " шкоди!");
                    }
                }
            }

            System.out.println("-------------------------------------------------\n");
            round++;
        }


        System.out.println("======================================================");
        if (bossHp <= 0) {
            System.out.println("🏆 ПЕРЕМОГА! РОБО-БОСА ЗНИЩЕНО!");
            System.out.println("Раундів зіграно: " + (round - 1));
            System.out.println("Зібрано Power Cubes: " + powerCubes + " шт.");
            System.out.println("Нагорода: +10 Трофеїв 🏆, 100 Starr Drops! Ви - Зірковий Гравець!");
        } else {
            System.out.println("💀 ПОРАЗКА! СЕЙФ ЗРУЙНОВАНО!");
            System.out.println("Вашого бійця здолали на " + (round - 1) + "-му раунді.");