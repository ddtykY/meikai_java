package ensyu7_3;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_3
 *  概要     :演習問題7-3の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_3 {
	/*
	 * 関数名           :med
	 * メソッドの説明   :受け取ったint型の三つの引数の中央値を求める
	 *                   ※この問題では教本で関数名や引数名が指定されている
	 * パラメータの説明 :a　比較される一つ目のint型の値
	 *                   b　比較される二つ目のint型の値
	 *                   c　比較される三つ目のint型の値
	 * 返り値           :medianNumber　三つの整数の中央値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static int med(int a, int b, int c) {
		// 最小値を格納する変数"medianNumber"を"a"で初期化する
		int medianNumber = a;
		// "medianNumber"が"b", "c"のどちらよりも大きい場合
		if(medianNumber > b && medianNumber > c) {
			// "b"が"c"より大きい場合
			if(b > c) {
				// "medianNumber"に"b"を代入する
				medianNumber = b;
			// "c"が"b"以上の場合
			} else {
				// "medianNumber"に"c"を代入する
				medianNumber = c;
			}
		// "medianNumber"が"b", "c"のどちらよりも小さい場合
		} else if (medianNumber < b && medianNumber < c) {
			// "b"が"c"より小さい場合
			if(b < c) {
				// "medianNumber"に"b"を代入する
				medianNumber = b;
				// "c"が"b"以上の場合
			} else {
				// "medianNumber"に"c"を代入する
				medianNumber = c;
			}
		}
		// "medianNumber"を返却する
		return medianNumber;
	}
	
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドmedを実行する、変数を与えて返ってきた値を中央値として表示する
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
		
		// メソッドmedに入力された三つの整数を与え返却された値を表示する
		System.out.println("中央値は " + med(firstIntegerValue,secondIntegerValue,thirdIntegerValue) + " です。");
		
	}
}

