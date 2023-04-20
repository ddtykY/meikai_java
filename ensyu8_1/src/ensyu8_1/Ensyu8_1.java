package ensyu8_1;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu8_1
 *  概要     :演習問題8-1のクラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.20
 */
public class Ensyu8_1 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :inputData
	 * メソッドの説明   :引数として渡された値の範囲内で入力された実数値を返す
	 * パラメータの説明 :dataName　入力させるデータについての文字列
	 *                   minimumLimit　入力させる値の最小値
	 *                   maximumLimit　入力させる値の最大値
	 * 返り値           :inputData　
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
	 * メソッドの説明   :作成した人間クラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public static void main(String[] args) {
		// 身長の最小値
		final double MINIMUM_HEIGHT = 50;
		// 身長の最大値
		final double MAXIMUM_HEIGHT = 300;
		// 体重の最小値
		final double MINIMUM_WEIGHT = 1;
		// 体重の最大値
		final double MAXIMUM_WEIGHT = 500;
		
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
		
		// Humanクラスのインスタンスを生成
		Human humanUser = new Human(userName, userHeight, userWeight);
		
		// ループ処理を終了するかの判断のための変数
		boolean roopCheck = true;
		
		// 無限ループ
		while(roopCheck) {
			// 区切りの出力
			System.out.println("---------------------------------------");
		
			// 行う処理について問う
			System.out.print("0 … 終了 / 1 … 個人データの表示 / 2 … 標準体重の表示\n" +
					"3 … 身長の増減 / 4 … 体重の増減 : ");
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
			case 1 : // putSpecを呼び出す
				humanUser.putSpec();
				// switch文を抜ける
				break;
			// 2なら
			case 2 : // printStandardWeightを呼び出す
				humanUser.printStandardWeight();
				// switch文を抜ける
				break;
			// 3なら
			case 3 : // メソッドinputDataを呼び出し身長の変化量を表す変数を初期化する
				// ここでは身長の最大値と最小値を超えないように範囲を定めている
				double heightChange = inputData("身長の変化量(符号含めて)", 
						-(humanUser.getHeight() - MINIMUM_HEIGHT), (MAXIMUM_HEIGHT - humanUser.getHeight()));
				// changeHeightを呼び出す
				humanUser.changeHeight(heightChange);
				// 変化後の身長を表示する
				System.out.println("変化後の身長 : " + humanUser.getHeight() + "cm");
				// switch文を抜ける
				break;
			// 4なら
			case 4 : // メソッドinputDataを呼び出し身長の変化量を表す変数を初期化する
				// ここでは体重の最大値と最小値を超えないように範囲を定めている
				double weightChange = inputData("体重の変化量(符号含めて)", 
						-(humanUser.getWeight() - MINIMUM_WEIGHT), (MAXIMUM_WEIGHT - humanUser.getWeight()));
				// changeHeightを呼び出す
				humanUser.changeWeight(weightChange);
				// 変化後の体重を表示する
				System.out.println("変化後の体重 : " + humanUser.getWeight() + "kg");
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
