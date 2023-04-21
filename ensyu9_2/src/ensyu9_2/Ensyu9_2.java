package ensyu9_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu9_2
 *  概要     :演習問題9-2の日付クラスの確認クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.21
 */
public class Ensyu9_2 {
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
		return yearNumber % 4 == 0 && yearNumber % 100 != 0 && yearNumber % 400 == 0;
	}
	
	/*
	 * 関数名           :printDayArray
	 * メソッドの説明   :メソッドtoStringを呼び出し日付クラスの配列の情報を表示する
	 * パラメータの説明 :dayArray　情報を表示する日付クラスの配列
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static void printDayArray(Day[] dayArray) {
		// 区切りの表示
		System.out.println("--------------------");
		// 配列の長さの分だけ繰り返す
		for(int countNumber = 0; countNumber < dayArray.length; countNumber++) {
			// それぞれの基本的な情報を表示する
			System.out.println("\n" + dayArray[countNumber].toString());
		}
		// 区切りの表示
		System.out.println("--------------------");
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成した日付クラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.21
	 */
	public static void main(String[] args) {
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
		
		// Dayクラスの配列を生成する
		Day[] dayArray = {
				new Day(),
				new Day(yearValue),
				new Day(yearValue, monthValue),
				new Day(yearValue, monthValue, dateValue)
		};
		// メソッドprintDayArrayを呼び出す
		printDayArray(dayArray);
		
		// DayクラスのインスタンスdayValueを生成する
		Day dayValue = new Day(dayArray[3]);
		
		// toStringメソッド用いてdayValueを表示する
		System.out.println(dayValue.toString());
		
		// 一つ目の要素に対してメソッドsetDayNumberを使う
		dayArray[0].setDayNumber(2000, 11, 2);
		// 二つ目の要素に対してメソッドsetDateNumberを使う
		dayArray[1].setDateNumber(28);
		// 三つ目の要素に対してメソッドMonthNumberを使う
		dayArray[2].setMonthNumber(3);
		// 四つ目の要素に対してメソッドsetYearNumberを使う
		dayArray[3].setYearNumber(1989);
		// メソッドprintDayArrayを呼び出す
		printDayArray(dayArray);
		
		// メソッドgetYearNumber,getMonthNumber,getDateNumberを用いてdayArray[0]の日付を表示する
		System.out.println(dayArray[0].getMonthNumber() + " / " + dayArray[0].getDateNumber() + " / " + dayArray[0].getYearNumber());
		
		
		
		// もしメソッドequalToを用いてdayArray[2]とdayArray[3]を比べた時にtrueが返却されたら
		if(dayArray[2].equalTo(dayArray[3])) {
			// 等しいことを表示
			System.out.println("等しいです");
		// falseが返却されたら
		} else {
			// 等しくないことを表示する
			System.out.println("等しくないです");
		}
		
		
	}

}
