import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte  PERCENT= 100;

        Scanner scanner = new Scanner(System.in);
        int principal=0;
        float annualInterestRate=0;
        float monthlyInterestRate =0;
        byte years=0;
        int numberOfPayments=0;

        while(true){
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if(principal>=1000 && principal<=1_000_000)
                break;
            System.out.println("Enter a value betwwen 1000 and 1000000");

        }

    while(true){
        System.out.print("Annual Interest Rate : ");
        annualInterestRate = scanner.nextFloat();
        if(annualInterestRate>0 && annualInterestRate<=30) {
            monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter bewteen 1 and 30");
    }

    while(true){
        System.out.print("Period (Years): ");
        years= scanner.nextByte();
        if(years >=1 && years<=30){
            numberOfPayments= years * MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 and 30");
    }


            double mortgage= principal*(monthlyInterestRate * Math.pow(1+ monthlyInterestRate, numberOfPayments)/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1));
            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + mortgageFormatted);
    }
}