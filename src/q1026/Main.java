package q1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int S;
	static int[] A,B;
	
	public static void main(String[] args) throws IOException {
		int i,j,sum = 0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		S = Integer.parseInt(in.readLine());
		A = new int[S];
		B = new int[S];
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		for(i=0;i<S;i++) A[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(in.readLine());
		for(i=0;i<S;i++) B[i] = Integer.parseInt(st.nextToken()); 
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(i=0;i<S;i++) {
			sum += A[i] * B[(S-1)-i];
		}
		
		System.out.println(sum);
		
		in.close();
	}
}
