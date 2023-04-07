package ensyu4_9;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_9
 *  概要     :演習問題4-9の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_9 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んで1からその値までの積を求める
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
		
		do {
			// 正の整数値の入力を促す
			System.out.print("整数値 : ");
			// int型の変数"integerValue"に入力された値を代入する
			integerValue = standardInput.nextInt();
		} while (integerValue <= 0); // "integerValue"が正の整数値でない場合繰り返す
		
		// 1から"integerValue"までの積を求めることを伝える
		System.out.print(1 + "から" + integerValue + "までの積は");
		
		// 積の結果を代入するint型の変数"productValue"を初期化する
		int productValue = 1;
		
		while (integerValue > 0) { // デクリメントされていく"integerValue"が0より大きい間繰り返すことで入力された値から1までの積を実現する
			// "productVAlue"に"integerValue"を掛ける
			productValue *= integerValue;
			// "integerNumber"をデクリメントする
			integerValue--;
		}
		
		// 全ての積の計算結果である"productValue"を表示する
		System.out.println(productValue + "です。");
	}
}