package number;

import java.io.IOException;

public class Number<T> {
	private T value;
	public Number(){
		value = null;
	}
	public Number(T value)throws IOException{
		String type = value.getClass().getSimpleName();
		if(type.compareTo("String") == 0 || type.compareTo("Bolean") == 0){
			throw new IOException();
		}
		this.value = value;
	}
	public T getValue(){
		return value;
	}
	public Number add(Number a)throws Exception{
		String type1 = this.value.getClass().getSimpleName();
		String type2 = a.value.getClass().getSimpleName();
		if(type1.compareTo(type2) != 0){
			throw new Exception("Invalid");
		}
		Number sum = new Number();
		if(type1.compareTo("Integer") == 0){
			sum.value = Integer.valueOf(this.value.toString()) + Integer.valueOf(a.value.toString());
		}
		if(type1.compareTo("Double") == 0){
			sum.value = Double.valueOf(this.value.toString()) + Double.valueOf(a.value.toString());
		}
		return sum;
	}
	public Number sub(Number a)throws Exception{
		String type1 = this.value.getClass().getSimpleName();
		String type2 = a.value.getClass().getSimpleName();
		if(type1.compareTo(type2) != 0){
			throw new Exception("Invalid");
		}
		Number sub = new Number();
		if(type1.compareTo("Integer") == 0){
			sub.value = Integer.valueOf(this.value.toString()) - Integer.valueOf(a.value.toString());
		}
		if(type1.compareTo("Double") == 0){
			sub.value = Double.valueOf(this.value.toString()) - Double.valueOf(a.value.toString());
		}
		return sub;
	}
	public Number mul(Number a)throws Exception{
		String type1 = this.value.getClass().getSimpleName();
		String type2 = a.value.getClass().getSimpleName();
		if(type1.compareTo(type2) != 0){
			throw new Exception("Invalid");
		}
		Number mul = new Number();
		if(type1.compareTo("Integer") == 0){
			mul.value = Integer.valueOf(this.value.toString()) * Integer.valueOf(a.value.toString());
		}
		if(type1.compareTo("Double") == 0){
			mul.value = Double.valueOf(this.value.toString()) * Double.valueOf(a.value.toString());
		}
		return mul;
	}
	public Number div(Number a)throws Exception{
		String type1 = this.value.getClass().getSimpleName();
		String type2 = a.value.getClass().getSimpleName();
		if(type1.compareTo(type2) != 0){
			throw new Exception("Invalid");
		}
		if(a.value.toString().compareTo("0") == 0 || a.value.toString().compareTo("0.0") == 0){
			throw new Exception("Demo = 0");
		}
		Number div = new Number();
		if(type1.compareTo("Integer") == 0){
			div.value = Integer.valueOf(this.value.toString()) / Integer.valueOf(a.value.toString());
		}
		if(type1.compareTo("Double") == 0){
			div.value = Double.valueOf(this.value.toString()) / Double.valueOf(a.value.toString());
		}
		return div;
	}
}
