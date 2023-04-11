package ensyu4_15;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_15
 *  概要     :演習問題4-15の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_15 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :身長と標準体重の対応表を表示するプログラム
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		int startHeight;     // 身長の範囲の開始値を表す変数
		int endHeight;       // 身長の範囲の終了値を表す変数
		int incrementHeight; //表の身長の増分を表す変数

		// 身長の開始値として正の整数値が入力されるまで繰り返すdo文
		do {
			// 身長の範囲の開始値の入力を促す
			System.out.print("何cmから : ");
			// 入力された値をint型の変数"startHeight"に代入する
			startHeight = standardInput.nextInt();
		  // 正の整数値が入力されるまで繰り返す
		} while (startHeight <= 0);

		// 身長の終了値として正の整数値が入力されるまで繰り返すdo文
		do {
			// 身長の範囲の終了値の入力を促す
			System.out.print("何cmまで : ");
			// 入力された値をint型の変数"endHeight"に代入する
			endHeight = standardInput.nextInt();
		  // 正の整数値が入力されるまで繰り返す
		} while (endHeight <= 0);

		// 身長の増分として正の整数値が入力されるまで繰り返すdo文
		do {
			// 表の身長の増分の入力を促す
			System.out.print("何cmごと : ");
			// 入力された値をint型の変数"incrementHeight"に代入する
			incrementHeight = standardInput.nextInt();
		  // 正の整数値が入力されるまで繰り返す
		} while (incrementHeight <= 0);
		
		// 表の各列のタイトルを表示する
		System.out.println("身長  標準体重");
		
		// 表の各行に対応する身長として"heightValue"を身長の開始値"startHeight"の値で初期化する
		// "heightValue"が身長の終了値"endHeight"以下の間繰り返す
		// 表が一行進むごとに"heightValue"を身長の増分"incrementHeight"だけ増やす
		for(int heightValue = startHeight; heightValue <= endHeight; heightValue += incrementHeight) {
			// 現在の身長を表す"heightValue"と標準体重(身長-100)*0.9を表示する
			System.out.println(heightValue + "   " + (heightValue - 100) * 0.9);
		}
	}
}
