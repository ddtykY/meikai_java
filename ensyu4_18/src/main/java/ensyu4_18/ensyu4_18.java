package ensyu4_18;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_18
 *  概要     :演習問題4-18の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_18 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :1から入力された値までの整数値の2乗値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

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
		
		// 1から入力された整数値までなのでfor文の制御に利用する"countNumber"を1で初期化し
		// 入力された整数値"integerValue"回処理を繰り返す
		for(int countNumber = 1; countNumber <= integerValue; countNumber++) {
			// countNumberの2乗を表示する
			System.out.println(countNumber + "の2乗は" + countNumber*countNumber);
		}
	}
}