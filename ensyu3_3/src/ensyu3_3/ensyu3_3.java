package ensyu3_3;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_3
* 概要    :演習3-3の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.05
*/

public class ensyu3_3 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :教本List3-5のelseをelse if (n == 0)に変更した結果を検討するためのもの
	 *                  :List3-5は読み込んだ整数値符号（正/負/0）を判定して表示するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"value"の入力を促す
		System.out.print("整数value : ");
		// int型の変数"integerValue"に入力された整数値を代入する
		int integerValue = standardInput.nextInt();
		
		if (integerValue > 0) {
			// "value"が0より大きいなら正である旨を表示する
			System.out.println("その値は正です");
		} else if (integerValue < 0){
			// "value"が0より小さいなら負である旨を表示する
			System.out.println("その値は負です");
		} else if (integerValue == 0) {
			// "value"が0であるならその旨を表示する
			System.out.println("その値は0です");
		}
		
		//standardInputを閉じる
		standardInput.close();
	}
}
