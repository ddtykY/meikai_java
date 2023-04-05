package ensyu2_7;

//Randomクラスを使用可能にするためにimportする
import java.util.Random;

/*
 * クラス名:ensyu2_7
 * 概要    :演習2-7の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_7 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :1桁の正の整数値、1桁の負の整数値、2桁の正の整数値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成する
		Random rand = new Random();
		
		// 0～8の整数値をランダムに生成し1を加算することにより
		// 1桁の正の整数値(1～9)を生成し、それをint型の変数"oneDigitPositive"に代入する。
		int oneDigitPositive = rand.nextInt(9) + 1;
		// 1桁の正の整数値"oneDigitPositive"を表示する
		System.out.println("1桁の正の整数値 : " + oneDigitPositive);
		
		// "oneDigitPositive"と同様に1桁の正の整数値を生成、
		// その符号を反転させた値をint型の変数"oneDigitNegaitive"に代入する。
		int oneDigitNegaitive = -(rand.nextInt(9) + 1);
		System.out.println("1桁の正の整数値 : " + oneDigitNegaitive);
		
		// 0～89の整数値をランダムに生成しそれに10を加算することにより
		// 2桁の正の整数値(10～99)を生成し、それをint型の変数"twoDigitPositive"に代入する。
		int twoDigitPositive = rand.nextInt(90) + 10;
		System.out.println("1桁の正の整数値 : " + twoDigitPositive);
	}
}
