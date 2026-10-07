import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Доход за месяц: ");
        int income = sc.nextInt();

        System.out.print("Расходы на еду: ");
        int foodExpenses = sc.nextInt();

        System.out.print("Расходы на транспорт: ");
        int transportExpenses = sc.nextInt();

        System.out.print("Расходы на развлечения: ");
        int entertainmentExpenses = sc.nextInt();

        System.out.print("Текущие сбережения: ");
        double savings = sc.nextDouble();

        int totalExpenses = foodExpenses + transportExpenses + entertainmentExpenses;
        int monthlyRemainder = income - totalExpenses;
        double averageDailyExpense = totalExpenses / 30.0;

        int monthsOnSavings = 0;
        if (totalExpenses != 0) {
            monthsOnSavings = (int) (savings / totalExpenses);
        }

        System.out.println();
        System.out.println("=== Семейный бюджет на месяц ===");
        System.out.printf("Доход:                  %d%n", income);
        System.out.printf("Общие расходы:          %d%n", totalExpenses);
        System.out.printf("Остаток за месяц:       %d%n", monthlyRemainder);
        System.out.printf("Средний расход в день:  %.2f%n", averageDailyExpense);
        System.out.printf("Месяцев на сбережениях: %d%n", monthsOnSavings);

        sc.close();
    }
}