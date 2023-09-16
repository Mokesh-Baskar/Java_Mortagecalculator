import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner variable= new Scanner(System.in);
        System.out.println("Please Enter the following details");
        System.out.println("Loan Amount:");
        double Amount=variable.nextDouble();
        System.out.println("Percentage:");
        float Percentage = variable.nextFloat();
        System.out.println("Tenure:");
        int tenure = variable.nextInt();
        float annualpercentage=Percentage/12;
        double emi = (Amount*(annualpercentage/100)*(Math.pow(1+(annualpercentage/100),tenure)))/((Math.pow(1+(annualpercentage/100),tenure)-1));
        System.out.println("Please find your EMI below");
        System.out.println(emi);
    }
}