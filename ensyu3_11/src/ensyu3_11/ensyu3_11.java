package ensyu3_11;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_11
* 概要    :演習3-11の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_11 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :二つの整数値を読み込んでそれらの差の大きさによってメッセージを表示する
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
		
		// 条件演算子を用いて二つの数値の差を求めてint型の変数"differenceValue"に代入する
		int differenceValue = firstValue > secondValue ? firstValue - secondValue : secondValue - firstValue;
		
		if (differenceValue <= 10) { // 二値の差が10以下なら
			// 入力された二つの値の差が10以下であえる旨を表示する
			System.out.println("それらの差は10以下です。");
		} else { // 二値の差が10以下でないなら
			// 入力された二つの値の差が11以上である旨を表示する
			System.out.println("それらの差は11以上です。");
		}
		
		//standardInputを閉じる
		standardInput.close();
	}
}
