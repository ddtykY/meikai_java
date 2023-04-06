package ensyu3_14;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_14
* 概要    :演習3-14の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_14 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :二つの整数値を読み込んで小さい方、大きい方をそれぞれ表示し
	 *                   等しい場合はメッセージを表示する
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
		
		int minimum; // 小さいほうの値を表す変数
		int maximum; // 大きいほうの値を表す変数
		
		if (firstValue < secondValue) {
			// 1つ目の整数値のほうが小さい場合は小さいほうを表す"minimum"に"firstValue"を代入
			minimum = firstValue;
			// "minimum"同様に大きいほうの"secondValue"を"maximum"に代入
			maximum = secondValue;
		} else {
			// 2つ目の整数値のほうが小さい場合は小さいほうを表す"minimum"に"secondValue"を代入
			minimum = secondValue;
			// "minimum"同様に大きいほうの"firstValue"を"maximum"に代入
			maximum = firstValue;
		}
		
		if (firstValue == secondValue) {
			// 二つの値が同じ場合はその旨を表示する
			System.out.println("二つの値は同じです");
		} else {
			System.out.println("小さいほうの値は" + minimum + "です。");
			System.out.println("大きいほうの値は" + maximum + "です。");
		}
		
		//standardInputを閉じる
		standardInput.close();
	}
}
