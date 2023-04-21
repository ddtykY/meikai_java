package ensyu9_1;

import java.util.Scanner;

public class Ensyu9_1 {
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
	 * 関数名           :printHumanArray
	 * メソッドの説明   :メソッドputSpecを呼び出し人間クラスの配列の情報を表示する
	 * パラメータの説明 :humanArray　情報を表示する人間クラスの配列
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	static void printHumanArray(Human[] humanArray) {
		// 区切りを表示する
		System.out.println("--------------------");
		// 配列の長さの分だけ繰り返す
		for(int countNumber = 0; countNumber < humanArray.length; countNumber++) {
			// それぞれの基本的な情報を表示する
			humanArray[countNumber].putSpec();
			// 改行する
			System.out.println();
		}
		// 区切りを表示する
		System.out.println("--------------------");
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成した人間クラスの動作確認とともに配列を用いる
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public static void main(String[] args) {
		// 配列の要素数の最小値
		final int MINIMUM_ELEMENT = 1;
		// 配列の要素数の最大値
		final int MAXIMUM_ELEMENT = 100;
		
		// 身長の最小値
		final double MINIMUM_HEIGHT = 50;
		// 身長の最大値
		final double MAXIMUM_HEIGHT = 300;
		// 体重の最小値
		final double MINIMUM_WEIGHT = 1;
		// 体重の最大値
		final double MAXIMUM_WEIGHT = 500;
		
		// 一つ目の人間クラスの配列を生成する
		Human[] firstHumanArray = {
				new Human("山田", 170.5, 88.3),
				new Human("山根", 188.0, 45.9),
				new Human("山岡", 160.1, 55.5)
		};
		// メソッドprintHumanArrayを呼び出し情報を表示する
		printHumanArray(firstHumanArray);
		
		// 二つ目の人間クラスの配列を生成する
		Human[] secondHumanArray;
		
		// 二つ目の配列に要素を代入していく
		secondHumanArray = new Human[] {
				new Human("山本", 166.6, 53.2),
				new Human("山口", 171.2, 66.0),
				new Human("山下", 200.2, 121.1)
		};
		// メソッドprintHumanArrayを呼び出し情報を表示する
		printHumanArray(secondHumanArray);
		
		// メソッドinputDataを呼び出し生成する配列の要素数を決める
		int elementValue = inputData("人数", MINIMUM_ELEMENT, MAXIMUM_ELEMENT);
		// 三つ目の配列を生成する
		Human[] thirdHumanArray = new Human[elementValue];
		// 三つ目の配列の要素数だけ繰り返す
		for(int countNumber = 0; countNumber < thirdHumanArray.length; countNumber++) {
			// 改行文字の出力
			System.out.println();
			// 名前の入力を促す
			System.out.print("名前 : ");
			// 入力された文字でString型の変数を初期化する
			String userName = standardInput.next();
			// メソッドinputDataを呼び出し入力された値で身長を表すdouble型の変数を初期化する
			double userHeight = inputData("身長(cm)", MINIMUM_HEIGHT, MAXIMUM_HEIGHT);
			// メソッドinputDataを呼び出し入力された値で体重を表すdouble型の変数を初期化する
			double userWeight = inputData("体重(kg)", MINIMUM_WEIGHT, MAXIMUM_WEIGHT);
			// 三つ目の配列のそれぞれの要素に入力された人間のデータを代入していく
			thirdHumanArray[countNumber] = new Human(userName, userHeight, userWeight);
			
		}
		// メソッドprintHumanArrayを呼び出し情報を表示する
		printHumanArray(thirdHumanArray);
	}
}
