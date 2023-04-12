package ensyu6_5;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_5
 *  概要     :演習問題6-5の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_5 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :配列の要素と個々の値を読み込んで各要素を表示する
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
		
		// 入力された値分の要素数を持つ配列を生成
		int[] integerValueArray = new int[elementNumber];
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// integerValueArrayに代入する値の入力を促す
			System.out.print("integerValueArray[" + indexArray + "] = ");
			// "integerValueArray"の"indexArray"番目の要素に入力された値を代入する
			integerValueArray[indexArray] = standardInput.nextInt();
		}
		
		// 各要素の表示の始まり
		System.out.print("integerValueArray = {");
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// "indexArray"番目の値を表示する
			System.out.print(integerValueArray[indexArray]);
			// もし最後の要素("indexArray"が"elementNumber-1")でないなら
			if (indexArray != elementNumber - 1) {
				// 区切りを表示する
				System.out.print(", ");
			}
		}
		// 各要素の表示の終わり
		System.out.println("}");
	}
}