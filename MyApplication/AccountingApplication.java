
public class AccountingApplication {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("공급가(value of supply) : "+ valueOfSupply);
		System.out.println("부가가치세(VAT) :"+ vat);
		System.out.println("합계(total) :"+ total);
		System.out.println("비용(expense) :"+ expense);
		System.out.println("순이익(income) :"+ income);
		System.out.println("배당(dividend) 1 :"+ dividend1 );
		System.out.println("배당(dividend) 2 :"+ dividend2 );
		System.out.println("배당(dividend) 3 :"+ dividend3 );
		
	}

}
