package ensyu7_10;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_10
 *  概要     :演習問題7-10の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_10 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :confirmRetry
	 * メソッドの説明   :続行の確認を行う(List7-11のメソッド)
	 * パラメータの説明 :なし
	 * 返り値           :true　続行する
	 *                   false　続行しない
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static boolean confirmRetry() {
		// 続行を行うか確認するための変数を0で初期化する
		int continueCheck = 0;
		// 1か0が入力されるまで確認する処理を行う
		do {
			// もう一度行うか確認する
			System.out.print("もう一度？<Yes…1 / No…0> : ");
			// "continueCheck"に入力された値を代入する
			continueCheck = standardInput.nextInt();
		// 1か0以外が入力された場合繰り返す
		} while (continueCheck != 0 && continueCheck != 1);
		return continueCheck == 1;
	}
	
	/*
	 * 関数名           :executeOperation
	 * メソッドの説明   :"operatorNumber"の値によって二つの値の演算処理を行う
	 *                   0なら減算、1なら加算処理を行う
	 * パラメータの説明 :operatorNumber　演算の種類を決定する
	 *                   firstValue　演算に利用される一つ目の値
	 *                   secondValue　演算に利用される二つ目の値
	 * 返り値           :resultValue
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static int executeOperation(int operatorNumber, int firstValue, int secondValue) {
		// 演算結果を格納する変数を"firstValue"で初期化する
		int resultValue = firstValue;
		
		// "operatorNumber"が0なら
		if (operatorNumber == 0) {
			// "resultValue"から"secondValue"を引く
			resultValue -= secondValue;
		//"operatorNumber"が1なら
		} else if(operatorNumber == 1) {
			// "resultValue"に"secondValue"を加算する
			resultValue += secondValue;
		}
		// "resultValue"を返却する
		return resultValue;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :四種類の問題をランダムに出題する(List7-11の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを生成する
		Random randomNumber = new Random();
		
		// 問題の数値の下限を表す定数
		final int LOWER_LIMIT = 100;
		// 問題の数値の範囲を表す定数
		final int QUESTION_RANGE = 900;
		
		// 演算の種類を表す定数
		final int OPERATOR_TYPE = 2;
		// 演算子の文字を格納する配列
		String[] operatorString = {" + ", " - "};
		
		// 問題に用いられる値の数を表す定数
		final int VALUE_NUMBER = 3;
		
		// 暗算力トレーニングを行う旨を表示する
		System.out.println("暗算力トレーニング!!");
		
		// 問題を出題し解答させる処理を行う繰り返し
		do {
			// 何度か使用するためfor文の制御に用いるint型の変数を0で初期化する
			int countNumber = 0;
			
			// 問題に用いられる値を格納するための配列
			int[] integerValueArray = new int[VALUE_NUMBER];
			// 問題に用いられる値の数だけ乱数を生成する処理を行う
			for(countNumber = 0; countNumber < VALUE_NUMBER; countNumber++) {
				// 乱数を生成しintegerValueArrayに代入していく
				integerValueArray[countNumber] = randomNumber.nextInt(QUESTION_RANGE) + LOWER_LIMIT;
			}
			
			// 問題に用いられる演算子を格納するための配列
			// 要素数は問題に用いられる値よりも一つ少ない
			int[] operatorArray = new int[VALUE_NUMBER - 1];
			// 問題に用いられる演算子の数だけ乱数を生成する処理を行う
			for(countNumber = 0; countNumber < VALUE_NUMBER - 1; countNumber++) {
				// 乱数を生成しoperatorArrayに代入していく
				operatorArray[countNumber] = randomNumber.nextInt(OPERATOR_TYPE);
			}
			
			// 正解が入力されるまで繰り返す
			while (true) {
				// 問題の一つ目の値を表示する
				System.out.print(integerValueArray[0]);
				// 問題文を表示するためのループ処理
				for(countNumber = 1; countNumber < VALUE_NUMBER; countNumber++) {
					// 各演算子を表示する
					System.out.print(operatorString[operatorArray[countNumber-1]]);
					// 各問題の値を表示する
					System.out.print(integerValueArray[countNumber]);
				}
				// 問題の解答の入力を促す
				System.out.print(" = ");
				
				// 入力された解答から"firstIntegerValue"を引いた値をint型の変数"playerAnswer"に代入する
				int playerAnswer = standardInput.nextInt() - integerValueArray[0];
				
				// 回答があっているか確かめるための演算処理を行う
				for(countNumber = 0; countNumber < VALUE_NUMBER - 1; countNumber++) {
					// メソッドexecuteOperationにそれぞれ値と演算子を表す値を与え、"playerAnswer"に代入する
					playerAnswer = executeOperation(operatorArray[countNumber], playerAnswer, integerValueArray[countNumber+1]);
				}
				
				// もし"playerAnswer"が0なら
				if(playerAnswer == 0) {
					// 正解である旨を表示する
					System.out.println("正解です!!\n");
					// 繰り返しを抜ける
					break;
				}
				// ここまで処理が行われるということは解答が間違いであるため、その旨を表示する
				System.out.println("違いますよ!!");
			}
		// メソッドconfirmRetryを呼び出しtrueが返却されたら繰り返す
		} while (confirmRetry());
	}
}


