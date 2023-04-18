package ensyu7_22;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_22
 *  概要     :演習問題7-22の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_22 {
	/*
	 * 関数名           :arrayClone
	 * メソッドの説明   :配列aと同じ配列を生成して返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　コピーされる配列
	 * 返り値           :配列integerValueArray　配列aをコピーした配列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static int[] arrayClone(int[] a) {
		// 配列aと同じ要素数を持つ配列を生成する
		int[] integerValueArray = new int[a.length];
		
		// 配列aの長さだけ繰り返す
		for(int countNumber = 0; countNumber < a.length; countNumber++) {
			// "integerValueArray[countNumber]"に"a[countNumber]"を代入する
			integerValueArray[countNumber] = a[countNumber];
		}
		
		// 配列integerValueArrayを返却する
		return integerValueArray;
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
		
		// 同じ配列を生成したことを伝える
		System.out.println("\n同じ配列を生成しました\n");
		
		// メソッドarrayCloneを呼び出し、返却された配列を配列cloneArrayとする
		int[] cloneArray = arrayClone(integerValueArray);
		
		// 配列cloneArrayのすべての要素を表示する繰り返し
		for(int countNumber = 0; countNumber < cloneArray.length; countNumber++) {
			// "cloneArray[countNumber]"を表示する
			System.out.println("cloneArray[" + countNumber + "] = " + cloneArray[countNumber]);
		}
	}
}