package ensyu6_14;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_14
 *  概要     :演習問題6-14の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.13
 */
public class Ensyu6_14 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :月を1から12の数値として表示してその英語表記を入力させる
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.13
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成
		Random randomNumber = new Random();
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 月の数を表すint型の定数
		final int MONTH_NUMBER = 12;
		
		// 月の英語表記を格納する文字型の配列を用意する
		String[] monthString = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};
		
		// 問題について表示する
		System.out.println("英語の月名を入力してください。");
		// 問題の概要を説明する
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");
		
		// もう一度行うか確認するための変数"retryCheck"を0で初期化する
		int retryCheck = 0;
		// 問題の解答に当たる要素を示すための変数"correctMonth"を0で初期化する
		int correctMonth = 0;
		// 0～11の乱数を格納する変数"randomMonth"を0で初期化する
		int randomMonth = 0;
		
		// もう一度行うが選択される限り以下の処理は繰り返す
		do {
			// 改行文字を出力する
			System.out.println();
			
			// 前回と同じ値の乱数が生成された場合乱数の生成の処理を繰り返す
			do {
				// "rondomMonth"に0～11の乱数を代入する
				randomMonth = randomNumber.nextInt(MONTH_NUMBER);
			// 新たに生成された"randomMonth"が前回の"correctMonth"と同じ場合繰り返す
			} while (randomMonth == correctMonth);
			
			// "correctMonth"に"randomMonth"を代入する
			correctMonth = randomMonth;
			// 回答者が正解するまで繰り返しを抜け出さない無限ループ
			while (true) {
				// 問題を表示する
				System.out.print((correctMonth + 1) + "月 : ");
				// String型の変数"guessMonth"を入力された文字列で初期化する
				String guessMonth = standardInput.next();
				
				// もし入力された文字列と解答の文字列が等しいなら
				if (guessMonth.equals(monthString[correctMonth])) {
					// while文の繰り返しを抜ける
					break;
				}
				// この時点で繰り返しを抜け出していないため間違いである旨を表示する
				System.out.println("違います。\n");
			}
			
			// 繰り返しを抜けているということは正解であるためその旨を表示する
			System.out.println("正解です。\n");
			
			//もう一度行うか確認する
			System.out.print("もう一度？ 1…Yes / 1以外の数…No :");
			// "retryCheck"に入力された値を代入する
			retryCheck = standardInput.nextInt();
		// もう一度行うが選択された場合("retryCheck"が1)の場合繰り返す
		}while (retryCheck == 1);
	}
}