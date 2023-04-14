package ensyu7_4;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_4
 *  概要     :演習問題7-4の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_4 {
	/*
	 * 関数名           :sumUp
	 * メソッドの説明   :1から受け取った正の整数までの全整数の和を求めて返却する
	 *                   ※この問題では教本で関数名や引数名が指定されている
	 * パラメータの説明 :n　1からどの値までの和を求めるかを表す変数
	 * 返り値           :sumValue　1から"n"までの値の和
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static int sumUp(int n) {
		// 1から"n"までの和を格納する変数をnで初期化する
		int sumValue = n;
		
		// "n"が1以上の場合間繰り返す。ループごとの処理の開始時に"n"をデクリメントする
		while(n-- >= 1) {
			// "sumValue"に"n"を加算する
			sumValue += n;
		}
		// "sumValue"の値を返却する
		return sumValue;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドsumUpを実行し返却された値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 入力された整数値を格納する変数を0で初期化する
		int integerValue = 0;
		
		// オーバーフローしないように制御するための定数
		final int MAXIMUM_VALUE = 146542; 
		
		// 正の整数値が入力されるまで以降の処理を繰り返す
		do {
			// 整数値の入力を促す
			System.out.print("整数値 : ");
			// 入力された値を"integerValue"に代入する
			integerValue = standardInput.nextInt();
		// "integerValue"が0以下（正の整数値でない）の間
		// あるいは "MAXIMUM_VALUE" より大きい間繰り返す（オーバーフローするため）
		} while(integerValue <= 0 || integerValue > MAXIMUM_VALUE);
		
		// 1から入力された値までの和を表示する
		System.out.println("1から" + integerValue + "までの和は " + sumUp(integerValue) + " です。");
	}
}