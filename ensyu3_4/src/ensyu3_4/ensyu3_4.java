package ensyu3_4;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_4
* 概要    :演習3-4の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/

public class ensyu3_4 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :二つの変数に値を読み込んで、その大小関係を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 実数値"firstValue"の入力を促す
		System.out.print("整数firstValue : ");
		// double型の変数"firstvalue"に入力された整数値を代入する
		double firstValue = standardInput.nextDouble();
		

		// 実数値"secondValue"の入力を促す
		System.out.print("整数secondValue : ");
		// double型の変数"secondvalue"に入力された整数値を代入する
		double secondValue = standardInput.nextDouble();
		
		if (firstValue > secondValue) {
			// "firstValue"のほうが大きいならその旨を表示する
			System.out.println("firstValueのほうが大きいです");
		} else if (firstValue < secondValue){
			// "secondValue"のほうが大きいなら旨を表示する
			System.out.println("secondValueのほうが大きいです");
		} else {
			// ほかのどの条件にも当てはまらないなら二つの変数が等しい旨を表示する
			System.out.println("firstValueとsecondValueは同じ値です");
		}
		
		//standardInputを閉じる
		standardInput.close();
	}
}
