package package1;

public class Nguoi {
	private  String ten;
	protected String namSinh;
	protected Nguoi(String ten, String namSinh){
		this.ten = ten;
		this.namSinh = namSinh;
	}
	public String getName(){
		return ten;
	}
}
