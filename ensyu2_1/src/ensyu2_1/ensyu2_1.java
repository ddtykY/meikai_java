package ensyu2_1;
/*
 * クラス名:ensyu2_1
 * 概要    :演習2-1の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */

public class ensyu2_1 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :int型の変数に小数部を持つ実数を代入した結果を考察するため
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		int firstValue;  //一つ目の整数値を代入するint型の変数
		int secondValue; //二つ目の整数値を代入するint型の変数
		
		firstValue = 63.5;  //変数に値を代入する。この時小数部を持つ実数を代入する。
		secondValue = 18.7; //１つ目同様に小数部を持つ実数を代入する。
		
		//一つ目の変数を表示する。
		System.out.println("firstValueの値は" + firstValue + "です。");
		//二つ目の変数を表示する。
		System.out.println("yの値は" + secondValue + "です。");
		//二つの数の合計を表示する。
		System.out.println("合計は" + (firstValue + secondValue) + "です。");
		//二つの数の平均を表示する。
		System.out.println("平均は" + (firstValue + secondValue) / 2 + "です。");
	}
}
