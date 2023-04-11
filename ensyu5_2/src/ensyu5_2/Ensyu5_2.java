package ensyu5_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu5_2
 *  概要     :演習問題5-2の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class Ensyu5_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// これから入力するのがfloat型、double型の変数であることを伝える
		System.out.println("xはfloat型でyはdouble型です");

		// float型の変数の入力を促す
		System.out.print("x : ");
		// float型の変数"firstNumber"をxとして入力された値で初期化する
		float firstNumber = standardInput.nextFloat();

		// double型の変数の入力を促す
		System.out.print("y : ");
		// double型の変数"secondNumber"をyとして入力された値で初期化する
		double secondNumber = standardInput.nextDouble();

		// "firstNumber"を表示する
		System.out.println("x = " + firstNumber);
		// "secondNumber"を表示する
		System.out.println("y = " + secondNumber);
	}
}