package ensyu6_4;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_4
 *  概要     :演習問題6-4の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_4 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :配列の全要素に乱数を代入して縦向きの棒グラフを表示する(List6-5の改変)
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
		
		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数: ");
			// 要素数を表すint型の変数"elementNumber"に入力された値を代入する
			elementNumber = standardInput.nextInt();
		// "elementNumber"が0以下(正の整数ではない)なら繰り返す
		} while (elementNumber <= 0);
		
		// "elementNumber"の値だけ要素数を持つint型の配列を生成
		int[] barGraph = new int[elementNumber];
		
		// "barGraph"に格納されている中の最大値を格納する変数を0で初期化する
		int maximumNumber = 0;
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、barGraphの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// 配列"barGraph"の各要素にそれぞれ1～10のランダムな値を代入する
			barGraph[indexArray] = randomNumber.nextInt(10) + 1;
			// もし最大値"maximumNumber"が新たに生成された乱数より小さければ
			if (maximumNumber < barGraph[indexArray]) {
				// "maximumNumber"に生成された乱数を代入する
				maximumNumber = barGraph[indexArray];
			}
		}
		
		// for文をint型の変数"countNumber"で制御しこれを最大値"maximumNumber"で初期化、以下の処理を10回繰り返す
		for (int countNumber = maximumNumber; countNumber > 0; countNumber--) {
			// for文をint型の変数"indexArray"で制御し、barGraphの要素数分繰り返す
			// "barGraph[0]"から順にcountNumber以上の値が格納されているかを確認し*かスペースを表示する
			for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
				// "barGraph[indexArray]"の値が"countNumber"以上なら
				if(barGraph[indexArray] >= countNumber) {
					// *を表示する
					System.out.print("* ");
				// "barGraph[indexArray]"の値が"countNumber"未満なら
				} else {
					// スペースを表示する
					System.out.print("  ");
				}
			}
			// 1行すべての表示を終えた後、改行する
			System.out.println();
		}
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、barGraphの要素数から1を引いた分繰り返す
		for (int indexArray = 0; indexArray < elementNumber-1; indexArray++) {
			// 列番号と*の表示を区切るために-を表示する
			System.out.print("--");
		}
		// 最後の-を表示し、ともに改行を行う
		System.out.println("- ");
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、barGraphの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// 最下段にインデックスを10で割った余剰を表示する
			System.out.print(indexArray % 10 + " ");
		}	
	}
}