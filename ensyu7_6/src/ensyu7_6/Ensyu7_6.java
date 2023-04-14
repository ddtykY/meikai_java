package ensyu7_6;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_6
 *  概要     :演習問題7-6の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_6 {
	/*
	 * 関数名           :printSeason
	 * メソッドの説明   :引数として与えられた値によって季節を表示する
	 * パラメータの説明 :m　月を表す変数。この値によって表示するメッセージを変える
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static void printSeason(int m) {
		// "m"の値によって表示するメッセージを変えるswitch文
		switch(m) {
		// "m"が3,4,5であれば
		case 3, 4, 5 :	// 春である旨を表示する
			System.out.println("春");
		// swich文を抜ける
		break;
		// "m"が6,7,8であれば
		case 6, 7, 8 :	// 夏である旨を表示する
			System.out.println("夏");
		// swich文を抜ける
		break;
		// "m"が9,10,11であれば
		case 9, 10, 11 :// 秋である旨を表示する
			System.out.println("秋");
		// swich文を抜ける
		break;
		// "m"が12,1,2であれば
		case 12, 1, 2 :	// 冬である旨を表示する
			System.out.println("冬");
		// swich文を抜ける
		break;
		}
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドprintSeasonを呼び出し入力された値に対応するメッセージを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 月の入力を促す
		System.out.print("月 : ");
		// 月を表す整数"monthValue"を入力された値で初期化する
		int monthValue = standardInput.nextInt();
		
		// メソッドprintSeasonを呼び出し"monthValue"を与える
		printSeason(monthValue);
	}
}

