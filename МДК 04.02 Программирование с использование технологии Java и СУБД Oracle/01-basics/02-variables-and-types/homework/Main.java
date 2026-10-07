public class Main {
    public static void main(String[] args) {
        int scholarship = 30000;       
        int foodExpenses = 12000;      
        int transportExpenses = 3000;  
        int entertainment = 5000;      

        double phonePrice = 79990.0;
     
        int monthlyExpenses = foodExpenses + transportExpenses + entertainment;

        int monthlySavings = scholarship - monthlyExpenses;

        int halfYearSavings = monthlySavings * 6;

        int monthsToSave = (int) (phonePrice / monthlySavings);

        System.out.println("Расходы за месяц: " + monthlyExpenses + " руб.");
        System.out.println("Остаток за месяц: " + monthlySavings + " руб.");
        System.out.println("Накопления за полгода: " + halfYearSavings + " руб.");
        System.out.println("Полных месяцев на смартфон: " + monthsToSave);
        System.out.println("Хватит за " + monthsToSave + " месяцев");
    }
}                                                               