package ensyu4_6;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_6
 *  概要     :演習問題4-6のList4-7についての解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_6_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ値が1未満であれば改行文字を出力しないようにList4-7を書き換える
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// List4-7
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// *を表示する個数の入力を促す
		System.out.print("何個*を表示しますか : ");
		// int型の変数"quantityNumber"に入力された整数値を代入する
		int quantityNumber = standardInput.nextInt();
		
		// while文の制御用のint型の変数"countNumber"を初期化する
		int countNumber = 0;
		
		// インクリメントされていく"countNumber"が入力された"quantityNumber"より小さい間繰り返す
		while (countNumber < quantityNumber) {
			// *を出力する
			System.out.print('*');
			// "countNumber"をインクリメントする
			countNumber++;
		}
		// 入力された値が1以上なら改行文字を出力する
		if (quantityNumber >= 1) System.out.println();
	}
}
