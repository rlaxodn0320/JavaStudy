
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
		
		System.out.println("���ް�(value of supply) : "+ valueOfSupply);
		System.out.println("�ΰ���ġ��(VAT) :"+ vat);
		System.out.println("�հ�(total) :"+ total);
		System.out.println("���(expense) :"+ expense);
		System.out.println("������(income) :"+ income);
		System.out.println("���(dividend) 1 :"+ dividend1 );
		System.out.println("���(dividend) 2 :"+ dividend2 );
		System.out.println("���(dividend) 3 :"+ dividend3 );
		
	}

}
