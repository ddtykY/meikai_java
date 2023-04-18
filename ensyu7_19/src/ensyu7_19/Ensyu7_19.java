package ensyu7_19;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_19
 *  概要     :演習問題7-19の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_19 {
	/*
	 * 関数名           :aryRmvN
	 * メソッドの説明   :配列aからa[idx]を先頭とする"n"個の要素を削除する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　要素を削除される配列
	 *                   idx　削除する要素の1番早い番号
	 *                   n　削除する要素の個数
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static void aryRmvN(int[] a, int idx, int n) {
		// for文の制御に使う"countNumber"を0で初期化し配列aの長さ-1になるまで繰り返す
		for(int countNumber = idx; countNumber < a.length-1; countNumber++) {
			// もし"idx + countNumber + n"が配列aの長さと等しいなら
			if(countNumber + n == a.length){
				// 繰り返しを抜ける
				break;
			}
			// "a[countNumber]"に"n"個次の要素の値を代入する
			a[countNumber] = a[countNumber + n];
		}
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドaryRmvNを実行し結果にその結果を表示する
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
		
		// 要素数の最低数
		// ここでは最低1つ削除するために2としている
		final int MINIMUM_ELEMENT_NUMBER = 2;

		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数(" + MINIMUM_ELEMENT_NUMBER + "～) : ");
			// 入力された値を"elementNumber"に代入
			elementNumber = standardInput.nextInt();
			// "MINIMUM_ELEMENT_NUMBER"より小さい値が入力されている間繰り返す
		} while (elementNumber < MINIMUM_ELEMENT_NUMBER);

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
		
		// 削除する要素の番号を格納する変数を0で初期化する
		int removeElementNumber = 0;
		// 0以上で要素数から1引いた値より小さい値が入力されるまで繰り返す
		do {
			// 削除する要素を問う
			System.out.print("削除する要素の最初の番号 : ");
			// "removeElementNumber"に入力された値を代入する
			removeElementNumber = standardInput.nextInt();
			// 0以上で"elementNumber-1"より大きい値が入力されている間繰り返す
		} while (removeElementNumber < 0 || removeElementNumber >= elementNumber-1);
		
		// 改行文字の出力
		System.out.println();
		
		// 削除する要素の個数を格納する変数を0で初期化する
		int removeElementQuantity = 0;
		// 0～要素数と削除する要素の先頭の番号の差が入力されるまで繰り返す
		do {
			// 削除する要素を問う
			System.out.print("削除する要素の個数 : ");
			// "removeElementQuantity"に入力された値を代入する
			removeElementQuantity = standardInput.nextInt();
			// 1以上で"elementNumber - removeElementNumber"より大きい値が入力されている間繰り返す
		} while (removeElementQuantity < 1 || removeElementQuantity >= elementNumber - removeElementNumber);

		// aryRmvNを呼び出す
		aryRmvN(integerValueArray, removeElementNumber, removeElementQuantity);

		// 改行文字の出力
		System.out.println();

		// すべての要素を表示する繰り返し
		for(int countNumber = 0; countNumber < elementNumber; countNumber++) {
			System.out.println("integerValueArray[" + countNumber + "] = " + integerValueArray[countNumber]);
		}
	}
}