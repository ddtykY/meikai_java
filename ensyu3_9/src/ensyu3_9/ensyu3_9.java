package ensyu3_9;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_9
* 概要    :演習3-9の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_9 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :二つの実数値を読み込んで大きいほうの値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 実数値"firstValue"の入力を促す
		System.out.print("実数値firstValue : ");
		// double型の変数"firstValue"に入力された実数値値を代入する
		double firstValue = standardInput.nextDouble();
		
		// 実数値"secondValue"の入力を促す
		System.out.print("実数値secondValue : ");
		// double型の変数"secondValue"に入力された実数値を代入する
		double secondValue = standardInput.nextDouble();
		
		// 条件演算子を用いて大きいほうの値を表示する
		System.out.println("大きい方の値は" + (firstValue > secondValue ? firstValue : secondValue) + "です。");
		
		//standardInputを閉じる
		standardInput.close();
	}
}
