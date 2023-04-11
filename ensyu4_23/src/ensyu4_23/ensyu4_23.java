package ensyu4_23;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_23
 *  概要     :演習問題4-23の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class ensyu4_23 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :入力された段数の数字ピラミッドを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// ピラミッドを表示する旨を知らせる
		System.out.println("数字ピラミッドを表示します");
		
		// 段数を格納する変数
		int stepNumber;
		
		// 段数として正の整数値が入力されるまで繰り返す
		do {
			// 段数の入力を促す
			System.out.print("段数 : ");
			// int型の変数"stepNumber"を入力された値で初期化する
			stepNumber = standardInput.nextInt();
		// "stepNumber"が0以下である場合繰り返す
		} while (stepNumber <= 0);
		
		
		// 行を表しfor文の制御を行うint型の"lineNumber"を0で初期化し入力された段数である"stepNumber"回だけ繰り返す
		for (int lineNumber = 1; lineNumber <= stepNumber; lineNumber++) {
			// *を出力する前に空白を"stepNumber - lineNumber"だけ出力する
			for (int blankNumber = 1; blankNumber <= stepNumber - lineNumber ; blankNumber++) {
				// 空白を表示する
				System.out.print(" ");
			}
			// 行に対応する数だけ繰り返す
			for (int columnNumber = 1; columnNumber <= (lineNumber - 1) * 2 + 1; columnNumber++) {
				// 行番号を10で割ったあまりの数字"lineNumber%10"を表示する
				System.out.print(lineNumber % 10);
			}
			// 1行出力し終えたら1度改行を行う
			System.out.println("");
		}
	}
}
