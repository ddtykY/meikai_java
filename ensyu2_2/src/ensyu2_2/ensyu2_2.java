package ensyu2_2;
/*
 * クラス名:ensyu2_2
 * 概要    :演習2-2の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */

public class ensyu2_2 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :三つのint型変数に値を代入し、合計と平均を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		int firstValue;   //一つ目の整数値を代入するint型の変数
		int secondValue;  //二つ目の整数値を代入するint型の変数
		int thirdValue;   //三つ目の整数値を代入するint型の変数
		
		firstValue  = 63; //firstValueに63を代入
		secondValue = 18; //secondValueに18を代入
		thirdValue  = 33; //thirdValueに33を代入
		
		//一つ目の変数を表示する。
		System.out.println("firstValueの値は" + firstValue + "です。");
		//二つ目の変数を表示する。
		System.out.println("secondValueの値は" + secondValue + "です。");
		//三つ目の変数を表示する。
		System.out.println("thirdValueの値は" + thirdValue + "です。");
		//三つの数の合計を表示する。
		System.out.println("合計は" + (firstValue + secondValue + thirdValue) + "です。");
		//三つの数の合計を表示する。
		System.out.println("平均は" + (firstValue + secondValue + thirdValue) / 3 + "です。");
	}
}
