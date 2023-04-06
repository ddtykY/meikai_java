package ensyu3_12;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_12
* 概要    :演習3-12の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_12 {
	/**
	 * 関数名           :main
	 * メソッドの説明   三つの整数値を読み込んで最小値を求めて表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"firstValue"の入力を促す
		System.out.print("整数値firstValue : ");
		// int型の変数"firstValue"に入力された整数値を代入する
		int firstValue = standardInput.nextInt();
		
		// 整数値"secondValue"の入力を促す
		System.out.print("整数値secondValue : ");
		// int型の変数"secondValue"に入力された整数値を代入する
		int secondValue = standardInput.nextInt();
		
		// 整数値"thirdValue"の入力を促す
		System.out.print("整数値thirdValue : ");
		// int型の変数"thirdValue"に入力された整数値を代入する
		int thirdValue = standardInput.nextInt();
		
		// 最小値を格納するためのint型の変数"minimum"を作り、
		// そこにまず一つ目の整数値の"firstValue"を代入し、この後ほかの整数値と比較していく
		int minimum = firstValue;
		
		// 二つ目の整数値"secondValue"と"minimum"を比較し小さいほうを"minimum"とする
		if (minimum > secondValue) minimum = secondValue;
		// 三つ目の整数値"thirdValue"と"minimum"を比較し小さいいほうを"minimum"とする
		if (minimum > thirdValue) minimum = thirdValue;
		
		// 全ての数を比較し求めた最小値"minimum"を表示する
		System.out.println("最小値は " + minimum + " です。");
		
		//standardInputを閉じる
		standardInput.close();
	}
}
