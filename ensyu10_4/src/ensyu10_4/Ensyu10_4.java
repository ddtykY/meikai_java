package ensyu10_4;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu10_4
 *  概要     :演習問題10-4の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class Ensyu10_4 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :createDay
	 * メソッドの説明   :Dayクラスのインスタンスを生成する
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 * 返り値           :入力された値をもとに生成したDayクラスのインスタンス
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	static Day createDay(String dataName) {
		// 日付を入力するように表示する
		System.out.println(dataName);
		// 年の入力を促す
		System.out.print("年 : ");
		// 入力された値で年を表す変数を初期化する
		int yearValue = standardInput.nextInt();
		// 月の入力を促す
		System.out.print("月 : ");
		// 入力された値で月を表す変数を初期化する
		int monthValue = standardInput.nextInt();
		// 日の入力を促す
		System.out.print("日 : ");
		// 入力された値で日を表す変数を初期化する
		int dateValue = standardInput.nextInt();
		
		//すべての入力が終了したら改行する
		System.out.println();
		// 入力された値でDayクラスのインスタンスを生成し返却する
		return new Day(yearValue, monthValue, dateValue);
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成したDayクラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.24
	 */
	public static void main(String[] args) {
		// 引数を与えずにインスタンスを生成する
		Day todayDate = new Day();
		// toDayDateを表示する
		System.out.println("今日は : " + todayDate.toString() + " です\n");
		
		// 使いたい日付を入力させインスタンスを生成する
		Day confirmDay = createDay("メソッド確認用の日付");
		// 日付を表示する
		System.out.println(confirmDay.toString() + "\n");
		
		// メソッドelapsedDayを呼び出し返却された値を表示する
		System.out.println("その年の元旦からの経過日数は " + confirmDay.elapsedDay() + "日 です");
		// メソッドremainingDayを呼び出し残り日数を表示する
		System.out.println("その年の残り日数は " + confirmDay.remainingDay() + "日 です");
		// 実行日とconfirmDayの前後関係を表示することを示す
		System.out.print("その日は実行日と比べ : ");
		// メソッドbeforeAfterを呼び出す
		confirmDay.beforeAfter(todayDate);
		// 比べたい日付を入力させインスタンスを生成する
		Day.beforeAfterTwo(confirmDay, createDay("比べたい日付"));
		// 日付を一つ後ろに進める
		confirmDay.nextDay();
		// 日付を表示する
		System.out.println("一つ後ろに日付を進めました\n" + confirmDay.toString() + " です");
		
		// 何日後ろに進めるか入力を促す
		System.out.print("何日後ろに進める : ");
		// 入力された値分日付を進める
		confirmDay.advanceDay(standardInput.nextInt());
		// 日付を表示する
		System.out.println(confirmDay.toString() + " となりました");

		// 日付を一つ前に戻す
		confirmDay.beforeDay();
		// 日付を表示する
		System.out.println("一つ前に日付を戻しました\n" + confirmDay.toString() + " です");

		// 何日前戻すか入力を促す
		System.out.print("何日前に戻す : ");
		// 入力された値分日付を進める
		confirmDay.recessionDay(standardInput.nextInt());
		// 日付を表示する
		System.out.println(confirmDay.toString() + " となりました\n");
	
		// 配列を作ることを伝える
		System.out.println("\n実行日の次の日、前日、n日後、m日前のインスタンスを生成します");
		// 何日後か問う
		System.out.print("何日後 : ");
		// 進める日数を表す変数を入力された値で初期化する
		int advanceValue = standardInput.nextInt();

		// 何日前か問う
		System.out.print("何日前 : ");
		// 戻す日数を表す変数を入力された値で初期化する
		int recessionValue = standardInput.nextInt();
		
		// Dayクラスの配列を生成する
		Day[] dayArray = {
			// メソッドreturnNextDayを呼び出し実行日の次の日を0番目の要素とする
			new Day(todayDate.returnNextDay()),
			// メソッドreturnBeforeDayを呼び出し実行日の前の日を1番目の要素とする
			new Day(todayDate.returnBeforeDay()),
			// メソッドreturnAdvanceDayを呼び出し実行日の365日後の日を2番目の要素とする
			new Day(todayDate.returnAdvanceDay(advanceValue)),
			// メソッドreturnAdvanceDayを呼び出し実行日の365日前の日を2番目の要素とする
			new Day(todayDate.returnRecessionDay(recessionValue))
		};
		
		// dayArrayの要素数分繰り返す
		for(int countNumber = 0; countNumber < dayArray.length; countNumber++) {
			// 各要素を表示する
			System.out.println(dayArray[countNumber].toString());
		}
		
		
	}
	
	
}
