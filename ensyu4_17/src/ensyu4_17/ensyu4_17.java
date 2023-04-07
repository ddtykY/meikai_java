package ensyu4_17;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_17
 *  概要     :演習問題4-17の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_17 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ整数値のすべての約数を表示し最後に約数の個数を表示する(List4-13の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の入力を促す
		System.out.print("整数値 : ");
		// 入力された整数値をint型の変数"integerValue"に代入する
		int integerNumber = standardInput.nextInt();
		
		// 約数の個数を格納する変数を0で初期化する
		int divisorNumber = 0;
		
		// 入力された"integerNumber"回繰り返す、このとき0では数を割ることができないため"countNumber"を1で初期化する
		for(int countNumber = 1; countNumber <= integerNumber; countNumber++) {
			if (integerNumber % countNumber == 0) { // "countNumber"で入力された"integerNumber"を割り切れるとき
				// その数字"countNumber"を表示する
				System.out.println(countNumber);
				// 約数の個数を表すint型の変数"divisorNumber"を1つ加算する
				divisorNumber++;				
			}
		}
		// 約数の個数を表示する
		System.out.println("約数は " + divisorNumber + " 個です。");	
	}
}