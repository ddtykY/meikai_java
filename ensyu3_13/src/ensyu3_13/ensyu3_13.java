package ensyu3_13;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_13
* 概要    :演習3-13の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_13 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :三つの整数値を読み込んで中央値を求めて表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"firstValue"の入力を促す
		System.out.print("整数値firstValue  : ");
		// int型の変数"firstValue"に入力された整数値を代入する
		int firstValue = standardInput.nextInt();
		
		// 整数値"secondValue"の入力を促す
		System.out.print("整数値secondValue : ");
		// int型の変数"secondValue"に入力された整数値を代入する
		int secondValue = standardInput.nextInt();
		
		// 整数値"thirdValue"の入力を促す
		System.out.print("整数値thirdValue  : ");
		// int型の変数"thirdValue"に入力された整数値を代入する
		int thirdValue = standardInput.nextInt();
		
		// 中央値を格納するためのint型の変数"median"を作り、
		// そこにまず一つ目の整数値の"firstValue"を代入し、この後ほかの整数値と比較していく
		int median = firstValue;
		
		if (median > secondValue && median > thirdValue) {
			// "median"が他の二値のどちらよりも大きい場合、他の2値の大きいほうを"median"に代入する
			median = secondValue > thirdValue ? secondValue : thirdValue;
		} else if (median < secondValue && median < thirdValue) {
			// "median"が他の二値のどちらよりも小さい場合、他の2値の小さいほうを"median"に代入する
			median = secondValue < thirdValue ? secondValue : thirdValue;
		}
		
		// 全ての数を比較し求めた中央値"median"を表示する
		System.out.println("中央値は " + median + " です。");
		
		//standardInputを閉じる
		standardInput.close();
	}
}
