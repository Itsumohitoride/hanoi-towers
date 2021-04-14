package ui;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public Scanner lector;

	public Main(){

		lector = new Scanner(System.in);
	}

	public static void main(String[] args) throws IOException {

		Main objMain = new Main();
		objMain.initializate();
	}

	public void initializate() throws IOException {

		int agujaInicial = 0;
		int agujaFinal = 0;
		int agujaTemp = 0;
		int numDisc;
		int numDiscInt = 0;
		int totalDisc = 0;
		int[] allDisc;

		numDisc = lector.nextInt();

		allDisc = new int[numDisc];

		for(int i = 0; i<numDiscInt; i++) {

			totalDisc = lector.nextInt();;

			allDisc[i] = totalDisc;
		}

		for (int i = 0; i < allDisc.length; i++) {
			resolverTorres(allDisc[i], agujaInicial, agujaTemp, agujaFinal);
		}
	}

	public static void resolverTorres(int n, int origin, int temp, int end) {

		if(n == 1) {
			System.out.println((origin-origin)+" "+(temp-temp)+" "+n+"\n");
		}
		else {

			System.out.println((n)+" "+(end)+" "+(temp)); 

			resolverTorres(n - 1, origin, end, temp);

			System.out.println((n)+" "+(origin)+" "+(end));

			resolverTorres(n - 1, temp, origin, end);
		}
	}
}
