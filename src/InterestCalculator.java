import java.util.Scanner;

abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterest() throws InvalidInputException;

    static class InvalidInputException extends Exception {
        InvalidInputException(String message) {
            super(message);
        }
    }
}

class FDAccount extends Account {
    int noOfDays;
    int ageOfACHolder;

    @Override
    double calculateInterest() throws InvalidInputException {
        if (noOfDays < 0 || amount < 0 || ageOfACHolder < 0) {
            throw new InvalidInputException("Invalid input. Please enter valid values.");
        }

        double interest = 0;

        if (amount <= 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = ageOfACHolder >= 60 ? 5.00 : 4.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = ageOfACHolder >= 60 ? 5.25 : 4.75;
            }
            else if (noOfDays >= 30 && noOfDays <45) {
                interestRate = ageOfACHolder >= 60 ? 6.00 : 5.50;
            }
            else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = ageOfACHolder >= 60 ? 7.50 : 7.00;
            }
            else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = ageOfACHolder >= 60 ? 8.00 : 7.50;
            }
            else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = ageOfACHolder >= 60 ? 8.50 : 8.00;
            }
            
        } else {
            // Implement interest calculation for amounts above 1 Crore
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate =6.50;
            }
            else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate =6.75 ;
            }
            else if (noOfDays >= 30 && noOfDays <45) {
                interestRate =6.75;
            }
            else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate =8.00 ;
            }
            else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate= 8.50 ;
            }
            else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 10.00;
            }
        }

        
        interest = (amount * interestRate * noOfDays) / 36500;

        return interest;
    }
}

class SBAccount extends Account {
    @Override
    double calculateInterest() throws InvalidInputException {
        if (amount < 0) {
            throw new InvalidInputException("Invalid input. Please enter a valid amount.");
        }

        if (amount <= 10000000) {
            interestRate = 4.0; // Normal SB Account
        } else {
            interestRate = 6.0; // NRI SB Account
        }

        
        return (amount * interestRate) / 100;
    }
}

class RDAccount extends Account {
    int noOfMonths;
    double monthlyAmount;
    int ageOfACHolder;

    @Override
    double calculateInterest() throws InvalidInputException {
        int n=0;
        if (noOfMonths < 0 || monthlyAmount < 0) {
            throw new InvalidInputException("Invalid input. Please enter valid values.");
        }

        if(noOfMonths<=6)
         {
            interestRate = ageOfACHolder >= 60 ? 8.00 : 7.50;
            n=1;
         }
         else if(noOfMonths>6 && noOfMonths<=9)
         {
            interestRate = ageOfACHolder >= 60? 8.25 : 7.75;
            n=2;
         }
         else if(noOfMonths>9 && noOfMonths<=12)
         {
            interestRate = ageOfACHolder >= 60? 8.50 : 8.00;
            n=3;
         }
         else if (noOfMonths>12 && noOfMonths<=15)
         {
            interestRate = ageOfACHolder >= 60? 8.75 : 8.25;
            n=4;
         }
         else if (noOfMonths>15 && noOfMonths<=18)
         {
            interestRate = ageOfACHolder >= 60? 9.00 : 8.50;
            n=5;
         }
         else if (noOfMonths>18 && noOfMonths<=21)
         {
            interestRate = ageOfACHolder >= 60? 9.25 : 8.75;
            n=6;
         }

         double interest = monthlyAmount *(Math.pow((1+interestRate/noOfMonths), (noOfMonths*n))) ;
        
         return interest;
        
    
        
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         boolean check=true;
        while (check) {
            System.out.println("Select the option:");
            System.out.println("1. Interest Calculator –SB");
            System.out.println("2. Interest Calculator –FD");
            System.out.println("3. Interest Calculator –RD");
            System.out.println("4. Exit  ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSBInterest(scanner);
                    break;
                case 2:
                    calculateFDInterest(scanner);
                    break;
                case 3:
                    calculateRDInterest(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    check=false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void calculateSBInterest(Scanner scanner) {
        try {
            SBAccount sbAccount = new SBAccount();

            System.out.println("Enter the Average amount in your account:");
            sbAccount.amount = scanner.nextDouble();

            double interest = sbAccount.calculateInterest();
            System.out.println("Interest gained: Rs. " + interest);
        } catch (Account.InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calculateFDInterest(Scanner scanner) {
        try {
            FDAccount fdAccount = new FDAccount();

            System.out.println("Enter the FD amount:");
            fdAccount.amount = scanner.nextDouble();

            System.out.println("Enter the number of days:");
            fdAccount.noOfDays = scanner.nextInt();

            System.out.println("Enter your age:");
            fdAccount.ageOfACHolder = scanner.nextInt();

            double interest = fdAccount.calculateInterest();
            System.out.println("Interest gained is: " + interest);
        } catch (Account.InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calculateRDInterest(Scanner scanner) {
        try {
            RDAccount rdAccount = new RDAccount();

            System.out.println("Enter the number of months:");
            rdAccount.noOfMonths = scanner.nextInt();

            System.out.println("Enter the monthly amount:");
            rdAccount.monthlyAmount = scanner.nextDouble();
            System.out.println("Enter your age:");
            rdAccount.ageOfACHolder=scanner.nextInt();

            double interest = rdAccount.calculateInterest();
            System.out.println("Interest gained is: " + interest);
        } catch (Account.InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
