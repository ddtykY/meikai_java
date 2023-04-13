package ensyu6_15;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_15
 *  概要     :演習問題6-15の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.13
 */
public class Ensyu6_15 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :曜日を表示してその英語表記を入力させる
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
		
		// 曜日の数を表すint型の定数
		final int WEEK_NUMBER = 7;
		
		// 曜日の日本語表記を格納する文字型の配列を用意する
		String[] japaneseWeekString = {
				"日曜日", "月曜日", "火曜日", "水曜日",  
				"木曜日", "金曜日", "土曜日"
		};
		
		// 曜日の英語表記を格納する文字型の配列を用意する
		String[] englishWeekString = {
				"sunday", "monday", "tuesday", "wednesday",  
				"thursday", "friday", "saturday"
		};
		
		// 問題について表示する
		System.out.println("英語の曜日名を小文字で入力してください。");
		
		// もう一度行うか確認するための変数"retryCheck"を0で初期化する
		int retryCheck = 0;
		// 問題の解答に当たる要素を示すための変数"correctWeek"を0で初期化する
		int correctWeek = 0;
		// 0～6の乱数を格納する変数"randomWeek"を0で初期化する
		int randomWeek = 0;
		
		// もう一度行うが選択される限り以下の処理は繰り返す
		do {
			// 改行文字を出力する
			System.out.println();
			
			// 前回と同じ値の乱数が生成された場合乱数の生成の処理を繰り返す
			do {
				// "randomWeek"に0～6の乱数を代入する
				randomWeek = randomNumber.nextInt(WEEK_NUMBER);
			// 新たに生成された"randomWeek"が前回の"correctWeek"と同じ場合繰り返す
			} while (randomWeek == correctWeek);
			
			// "correctWeek"に"randomWeek"を代入する
			correctWeek = randomWeek;
			// 回答者が正解するまで繰り返しを抜け出さない無限ループ
			while (true) {
				// 問題を表示する
				System.out.print(japaneseWeekString[correctWeek] + " : ");
				// String型の変数"guessWeek"を入力された文字列で初期化する
				String guessWeek = standardInput.next();
				
				// もし入力された文字列と解答の文字列が等しいなら
				if (guessWeek.equals(englishWeekString[correctWeek])) {
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