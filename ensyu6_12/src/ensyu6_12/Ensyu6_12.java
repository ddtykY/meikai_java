package ensyu6_12;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_12
 *  概要     :演習問題6-12の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_12 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :配列の要素の並びをシャッフルする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.12
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成
		Random randomNumber = new Random();
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

		// 要素数が"elementNumber"であるint型の配列を生成
		int[] integerValueArray = new int[elementNumber];

		// for文をint型の変数"indexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// integerValueArray[indexArray]に1～10の乱数を代入する
			integerValueArray[indexArray] = randomNumber.nextInt(10) + 1;

			// integerValueArray[indexArray]を表示する
			System.out.println("integerValueArray[" + indexArray + "] = " + integerValueArray[indexArray]);
		}
		
		// 要素の並びをシャッフルした旨を表示する
		System.out.println("\n配列の要素の並びをシャッフルしました。\n");
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// int型の変数"randomIndex"を要素数-1の乱数で初期化する
			int randomIndex = randomNumber.nextInt(elementNumber);
			// 一時的に値を保存するための変数"temporaryValue"をintegerValueArray[indexArray]で初期化する
			int temporaryValue = integerValueArray[indexArray];
			// integerValueArray[indexArray]にintegerValueArray[randomIndex]を代入する
			integerValueArray[indexArray] = integerValueArray[randomIndex];
			// integerValueArray[randomIndex]に保存されていた"temporaryValue"を代入する
			integerValueArray[randomIndex] = temporaryValue;
		}
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// integerValueArray[indexArray]を表示する
			System.out.println("integerValueArray[" + indexArray + "] = " + integerValueArray[indexArray]);
		}
	}
}