package ensyu2_9;

//Randomクラスを使用可能にするためにimportする
import java.util.Random;

/*
 * クラス名:ensyu2_9
 * 概要    :演習2-9の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_9 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :0.0以上1.0未満、0.0以上10.0未満、-1.0以上1.0未満の実数値をそれぞれ表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成する
		Random randomNumber = new Random();
		
		// 0.0以上1.0未満の実数値の乱数を生成しdouble型の変数"firstRealValue"に代入する
		double firstRealValue = randomNumber.nextDouble();
		// 0.0以上1.0未満の実数値"firstRealValue"を表示する。
		System.out.println("0.0以上1.0未満の実数値 : " + firstRealValue);
		
		// 0.0以上1.0未満の実数値の乱数を生成しそれを10倍する、
		// それにより0.0以上10.0未満の実数値を生成しdouble型の変数"secondRealValue"に代入する
		double secondRealValue = randomNumber.nextDouble() * 10;
		// 0.0以上1.0未満の実数値"secondRealValue"を表示する。
		System.out.println("0.0以上10.0未満の実数値 : " + secondRealValue);
		

		// 0.0以上1.0未満の実数値の乱数を生成しそれを2倍し0.0以上2.0未満の実数値にする、
		// そこから1.0引くことにより-1.0以上1.0未満の実数値を生成しdouble型の変数"thirdRealValue"に代入する
		double thirdRealValue = randomNumber.nextDouble() * 2 - 1.0;
		// 0.0以上1.0未満の実数値"thirdRealValue"を表示する。
		System.out.println("-1.0以上1.0未満の実数値 : " + thirdRealValue);
	}

}
