package ensyu4_20;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_20
 *  概要     :演習問題4-20の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class ensyu4_20 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :n段の正方形を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 正方形を表示する旨を示す
		System.out.println("正方形を表示します");
		// 段数の入力を促す
		System.out.print("段数 : ");
		// int型の変数"stepNumber"を入力された値で初期化する
		int stepNumber = standardInput.nextInt();
		
		// 行を表しfor文の制御を行うint型の"lineNumber"を0で初期化し入力された段数である"stepNumber"回だけ繰り返す
		for (int lineNumber = 0; lineNumber < stepNumber; lineNumber++) {
			// 行と同様に列を表すint型の"columnNumber"を0で初期化、"stepNumber"回だけ繰り返す
			for (int columnNumber = 0; columnNumber < stepNumber; columnNumber++) {
				// *を表示する
				System.out.print('*');
			}
			// 入力された値の分だけ*が表示されたら1度改行を行うことで正方形の表示を実現する
			System.out.println("");
		}
	}
}
