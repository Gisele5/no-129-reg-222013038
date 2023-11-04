public class LoanCalculator {//variable to store the principal,interestrate,months
        private double principal;
        private double interestRate;
        private int months;
    //constructor to initialize the variable
        public LoanCalculator(double principal, double interestRate, int months) {
            this.principal = principal;
            this.interestRate = interestRate / 100; // Convert percentage to decimal
            this.months = months;
        }
        //method to calculate the total payment with compound interest
        public double calculateTotalPayment() {//method 
            double monthlyPayment = principal * (interestRate / 12) / (1 - Math.pow(1 + (interestRate / 12), -months));
            return monthlyPayment * months;
        }
    
        public static void main(String[] args) {
            double principal = 500000;
            double interestRate = 18; // Annual interest rate
            int months = 3 * 12; // 3 years
            
            LoanCalculator loan = new LoanCalculator(principal, interestRate, months);//create object of the class
            double totalPayment = loan.calculateTotalPayment();//calculate total payment
    
            System.out.println("Total payment after 3 years: $" + totalPayment);//print total payment
        }
    } 

