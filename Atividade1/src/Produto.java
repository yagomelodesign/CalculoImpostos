import java.util.Scanner;

public class Produto {
	
	public static void main(String[] args) {
		
		
		String productOrService;
		
		double valueProduct, freight, insurance;
		double aliquotOriginDestination, aliquotPracticed, valueService;
		double profitMargin;
	    	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Product or service?");
		productOrService = scan.nextLine();
		
		if (productOrService.toUpperCase().equals("PRODUCT")) {
			System.out.println("\nEnter the values\n");
			System.out.println("Product");
			valueProduct = scan.nextDouble();
			System.out.println("Freight");
			freight = scan.nextDouble();
			System.out.println("Insurance");
			insurance = scan.nextDouble();
			System.out.println("Aliquot");
			aliquotOriginDestination = scan.nextDouble();
			System.out.println("Profit Margin");
			profitMargin = scan.nextDouble();
			
			System.out.println("\nThe final value of the product is: $"+finalValueProduct(valueProduct, freight, insurance, aliquotOriginDestination, profitMargin));
	  		}
		
		if (productOrService.toUpperCase().equals("SERVICE")) {
			System.out.println("\nEnter the values\n");
			System.out.println("Service");
			valueService = scan.nextDouble();
			System.out.println("Aliquot");
			aliquotPracticed = scan.nextDouble();
			
			System.out.println("\nThe final value of the product is: $"+finalValuesService(aliquotPracticed, valueService));

		}
		
	}
	

    public static double finalValueProduct(double valueProduct, double freight, double insurance, double aliquotOriginDestination, double profitMargin) {
    	
    	double cost = valueProduct + freight + insurance;
    	double taxIPI = cost * 0.15;
    	double taxICMS = cost * aliquotOriginDestination;
    	double totalTaxes = taxIPI + taxICMS;
 
    	
    	return cost + totalTaxes + profitMargin;
    	
    }
    
    public static double finalValuesService( double aliquotPracticed, double valueService) {
    	
    	double taxISS = aliquotPracticed * valueService;
    	
    	return valueService + taxISS;
    	
    }
    
	


    
}
