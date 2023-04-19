package ensyu7_30;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_30
 *  概要     :演習問題7-30の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.19
 */
public class Ensyu7_30 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名           :min
	 * メソッドの説明   :二つの値の最小値を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :a　一つ目の比較対象になる値
	 *                   b　二つ目の比較対象になる値
	 * 返り値           :a,bの小さい方の値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int min(int a, int b) {
		// "a"と"b"の小さいほうを返却する
		return a < b ? a : b;
	}
	
	/*
	 * 関数名           :min
	 * メソッドの説明   :三つの値の最小値を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :a　一つ目の比較対象になる値
	 *                   b　二つ目の比較対象になる値
	 *                   c　三つ目の比較対象になる値
	 * 返り値           :minimumValue　三つの値の最小値を表す
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int min(int a, int b, int c) {
		// 最小値を格納する変数を"a"で初期化する
		int minimumValue = a;
		
		// "minimumValue"と"b"の小さいほうを"minimumValue"とする
		minimumValue = minimumValue < b ? minimumValue : b;
		// "minimumValue"と"c"の小さいほうを"minimumValue"とする
		minimumValue = minimumValue < c ? minimumValue : c;
		
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	/*
	 * 関数名           :min
	 * メソッドの説明   :配列aの要素の最小値を求める
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　最小値を求める配列
	 * 返り値           :minimumValue　配列aの最小値を表す変数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int min(int[] a) {
		// 最小値を表す変数を"a[0]"で初期化する
		int minimumValue = a[0];
		
		// 1から配列aの要素数まで繰り返す
		for(int countNumber = 1; countNumber < a.length; countNumber++) {
			// "minimumValue"と"a[countNumber]"の小さいほうを"minimumValue"とする
			minimumValue = minimumValue < a[countNumber] ? minimumValue : a[countNumber];
		}
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :多重定義されたメソッドminを実行しその結果をそれぞれ表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	public static void main(String[] args) {
		// 一つ目の整数値の入力を促す
		System.out.print("firstIntegerValue  : ");
		// int型の変数を入力された値で初期化する
		int firstIntegerValue = standardInput.nextInt();
		
		// 二つ目の整数値の入力を促す
		System.out.print("secondIntegerValue : ");
		// int型の変数を入力された値で初期化する
		int secondIntegerValue = standardInput.nextInt();
		
		// 三つ目の整数値の入力を促す
		System.out.print("thirdIntegerValue  : ");
		// int型の変数を入力された値で初期化する
		int thirdIntegerValue = standardInput.nextInt();
		
		// 二つの最小値を表示することを示唆する
		System.out.println("\nfirstIntegerValueとsecondIntegerValueの最小値は");
		// メソッドminを呼び出し"firstIntegerValue"と"secondIntegerValue"の最小値を表示する
		System.out.println(min(firstIntegerValue, secondIntegerValue) + " です");
		
		// 三つの最小値を表示することを示唆する
		System.out.println("\n三つの最小値は");
		// メソッドminを呼び出し"firstIntegerValue"と"secondIntegerValue"と"thirdIntegerValue"の最小値を表示する
		System.out.println(min(firstIntegerValue, secondIntegerValue, thirdIntegerValue) + " です\n\n");
		
		
		// 配列の要素数を表す変数を0で初期化する
		int elementValue = 0;
		// 正の整数値が入力されるまで入力させる処理を繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数 : ");
			// 入力された値を"elementValue"に代入する
			elementValue = standardInput.nextInt();
		// 0以下の値が入力されている間繰り返す
		} while (elementValue <= 0);
		
		// "elementValue"だけ要素数を持つ配列を生成する
		int[] integerValueArray = new int[elementValue];
		
		// "integeValueArray"の要素数だけ繰り返す
		for(int countNumber = 0; countNumber < elementValue; countNumber++) {
			// 要素の入力を促す
			System.out.print("integerValueArray[" + countNumber + "] = ");
			// "integerValueArray[countNumber]"に入力された値を代入する
			integerValueArray[countNumber] = standardInput.nextInt();
		}
		// 配列の最小値を表示することを示唆する
		System.out.println("\nこの配列の最小値は");
		// メソッドminを呼び出し配列の用をの最小値を求める
		System.out.println(min(integerValueArray) + " です");
	}
}
