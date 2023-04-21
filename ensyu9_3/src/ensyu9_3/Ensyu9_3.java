package ensyu9_3;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu9_3
 *  概要     :演習問題9-3の銀行口座クラスの確認クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.21
 */
public class Ensyu9_3 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名           :noMaximumLimitInput
	 * メソッドの説明   :引数として渡された値以上の入力された整数値を返す
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 *                   minimumLimit　入力させる値の最小値
	 * 返り値           :inputData　入力された値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static int noMaximumLimitInput(String dataName, int minimumLimit) {
		// 返却するための入力された値を格納する変数を初期化する
		int inputData = 0;
		
		//  "minimumLimit"以上の範囲で入力されるまで繰り返す
		do {
			// 入力を促す
			System.out.print(dataName + " : ");
			// 入力された値を"inputData"に代入する
			inputData = standardInput.nextInt();
		// "inputData"が引数として渡された値のである場合繰り返す
		} while (inputData < minimumLimit);

		// "inputData"を返却する
		return inputData;
	}
	
	/*
	 * 関数名           :noMaximumLimitInput
	 * メソッドの説明   :引数として渡された値以上の入力された整数値を返す
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 *                   minimumLimit　入力させる値の最小値
	 * 返り値           :inputData　入力された値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static long noMaximumLimitInput(String dataName, long minimumLimit) {
		// 返却するための入力された値を格納する変数を初期化する
		long inputData = 0;
		
		//  "minimumLimit"以上の範囲で入力されるまで繰り返す
		do {
			// 入力を促す
			System.out.print(dataName + " : ");
			// 入力された値を"inputData"に代入する
			inputData = standardInput.nextLong();
		// "inputData"が引数として渡された値のである場合繰り返す
		} while (inputData < minimumLimit);

		// "inputData"を返却する
		return inputData;
	}
	
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
		// "inputData"が引数として渡された値の範囲外である場合繰り返す
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

		// 口座名義の入力を促す
		System.out.print("口座名義 : ");
		// 口座名義を入力した文字列で初期化する
		String accountHolder = standardInput.next();
		
		// 口座番号の入力を促す
		System.out.print("口座番号 : ");
		// 口座番号を入力した文字列で初期化する
		String accountNumber = standardInput.next();
		
		// 預金残高を入力した値で初期化する
		long depositBalance = noMaximumLimitInput("預金残高", 0);

		// 口座開設日について問う
		System.out.println("口座開設日");
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
		
		// 銀行口座クラスのインスタンスを生成する
		Account myAccount = new Account(accountHolder, accountNumber, depositBalance,
				new Day(yearValue, monthValue, dateValue));
		
		
		// ループ処理を終了するかの判断のための変数
		boolean roopCheck = true;

		// 無限ループ
		while(roopCheck) {
			// 区切りの出力
			System.out.println("---------------------------------------------------");

			// 行う処理について問う
			System.out.print("0 … 終了 / 1 … 個人情報の表示 / 2 … 口座開設日の表示\n" +
					"3 … 預金残高の表示 / 4 … 預ける / 5 … 引き出す : ");
			// 行う処理について格納する変数を入力された値で初期化する
			int switchProcess = standardInput.nextInt();
			
			// 改行文字の出力
			System.out.println();

			switch (switchProcess) {
			// 0なら
			case 0 : // 終了することを伝える
				System.out.println("終了します");
				// "roopCheck"をfalseにする
				roopCheck = false;
				// switch文を抜ける
				break;
				// 1なら
			case 1 : // メソッドtoStringを呼び出す
				System.out.println(myAccount.toString());
				// switch文を抜ける
				break;
				// 2なら
			case 2 : // getOpeningDayを呼び出す
				System.out.println(myAccount.getOpeningDay());
				// switch文を抜ける
				break;
				// 3なら
			case 3 : // メソッドgetDepositBalanceを呼び出す
				System.out.println(myAccount.getDepositBalance() + "円");
				// switch文を抜ける
				break;
				// 4なら
			case 4 : // メソッドmakeDepositを呼び出す
				myAccount.makeDeposit(noMaximumLimitInput("金額", 0));
				// switch文を抜ける
				break;
				// 5なら
			case 5 : // メソッドwithdrawDepositを呼び出す
				myAccount.withdrawDeposit(noMaximumLimitInput("金額", 0));
				// switch文を抜ける
				break;
				// 該当するものがなければ
			default : // 正しい数値を入力するように表示する
				System.out.println("正しい値を入力してください。");
				// switch文を抜ける
				break;
			}
			// 改行文字の出力
			System.out.println();

		}
	}
}
