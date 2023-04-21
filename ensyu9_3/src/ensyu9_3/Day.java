package ensyu9_3;

/*
 *  クラス名 :Day
 *  概要     :日付クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.21
 */
public class Day {
	// フィールドの宣言
	// 年
	private int yearNumber = 1;
	// 月
	private int monthNumber = 1;
	// 日
	private int dateNumber = 1;
	
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
		// フィールドの"monthNumber"に引数の"monthNumber"を代入する
		this.monthNumber = monthNumber;
	}
	// 年月日すべて引数として与えられその値で初期化する
	public Day(int yearNumber, int monthNumber, int dateNumber) {
		// 一つ上のコンストラクタを呼び出し"yearNumber"と"monthNumber"を設定する
		this(yearNumber, monthNumber);
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
		String[] weekDay = {"日", "火", "水", "木", "金", "土", "月"};
		// 自身の年月日に対応した文字列を返却する
		return String.format("%04d年%02d月%02d日(%s)", yearNumber, monthNumber, dateNumber, weekDay[dayOfWeek()]);
	}
}
