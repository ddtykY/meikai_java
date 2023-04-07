package ensyu4_12;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_12
 *  概要     :演習問題4-12の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_12 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を0からfor文を用いてカウントアップする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// カウントダウンを行う旨を表示する
		System.out.println("カウントアップします。");
		
		// 入力された値を格納する変数
		int integerValue;
		
		do {
			// 正の整数値の入力を促す
			System.out.print("正の整数値 : ");
			// 入力された値をint型の変数"integerValue"に代入する
			integerValue = standardInput.nextInt();
		} while (integerValue <= 0);
		
		// for文を制御する変数"countUpNumber"0で初期化し"integerValue"になるまでインクリメントすることでカウントアップを実現させる
		for(int countUpNumber = 0; countUpNumber <= integerValue; countUpNumber++)
			System.out.println(countUpNumber); // "countUpNumber"を表示する
		
		// 改行文字を出力する
		System.out.println(); 
	}
}