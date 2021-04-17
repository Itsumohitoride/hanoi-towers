package ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public final static int ONE = 0;
	public final static int TWO = 1;
	public final static int THREE = 2;
	public final static int SIZEARRAY = 3;
	public int positionDisc[] = new int[SIZEARRAY];
	public final static String FILEINPUT = "data/Hanoi_input.txt";
	public final static String FILEOURPUT = "data/Hanoi_output.txt";

	public Scanner lector;

	public Main(){

		lector = new Scanner(System.in);
	}

	public static void main(String[] args) throws IOException {

		Main objMain = new Main();
		objMain.initializate();
	}

	public void initializate() throws IOException {

		int numDisc;
		
		BufferedReader br = new BufferedReader(new FileReader(FILEINPUT));
		PrintWriter pw = new PrintWriter(FILEOURPUT);
		numDisc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < numDisc; i++) {
			
			positionDisc[ONE] = Integer.parseInt(br.readLine());
			positionDisc[TWO] = 0;
			positionDisc[THREE] = 0;

			pw.println(positionDisc[ONE]+" "+positionDisc[TWO]+ " "+positionDisc[THREE]);
			
			towers(pw, positionDisc[ONE], ONE, THREE, TWO);
			
			pw.println("");
		}
	  
		br.close();
		pw.close();
	}

	public void towers(PrintWriter pw, int n, int origin, int end, int temp) {

		if(n == 1) {

			positionDisc[origin] = positionDisc[origin] - 1;
			positionDisc[end] = positionDisc[end] + 1;

			pw.println(positionDisc[ONE]+" "+positionDisc[TWO]+ " "+positionDisc[THREE]);
		}
		else {

			towers(pw, n - 1, origin, temp, end);

			positionDisc[origin] = positionDisc[origin] - 1;
			positionDisc[end] = positionDisc[end] + 1;

			pw.println(positionDisc[ONE]+" "+positionDisc[TWO]+ " "+positionDisc[THREE]);

			towers(pw, n - 1, temp, end, origin);
		}
	}
}
