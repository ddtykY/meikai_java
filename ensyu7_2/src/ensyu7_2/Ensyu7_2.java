package ensyu7_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_2
 *  概要     :演習問題7-2の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_2 {
	/*
	 * 関数名           :min
	 * メソッドの説明   :受け取ったint型の三つの引数の中央値を求める
	 *                   ※この問題では教本で関数名や引数名が指定されている
	 * パラメータの説明 :a　比較される一つ目のint型の値
	 *                   b　比較される二つ目のint型の値
	 *                   c　比較される三つ目のint型の値
	 * 返り値           :minimumNumber　三つの整数の最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static int min(int a, int b, int c) {
		// 最小値を格納する変数"medianNumber"を"a"で初期化する
		int minimumNumber = a;
		// もし"minimumNumber"が"b"より大きいなら
		if(minimumNumber > b) {
			// "minimumNumber"に"b"を代入する
			minimumNumber = b;
		}
		// もし"minimumNumber"が"c"より大きいなら
		if(minimumNumber > c) {
			// "minimumNumber"に"c"を代入する
			minimumNumber = c;
		}
		// "minimumNumber"を返却する
		return minimumNumber;
	}
	
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドminを実行する、変数を与えて返ってきた値を最小値として表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 一つ目の整数値の入力を促す
		System.out.print("firstIntegerValue  : ");
		// int型の変数"firstIntegerValue"を入力された値で初期化する
		int firstIntegerValue = standardInput.nextInt();
		
		// 二つ目の整数値の入力を促す
		System.out.print("secondIntegerValue : ");
		// int型の変数"secondIntegerValue"を入力された値で初期化する
		int secondIntegerValue = standardInput.nextInt();
		
		// 三つ目の整数値の入力を促す
		System.out.print("thirdIntegerValue  : ");
		// int型の変数"thirdIntegerValue"を入力された値で初期化する
		int thirdIntegerValue = standardInput.nextInt();
		
		// メソッドminに入力された三つの整数を与え返却された値を表示する
		System.out.println("最小値は " + min(firstIntegerValue,secondIntegerValue,thirdIntegerValue) + " です。");
		
	}
}

