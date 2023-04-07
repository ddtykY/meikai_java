package ensyu3_15;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_15
* 概要    :演習3-15の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_15 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :二つの整数値を読み込んで降順にソートする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"firstValue"の入力を促す
		System.out.print("整数firstValue  : ");
		// int型の変数"firstValue"に入力された整数値を代入する
		int firstValue = standardInput.nextInt();
		
		// 整数値"secondValue"の入力を促す
		System.out.print("整数secondValue : ");
		// int型の変数"secondValue"に入力された整数値を代入する
		int secondValue = standardInput.nextInt();
		
		
		if (firstValue < secondValue) {  // 1つ目の整数値のほうが小さい場合
			// 一時的に値を格納しておくint型の変数"temporaryValue"を作り1つ目の値を代入
			int temporaryValue = firstValue;
			// 大きいほうの値"secondValue"を小さいほうの変数"firstvalue"に代入
			firstValue = secondValue;
			// 保存しておいた"temporaryValue"を"secoundValue"に代入
			secondValue = temporaryValue;
		}
		
		// 降順にソートした旨を表示する
		System.out.println("\n降順にソートしました。\n");
		// 一番大きい"firstValue"を表示する
		System.out.println("整数firstValue  : " + firstValue);
		// 次に大きい"secondValue"を表示する
		System.out.println("整数secondValue : " + secondValue);
		
		//standardInputを閉じる
		standardInput.close();
	}
}
