package ensyu4_27;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :ensyu4_27
 *  概要     :演習問題4-27の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class Ensyu4_27 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :0～99の数当てゲームでプレイヤーが入力できる回数に制限を設ける(List4-3の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		// Randomクラスのインスタンスを作成
		Random randomNumber = new Random();

		// それをゲームの答えを表すint型の変数"answerNumber"を0～100の乱数で初期化する
		int answerNumber = randomNumber.nextInt(100);

		// プレイヤー解答の回数制限を表すint型の変数
		int limitNumber;

		// 制限回数として正の整数値が入力されるまで繰り返す 
		do {
			// 回数制限の入力を促す
			System.out.print("何回までに当てますか : ");
			// int型の変数"limitNumber"に入力された値を代入する
			limitNumber = standardInput.nextInt();
		} // "limitNumber"が0以下である場合繰り返す
		while (limitNumber <= 0);

		// プレイヤーの解答を格納するint型の変数
		int playerNumber;
		// プレイヤーの解答回数を表すint型の変数"countAnswer"を0で初期化する
		int countAnswer = 0;

		// プレイヤーに解答させる処理を制限回数に達するか正解するまで繰り返す。無限ループを利用している
		do { 
			// プレイヤーの解答回数を表すint型の変数"countAnswer"をインクリメントする
			countAnswer++;

			// 解答することを促す
			System.out.print("いくつかな : ");
			// "playerNumber"に入力した値を代入する
			playerNumber = standardInput.nextInt();

			// もしプレイヤーの解答がゲームの答えと一致した場合は
			if (playerNumber == answerNumber) {
				// 正解である旨を伝える
				System.out.println("正解です。");
				// do文を抜け出す
				break;
			}
			
			// もし解答回数"countAnswer"が制限回数"limitNumber"と等しいなら
			if (countAnswer == limitNumber) {
				// 正解を表示する
				System.out.println("正解は " + answerNumber + " です。");
				// do文を抜け出す
				break;
			}
			
			// プレイヤーの解答がゲームの答えより大きければ
			if (playerNumber > answerNumber) {
				// 答えはその解答よりも小さいということを伝える
				System.out.println("もっと小さな数だよ"); 
			}
			// プレイヤーの解答がゲームの答えより小さければ
			else if (playerNumber < answerNumber) {
				// 答えはその解答よりも大きいということを伝える
				System.out.println("もっと大きな数だよ");
			}
		}// 無限ループを行う
		 while(true);
	}
}
