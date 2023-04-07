package ensyu4_18;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_18
 *  概要     :演習問題4-18の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_18 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :1から入力された値までの整数値の2乗値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"integerValue"の入力を促す
		System.out.print("整数値integerValue : ");
		// 入力された整数値をint型の変数"integeValue"に代入する
		int integerValue = standardInput.nextInt();
		
		// 1から入力された整数値までなのでfor文の制御に利用する"countNumber"を1で初期化し
		// 入力された整数値"integerValue"回処理を繰り返す
		for(int countNumber = 1; countNumber <= integerValue; countNumber++)
			System.out.println(countNumber + "の2乗は" + countNumber*countNumber); // countNumberの2乗を表示する
	}
}