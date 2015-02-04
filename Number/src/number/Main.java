package number;

import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			Number a = new Number(10e+3);		
			Number b = new Number(0.0);
			Number sum = a.add(b);
			Number sub = a.sub(b);
			Number mul = a.mul(b);
			Number div = a.div(b);
			System.out.print(div.getValue());		
		}
		catch(IOException e){
			System.err.println("IO Exception");
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
	}

}
