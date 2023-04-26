package ensyu9_5;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu9_5
 *  概要     :演習問題9-5の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class Ensyu9_5 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名           :inputData
	 * メソッドの説明   :引数として渡された値の範囲内で入力された整数値を返す
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 *                   minimumLimit　入力させる値の最小値
	 *                   maximumLimit　入力させる値の最大値
	 * 返り値           :inputData　入力された値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static int inputData(String dataName, int minimumLimit, int maximumLimit) {
		// 返却するための入力された値を格納する変数を初期化する
		int inputData = 0;

		//  "minimumLimit"から"maximumLimit"までの範囲で入力されるまで繰り返す
		do {
			// 入力を促す
			System.out.print(dataName + " : ");
			// 入力された値を"inputData"に代入する
			inputData = standardInput.nextInt();
		// "inputData"が引数として渡された値の範囲害である場合繰り返す
		} while (inputData < minimumLimit || inputData > maximumLimit);

		// "inputData"を返却する
		return inputData;
	}
	
	/*
	 * 関数名           :isLeap
	 * メソッドの説明   :引数として渡された年がうるう年か判定する
	 * パラメータの説明 :yearNumber　判定の対象
	 * 返り値           :うるう年ならtrue
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static boolean isLeap(int yearNumber) {
		// "yearNumber"が4の倍数で100の倍数ではなく400の倍数であるときtrueを返却する
		return yearNumber % 4 == 0 && yearNumber % 100 != 0 || yearNumber % 400 == 0;
	}
	
	/*
	 * 関数名           :createDay
	 * メソッドの説明   :Dayクラスのインスタンスを生成する
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 * 返り値           :
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static Day createDay(String dataName) {
		// 月の最小値
		final int MINIMUM_MONTH = 1;
		// 月の最大値
		final int MAXIMUM_MONTH = 12;
		// 日の最小値
		final int MINIMUM_DATE = 1;
		// 日の最大値を格納する配列
		int[] dateString = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// うるう年の2月の日数
		final int LEAP_YEAR_DATE = 29;

		// 日付を入力するように表示する
		System.out.println(dataName);
		// 年の入力を促す
		System.out.print("年 : ");
		// 入力された値で年を表す変数を初期化する
		int yearValue = standardInput.nextInt();

		// メソッドinputDataを用いて入力された値で月を表す変数を初期化する
		int monthValue = inputData("月", MINIMUM_MONTH, MAXIMUM_MONTH);
		// 日を表す変数を初期化する
		int dateValue = 0;

		// メソッドisLeapを呼び出しうるう年でかつ2月であれば
		if (isLeap(yearValue) && monthValue == 2) {
			// メソッドinputDataを用いて入力された値を"dateValue"に代入する
			dateValue = inputData("日", MINIMUM_DATE, LEAP_YEAR_DATE);
			// うるう年でないなら
		} else {
			// メソッドinputDataを用いて入力された値を"dateValue"に代入する
			dateValue = inputData("日", MINIMUM_DATE, dateString[monthValue-1]);
		}
		//すべての入力が終了したら改行する
		System.out.println();
		// 入力された値でDayクラスのインスタンスを生成し返却する
		return new Day(yearValue, monthValue, dateValue);
	}
	
	/*
	 * 関数名           :printPeriod
	 * メソッドの説明   :開始日と終了日を表示する
	 * パラメータの説明 :dayPeriod　情報を表示するperiodクラスの配列
	 * 返り値           :
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static void printPeriod(Period dayPeriod) {
			// 区切りの表示
			System.out.println("--------------------");
			// メソッドtoStringを呼び出し表示する
			System.out.println(dayPeriod.toString());
			// 区切りの表示
			System.out.println("--------------------");
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成した期間クラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.24
	 */
	public static void main(String[] args) {
		// 開始日を設定させる
		Day fromDay = createDay("開始日");
		// 終了日を設定させる
		Day toDay = createDay("終了日");
		
		// Periodクラスのインスタンスを生成する
		Period dayPeriod = new Period(fromDay, toDay);
		// 入力された期間を表示する
		printPeriod(dayPeriod);
		
		// メソッドtoIsEarlierを呼び出しfalseの間繰り返す
		while(dayPeriod.fromIsEarlier()) {
			// どちらかが間違っていることを指摘する
			System.out.println("\n開始日か終了日のどちらかが間違っています");
			// 開始日を改めて設定する
			dayPeriod.setFrom(createDay("開始日"));
			// 終了日を改めて設定する
			dayPeriod.setTo(createDay("終了日"));
			// 入力された期間を表示する
			printPeriod(dayPeriod);
		}
		
		// 終了日までの期間を表示する
		System.out.println("この期間の日数は " + dayPeriod.calculatePeriod() + "日 です。(初日含む)");
		
	}

}
