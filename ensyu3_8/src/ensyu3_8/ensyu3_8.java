package ensyu3_8;

import java.util.Scanner;

/*
* クラス名:ensyu3_8
* 概要    :演習3-8の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_8 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :キーボードから読み込んだ点数に応じて、優/良/可/不可を判定して表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"points"の入力を促す
		System.out.print("点数 : ");
		// int型の変数"points"に入力された整数値を代入する
		int pointNumber = standardInput.nextInt();
		
		
		if (pointNumber >= 0 && pointNumber <= 59) {
			// 点数が0～59の場合は不可と表示する
			System.out.println("不可");
		} else if (pointNumber >= 60 && pointNumber <= 69){
			// 点数が60～69の場合は可と表示する
			System.out.println("可");
		} else if (pointNumber >= 70 && pointNumber <= 79){
			// 点数が70～79の場合は良と表示する
			System.out.println("良");
		} else if (pointNumber >= 80 && pointNumber <= 100) {
			// 点数が80～100の場合は優と表示する
			System.out.println("優");
		} else {
			// ほかのどの条件にも当てはまらない場合は不正な値であることを表示する
			System.out.println("不正な値です");	
		}
	}
}
