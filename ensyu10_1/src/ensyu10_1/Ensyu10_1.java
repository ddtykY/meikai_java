package ensyu10_1;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu10_1
 *  概要     :演習問題10-1の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class Ensyu10_1 {
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
	 * 関数名           :main
	 * メソッドの説明   :作成した期間クラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.24
	 */
	public static void main(String[] args) {
		// 一つ目のIdクラスのインスタンスを生成する
		Id firstUser = new Id();
		// 二つ目のIdクラスのインスタンスを生成する
		Id secondUser = new Id();
		
		// firstUserの識別番号を確認する
		System.out.println("一人目の識別番号 : " + firstUser.getUserId());
		// secondUserの識別番号を確認する
		System.out.println("二人目の識別番号 : " + secondUser.getUserId() + "\n");
		
		// 最後に与えた識別番号を表示する
		System.out.println("最後に与えた識別番号 : " + Id.getMaxId());

	}

}
