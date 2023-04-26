package ensyu9_5;

/*
 *  クラス名 :Period
 *  概要     :演習問題9-5の期間クラスです
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class Period {
	// フィールドの宣言
	// 開始日
	private Day from;
	// 終了日
	private Day to;
	
	// コンストラクタ
	public Period(Day from, Day to) { 
		// フィールドの"from"に引数の"from"のコピーへの参照を代入する
		this.from = new Day(from);
		// フィールドの"to"に引数の"to"のコピーへの参照を代入する
		this.to = new Day(to);
	}
	
	/*
	 * 関数名           :getFrom
	 * メソッドの説明   :開始日を取得
	 * パラメータの説明 :なし
	 * 返り値           :from　開始日
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	Day getFrom() {
		// "from"を返却する
		return new Day(from);
	}
	
	/*
	 * 関数名           :getTo
	 * メソッドの説明   :終了日を取得
	 * パラメータの説明 :なし
	 * 返り値           :to　終了日
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	Day getTo() {
		// "to"を返却する
		return new Day(to);
	}
	
	/*
	 * 関数名           :setFrom
	 * メソッドの説明   :開始日を設定
	 * パラメータの説明 :from　開始日
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
    public void setFrom(Day from)  {
    	// フィールドの"from"に引数の"from"のコピーへの参照を代入する
    	this.from = new Day(from);
    }
    
    /*
	 * 関数名           :setTo
	 * メソッドの説明   :終了日を設定
	 * パラメータの説明 :to　終了日
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
    public void setTo(Day to)  {
    	// フィールドの"to"に引数の"to"のコピーへの参照を代入する
    	this.to = new Day(to);
    }
    
    /*
	 * 関数名           :setPeriod
	 * メソッドの説明   :期間を設定
	 * パラメータの説明 :from　開始日
	 *                   to　終了日
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
    public void setPeriod(Day from, Day to) {
    	// フィールドの"from"に引数の"from"のコピーへの参照を代入する
    	this.from = new Day(from);
    	// フィールドの"to"に引数の"to"のコピーへの参照を代入する
    	this.to = new Day(to);
    }
    
    /*
	 * 関数名           :fromIsEarlier
	 * メソッドの説明   :終了日より開始日の方が後になっているかを確かめる
	 * パラメータの説明 :なし
	 * 返り値           :終了日の方が後ならtrueを
	 *                   開始日の方が後ならfalseを返却する
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
    public boolean fromIsEarlier() {
    	// 終了日の方が早いか確かめる変数
    	boolean beforeAfter = true;
    	// もし終了日の年が後なら
    	if (from.getYearNumber() < to.getYearNumber()) {
    		// "beforeAfter"をfalseにする
    		beforeAfter = false;
    	// もし同じ年なら
    	} else if (from.getYearNumber() == to.getYearNumber()){
    		// もし終了日の月が後なら
        	if (from.getMonthNumber() < to.getMonthNumber()) {
        		// "beforeAfter"をfalseにする
        		beforeAfter = false;
        	// もし同じ月なら
        	} else if (from.getMonthNumber() == to.getMonthNumber()){
        		// もし終了日が同じか後なら
        		if (from.getDateNumber() <= to.getDateNumber()) {
            		// "beforeAfter"をfalseにする
            		beforeAfter = false;
        		}
        	}
    	}
    	// "beforeAfter"を返却する
    	return beforeAfter;
    }
    
    /*
	 * 関数名           :calculatePeriod
	 * メソッドの説明   :期間を設定
	 * パラメータの説明 :なし
	 * 返り値           :periodValue　期間を日数に直したもの
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
    public int calculatePeriod () {
    	// それぞれの日数を求めてその差を返却する
    	// この時開始日を1日として含めるために1加算する
    	return to.calculateDay() - from.calculateDay() + 1;
    }
	
    /*
	 * 関数名           :toString
	 * メソッドの説明   :開始日と終了日の文字列を返却する
	 * パラメータの説明 :なし
	 * 返り値           :開始日と終了日の文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public String toString() {
		// 開始日と終了日の文字列を返却する
		return String.format("開始日 : %s\n終了日 : %s", from.toString(), to.toString());
	}
}
