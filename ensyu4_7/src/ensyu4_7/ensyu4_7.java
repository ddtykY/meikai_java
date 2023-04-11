package ensyu4_7;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_7
 *  概要     :演習問題4-7の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_7 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ値の個数だけ+と*を交互に表示するプログラム
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 表示する個数の入力を促す
		System.out.print("何個表示しますか : ");
		// int型の変数"quantityNumber"に入力された値を代入する
		int quantityNumber = standardInput.nextInt();
		
		// while文の制御用のint型の変数"countNumber"を初期化する
		int countNumber = 0;
		// インクリメントされていく"countNumber"が入力された"quantityNumber"以下の間繰り返す
		while (countNumber < quantityNumber) {
			// "countNumber"が奇数の場合*を表示する
			if (countNumber % 2 != 0) System.out.print('*');
			// "countNumber"が偶数の場合+を表示する
			else System.out.print('+');
			// "countNumber"をインクリメントしループ回数を数える
			countNumber++;
		}
		// 入力された値が1以上なら改行文字を出力する
		if (quantityNumber >= 1) System.out.println();
	}
}