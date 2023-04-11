package ensyu4_16;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_16
 *  概要     :演習問題4-16の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_16 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ個数だけ*を表示し、5個表示するごとに改行する(List4-11の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 入力された値の個数を表すint型の変数
		int quantityValue;
		
		// 表示する個数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 表示する個数の入力を促す
			System.out.print("何個*を表示しますか : ");
			// 入力された値を個数を表すint型の変数"quantityValue"に代入する
			quantityValue = standardInput.nextInt();
		 // "quantityValue"が0以下(正の整数値でない）場合繰り返す
		} while (quantityValue <= 0);
		
		// "quantityNumber"回だけ繰り返すこの時5個ごとの改行処理を行いやすいようにするため
		// for文の制御に使う"countNumber"を1で初期化する
		for (int countNumber = 1; countNumber <= quantityValue; countNumber++) {
			// *を表示する
			System.out.print('*');
			// "countNumber"が5の倍数の時
			if (countNumber % 5 == 0) {
				// 改行する
				System.out.println();
			}
		}		
	}
}
