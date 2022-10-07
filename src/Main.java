import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {

            printMenu();
            userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Введите месяц, за который хотите ввести количество шагов. 0 - Январь," +
                        " 1 - Февраль ... 11 - Декабрь");
                int chosenMonth = scanner.nextInt();
                System.out.println("Введите день, за который хотите ввести количество шагов (от 1 до 30)");
                int chosenDay = scanner.nextInt();
                System.out.println("Введите количество шагов");
                int userSteps = scanner.nextInt();
                tracker.saveStepsInDay(chosenMonth, chosenDay, userSteps);
            } else if (userInput == 2) {
                System.out.println("За какой месяц вы хотите получить статистику? 0 - январь, 1 - Февраль ..." +
                        " 11 - Декабрь");
                int monthStatistics = scanner.nextInt();
                tracker.showStepsInDay(monthStatistics);
                System.out.println("Общее количество шагов за месяц: " + tracker.sumMonthSteps(monthStatistics));
                System.out.println("Максимальное пройденное количество шагов в месяце: " + tracker.getMaxSteps(monthStatistics));
                System.out.println("Среднее количество шагов: " + tracker.getAverageSteps(monthStatistics));
                System.out.println("Пройденная дистанция (в км): " + tracker.getDistance(monthStatistics));
                System.out.println("Количество сожжённых килокалорий: " + tracker.getKilocalories(monthStatistics));
                System.out.println("Ваша лучшая серия: " + tracker.getBestSeries(monthStatistics));
            } else if (userInput == 3) {
                System.out.println("Введите новую цель по количеству шагов");
                int newGoal = scanner.nextInt();
                tracker.changeTheGoal(newGoal);
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
        System.out.println("Программа завершена");
        return;
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println(" 1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения.");
    }
} 