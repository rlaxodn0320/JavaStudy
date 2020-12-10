
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b); // 1.0
		
		// int c = 1.1; error 1.1은 double형인데 int에 담으려고 함
		double d = 1.1;
		int e = (int) 1.1; // 강제로 1로 바뀐다 0.1의 손실이 일어남 
		System.out.println(e);
		
		// 1 to String how?!?
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}
