package ensyu12_1;

// スキャナークラスをインポート
import java.util.Scanner;

/*
 *  クラス名 :Ensyu12_1
 *  概要     :演習問題12-1のクラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.25
 */
public class Ensyu12_1 {
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
	 * 作成日           :2023.04.20
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
	 * 関数名           :noMaximumLimitInput
	 * メソッドの説明   :引数として渡された値以上の入力された整数値を返す
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 *                   minimumLimit　入力させる値の最小値
	 * 返り値           :inputData　入力された値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	static double noMaximumLimitInput(String dataName, double minimumLimit) {
		// 返却するための入力された値を格納する変数を初期化する
		double inputData = 0;

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
	 * メソッドの説明   :Carクラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.25
	 */
	public static void main(String[] args) {
		// 車幅の最小値
		final int MINIMUM_WIDTH = 1000;
		// 車幅の最大値
		final int MAXIMUM_WIDTH = 3000;
		// 車高の最小値
		final int MINIMUM_HEIGHT = 1000;
		// 車高の最大値
		final int MAXIMUM_HEIGHT = 4000;
		// 車長の最小値
		final int MINIMUM_LENGTH = 1000;
		// 車長の最大値
		final int MAXIMUM_LENGTH = 15000;

		// データを入力させる旨を表示する
		System.out.println("車のデータを入力してください");
		// 名前の入力を促す
		System.out.print("名前 : ");
		// 入力された文字でString型の変数を初期化する
		String carName = standardInput.next();
		// メソッドinputDataを呼び出し入力された値で車幅を表す変数を初期化する
		int carWidth = inputData("車の幅(mm)", MINIMUM_WIDTH, MAXIMUM_WIDTH);
		// メソッドinputDataを呼び出し入力された値で車高を表す変数を初期化する
		int carHeight = inputData("車の高さ(mm)", MINIMUM_HEIGHT, MAXIMUM_HEIGHT);
		// メソッドinputDataを呼び出し入力された値で車長を表す変数を初期化する
		int carLength = inputData("車の長さ(mm)", MINIMUM_LENGTH, MAXIMUM_LENGTH);
		// メソッドinputDataを呼び出し入力された値でガソリン量を表す変数を初期化する
		double carFuel = noMaximumLimitInput("ガソリン量(L)", 0);
		// 購入日
		Day purchaseDay = createDay("購入日");
		
		
		// Carクラスのインスタンスを生成
		TotalDistance myCar = new TotalDistance(carName, carWidth, carHeight, carLength, carFuel, purchaseDay);

		// 区切りを表示する
		System.out.println("-------------------------------------");
		// メソッドputSpecを呼び出す
		myCar.putSpec();
		// 区切りを表示する
		System.out.println("-------------------------------------");

		// 無限ループ
		while (true) {
			// 現在地や残り燃料を表示する
			System.out.println("現在地(" + myCar.getXCoordinate() + ", " + myCar.getYCoordinate() +
					")・残り燃料" + Math.round(myCar.getFuel()) + "L\n総走行距離 : " + Math.round(myCar.calculateTotalDistance()));
			
			// 移動するか問う
			System.out.print("\n移動しますか[1…Yes / 1以外…No] : ");
			// もし入力された値が1でないなら
			if(standardInput.nextInt() != 1) {
				// 終了する旨を伝える
				System.out.println("終了します");
				// ループを抜ける
				break;
			}

			// X方向の移動距離の入力を促す
			System.out.print("X方向の移動距離 : ");
			// 入力された値でX方向の移動距離を表す変数を初期化する
			double xDistance = standardInput.nextDouble();
			// Y方向の移動距離の入力を促す
			System.out.print("Y方向の移動距離 : ");
			// 入力された値でY方向の移動距離を表す変数を初期化する
			double yDistance = standardInput.nextDouble();

			// もしメソッドmovePossibleを呼び出しfalseが返却されたら
			if(!myCar.movePossible(xDistance, yDistance)) {
				// 燃料が足りない旨を表示する
				System.out.println("燃料が足りません!");
			}
			
			// 改行文字の出力
			System.out.println();
		}
	}
}