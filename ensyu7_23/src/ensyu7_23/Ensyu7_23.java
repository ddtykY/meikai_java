package ensyu7_23;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_23
 *  概要     :演習問題7-23の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_23 {
	/*
	 * 関数名           :arraySrchIdx
	 * メソッドの説明   :配列aの要素の中で値が"x"である全要素のインデックスを先頭から順に格納した配列を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　探索する対象の配列
	 *                   x　探索する値
	 * 返り値           :serchIndexArray　配列aの要素で"x"である要素のインデックスをまとめた配列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static int[] arraySrchIdx(int[] a, int x) {
		// "x"と同じ値のインデックスの数を格納する変数
		int serchIndexCount = 0;
		
		// 配列aの長さだけ繰り返す
		for(int countNumber = 0; countNumber < a.length; countNumber++) {
			// もし"a[countNumber]"と"x"が等しければ
			if(a[countNumber] == x) {
				// "serchIndexCount"をインクリメントする
				serchIndexCount++;
			}
		}
		
		// 要素数が"serchIndexCount"の配列を生成する
		int[] serchIndexArray = new int[serchIndexCount];
		// "serchIndexArray"の要素番号を表す変数
		int countSerchIndex = 0;
		
		// 配列aの長さだけ繰り返す
		for(int countNumber = 0; countNumber < a.length; countNumber++) {
			// もし"a[countNumber]"と"x"が等しければ
			if(a[countNumber] == x) {
				// "serchIndexArray[countSerchIndex]"に"countNumber"を代入する
				serchIndexArray[countSerchIndex] = countNumber;
				// "countSerchIndex"をインクリメントする
				countSerchIndex++;
			}
		}
		
		// 配列serchIndexArrayを返却する
		return serchIndexArray;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドarrayCloneを実行しその結果を表示する
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
		
		// 探索する値の入力を促す
		System.out.print("探索する値 : ");
		// 探索する値を表す変数を入力された値で初期化する
		int keyValue = standardInput.nextInt();
		
		// メソッドarraySrchIdxを呼び出し、返却された配列を配列serchIndexArrayとする
		int[] serchIndexArray = arraySrchIdx(integerValueArray, keyValue);
		
		// もし"serchIndexArray"の要素数が0なら
		if(serchIndexArray.length == 0) {
			// 探索値が存在しないことを伝える
			System.out.println(keyValue + " は存在しません");
		// もし要素をもつなら
		} else {
			// 探索した旨を伝える
			System.out.print(keyValue + " は以下のインデックスに存在します\n{ ");
			// 配列serchIndexArrayのすべての要素を表示する繰り返し
			for(int countNumber = 0; countNumber < serchIndexArray.length; countNumber++) {
				// "serchIndexArray[countNumber]"を表示する
				System.out.print(serchIndexArray[countNumber]);
				// もし"countNumber"が配列serchIndexArrayの最後のインデックスでなければ
				if(countNumber != serchIndexArray.length-1) {
					// ", "を表示する
					System.out.print(", ");
				}
			}
			// 配列serchIndexArrayの表示の終わり
			System.out.println(" }");
		}
	}
}