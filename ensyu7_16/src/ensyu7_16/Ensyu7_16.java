package ensyu7_16;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_16
 *  概要     :演習問題7-16の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.17
 */
public class Ensyu7_16 {
	/*
	 * 関数名           :minOf
	 * メソッドの説明   :配列aの要素の最小値を求める
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　最小値を求める配列
	 * 返り値           :minimumValue　配列aの最小値を表す値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int minOf(int[] a) {
		// 最小値を表す変数"minimumValue"を"a[0]"で初期化する
		int minimumValue = a[0];
		// 配列aの要素より1少ない数だけ以下の処理を繰り返す
		for(int countNumber = 1; countNumber < a.length; countNumber++) {
			// もし"minimumValue"が"a[countNumber]"より大きければ
			if(minimumValue > a[countNumber]) {
				// "minimumValue"に"a[countNumber]"を代入する
				minimumValue = a[countNumber];
			}
		}
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドminOfを実行し結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 配列の要素数を表す変数を0で初期化する
		int elementNumber = 0;
		
		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数 : ");
			// 入力された値を"elementNumber"に代入
			elementNumber = standardInput.nextInt();
		// 0以下の値が入力されている間繰り返す
		} while (elementNumber <= 0);
		
		// 要素数が"elementNumber"のint型の配列を生成
		int[] integerValueArray = new int[elementNumber];
		
		// "integerValueArray"の要素数分、要素を入力させる処理を繰り返す
		for(int countNumber = 0; countNumber < elementNumber; countNumber++) {
			// 要素の入力を促す
			System.out.print("integerValueArary[" + countNumber + "] = ");
			// 入力された値をintegerValueArary[countNumber]に代入する
			integerValueArray[countNumber] = standardInput.nextInt();
		}
		
		// 最小値を表示する
		System.out.println("その配列の最小値は " + minOf(integerValueArray) + " です。");
	}
}
