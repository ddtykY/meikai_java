package ensyu7_18;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_18
 *  概要     :演習問題7-18の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.17
 */
public class Ensyu7_18 {
	/*
	 * 関数名           :aryRmv
	 * メソッドの説明   :配列aからa[idx]を削除する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　要素を削除される配列
	 *                   idx　削除する要素の番号
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static void aryRmv(int[] a, int idx) {
		// for文の制御に使う"countNumber"を"idx"で初期化し配列aの要素数から1引いた値まで繰り返す
		for(int countNumber = idx; countNumber < a.length-1; countNumber++) {
			// "a[countNumber]"に次の要素の値を代入する
			a[countNumber] = a[countNumber + 1];
		}
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドaryRmvを実行しその結果にあったメッセージを表示する
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
		// 0より小さい値が入力されている間繰り返す
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
		
		// 削除する要素の番号を格納する変数を0で初期化する
		int removeElementNumber = 0;
		
		// 改行文字の出力
		System.out.println();
		
		// 0～要素数-2の値が入力されるまで繰り返す
		do {
			// 削除する要素を問う
			System.out.print("削除する要素の番号 : ");
			// "removeElementNumber"に入力された値を代入する
			removeElementNumber = standardInput.nextInt();
		// 0～要素数-2以外の値が入力されている間繰り返す
		} while (removeElementNumber < 0 || removeElementNumber >= elementNumber-1);
		
		// aryRmvを呼び出す
		aryRmv(integerValueArray, removeElementNumber);
		
		// 改行文字の出力
		System.out.println();
		
		// すべての要素を表示する繰り返し
		for(int countNumber = 0; countNumber < elementNumber; countNumber++) {
			System.out.println("integerValueArray[" + countNumber + "] = " + integerValueArray[countNumber]);
		}
	}
}

