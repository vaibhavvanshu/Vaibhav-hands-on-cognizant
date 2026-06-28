import java.util.*;

class FinancialData {
    private int year;
    private double revenue;
    private double expense;
    public FinancialData(int year, double revenue, double expense) {
        this.year = year;
        this.revenue = revenue;
        this.expense = expense;
    }
    public int getYear() {
        return year;
    }
    public double getRevenue() {
        return revenue;
    }
    public double getExpense() {
        return expense;
    }
    public double getProfit() {
        return revenue - expense;
    }
    public void display() {
        System.out.println("--------------------");
        System.out.println("Year    : " + year);
        System.out.println("Revenue : " + revenue);
        System.out.println("Expense : " + expense);
        System.out.println("Profit  : " + getProfit());
    }
}

public class FinancialForecasting {
    static ArrayList<FinancialData> data = new ArrayList<>();
    public static double calculateGrowthRate() {
        double totalGrowth = 0;
        for(int i = 1; i < data.size(); i++) {
            double previous =
                    data.get(i-1).getRevenue();
            double current =
                    data.get(i).getRevenue();
            double growth =
                    ((current - previous) / previous) * 100;
            totalGrowth += growth;
        }
        return totalGrowth / (data.size()-1);
    }
    public static void forecastRevenue(int years) {
        double growthRate = calculateGrowthRate();
        double currentRevenue =
                data.get(data.size()-1).getRevenue();
        System.out.println("\nFuture Revenue Forecast");
        for(int i=1;i<=years;i++) {
            currentRevenue =
                    currentRevenue +
                    (currentRevenue * growthRate / 100);
            System.out.println(
                    "Year " + 
                    (data.get(data.size()-1).getYear()+i)
                    +
                    " Revenue : "
                    +
                    currentRevenue
            );
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        data.add(new FinancialData(
                2022,500000,300000));
        data.add(new FinancialData(
                2023,600000,350000));
        data.add(new FinancialData(
                2024,750000,400000));
        System.out.println("Past Financial Data");
        for(FinancialData f : data) {
            f.display();
        }
        System.out.print(
                "\nEnter number of years to forecast: "
        );
        int years = sc.nextInt();
        forecastRevenue(years);
        sc.close();
    }

}
