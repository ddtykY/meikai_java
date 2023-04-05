package ensyu3_1;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu3_1
 * 概要    :演習3-1の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu3_1 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :整数値を読み込みその絶対値を求めて表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の入力を促す
		System.out.print("整数値 : ");
		// int型の変数"absoluteValue"に入力した整数値を代入する
		int absoluteValue = standardInput.nextInt();
		
		if(absoluteValue < 0) {
			// 入力された整数値"absoluteValue"が負の値なら符号を入れ替えた値を表示する
			System.out.println("その値の絶対値は" + (-absoluteValue) + "です。");
		} else {  
			// 入力された整数値"absoluteValue"が負の値でないなら値をそのまま表示する
			System.out.println("その値の絶対値は" + absoluteValue + "です。");
		}
		
		//standardInputを閉じる
		standardInput.close();
	}
}
