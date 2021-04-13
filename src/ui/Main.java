package ui;

public class Main {
	
	public static void resolverTorres(int n, int origin, int temp, int end) {

		if(n == 1) {
			System.out.println((origin-origin)+" "+(temp-temp)+" "+n);
		}
		else {
			
			System.out.println((n)+" "+(end)+" "+(temp)); 
			
			resolverTorres(n - 1, origin, end, temp);
			
			System.out.println((n)+" "+(origin)+" "+(end));
			
			resolverTorres(n - 1, temp, origin, end);
		}
	}

	public static void main(String[] args) {
		
		int agujaInicial = 0;
		int agujaFinal = 0;
		int agujaTemp = 0;
		int totalDiscos = 2;
		
		resolverTorres(totalDiscos, agujaInicial, agujaTemp, agujaFinal);
	}

}
