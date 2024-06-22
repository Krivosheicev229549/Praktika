/*
Кривошейцев Михаил Б763-2
Вариант А
11.  Банковский вклад. Возможности: изменить продолжительность вклада (бессрочный/долгосрочный/краткосрочный); узнать, какой вклад (отзывной или безотзывной); закрыть один вклад и открыть новый с такими же условиями, но в другой валюте; рассчитать начисление процентов по вкладу.
*/

public class Deposit {
    private int duration;
    private String type;
    private String currency;
    public Deposit(int duration, String type, String currency) {
        this.duration = duration;
        this.type = type;
        this.currency = currency;
    }
    public void change_duration(int new_duration) {
        this.duration = new_duration;
        System.out.println("Продолжительность изменена на " + new_duration + " месяцев.");
    }
    public void change_type(String new_type) {
        this.type = new_type;
        System.out.println("Тип изменен на " + new_type);
    }
    public void change_currency(String newCurrency) {
        this.currency = newCurrency;
        System.out.println("Валюта изменена на " + newCurrency);
    }
    public double calculateInterest(double amount, double interestRate) {
        double interest = amount * interestRate * duration / 100;
        return interest;
    }
    public static void main(String[] args) {
        Deposit deposit = new Deposit(12, "отзывной", "USD");
        deposit.change_duration(24);
        deposit.change_type("безотзывной");
        deposit.change_currency("EUR");
        double amount = 1000.0;
        double interestRate = 5.0;
        double interest = deposit.calculateInterest(amount, interestRate);
        System.out.println("Начисленные проценты: " + interest);
    }
}

