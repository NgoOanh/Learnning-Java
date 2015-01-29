package number;

import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Number a = new Number("Double", "7");		
			Number b = new Number("Double", "2");
			Number sum = a.addNumber(b);
			Number sub = a.subNumber(b);
			Number mul = a.mulNumber(b);
			Number div = a.divNumber(b);
			System.out.print(sum.getValue());
		}
		catch(IOException e){
			System.err.println("IO Exception");
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
	}

}
