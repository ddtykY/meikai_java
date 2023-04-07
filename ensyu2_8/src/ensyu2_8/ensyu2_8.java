package ensyu2_8;

//Randomクラスを使用可能にするためにimportする
import java.util.Random;
//Randomクラスを使用可能にするためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu2_8
 * 概要    :演習2-8の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_8 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :1桁の正の整数値、1桁の負の整数値、2桁の正の整数値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		// Randomクラスのインスタンスを作成する
		Random randomNumber = new Random();
		
		// 整数値"integerValue"の入力を促す
		System.out.print("整数値 : ");
		// int型の変数"integerValue"に整数値を読み込む
		int integerValue = standardInput.nextInt();
		
		// "value"の値に5を加算し、そこから0～10のランダムな数を減算、
		// それにより最大値が"integerValue"+5、最小値が"integerValue"-5であるような数を生成、
		// それをint型の変数"plusMinus5"に代入する
		int plusMinus5 = integerValue + 5 - randomNumber.nextInt(11);
		
		// 入力された整数値の±5の乱数を生成した旨を表示する
		System.out.println("その値の±5の乱数を生成しました。");
		// "plusMinus5"の値を表示する
		System.out.println("それは" + plusMinus5 + "です。");
		
		// standardInputを閉じる
		standardInput.close();
	}


}
