package ensyu7_8;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_8
 *  概要     :演習問題7-8の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_8 {
	/*
	 * 関数名           :random
	 * メソッドの説明   :"a"以上"b"未満の乱数を生成して返却する
	 *                   "b"が"a"より小さい場合は"a"の値を返却する
	 *                   ※この問題では教本により関数名や引数名が指定されている
	 * パラメータの説明 :a　乱数の下限値を表す整数
	 *                   b　乱数の上限値を表す整数
	 * 返り値           :randomValue　"a"以上"b"未満の乱数("b<a"の場合は"a"の値)
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static int random(int a, int b) {
		// Randomクラスのインスタンスを生成
		Random randomNumber = new Random();
		
		// a以上b未満の乱数を格納する変数を"a"で初期化する
		int randomValue = a;
		
		// もし"b"が"a"より小さいなら
		if(b < a) {
			// "randomValue"を返却する
			return randomValue;
		// もし"b"が"a"以上なら
		} else {
			// 0～"b-a+1"の乱数を"randomValue"に加算した値を返却する
			return randomValue = a + randomNumber.nextInt(b-a+1);
		}
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドrandomを呼び出し入力された二値の範囲で乱数を生成する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 乱数の生成を行う旨を表示する
		System.out.println("乱数の生成を行います");
		
		// 下限値の入力を促す
		System.out.print("下限値 : ");
		// int型の変数"lowerLimit"を入力された値で初期化する
		int lowerLimit = standardInput.nextInt();
		
		// 上限値の入力を促す
		System.out.print("上限値 : ");
		// int型の変数"upperLimit"を入力された値で初期化する
		int upperLimit = standardInput.nextInt();
		
		// メソッドrandomを呼び出し引数として下限値、上限値を与え返却された値を表示する
		System.out.println("生成された値 : " + random(lowerLimit, upperLimit));
	}
}

