package ensyu5_4;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu5_4
 *  概要     :演習問題5-4の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.11
 */
public class Ensyu5_4 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :三つの整数値を読み込んでその合計と平均を求める。
	 *                   このとき平均は実数として表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// スキャナークラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// 一つ目の整数の入力を促す
		System.out.print("整数1 : ");
		// int型の変数"firstValue"を入力された整数で初期化する
		int firstValue = standardInput.nextInt();

		// 二つ目の整数の入力を促す
		System.out.print("整数2 : ");
		// int型の変数"secondValue"を入力された整数で初期化する
		int secondValue = standardInput.nextInt();

		// 三つ目の整数の入力を促す
		System.out.print("整数3 : ");
		// int型の変数"thirdValue"を入力された整数で初期化する
		int thirdValue = standardInput.nextInt();
		
		// 合計を表示する
		System.out.println("合計は " + (firstValue+secondValue+thirdValue) + " です。");
		//平均を表示する
		System.out.println("平均は " + (firstValue+secondValue+thirdValue)/3.0 + " です。");
	}
}