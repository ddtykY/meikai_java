package ensyu6_8;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_8
 *  概要     :演習問題6-8の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_8 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.12
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// 要素数を表す変数を0で初期化
		int elementNumber = 0;

		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数: ");
			// 要素数を表すint型の変数"elementNumber"に入力された値を代入する
			elementNumber = standardInput.nextInt();
		// "elementNumber"が0以下(正の整数ではない)なら繰り返す
		} while (elementNumber <= 0);

		// "elementNumber"の値だけ要素数を持つdouble型の配列を生成
		double[] doubleValueArray = new double[elementNumber];
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、doubleValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// 値の入力を促す
			System.out.print("doubleValueArray[" + indexArray + "] = ");
			// "doubleValueArray[indexArray]"に入力された値を代入する
			doubleValueArray[indexArray] = standardInput.nextDouble();
		}
		
		// 合計を格納する変数を0で初期化する
		double sumValue = 0;
		
		// 拡張for文を用いて合計を求める
		for(double doubleValue : doubleValueArray) {
			// 合計を表す変数"sumValue"に"doubleValue"を加算する
			sumValue += doubleValue;
		}
		
		// 合計を表示する
		System.out.println("\n合計は " + sumValue + " です。");
		// 平均を表示する
		System.out.println("平均は " + sumValue / elementNumber + " です。");
	}
}