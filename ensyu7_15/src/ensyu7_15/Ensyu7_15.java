package ensyu7_15;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_15
 *  概要     :演習問題7-15の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.17
 */
public class Ensyu7_15 {
	/*
	 * 関数名           :sumOf
	 * メソッドの説明   :配列aの全要素の合計を求める
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　合計を求められる配列
	 * 返り値           :sumValue　配列aの合計を示す値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int sumOf(int[] a) {
		// 合計を表す変数"sumValue"を0で初期化する
		int sumValue = 0;
		// 配列aの要素数だけ以下の処理を繰り返す
		for(int countNumber = 0; countNumber < a.length; countNumber++) {
			// "sumValue"に"a[countNumber]"を加算する
			sumValue += a[countNumber];
		}
		// "sumValue"を返却する
		return sumValue;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドsumOfを実行し結果を表示する
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
		
		// 合計を表示する
		System.out.println("その配列の全要素の合計は " + sumOf(integerValueArray) + " です。");
	}
}
