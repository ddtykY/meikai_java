package ensyu7_26;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_26
 *  概要     :演習問題7-26の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_26 {
	/*
	 * 関数名           :arrayInsOf
	 * メソッドの説明   :配列aから要素"a[idx]"に"x"をした配列を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　挿入するもとの配列
	 *                   idx　挿入するインデックスを表す値
	 * 返り値           :insertIndexArray　配列aの要素"a[idx]"に"x"をした配列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static int[] arrayInsOf(int[] a, int idx, int x) {
		// 配列aの要素数より1つ多い要素数をもつ配列を生成する
		int[] insertIndexArray = new int[a.length+1];
		
		// 配列insertIndexArrayの長さだけ繰り返す
		for(int countNumber = 0; countNumber < insertIndexArray.length; countNumber++) {
			// もし"countNumber"が"idx"より小さければ
			if(countNumber < idx) {
				// "insertIndexArray[countNumber]"に"a[countNumber]"を代入する
				insertIndexArray[countNumber] = a[countNumber];
			// もし"idx"なら
			} else if (countNumber == idx) {
				// "insertIndexArray[countNumber]"に"x"を代入する
				insertIndexArray[countNumber] = x;
			// もし"idx"より大きければ	
			} else {
				// insertIndexArray[countNumber]"に"a[countNumber-1]"を代入する
				insertIndexArray[countNumber] = a[countNumber-1];
			}
		}
		// 配列insertIndexArrayを返却する
		return insertIndexArray;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドarrayInsOfを実行しその結果を表示する
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
		
		// 挿入する要素のインデックスを表す変数を初期化する
		int insertIndex = 0;
		// 0～integerValueArrayの要素数から1を引いた値が入力されるまで繰り返す
		do {
			// 挿入する最初の要素のインデックスの入力を促す
			System.out.print("挿入する要素のインデックス : ");
			// "insertIndex"に入力された値を代入する
			insertIndex = standardInput.nextInt();
		// 0未満かintegerValueArrayの要素数以上が入力される間繰り返す
		} while (insertIndex < 0 || insertIndex >= elementNumber);
		
		// 改行文字の出力
		System.out.println();
		
		// 挿入する値の入力を促す
		System.out.print("挿入する値 : ");
		// 挿入する値を表す変数を入力された値で初期化する
		int insertValue = standardInput.nextInt();
		
		// メソッドarrayRmvOfを呼び出し、返却された配列を配列insertElementArrayとする
		int[] insertElementArray = arrayInsOf(integerValueArray, insertIndex, insertValue);
		
		// 改行文字の出力
		System.out.println();
		
		// 挿入した旨を伝える
		System.out.print("integerValueArray[" + insertIndex + "]に " + insertValue + " を挿入しました\n{ ");
		// 配列insertElementArrayのすべての要素を表示する繰り返し
		for(int countNumber = 0; countNumber < insertElementArray.length; countNumber++) {
			// "insertElementArray[countNumber]"を表示する
			System.out.print(insertElementArray[countNumber]);
			// もし"countNumber"が配列insertElementArrayの最後のインデックスでなければ
			if(countNumber != insertElementArray.length-1) {
				// ", "を表示する
				System.out.print(", ");
			}
		}
		// 配列insertElementArrayの表示の終わり
		System.out.println(" }");
	}
}