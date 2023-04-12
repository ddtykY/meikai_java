package ensyu6_11;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_11
 *  概要     :演習問題6-11の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_11 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :要素型がint型である配列を作り全要素を1～10の乱数で埋め尽くす
	 *                   異なる要素が同じ値を持つことがないようにする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.12
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成
		Random randomNumber = new Random();
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// 要素数を表す変数を0で初期化
		int elementNumber = 0;
		// 要素数を入力させる処理を10以下の正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数(10以下): ");
			// 要素数を表すint型の変数"elementNumber"に入力された値を代入する
			elementNumber = standardInput.nextInt();
		// "elementNumber"が0以下(正の整数ではない)または10より大きいなら繰り返す
		} while (elementNumber <= 0 || elementNumber > 10);
		
		// 要素数が"elementNumber"であるint型の配列を生成
		int[] integerValueArray = new int[elementNumber];
		
		// for文をラベル付けする
		Outer : 
			// for文をint型の変数"firstIndexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
			for (int firstIndexArray = 0; firstIndexArray < elementNumber; firstIndexArray++) {
				// integerValueArray[indexArray]に1～10の乱数を代入する
				integerValueArray[firstIndexArray] = randomNumber.nextInt(10) + 1;
				
				// for文をint型の変数"secondIndexArray"で制御し、これを0で初期化、firstIndexArray分繰り返す
				for (int secondIndexArray = 0; secondIndexArray < firstIndexArray; secondIndexArray++) {
					//integerValueArray[firstIndexArray]の値がintegerValueArray[secondIndexArray]の値と同じなら
					if(integerValueArray[firstIndexArray] == integerValueArray[secondIndexArray]) {
						// "indexArray"をデクリメントする
						firstIndexArray--;
						// Outerのラベルの着いたfor文の以降をスキップする
						continue Outer;
					}
				}
				// integerValueArray[indexArray]を表示する
				System.out.println("integerValueArray[" + firstIndexArray + "] = " + integerValueArray[firstIndexArray]);
			}
	}
}