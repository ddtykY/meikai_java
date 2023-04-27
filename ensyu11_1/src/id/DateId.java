package id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

/*
 *  クラス名 :DateId
 *  概要     :識別番号クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.25
 */
public class DateId {
	// フィールドの宣言
	// 何番までの識別番号を与えたか
	private static int counterId = 0;

	// 識別番号
	private int userId;
	
	// 静的初期化子
	static {
		// GregorianCalendarクラスのインスタンスを生成する
		GregorianCalendar todayDate = new GregorianCalendar();
		// 年
		int yearNumber = todayDate.get(YEAR);
		// 月
		int monthNumber = todayDate.get(MONTH)+1;
		// 日
		int dateNumber = todayDate.get(DATE);
		
		// 日付を表示する
		System.out.printf("今日は%04d年%02d月%02d日です。\n", yearNumber, monthNumber, dateNumber);
		// "counterId"にyyyymmdd00を代入する
		counterId = yearNumber * 1000000 + monthNumber * 10000 + dateNumber * 100;
	}
	
	// コンストラクタ
	public DateId() {
		// "counterId"をインクリメントして識別番号とする
		userId = ++counterId;
	}
	
	/*
	 * 関数名           :getUserId
	 * メソッドの説明   :識別番号を取得する
	 * パラメータの説明 :なし
	 * 返り値           :userId　識別番号
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public int getUserId() {
		// "userId"を返却する
		return userId;
	}
}
