package ensyu10_4;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

/*
 *  クラス名 :Day
 *  概要     :日付クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class Day {
	// GregorianCalendarクラスのインスタンスを生成する
	GregorianCalendar todayDate = new GregorianCalendar();
	
	// 年の日数
	private static final int YEARS_DATE = 365;
	// 月の最小値
	private static final int MINIMUM_MONTH = 1;
	// 月の最大値
	private static final int MAXIMUM_MONTH = 12;
	// 日の最小値
	private static final int MINIMUM_DATE = 1;
	// 日の最大値を格納する配列
	private static int[] maximumDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// うるう年の2月の日数
	private static final int LEAP_DATE = 29;
	
	// フィールドの宣言
	// 年を実行時の年で初期化する
	private int yearNumber = todayDate.get(YEAR);
	// 月を実行時の月で初期化する
	private int monthNumber = todayDate.get(MONTH)+1;
	// 日を実行時の日で初期化する
	private int dateNumber = todayDate.get(DATE);
	
	/*
	 * 関数名           :isLeap
	 * メソッドの説明   :引数として渡された年がうるう年か判定する
	 * パラメータの説明 :yearValue　判定の対象
	 * 返り値           :うるう年ならtrue
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public static boolean isLeap(int yearValue) {
		// "yearNumber"が4の倍数で100の倍数ではなく400の倍数であるときtrueを返却する
		return yearValue % 4 == 0 && yearValue % 100 != 0 || yearValue % 400 == 0;
	}
	
	
	// コンストラクタ
	// 引数なしのコンストラクタで、フィールドの宣言の際の初期化子の値で初期化する
	public Day() {}
	// 年の値だけ引数を与えられそれ以外は宣言時の初期化子の値で初期化する
	public Day(int yearNumber) {
		// フィールドの"yearNumber"に引数の"yearNumber"を代入する
		this.yearNumber = yearNumber;
	}
	// 年と月の値だけ引数を与えられそれ以外は宣言時の初期化子の値で初期化する
	public Day(int yearNumber, int monthNumber) {
		// 一つ上のコンストラクタを呼び出し"yearNumber"を設定する
		this(yearNumber);
		
		// もし"monthNumber"が"MINIMUM_MONTH"未満なら
		if(monthNumber < MINIMUM_MONTH) {
			// "monthNumber"を"MINIMUM_MONTH"とする
			monthNumber = MINIMUM_MONTH;
		// もし"monthNumber"が"MAXIMUM_MONTH"より大きければ
		} else if(monthNumber > MAXIMUM_MONTH) {
			// "monthNumber"を"MAXIMUM_MONTH"とする
			monthNumber = MAXIMUM_MONTH;
		}
		// フィールドの"monthNumber"に"monthNumber"を代入する
		this.monthNumber = monthNumber;
	}
	// 年月日すべて引数として与えられその値で初期化する
	public Day(int yearNumber, int monthNumber, int dateNumber) {
		// 一つ上のコンストラクタを呼び出し"yearNumber"と"monthNumber"を設定する
		this(yearNumber, monthNumber);
		
		// もし"dateNumber"が"MINIMUM_DATE"より小さければ
		if(dateNumber < MINIMUM_DATE) {
			// "dateNumber"を"MINIMUM_DATE"とする
			dateNumber = MINIMUM_DATE;
		// もしうるう年で2月かつ"dateNumber"が"LEAP_DATE"より大きければ
		} else if(isLeap(yearNumber) && this.monthNumber == 2 && dateNumber > LEAP_DATE) {
			// "dateNumber"を"LEAP_DATE"とする
			dateNumber = LEAP_DATE;
		// もし"dateNumber"が"maximumDate[monthNumber-1]"より大きければ
		} else if(dateNumber > maximumDate[this.monthNumber-1]) {
			// "dateNumber"を"maximumDate[monthNumber-1]"とする
			dateNumber = maximumDate[this.monthNumber-1];
		}
		// フィールドの"dateNumber"に引数の"dateNumber"を代入する
		this.dateNumber = dateNumber;
	}
	// 引数として与えられたインスタンスの値でそれぞれのフィールドを初期化する
	public Day(Day givenDay) {
		// 一つ上のコンストラクタを呼び出し与えられたインスタンスの値を引数として与える
		this(givenDay.yearNumber, givenDay.monthNumber, givenDay.dateNumber);
	}
	
	
	/*
	 * 関数名           :getYearNumber
	 * メソッドの説明   :年を取得する
	 * パラメータの説明 :なし
	 * 返り値           :yearNumber　年
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public int getYearNumber() {
		// yearNumberを返却する
		return yearNumber;
	}

	/*
	 * 関数名           :getMonthNumber
	 * メソッドの説明   :月を取得する
	 * パラメータの説明 :なし
	 * 返り値           :monthNumber　月
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public int getMonthNumber() {
		// monthNumberを返却する
		return monthNumber;
	}
	
	/*
	 * 関数名           :getDateNumber
	 * メソッドの説明   :日を取得する
	 * パラメータの説明 :なし
	 * 返り値           :dateNumber　日
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public int getDateNumber() {
		// dateNumberを返却する
		return dateNumber;
	}
	
	
	/*
	 * 関数名           :setYearNumber
	 * メソッドの説明   :年を設定する
	 * パラメータの説明 :yearNumber　与えられた年
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public void setYearNumber(int yearNumber) {
		// フィールドの"yearNumber"に引数の"yearNumber"を代入する
		this.yearNumber = yearNumber;
	}

	/*
	 * 関数名           :setMonthNumber
	 * メソッドの説明   :月を設定する
	 * パラメータの説明 :monthNumber　与えられた月
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public void setMonthNumber(int monthNumber) {
		// フィールドの"monthNumber"に引数の"monthNumber"を代入する
		this.monthNumber = monthNumber;
	}
	
	/*
	 * 関数名           :setDateNumber
	 * メソッドの説明   :日を設定する
	 * パラメータの説明 :dateNumber　与えられた日
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public void setDateNumber(int dateNumber) {
		// フィールドの"dateNumber"に引数の"dateNumber"を代入する
		this.dateNumber = dateNumber;
	}
	
	/*
	 * 関数名           :setDayNumber
	 * メソッドの説明   :年月日を設定する
	 * パラメータの説明 :yearNumber　与えられた年
	 *                   monthNumber　与えられた月
	 *                   dateNumber　与えられた日
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public void setDayNumber(int yearNumber, int monthNumber, int dateNumber) {
		// フィールドの"yearNumber"に引数の"yearNumber"を代入する
		this.yearNumber = yearNumber;
		// フィールドの"monthNumber"に引数の"monthNumber"を代入する
		this.monthNumber = monthNumber;
		// フィールドの"dateNumber"に引数の"dateNumber"を代入する
		this.dateNumber = dateNumber;
	}
	
	/*
	 * 関数名           :isLeap
	 * メソッドの説明   :うるう年か判定する
	 * パラメータの説明 :なし
	 * 返り値           :うるう年ならtrue
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public boolean isLeap() {
		return isLeap(yearNumber);
	}
	
	/*
	 * 関数名           :dayOfWeek
	 * メソッドの説明   :曜日を求める
	 * パラメータの説明 :なし
	 * 返り値           :それぞれの曜日に対応した0～6の整数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public int dayOfWeek() {
		// 年を表す変数を初期化する
		int yearValue = yearNumber;
		// 月を表す変数を初期化する
		int monthValue = monthNumber;
		
		// うるう日が2月末であるため1,2月を前年の13,14月として計算する
		// もし月が1か2なら
		if(monthValue == 1 || monthValue == 2) {
			// "yearValue"をデクリメントする
			yearValue--;
			// "monthValue"に12加算する
			monthValue += 12;
		}
		
		// ツェラーの公式
		// 年数を考慮し、うるう年は4の倍数で100の倍数をのぞいた年（400の倍数を含まない）なのでその調整を行う
		// 30日までの月、31日まである月を考慮し月によって加算する量を変化させる
		// 確認したい日付を加算する
		// すべての7で割った余剰が以下のカッコ内の式になる
		// この式を7で割った余剰を返却する
		return (yearValue + yearValue/4 - yearValue/100 + yearValue/400 + (13*monthValue+8)/5 + dateNumber) % 7;
	}
	
	/*
	 * 関数名           :equalTo
	 * メソッドの説明   :日付"givenDay"と等しいか
	 * パラメータの説明 :givenDay　日付クラスのインスタンス
	 * 返り値           :フィールドのそれぞれの値が与えられたインスタンスの値と等しいならtrue
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public boolean equalTo(Day givenDay) {
		// それぞれの値が引数のものと等しいならtrueを返却する
		return yearNumber == givenDay.yearNumber && monthNumber == givenDay.monthNumber && dateNumber == givenDay.dateNumber;
	}
	
	/*
	 * 関数名           :toString
	 * メソッドの説明   :自身の年月日に対応した文字列を返却する
	 * パラメータの説明 :なし
	 * 返り値           :自身の年月日に対応した文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public String toString() {
		// 曜日を表す文字列を格納する配列
		String[] weekDay = {"日", "月", "火", "水", "木", "金", "土"};
		// 自身の年月日に対応した文字列を返却する
		return String.format("%04d年%02d月%02d日(%s)", yearNumber, monthNumber, dateNumber, weekDay[dayOfWeek()]);
	}
	
	/*
	 * 関数名           :calculateDay
	 * メソッドの説明   :日数を求める
	 * パラメータの説明 :なし
	 * 返り値           :dayValue　0年1月1日からの日数を表す変数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public int calculateDay() {
		// 0年1月1日からの日数を表す変数
		int dayValue = 0;

		// 年単位の日数を求めるのに利用する変数を初期化する
		int yearValue = yearNumber-1;
		// 年単位の日数を求める
		dayValue += (YEARS_DATE * yearValue) + yearValue/4 - yearValue/100 + yearValue/400;
		// 月単位の日数を求める
		// 1月から前の月までの数だけ繰り返す
		for(int countMonth = 0; countMonth < monthNumber-1; countMonth++) {
			// うるう年の2月であるとき
			if (isLeap(yearNumber) && countMonth == 1) {
				// うるう年の2月の日数分加算する
				dayValue += LEAP_DATE;
			// 上記に当てはまらないとき
			} else {
				// maximumDate分加算する
				dayValue += maximumDate[countMonth];
			}
		}
		// 現在の日を加算する
		dayValue += dateNumber;

		// "dayValue"を返却する
		return dayValue;
	}

	
	// 以降演習問題10-4追加分
	
	/*
	 * 関数名           :elapsedDay
	 * メソッドの説明   :年内での経過日数を求める
	 * パラメータの説明 :なし
	 * 返り値           :elapsedDay　経過日数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public int elapsedDay() {
		// 経過日数を表す変数を初期化する
		int elapsedDay = -1;
		
		// 1月から前の月までの数だけ繰り返す
		for(int countMonth = 0; countMonth < monthNumber-1; countMonth++) {
			// うるう年の2月であるとき
			if (isLeap(yearNumber) && countMonth == 1) {
				// うるう年の2月の日数分加算する
				elapsedDay += LEAP_DATE;
				// 上記に当てはまらないとき
			} else {
				// maximumDate分加算する
				elapsedDay += maximumDate[countMonth];
			}
		}
		// 当月の日数分加算する
		elapsedDay += dateNumber;
		
		// "elapsedDay"を返却する
		return elapsedDay;
	}
	
	/*
	 * 関数名           :remainingDay
	 * メソッドの説明   :年内の残り日数を求める
	 * パラメータの説明 :なし
	 * 返り値           :remainingDay　残り日数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public int remainingDay() {
		// のこり日数を表す変数を初期化する
		int remainingDay = 0;
		
		// もしうるう年なら
		if(isLeap(yearNumber)) {
			// "YEARS_DATE+1"分加算する
			remainingDay += (YEARS_DATE+1);
		// もしうるう年でないなら
		} else {
			// "YEARS_DATE"分加算する
			remainingDay += YEARS_DATE;
		}
		
		// "remainingDay"から経過日数をひく
		remainingDay -= elapsedDay();
		
		// "remainingDay"を返却する
		return remainingDay;
	}
	
	/*
	 * 関数名           :beforeAfter
	 * メソッドの説明   :ほかの日付との前後関係を判定するインスタンスメソッド
	 * パラメータの説明 :jadgementDay　日付クラスのインスタンス
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public void beforeAfter(Day jadgmentDay) {
		// もしcalculateDateを呼び出し引数のそれより小さければ
		if(calculateDay() < jadgmentDay.calculateDay()) {
			// 前の日付であることを表示する
			System.out.println("より前の日付です");
		// もし同じなら
		} else if(calculateDay() == jadgmentDay.calculateDay()) {
			// 同じ日付であることを表示する
			System.out.println("同じ日付です");
		// 大きければ
		} else if(calculateDay() > jadgmentDay.calculateDay()) {
			// 後の日付であることを表示する
			System.out.println("より後の日付です");
		}
	}
	
	/*
	 * 関数名           :beforeAfterTwo
	 * メソッドの説明   :二つの日付の前後関係を判定するインスタンスメソッド
	 * パラメータの説明 :firstJadgementDay　一つ目の日付クラスのインスタンス
	 *                   secondJadgementDay　二つ目の日付クラスのインスタンス
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public static void beforeAfterTwo(Day firstJadgmentDay, Day secondJadgmentDay) {
		// calculateDateを呼び出し一つ目の日数を調べる
		int firstDayValue = firstJadgmentDay.calculateDay();
		// calculateDateを呼び出し二つ目の日数を調べる
		int secondDayValue = secondJadgmentDay.calculateDay();
		
		// もし一つ目のほうが小さければ
		if(firstDayValue < secondDayValue) {
			// 前の日付であることを表示する
			System.out.println(firstJadgmentDay.toString() + " の方が前です");
			// もし同じなら
		} else if(firstDayValue == secondDayValue) {
			// 同じ日付であることを表示する
			System.out.println("同じ日付です");
			// 大きければ
		} else if(firstDayValue > secondDayValue) {
			// 二つの日付の方が前であることを表示する
			System.out.println(secondJadgmentDay.toString() + " の方が前です");
		}
	}
	
	/*
	 * 関数名           :nextDay
	 * メソッドの説明   :日付を一つ後ろに進める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public void nextDay() {
		// もし各月最終日なら
		if(isLeap(yearNumber) && monthNumber == 2 && dateNumber == LEAP_DATE ||
				!isLeap(yearNumber) && monthNumber == 2 && dateNumber == maximumDate[monthNumber-1] || monthNumber != 2 && dateNumber == maximumDate[monthNumber-1]) {
			// "monthNumber"をインクリメントする
			monthNumber++;
			// もし"monthNumber"が13なら
			if(monthNumber == 13) {
				// "yearNumber"をインクリメントする
				yearNumber++;
				// "monthNumber"を1にする
				monthNumber = 1;
			}
			// "dateNumber"を"MINIMUM_DATE-1"にする
			dateNumber = MINIMUM_DATE-1;
		}
		// "dateNumber"をインクリメントする
		dateNumber++;
	}
	
	/*
	 * 関数名           :returnNextDay
	 * メソッドの説明   :次の日の日付を返却する
	 * パラメータの説明 :なし
	 * 返り値           :nextDate　次の日の日付のインスタンス
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public Day returnNextDay() {
		// 同じ日付のインスタンスを生成する
		Day nextDate = new Day(this);
		// メソッドnextDayを呼び出し生成したnextDateを一つ後ろの日付にする
		nextDate.nextDay();
		// nextDateを返却する
		return nextDate;
	}
	
	/*
	 * 関数名           :beforeDay
	 * メソッドの説明   :日付を一つ前に進める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public void beforeDay() {
		// もし各月初日なら
		if(dateNumber == 1) {
			// "monthNumber"をデクリメントする
			monthNumber--;
			// もし"monthNumber"が1なら
			if(monthNumber == 0) {
				// "yearNumber"をデクリメントする
				yearNumber--;
				// "monthNumber"を"MAXIMUM_MONTH"とする
				monthNumber = MAXIMUM_MONTH;
			}
			// うるう年で前の月が2月なら
			if(isLeap(yearNumber) && monthNumber == 2) {
				// "dateNumber"を"LEAP_DATE+1"にする
				dateNumber = LEAP_DATE + 1;
			// もし上記に該当しないなら
			} else {
				// "dateNumber"を"maximumDate[monthNumber-1]+1"にする
				dateNumber = maximumDate[monthNumber-1]+1;
			}
		}
		// "dateNumber"をデクリメントする
		dateNumber--;
	}
	
	/*
	 * 関数名           :returnBeforeDay
	 * メソッドの説明   :前の日の日付を返却する
	 * パラメータの説明 :なし
	 * 返り値           :beforeDate　前の日の日付のインスタンス
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public Day returnBeforeDay() {
		// 同じ日付のインスタンスを生成する
		Day beforeDate = new Day(this);
		// メソッドbeforeDayを呼び出し生成したbeforeDateを一つ後ろの日付にする
		beforeDate.beforeDay();
		// beforeDateを返却する
		return beforeDate;
	}
	
	/*
	 * 関数名           :advanceDay
	 * メソッドの説明   :日付を"advanceValue"だけ後ろに進める
	 * パラメータの説明 :advanceValue　進める日数
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public void advanceDay(int advanceValue) {
		// "advanceValue"の回数分処理を行う
		for(int countNumber = 0; countNumber < advanceValue; countNumber++) {
			// メソッドnextDayを呼び出す
			nextDay();
		}
	}
	
	/*
	 * 関数名           :returnAdvanceDay
	 * メソッドの説明   :"advanceValue"進めた日付を返却する
	 * パラメータの説明 :advanceValue　進める日数
	 * 返り値           :advanceDate　"advanceValue"日後の日付のインスタンス
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public Day returnAdvanceDay(int advanceValue) {
		// 同じ日付のインスタンスを生成する
		Day advanceDate = new Day(this);
		// メソッドadvanceDayを呼び出し生成したadvanceDayを"advanceValue"後ろの日付にする
		advanceDate.advanceDay(advanceValue);
		// beforeDateを返却する
		return advanceDate;
	}
	
	/*
	 * 関数名           :recessionDay
	 * メソッドの説明   :日付を"recessionValue"だけ後ろに進める
	 * パラメータの説明 :recessionValue　進める日数
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public void recessionDay(int recessionValue) {
		// "recessionValue"の回数分処理を行う
		for(int countNumber = 0; countNumber < recessionValue; countNumber++) {
			// メソッドbeforeDayを呼び出す
			beforeDay();
		}
	}
	
	/*
	 * 関数名           :returnRecessionDay
	 * メソッドの説明   :"recessionDay"進めた日付を返却する
	 * パラメータの説明 :recessionDay　進める日数
	 * 返り値           :advanceDate　"recessionDay"日後の日付のインスタンス
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public Day returnRecessionDay(int recessionDay) {
		// 同じ日付のインスタンスを生成する
		Day recessionDate = new Day(this);
		// メソッドrecessionDayを呼び出し生成したrecessionDayを"recessionDay"後ろの日付にする
		recessionDate.recessionDay(recessionDay);
		// beforeDateを返却する
		return recessionDate;
	}
}
