package ensyu4_25;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_25_2
 *  概要     :演習問題4-25のList4-18の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class ensyu4_25_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ整数を加算し平均を求める。このとき合計が1000を超えない範囲で加算する(List4-18の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 入力された整数の加算、平均を行う旨を表示する
		System.out.println("整数を加算し平均を求めます");
		
		// 加算する個数を格納する変数
		int quantityNumber;
		
		// 個数として正の整数値が入力されるまで繰り返す 
		do {
			// 個数の入力を促す
			System.out.print("何個加算しますか : ");
			// int型の変数"quantityNumber"を入力された値で初期化する
			quantityNumber = standardInput.nextInt();
		// "quantityNumber"が0以下である場合繰り返す
		} while (quantityNumber <= 0);
		
		// 合計を表す変数を0で初期化する
		int sumValue = 0;
		// 加算した個数を表す変数を1で初期化する
		int sumCount = 0;
		
		// 入力された値"quantiryNumber"回繰り返す
		for(int countNumber = 0; countNumber < quantityNumber; countNumber++) {
			// 整数の入力を促す
			System.out.print("整数: ");
			// int型の整数"integerValue"を入力された値で初期化する
			int integerValue = standardInput.nextInt();
			
			// 入力された値を"sumValue"に加算したとき1000を超えるなら
			if(sumValue + integerValue > 1000) {
				// 合計が1000を超えた旨を表示する
				System.out.println("合計が1000を超えました");
				// 最後の数値を無視することを伝える
				System.out.println("最後の数値は無視します");
				// for文を抜け出す
				break;
			}
			// 合計を表す変数"sumValue"に入力された値(integeValue)を加算する
			sumValue += integerValue;
			// 加算した回数を数えるために"sumCount"をインクリメントする
			sumCount++;
		}
		
		// 合計と平均を表示する
		System.out.print("合計は " + sumValue + " で平均は " + sumValue / sumCount + " です。");
	}
}