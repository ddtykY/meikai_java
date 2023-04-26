package ensyu9_4;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu9_4
 *  概要     :演習問題9-4のクラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.21
 */
public class Ensyu9_4 {
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
	 * 関数名           :inputData
	 * メソッドの説明   :引数として渡された値の範囲内で入力された実数値を返す
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 *                   minimumLimit　入力させる値の最小値
	 *                   maximumLimit　入力させる値の最大値
	 * 返り値           :inputData　入力された値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	static double inputData(String dataName, double minimumLimit, double maximumLimit) {
		// 返却するための入力された値を格納する変数を初期化する
		double inputData = 0;
		
		//  "minimumLimit"から"maximumLimit"までの範囲で入力されるまで繰り返す
		do {
			// 入力を促す
			System.out.print(dataName + " : ");
			// 入力された値を"inputData"に代入する
			inputData = standardInput.nextDouble();
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
	 * 関数名           :main
	 * メソッドの説明   :作成した人間クラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public static void main(String[] args) {
		// 身長の最小値
		final double MINIMUM_HEIGHT = 101;
		// 身長の最大値
		final double MAXIMUM_HEIGHT = 300;
		// 体重の最小値
		final double MINIMUM_WEIGHT = 1;
		// 体重の最大値
		final double MAXIMUM_WEIGHT = 500;
		
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
		
		// データを入力させる旨を表示する
		System.out.println("あなたの情報を入力してください");
		// 名前の入力を促す
		System.out.print("名前 : ");
		// 入力された文字でString型の変数を初期化する
		String userName = standardInput.next();
		// メソッドinputDataを呼び出し入力された値で身長を表すdouble型の変数を初期化する
		double userHeight = inputData("身長(cm)", MINIMUM_HEIGHT, MAXIMUM_HEIGHT);
		// メソッドinputDataを呼び出し入力された値で体重を表すdouble型の変数を初期化する
		double userWeight = inputData("体重(kg)", MINIMUM_WEIGHT, MAXIMUM_WEIGHT);
		
		// 誕生日を入力するように表示する
		System.out.println("誕生日");
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
		
		// Humanクラスのインスタンスを生成
		Human humanUser = new Human(userName, userHeight, userWeight, new Day(yearValue, monthValue, dateValue));
		
		// ループ処理を終了するかの判断のための変数
		boolean roopCheck = true;
		
		// 無限ループ
		while(roopCheck) {
			// 区切りの出力
			System.out.println("---------------------------------------");
		
			// 行う処理について問う
			System.out.print("0 … 終了 / 1 … 個人データの表示 / 2 … 標準体重の表示\n" +
					"3 … 身長の増減 / 4 … 体重の増減 / 5 … 誕生日の表示 : ");
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
			case 1 : // toStringを呼び出す
				System.out.println(humanUser.toString());
				// switch文を抜ける
				break;
			// 2なら
			case 2 : // printStandardWeightを呼び出す
				humanUser.printStandardWeight();
				// switch文を抜ける
				break;
			// 3なら
			case 3 : // 身長の変化量の入力を促す
				System.out.print("身長の変化量(符号含めて) : ");
				// 入力された値をメソッドchangeHeightに与える
				humanUser.changeHeight(standardInput.nextDouble());
				// switch文を抜ける
				break;
			// 4なら
			case 4 : // 体重の変化量の入力を促す
				System.out.print("体重の変化量(符号含めて) : ");
				// 入力された値をメソッドchangeHeightに与える
				humanUser.changeWeight(standardInput.nextDouble());
				// switch文を抜ける
				break;
			// 4なら
			case 5 : // 誕生日を表示する
				System.out.println("誕生日 : " + humanUser.getBirthDay());
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
