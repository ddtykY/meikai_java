package ensyu4_8;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_8
 *  概要     :演習問題4-8の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_8 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んでその桁数を出力する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 入力された値を格納する変数"integerValue"を宣言する
		int integerValue;
		
		// 整数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 正の整数値の入力を促す
			System.out.print("整数値 : ");
			// int型の変数"integerValue"に入力された値を代入する
			integerValue = standardInput.nextInt();
		// "integerValue"が正の整数値でない場合繰り返す
		} while (integerValue <= 0);
		
		//桁数を表す"digitNumber"を初期化する
		int digitNumber = 0;
		
		// "integerValue"が0より大きい間繰り返す
		while (integerValue > 0) {
			// "integerValue"を10で割る
			integerValue /= 10;
			// "digitNumber"をインクリメントすることでここまでの桁数を数える
			digitNumber++;
		}
		
		// 入力された桁数"digitNumber"を表示する
		System.out.println("その値は" + digitNumber + "桁です。");
	}
}