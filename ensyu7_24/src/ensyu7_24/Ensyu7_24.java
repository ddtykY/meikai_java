package ensyu7_24;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_24
 *  概要     :演習問題7-24の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_24 {
	/*
	 * 関数名           :arrayRmvOf
	 * メソッドの説明   :配列aから要素a[idx]を削除した配列を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　削除するもとの配列
	 *                   idx　削除する要素のインデックスを表す値
	 * 返り値           :removeIndexArray　配列aから要素a[idx]を削除した配列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static int[] arrayRmvOf(int[] a, int idx) {
		// 配列aの要素数より1少ない要素数をもつ配列を生成する
		int[] removeIndexArray = new int[a.length-1];
		
		// 配列removeIndexArrayの長さだけ繰り返す
		for(int countNumber = 0; countNumber < removeIndexArray.length; countNumber++) {
			// もし"countNumber"が"idx"より小さければ
			if(countNumber < idx) {
				// "removeIndexArray[countNumber]"に"a[countNumber]"を代入する
				removeIndexArray[countNumber] = a[countNumber];
			// もし"idx"以上なら
			} else {
				// removeIndexArray[countNumber]"に"a[countNumber+1]"を代入する
				removeIndexArray[countNumber] = a[countNumber+1];
			}
		}
		// 配列removeIndexArrayを返却する
		return removeIndexArray;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドarrayRmvOfを実行しその結果を表示する
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
			// "MINIMUM_ELEMENT_NUMBER"未満の値が入力されている間繰り返す
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
		
		//削除する要素のインデックスを表す変数を初期化する
		int removeIndex = 0;
		// 0～integerValueArrayの要素数から一を引いた値が入力されるまで繰り返す
		do {
			// 削除する要素のインデックスの入力を促す
			System.out.print("削除する要素のインデックス : ");
			// "removeIndex"に入力された値を代入する
			removeIndex = standardInput.nextInt();
		// 0未満かintegerValueArrayの要素数以上が入力される間繰り返す
		} while (removeIndex < 0 || removeIndex >= elementNumber);
		
		// メソッドarrayRmvOfを呼び出し、返却された配列を配列removeElementArrayとする
		int[] removeElementArray = arrayRmvOf(integerValueArray, removeIndex);


		// 削除した旨を伝える
		System.out.print("integerValueArray[" + removeIndex + "]を削除しました\n{ ");
		// 配列removeElementArrayのすべての要素を表示する繰り返し
		for(int countNumber = 0; countNumber < removeElementArray.length; countNumber++) {
			// "removeElementArray[countNumber]"を表示する
			System.out.print(removeElementArray[countNumber]);
			// もし"countNumber"が配列removeElementArrayの最後のインデックスでなければ
			if(countNumber != removeElementArray.length-1) {
				// ", "を表示する
				System.out.print(", ");
			}
		}
		// 配列removeElementArrayの表示の終わり
		System.out.println(" }");
	}
}