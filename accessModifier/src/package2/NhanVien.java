package package2;

import package1.Nguoi;

class NhanVien extends Nguoi {
	NhanVien(String ten, String namSinh, double luong) {
		super(ten, namSinh);
		this.luong=luong;
	}
	double luong;
	public String detail(){
		String s;
		s = getName()+", "+namSinh+", "+luong;
		return s;
	}	
}
