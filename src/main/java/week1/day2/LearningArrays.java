package week1.day2;

import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentList = {"Devi","Karthick","Mohan","Malliga","Kavitha"};
		int[] ageList= {25,28,43,46,27};
		char[][] grades= {{'A','B','C','D','E','F'},{'A','B','B','B','B','B'},{'A','A','A','A','A'},{'A','B','B','B','C','B'},{'D','D','B','B','C','B'}};

		System.out.println("Whos data I want");
		Scanner scan = new Scanner(System.in);
		int index= scan.nextInt();
		index=index-1;
		//devi whoes is 25 years old scoread a,b,c,d,e,f
		//System.out.println(studentList[index]  +  "whoes is" + ageList[index] + "years old scored "+ grades[index][0],[index][1],[index][2],[index][3],[index][4]);

		System.out.println(studentList[index] +  "whoes is" + ageList[index] + "years old scored "+ grades[index][0] + "," + grades[index][1] + "," + grades[index][2] + "," + grades[index][3] + ","+ grades[index][4]);


	}

}
