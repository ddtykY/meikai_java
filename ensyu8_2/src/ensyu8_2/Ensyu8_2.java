package ensyu8_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu8_2
 *  概要     :演習問題8-2のクラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.20
 */
public class Ensyu8_2 {
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
	 * 関数名           :main
	 * メソッドの説明   :Carクラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
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
		// タンク容量の最小値
		final double MINIMUM_TANK = 20;
		// タンク容量の最大値
		final double MAXIMUM_TANK = 150;
		// 燃費の最大値
		final double MAXIMUM_CONSUMPTION = 50;
		
		// データを入力させる旨を表示する
		System.out.println("車のデータを入力してください");
		// 名前の入力を促す
		System.out.print("名前 : ");
		// 入力された文字でString型の変数を初期化する
		String carName = standardInput.next();
		// 名前の入力を促す
		System.out.print("ナンバー : ");
		// 入力された文字でString型の変数を初期化する
		String carNumber = standardInput.next();
		// メソッドinputDataを呼び出し入力された値で車幅を表す変数を初期化する
		int carWidth = inputData("車の幅(mm)", MINIMUM_WIDTH, MAXIMUM_WIDTH);
		// メソッドinputDataを呼び出し入力された値で車高を表す変数を初期化する
		int carHeight = inputData("車の高さ(mm)", MINIMUM_HEIGHT, MAXIMUM_HEIGHT);
		// メソッドinputDataを呼び出し入力された値で車長を表す変数を初期化する
		int carLength = inputData("車の長さ(mm)", MINIMUM_LENGTH, MAXIMUM_LENGTH);
		// メソッドinputDataを呼び出し入力された値でタンク容量を表す変数を初期化する
		double carTank = inputData("タンク容量(L)", MINIMUM_TANK, MAXIMUM_TANK);
		// メソッドinputDataを呼び出し入力された値でガソリン量を表す変数を初期化する
		double carFuel = inputData("ガソリン量(L)", 0, carTank);
		// メソッドinputDataを呼び出し入力された値で燃費を表す変数を初期化する
		double carConsumption = inputData("燃費(km/L)", 1, MAXIMUM_CONSUMPTION);

		// Carクラスのインスタンスを生成
		Car myCar = new Car(carName, carNumber, carWidth, carHeight, carLength, carTank, carFuel, carConsumption);
		
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
					")・残り燃料 " + myCar.getFuel() + "L");
			
			// 給油するかを問う
			System.out.print("給油しますか[1…Yes / 1以外…No] : ");
			// もし入力された値が1なら
			if(standardInput.nextInt() == 1) {
				// 加える燃料の量の入力を促す
				System.out.print("何L : ");
				// もしメソッドaddFuelを呼び出してfalseが返却されたら
				if(!myCar.addFuel(standardInput.nextDouble())) {
					// 容量を超えている旨を表示する
					System.out.println("容量を超えています");
				}
			}
			
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
