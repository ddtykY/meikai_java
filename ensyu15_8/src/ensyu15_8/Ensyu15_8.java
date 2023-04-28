package ensyu15_8;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;
/*
 *  クラス名 :Ensyu15_8
 *  概要     :演習問題15-8の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.28
 */
public class Ensyu15_8 {
	// 月の最小値
	static final int MINIMUM_MONTH = 1;
	// 月の最大値
	static final int MAXIMUM_MONTH = 12;
	// 日の最小値
	static final int MINIMUM_DATE = 1;
	// 日の最大値を格納する配列
	static final int[] MAXIMUM_DATE = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// うるう年の2月の日数
	static final int LEAP_DATE = 29;
	// 週にある日付の数
	static final int NUMBER_WEEK_DATE = 7;
	
	/*
	 * 関数名           :isLeap
	 * メソッドの説明   :引数として渡された年がうるう年か判定する
	 * パラメータの説明 :yearValue　判定の対象
	 * 返り値           :うるう年ならtrue
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static boolean isLeap(int yearValue) {
		// "yearValue"が100の倍数ではない4の倍数かあるいは400の倍数であるときtrueを返却する
		return yearValue % 4 == 0 && yearValue % 100 != 0 || yearValue % 400 == 0;
	}
	
	/*
	 * 関数名           :judgeDayOfWeek
	 * メソッドの説明   :曜日を求める
	 * パラメータの説明 :なし
	 * 返り値           :それぞれの曜日に対応した0～6の整数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static int judgeDayOfWeek(int yearNumber, int monthNumber, int dateNumber) {
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

		// ツェラーの公式で求めた値を7で割った余剰を返却する
		return (yearValue + yearValue/4 - yearValue/100 + yearValue/400 + (13*monthValue+8)/5 + dateNumber) % NUMBER_WEEK_DATE;
	}
	
	/*
	 * 関数名           :printCalendar
	 * メソッドの説明   :カレンダーを出力する
	 * パラメータの説明 :yearValue　表示するカレンダーの年
	 *                  :monthValue　表示するカレンダーの月
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static void printCalendar(int yearValue, int monthValue){
		// メソッドjudgeDayOfWeekを呼び出して与えられた月の初日の曜日を取得する
		int dayWeek = judgeDayOfWeek(yearValue, monthValue, MINIMUM_DATE);
		// その月の日数を表す変数
		int numberOfDate = 0;
		
		// もしうるう年の2月なら
		if (monthValue == 2 && isLeap(yearValue)){
			// "numberOfDate"を"LEAP_DATE"に設定する
			numberOfDate = LEAP_DATE;
		// もし上記に該当しないなら
		} else {
			// "numberOfDate"を引数として与えられた月の"MAXIMUM_DATE"に設定する
			numberOfDate = MAXIMUM_DATE[monthValue-1];
		}
		// 区切りを表示する
		System.out.println("-------------------------------");
		// 表示する年と月を示す
		System.out.printf("\t\t\t%04d.%02d\n", yearValue, monthValue);
		// 曜日を表示する
		System.out.println("  日  月  火  水  木  金  土");
		// 最初の週の初日の曜日の下に日付が来るように調整する
		// 初日の曜日を表す"dayWeek"の数だけ繰り返す
		for (int countDay = 0; countDay < dayWeek; countDay++) {
			// スペースを表示する
			System.out.print("\t");
		}
		// 日付を表示していく
		// "numberOfDate"の数だけ繰り返す
		for (int countDate = 1; countDate <= numberOfDate; countDate++){
			// "countDate"を表示する
			System.out.printf("%4d", countDate);
			// 曜日を表す"dayWeek"をインクリメントする
			dayWeek++;
			// もし"dayWeek"が"NUMBER_WEEK_DATE"なら
			if(dayWeek == NUMBER_WEEK_DATE) { 
				// "dayWeek"を0とする
				dayWeek = 0; 
				// 改行する
				System.out.println();	
			}
		}
		// 区切りを表示する
		System.out.println("\n-------------------------------\n");
	}

	/*
	 * 関数名           :main
	 * メソッドの説明   :コマンドライン引数で与えられた月のカレンダーを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.28
	 */
	public static void main(String[] args) {
		// GregorianCalendarクラスのインスタンスを生成する
		GregorianCalendar todayDate = new GregorianCalendar();
		
		// 引数として与えられた配列の年が格納されているインデックス
		final int YEAR_INDEX = 0;
		// 引数として与えられた配列の月が格納されている最初のインデックス
		final int FIRST_YEAR_INDEX = 1;
		
		// 今の年で変数を初期化する
		int currentYear = todayDate.get(YEAR);
		// 今の月で変数を初期化する
		int currentMonth = todayDate.get(MONTH)+1;
		
		
		// 入力された値の数をint型の変数に格納する
		int parameterLength = args.length;
		
		// もし入力された値の数が0なら
		if(parameterLength == 0) {
			// 引数として今の年と月を与えメソッドprintCalendarを呼び出す
			printCalendar(currentYear, currentMonth);
		// もし入力された値の数が1なら
		} else if(parameterLength == 1) {
			// 与えられた年で変数を初期化する
			int parameterYear = Integer.parseInt(args[YEAR_INDEX]);
			// "MINIMUM_MONTH"から"MAXIMUM_MONTH"まで繰り返す
			for(int countMonth = MINIMUM_MONTH; countMonth <= MAXIMUM_MONTH; countMonth++) {
				// 引数として与えられた年と"countMonth"を与えメソッドprintCalendarを呼び出す
				printCalendar(parameterYear, countMonth);
			}
		// もし入力された値の数が2以上なら
		} else if(parameterLength >= 2) {
			// 与えられた年で変数を初期化する
			int parameterYear = Integer.parseInt(args[YEAR_INDEX]);
			// 入力された値の数から1引いた回数繰り返す
			for(int countIndex = FIRST_YEAR_INDEX; countIndex < parameterLength; countIndex++) {
				// "countIndex"番目の要素の値でint型の変数を初期化する
				int monthNumber = Integer.parseInt(args[countIndex]);
				// もし月として与えられた数が"MINIMUM_MONTH"から"MAXIMUM_MONTH"の範囲から外れている場合
				if(monthNumber < MINIMUM_MONTH || monthNumber > MAXIMUM_MONTH) {
					// その月が存在しないことを表示する
					System.out.println(monthNumber + "月 は存在しません\n");
				// もし範囲内なら
				} else {
					// 引数として与えられた年と"countMonth"を与えメソッドprintCalendarを呼び出す
					printCalendar(parameterYear, monthNumber);
				}
			}
			
		}
	}
}
