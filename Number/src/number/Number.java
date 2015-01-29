package number;

import java.io.IOException;

public class Number {
	private String type;
	private String value;
	public Number(){
		type = "int";
		value = "0";
	}
	public Number(String type, String value)throws IOException{
		if(type == "String" || type == "Bolean"){
			throw new IOException();
		}
		this.type = type;
		this.value = value;
	}
	public String getValue(){
		return value;
	}
	public String getType(){
		return type;
	}
	public Number addNumber(Number a)throws Exception{
		if(this.type.compareTo(a.type) != 0){
			throw new Exception("Invalid");
		}
		Number sum = new Number();
		sum.type = this.type;
		if(this.type == "int"){
			int sum1;
			sum1 = Integer.parseInt(this.value)+Integer.parseInt(a.value);
			sum.value = String.valueOf(sum1);
		}
		if(this.type == "float"){
			float sum1;
			sum1 = Float.parseFloat(this.value)+Float.parseFloat(a.value);
			sum.value = String.valueOf(sum1);
		}
		if(this.type == "Double"){
			double sum1;
			sum1 = Double.parseDouble(this.value)+Double.parseDouble(a.value);
			sum.value = String.valueOf(sum1);
		}
		return sum;
	}
	public Number subNumber(Number a)throws Exception{
		if(this.type.compareTo(a.type) != 0){
			throw new Exception("Invalid");
		}
		Number sub = new Number();
		sub.type = this.type;
		if(this.type == "int"){
			int sub1;
			sub1 = Integer.parseInt(this.value)-Integer.parseInt(a.value);
			sub.value = String.valueOf(sub1);
		}
		if(this.type == "float"){
			float sub1;
			sub1 = Float.parseFloat(this.value)-Float.parseFloat(a.value);
			sub.value = String.valueOf(sub1);
		}
		if(this.type == "Double"){
			double sub1;
			sub1 = Double.parseDouble(this.value)-Double.parseDouble(a.value);
			sub.value = String.valueOf(sub1);
		}
		return sub;
	}
	public Number mulNumber(Number a)throws Exception{
		if(this.type.compareTo(a.type) != 0){
			throw new Exception("Invalid");
		}
		Number mul = new Number();
		mul.type = this.type;
		if(this.type == "int"){
			int mul1;
			mul1 = Integer.parseInt(this.value)*Integer.parseInt(a.value);
			mul.value = String.valueOf(mul1);
		}
		if(this.type == "float"){
			float mul1;
			mul1 = Float.parseFloat(this.value)*Float.parseFloat(a.value);
			mul.value = String.valueOf(mul1);
		}
		if(this.type == "Double"){
			double mul1;
			mul1 = Double.parseDouble(this.value)*Double.parseDouble(a.value);
			mul.value = String.valueOf(mul1);
		}
		return mul;
	}
	public Number divNumber(Number a)throws Exception{
		if(this.type.compareTo(a.type) != 0){
			throw new Exception("Invalid");
		}
		if(a.value.compareTo("0") == 0){
			throw new Exception("Demo = 0");
		}
		Number div= new Number();
		div.type = this.type;
		if(this.type == "Int"){
			int div1;
			div1 = Integer.parseInt(this.value)/Integer.parseInt(a.value);
			div.value = String.valueOf(div1);
		}
		if(this.type == "Float"){
			float div1;
			div1 = Float.parseFloat(this.value)/Float.parseFloat(a.value);
			div.value = String.valueOf(div1);
		}
		if(this.type == "Double"){
			double div1;
			div1 = Double.parseDouble(this.value)/Double.parseDouble(a.value);
			div.value = String.valueOf(div1);
		}
		return div;
	}
}
