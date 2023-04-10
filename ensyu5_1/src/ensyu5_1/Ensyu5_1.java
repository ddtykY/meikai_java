package ensyu5_1;

import java.util.Scanner;

/*
 *  クラス名 :ensyu5_1
 *  概要     :演習問題5-1の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class Ensyu5_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :10進整数を読み込んでその値を8進数と16進数で表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 整数の入力を促す
		System.out.print("整数 : ");
		// int型の変数"integerNumber"を入力された値で初期化する
		int integerNumber = standardInput.nextInt();
		
		// 8進数で表示する
		System.out.printf("８進数では %o です\n", integerNumber);
		// 16進数で表示する
		System.out.printf("16進数では %x です\n", integerNumber);
	}
}