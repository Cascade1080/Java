public class CarLoan {
    //Instance Fields
    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;
    // Constructor Method
    public CarLoan(int loan, int length, int rate, int payment){
        carLoan = loan;
        loanLength = length;
        interestRate = rate;
        downPayment = payment;
    }
    // Confirm Loan Method
    public void confirmLoan(){
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if(downPayment >= carLoan){
            System.out.println("The car can be paid in full");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate)/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Congratulations!  You now owe $" + monthlyPayment + " every month!  Hahahahaha!");
        }
    }
    //Main Method
    public static void main(String[] args){
        CarLoan newCar = new CarLoan(10000, 3, 5, 2000);
        newCar.confirmLoan();
        CarLoan newCarA = new CarLoan(5000, 24, 3, 5000);
        newCarA.confirmLoan();
    }
}
