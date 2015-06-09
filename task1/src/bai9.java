import java.math.BigDecimal;



public class bai9 {

	public static BigDecimal giaithua(int n){
		if(n == 0 || n == 1){
			return BigDecimal.valueOf(1);
		}
		BigDecimal result = BigDecimal.valueOf(1);
		for(int i = 2; i <=n; i++){
			result = result.multiply(BigDecimal.valueOf(i));
		}
		return result;
	}
	public static void main(String[] args) {
		
		
		BigDecimal sum = BigDecimal.valueOf(0);
		for (int i = 1; i <= 100; i++){
			BigDecimal a = BigDecimal.valueOf(1).divide(giaithua(i),4,1);
			if(i % 2 != 0){
				sum = sum.add(a);
			}
			else {
				sum = sum.subtract(a);
			}
			
				
		}
		
		System.out.print(sum);
	}

}
