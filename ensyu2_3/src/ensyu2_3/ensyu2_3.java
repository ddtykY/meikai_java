package ensyu2_3;

import java.util.Scanner;

/*
 * クラス名:ensyu2_2
 * 概要    :演習2-2の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_3 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :キーボードから読み込んだ整数値を反復して表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"value"の入力を促す
		System.out.print("整数値 : ");
		// "value"に整数値を読み込む
		int value = standardInput.nextInt();
		
		//入力された値(value)を反復して表示する
		System.out.println(value + "と入力しましたね");	
	}

}
