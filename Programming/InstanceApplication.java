import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApplication {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("resultone.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("resulttwo.txt");
		p2.write("Hello 2");
		p2.close();
		
		
		
	}

}
