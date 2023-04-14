package ensyu7_7;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_7
 *  概要     :演習問題7-7の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_7 {
	/*
	 * 関数名           :putChars
	 * メソッドの説明   :文字cをn個表示する(List7-8内のメソッド)
	 *                   ※この問題ではList7-8にあるメソッドを呼び出すことが指定されている
	 * パラメータの説明 :c　表示するchar型の文字
	 *                   n　cを表示する個数
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static void putChars(char c, int n) {
		// "n"が0より大きい間以下の処理を繰り返す、ループごとに"n"をデクリメントする
		while(n-- > 0) {
			// "c"を表示する
			System.out.print(c);
		}
	}
	
	/*
	 * 関数名           :putStars
	 * メソッドの説明   :文字'*'を"n"個表示する(List7-7内のメソッド)
	 *                   ※この問題ではList7-7の本メソッドをputCharsを用いて改変する事が指定されている
	 * パラメータの説明 :n　*を表示する個数
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static void putStars(int n) {
		// putStarsを呼び出し、引数として'*', "n"を与える
		putChars('*', n);
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドputStarsを呼び出し入力された値分の段数をもつ三角形を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 段数を表すint型の変数"stepValue"を0で初期化する
		int stepValue = 0;
		
		// 正の整数値が入力されるまで入力させる処理を繰り返す
		do {
			// 段数の入力を促す
			System.out.print("段数は : ");
			// "stepValue"に入力された値を代入する
			stepValue = standardInput.nextInt();
		// "stepValue"が0以下の(正の整数値でない)間繰り返す
		} while (stepValue <= 0);
		
		// 1で初期化されたint型の変数"stepNumber"で制御するfor文で"stepValue"の回数分繰り返す
		for(int stepNumber = 1; stepNumber <= stepValue; stepNumber++) {
			// メソッドputStarsを呼び出し"stepNumber"を引数として与える
			putStars(stepNumber);
			// 改行文字の出力
			System.out.println();
		}
	}
}

