package ensyu4_14;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_14
 *  概要     :演習問題4-14の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_14 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :1から入力された整数値までの和を式を含めて求める(演習問題4-13の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// 1から入力された値までの和を求める旨を表示する
		System.out.println("1から\"integerValue\"までの和を求めます");

		// 入力された値を格納する変数
		int integerValue;

		// 整数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 正の整数値の入力を促す
			System.out.print("正の整数値integerValue : ");
			// 入力された値をint型の変数"integerValue"に代入する
			integerValue = standardInput.nextInt();
		// "integerValue"が0以下（正の整数値ではない）間繰り返す
		} while (integerValue <= 0);
		
		// 合計を格納する変数"sumValue"を0で初期化する
		int sumValue = 0;

		// for文を制御する変数"countNumber"を0で初期化し"integerValue"になるまでインクリメントする
		for(int countNumber = 1; countNumber <= integerValue; countNumber++) {
			// 1から入力された値まで増えていく"countNumber"を"sumValue"に加算していく
			sumValue += countNumber;
			// 式を表示するために"countNumber"の値を表示する
			System.out.print(countNumber);
			// "countNumber"が"integerValue"と等しくない場合
			if (countNumber != integerValue) {
				// +を表示する
				System.out.print(" + ");
			}
		}

		// 1から入力された値までの和である"sumValue"の値を表示する
		System.out.println(" = " + sumValue);

		// 改行文字を出力する
		System.out.println(); 
	}
}
