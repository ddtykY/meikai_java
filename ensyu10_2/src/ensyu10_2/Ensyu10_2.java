package ensyu10_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu10_2
 *  概要     :演習問題10-2の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class Ensyu10_2 {
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
	 * メソッドの説明   :作成した連番クラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.24
	 */
	public static void main(String[] args) {
		// イテレータとして用いる人数を表す変数
		int countNumber = 1;
		
		// 識別番号の幅を表示する
		System.out.println("識別番号の幅 : " + ExId.getWidthId());
		
		// 何人に識別番号を与えるかを問う
		int userNumber = noMaximumLimitInput("何人目まで識別番号を与えますか", countNumber);
		// 入力された値まで識別番号を与え表示する
		while(countNumber <= userNumber) {
			// 識別番号を表示していく
			System.out.println(countNumber + "人目 の識別番号 : " + new ExId().getUserId());
			// "countNumber"をインクリメントする
			countNumber++;
		}
		// 最後に与えた識別番号を表示する
		System.out.println("\n最後に与えた識別番号 : " + ExId.getMaxId() + "\n");
		
		// 識別番号の幅正の整数値に変える
		ExId.changeWidthId(noMaximumLimitInput("識別番号の幅", 0));
		
		// 何人に識別番号を与えるかを問う
		userNumber = noMaximumLimitInput("何人目まで識別番号を与えますか", countNumber);
		// 入力された値まで識別番号を与え表示する
		while(countNumber <= userNumber) {
			// 識別番号を表示していく
			System.out.println(countNumber + "人目 の識別番号 : " + new ExId().getUserId());
			// "countNumber"をインクリメントする
			countNumber++;
		}
		// 最後に与えた識別番号を表示する
		System.out.println("\n最後に与えた識別番号 : " + ExId.getMaxId() + "\n");


	}

}
