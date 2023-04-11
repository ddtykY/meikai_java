package ensyu4_3;

import java.util.Scanner;

/*
 * クラス名:ensyu4_3
 * 概要    :演習問題4_3の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.06
 */
public class ensyu4_3 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :二つの整数値を読み込んで、小さいほう以上、大きいほう以下の全整数を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		
		// 一つ目の整数"firstValue"を入力することを促す
		System.out.print("整数firstValue  : ");
		// int型の変数"firstValue"に入力した値を代入する
		int firstValue = standardInput.nextInt();
		
		// 二つ目の整数"secondValue"を入力することを促す
		System.out.print("整数secondValue : ");
		// int型の変数"secondValue"に入力した値を代入する
		int secondValue = standardInput.nextInt();
		
		// 大きい方の数字を表す変数
		int maximumNumber = firstValue > secondValue ? firstValue : secondValue;
		// 小さい方の数字を表す変数
		int minimumNumber = firstValue < secondValue ? firstValue : secondValue;
		
		
		do {// "minimumNumber"を表示し1加算することを"maximumNumber"と同じ値になるまで繰り返すことで全整数の表示を行う
			// 整数"minimumNumber"を表示する
			System.out.print(minimumNumber + " ");
			// "minimumNumber"を1増やす
			minimumNumber++;
		} while (minimumNumber <= maximumNumber);  // "minimumNumber"が"maximumNumber"以下の場合繰り返す
	}
}
