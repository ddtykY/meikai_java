package ensyu10_3;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu10_3
 *  概要     :演習問題10-3の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class ensyu10_3 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成したMinMaxクラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.24
	 */
	public static void main(String[] args) {
		// 一つ目の変数の入力を促す
		System.out.print("一つ目の数 : ");
		// 一つ目の変数を入力された値で初期化する
		int firstValue = standardInput.nextInt();
		// 二つ目の変数の入力を促す
		System.out.print("二つ目の数 : ");
		// 二つ目の変数を入力された値で初期化する
		int secondValue = standardInput.nextInt();
		// 三つ目の変数の入力を促す
		System.out.print("三つ目の数 : ");
		// 三つ目の変数を入力された値で初期化する
		int thirdValue = standardInput.nextInt();
		
		
		// 一つ目と二つ目の最小値を表示する
		System.out.println("\n一つ目と二つ目の最小値は " + MinMax.minimumTwo(firstValue, secondValue) + " です");
		// 最小値を表示する
		System.out.println("すべての数の最小値は " + MinMax.minimumThree(firstValue, secondValue, thirdValue) + " です");
		
		// 二つ目と三つ目の最大値を表示する
		System.out.println("\n二つ目と三つ目の最大値は " + MinMax.maximumTwo(secondValue, thirdValue) + " です");
		// 最大値を表示する
		System.out.println("すべての数の最大値は " + MinMax.maximumThree(firstValue, secondValue, thirdValue) + " です\n");
		
		
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

		// "elementNumber"だけ要素数を持つ配列を生成する
		int[] integerValueArray = new int[elementValue];

		// "integeValueArray"の要素数だけ繰り返す
		for(int countNumber = 0; countNumber < elementValue; countNumber++) {
			// 要素の入力を促す
			System.out.print("integerValueArray[" + countNumber + "] = ");
			// "integerValueArray[countNumber]"に入力された値を代入する
			integerValueArray[countNumber] = standardInput.nextInt();
		}
		// 配列の最小値を表示する
		System.out.println("\nこの配列の最小値は " + MinMax.minimumArray(integerValueArray) + " です");
		// 配列の最大値を表示する
		System.out.println("この配列の最大値は " + MinMax.maximumArray(integerValueArray) + " です");
	
	}
}
