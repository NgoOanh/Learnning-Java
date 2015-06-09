
public class bai24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 22; i<= 389; i++){
			if(i % 2 != 0){
				sum += Math.pow(i, 2);
			}
		}
		System.out.print(sum);
	}

}
