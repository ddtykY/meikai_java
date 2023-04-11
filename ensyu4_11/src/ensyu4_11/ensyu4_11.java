package ensyu4_11;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_11
 *  概要     :演習問題4-11の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_11 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を0までfor文を用いてカウントダウンする(List4-4の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// カウントダウンを行う旨を表示する
		System.out.println("カウントダウンします。");
		
		// 入力された値を格納する変数
		int integerValue;
		
		// 整数値を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 正の整数値の入力を促す
			System.out.print("正の整数値 : ");
			// 入力された値をint型の変数"integerValue"に代入する
			integerValue = standardInput.nextInt();
		// "integerValue"が0以下（負の値）の場合繰り返す
		} while (integerValue <= 0);
		
		// for文を制御する変数"countDownNumber"を入力された"integerValue"に初期化し繰り返すたびに
		// デクリメントすることでカウントダウンを実現させる
		for(int countDownNumber = integerValue; countDownNumber >= 0; countDownNumber--) {
			// "countDownNumber"を表示する
			System.out.println(countDownNumber);
		}
		
		// 改行文字を出力する
		System.out.println(); 
	}
}