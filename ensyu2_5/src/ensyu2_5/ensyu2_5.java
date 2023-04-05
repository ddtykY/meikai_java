package ensyu2_5;

import java.util.Scanner;

/*
 * クラス名:ensyu2_5
 * 概要    :演習2-5の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_5 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :二つの実数値を読み込み、その和と平均を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 実数値"firstvalue"の入力を促す
		System.out.print("firstValueの値 : ");
		// "firstValue"に整数値を読み込む
		double firstValue = standardInput.nextDouble();

		// 実数値"secondvalue"の入力を促す
		System.out.print("firstValueの値 : ");
		// "secondVvalue"に整数値を読み込む
		double secondValue = standardInput.nextDouble();
		
		//二つの実数値の合計を表示する
		System.out.println("合計は" + (firstValue + secondValue) + "です。");
		//二つの実数値の平均を表示する
		System.out.println("平均は" + (firstValue + secondValue) / 2 + "です。");
		
		//standardInputを閉じる
		standardInput.close();
	}

}
