import java.util.*;

public class GetAliquot{
	public static void main (String args[]){
		System.out.print("自然数を入力して下さい：");
        
        try{
            int num = new Scanner(System.in).nextInt();
            int sum = 0;
            
            // 約数の合計
            for ( int count = 1; count <= num; count++){
                if ( num % count == 0){
                    sum += count;
                }
            }
            // 合計表示
            System.out.println(sum);
            
        }catch (InputMismatchException e){
            System.out.println("無効な値です。");
        }
	}
}
	
