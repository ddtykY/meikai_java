package ensyu2_4;

import java.util.Scanner;

/*
 * クラス名:ensyu2_4
 * 概要    :演習2-4の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_4 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ整数値に10を加えた値、減じた値を出力
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);

		// 整数値"integerValue"の入力を促す
		System.out.print("整数値 : ");
		// "integerValue"に整数値を読み込む
		int integerValue = standardInput.nextInt();
		
		//"integerValue"に10を加えた値を表示する
		System.out.println("10を加えた値は" + (integerValue + 10) + "です。");
		//"integerValue"から10を減じた値を表示する
		System.out.println("10を減じた値は" + (integerValue - 10) + "です。");
		
		//standardInputを閉じる
		standardInput.close();
	}
	

}
