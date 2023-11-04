public class BankAccount {//variables to store the principal,rate,time
    private double principal;
    private double rate;
    private int time;

    public BankAccount(double principal, double rate, int time) {//constructor to initialize the variables
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateSimpleInterest() {//method to calculate the simple interest
        return (principal * rate * time) / 100;
    }
}

    
    public static void main(String[] args) {
        double principal = 100000; // Principal amount in Rwandan Francs
        double rate = 5; // Annual interest rate in percentage
        int time = 5; // Time in years

        BankAccount account = new BankAccount(principal, rate, time);//create object of bankaccount class
        double simpleInterest = account.calculateSimpleInterest();//calculate simple interest

        System.out.println("Mr. Bob's simple interest after depositing " + principal + " Rwandan Francs at a " + rate + "% annual rate for " + time + " years is " + simpleInterest + " Rwandan Francs.");//print simple interest
    }


 

