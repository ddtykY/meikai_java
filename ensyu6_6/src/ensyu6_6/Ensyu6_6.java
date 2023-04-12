package ensyu6_6;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_6
 *  概要     :演習問題6-6の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_6 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :テストの点数の合計点・平均点・最高点・最低点を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.12
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 人数を表す変数を0で初期化
		int peopleNumber = 0;
		
		// 人数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 人数の入力を促す
			System.out.print("人数: ");
			// 要素数を表すint型の変数"peopleNumber"に入力された値を代入する
			peopleNumber = standardInput.nextInt();
		// "peopleNumber"が0以下(正の整数ではない)なら繰り返す
		} while (peopleNumber <= 0);
		
		// "peopleNumber"の値だけ要素数を持つint型の配列を生成
		int[] scoreValue = new int[peopleNumber];
		
		// 人数分の点数を入力させる旨を表示する
		System.out.println(peopleNumber + "人の点数を入力せよ");
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、scoreValueの要素数分繰り返す
		for (int indexArray = 0; indexArray < peopleNumber; indexArray++) {
			// 点数を入力させる処理を0以上値が入力されるまで繰り返す
			do {
				// indexArray人目の点数の入力を促す
				System.out.print((indexArray + 1) + "番の点数 : ");
				// scoreValueのindexArray番目の要素に入力された値を代入する
				scoreValue[indexArray] = standardInput.nextInt();
				// scoreValue[indexValue]が負の値なら
				if (scoreValue[indexArray] < 0) {
					// 0以上の値を入力するよう表示する
					System.out.println("0以上の値を入力してください");
				}
			// scoreValue[indexValue]が負の値なら繰り返す
			} while (scoreValue[indexArray] < 0);
		}
		
		// 合計点を格納する変数をscoreValue[0]で初期化する
		int sumValue = scoreValue[0];
		
		// 最高点を格納する変数をscoreValue[0]で初期化する
		int maximumValue = scoreValue[0];
		
		// 最低点を格納する変数をscoreValue[0]で初期化する
		int minimumValue = scoreValue[0];
		
		// for文をint型の変数"indexArray"で制御し、これを1で初期化、scoreValueの要素数から1引いた分繰り返す
		for (int indexArray = 1; indexArray < peopleNumber; indexArray++) {
			// 合計点"sumValue"に"scoreValue[indexArray]"を加算する
			sumValue += scoreValue[indexArray];
			
			// もし"maximumValue"が"scoreValue[indexArray]"より小さければ
			if (maximumValue < scoreValue[indexArray]) {
				// "maximumValue"に"scoreValue[indexArray]"を代入する
				maximumValue = scoreValue[indexArray];
			// もし"minimumValue"が"scoreValue[indexArray]"より大きければ
			} else if (minimumValue > scoreValue[indexArray]) {
				// "minimumValue"に"scoreValue[indexArray]"を代入する
				minimumValue = scoreValue[indexArray];
			}
		}
		
		// 合計点を表示する
		System.out.println("\n合計点は " + sumValue + " です。");
		// 平均点を表示する
		System.out.println("平均点は " + (double)sumValue / peopleNumber + " です。");
		// 最高点を表示する
		System.out.println("最高点は " + maximumValue + " です。");
		// 最低点を表示する
		System.out.println("最低点は " + minimumValue + " です。");
		
	}
}