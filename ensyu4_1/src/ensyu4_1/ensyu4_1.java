package ensyu4_1;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu4_1
 * 概要    :演習問題4_1の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.06
 */
public class ensyu4_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ整数値の符号を判定して表示（何度も繰り返すことができる）
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		int retryCheck; // もう一度行うかどうかの確認用

		// 読み込んだ整数が正か負か判定する処理を"retryCeck"が1以外の値になるまで繰り返す
		do {
			// 判定したい整数値の入力を促す
			System.out.print("整数値 : ");
			// int型の変数"value"に入力された整数値を代入する
			int integerValue = standardInput.nextInt();

			// "integerValue"が0より大きければ
			if (integerValue > 0) {
				// 正の整数値であるという旨を表示する
				System.out.println("その値は正です。");
			// "integerValue"が0より小さければ
			}else if (integerValue < 0) {
				// 負の整数値であるという旨を表示する
				System.out.println("その値は負です。");
			// ほかのどの条件にも当てはまらなければ（integerValueが0ならば）
			}else {
				// 0であるという旨を表示する
				System.out.println("その値は0です。");
			}
			// もう一度行うかどうかを確認するための整数値の入力を促す
			System.out.print("もう一度？ 1…Yes / Other…No : ");
			// 確認用のint型の変数"retryCheck"に入力された値を代入する
			retryCheck = standardInput.nextInt();
			// "retryCheck"が1ならば繰り返す
		} while (retryCheck == 1);

		//standardInputを閉じる
		standardInput.close();
	}
}
