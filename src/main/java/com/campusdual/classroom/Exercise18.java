package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		try {
			int[] array = createAndInitializeArray(Utils.integer("Introduce un número entero: "));
			showInlineArray(array);
		} catch (Exception ex){
			System.out.println("Algo ha salido mal");
			ex.printStackTrace();
		}
	}

	public static int[] createAndInitializeArray(int num){
		int[] arrayNum = new int[Math.abs(num)];
		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = i + 1;
		}
		return arrayNum;
	}

	public static void showInlineArray(int[] array){
      for (int i : array) {
	  	if(array.length == i){
			System.out.println(i);
		}else{
			System.out.print(i + " ");
		}
      }
	}
}
