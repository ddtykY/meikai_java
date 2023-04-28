package ensyu15_4;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu15_4
 *  概要     :演習問題15-4の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Ensyu15_4 {

	/*
	 * 関数名           :printDouble
	 * メソッドの説明   :実数値xを小数点以下p桁、少なくともw桁で表示する
	 * パラメータの説明 :x　表示する実数値
	 *                  :p　表示する小数点以下の桁数
	 *                  :w　表示する最低の桁数
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.27
	 */
	static void printDouble(double x, int p, int w) {
		// %"w"."p"fの形を作り"x"を表示する
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドprintDoubleの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.27
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 実数値の入力を促す
		System.out.print("実数値 : ");
		// 入力された値でdouble型の変数を初期化する
		double doubleValue = standardInput.nextDouble();
		// 小数点以下の桁数の入力を促す
		System.out.print("小数点以下の桁数 : ");
		// 入力された値でint型の変数を初期化する
		int decimalPoint = standardInput.nextInt();
		// 最小値の桁数の入力を促す
		System.out.print("最小の桁数 : ");
		// 入力された値でint型の変数を初期化する
		int minimumDigit = standardInput.nextInt();
		
		// メソッドprintDoubleを呼び出す
		printDouble(doubleValue, decimalPoint, minimumDigit);
	}

}
