package xyz;

public class cont {

	public static void main(String[] args) {
		for(int i = 0; i<= 2; i++) {

			for (int j = i; j<=5; j++) {

			if(j == 4) { //4==4

			continue; //forecful iteration

			}

			System.out.println(j); //01235 1235 235

			}
		}
}}