package ensyu7_20;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_20
 *  概要     :演習問題7-20の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_20 {
	/*
	 * 関数名           :aryIns
	 * メソッドの説明   :配列aの要素"a[idx]"に"x"を挿入する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　要素を挿入される配列
	 *                   idx　挿入する要素の番号
	 *                   x　挿入する値
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static void aryIns(int[] a, int idx, int x) {
		// for文の制御に使う"countNumber"を"idx"で初期化し配列aの長さから2引いた値になるまで繰り返す
		for(int countNumber = a.length-2; countNumber >= idx; countNumber--) {
			// "a[countNumber+1]"を前の要素に代入する
			a[countNumber+1] = a[countNumber];
		}
		// "a[idx]"に"x"を代入する
		a[idx] = x;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドaryInsを実行し結果にその結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
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
		
		// 改行文字の出力
		System.out.println();
		
		// 挿入する要素の番号を格納する変数を0で初期化する
		int insertElementNumber = 0;
		// 0～要素数から1引いた値が入力されるまで繰り返す
		do {
			// 削除する要素を問う
			System.out.print("挿入する要素の番号 : ");
			// "insertElementNumber"に入力された値を代入する
			insertElementNumber = standardInput.nextInt();
			// 0～"elementNumber-1"以外の値が入力されている間繰り返す
		} while (insertElementNumber < 0 || insertElementNumber > elementNumber-1);
		
		// 改行文字の出力
		System.out.println();
		
		//挿入する値の入力を促す
		System.out.print("挿入する値 : ");
		// 挿入する値を示す変数を入力された値で初期化する
		int insertValue = standardInput.nextInt();
		
		// メソッドaryInsを呼び出す
		aryIns(integerValueArray, insertElementNumber, insertValue);

		// 改行文字の出力
		System.out.println();

		// すべての要素を表示する繰り返し
		for(int countNumber = 0; countNumber < elementNumber; countNumber++) {
			System.out.println("integerValueArray[" + countNumber + "] = " + integerValueArray[countNumber]);
		}
	}
}