package ensyu4_21;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_21
 *  概要     :演習問題4-21の直角が右上側である三角形の表示クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class ensyu4_21_upperRight {
	/*
	 * 関数名           :main
	 * メソッドの説明   :右上が直角である直角三角形を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 右上が直角の三角形を表示する旨を示す
		System.out.println("右上直角の三角形を表示します。");
		
		// 入力された段数を格納する変数
		int stepNumber;
		
		// 段数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 段数の入力を促す
			System.out.print("段数 : ");
			// int型の変数"stepNumber"に入力された値を代入する
			stepNumber = standardInput.nextInt();
		// "stepNumber"が0以下（正の整数値でない）場合繰り返す
		} while (stepNumber <= 0);
		
		// 行を表しfor文の制御を行うint型の"lineNumber"を0で初期化し入力された段数である"stepNumber"回だけ繰り返す
		for (int lineNumber = 0; lineNumber < stepNumber; lineNumber++) {
			// 行と同様に列を表すint型の"columnNumber"を0で初期化し、"stepNumber"回だけ繰り返す
			for (int columnNumber = 0; columnNumber < stepNumber; columnNumber++) {
				// "columNumber"が"lineNumber"より小さければ
				if (columnNumber < lineNumber) {
					// 空白を表示する
					System.out.print(" ");
				// "columNumber"が"lineNumber"以上ならば
				} else {
					// *を表示する
					System.out.print('*');
				}
			}
			// 1行出力し終えたら1度改行を行う
			System.out.println("");
		}
	}
}

