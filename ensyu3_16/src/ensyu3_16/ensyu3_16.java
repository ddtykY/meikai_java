package ensyu3_16;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu3_16
 * 概要    :演習3-16の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.06
 */
public class ensyu3_16 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :三つの整数値を読み込んで昇順にソートする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 一つ目の整数値"firstValue"の入力を促す
		System.out.print("整数firstValue  : ");
		// int型の変数"firstValue"に入力された整数値を代入する
		int firstValue = standardInput.nextInt();
		
		// 二つ目の整数値"secondValue"の入力を促す
		System.out.print("整数secondValue : ");
		// int型の変数"secondValue"に入力された整数値を代入する
		int secondValue = standardInput.nextInt();
		
		// 三つ目の整数値"thirdValue"の入力を促す
		System.out.print("整数thirdValue  : ");
		// int型の変数"secondValue"に入力された整数値を代入する
		int thirdValue = standardInput.nextInt();
		
		int temporaryValue;  // 一時的に値を格納しておくための変数
		
		if (firstValue > secondValue) {  // 一つ目の値より二つ目が小さい場合
			// "temporaryValue"に"firstValue"を保存
			temporaryValue = firstValue;
			// 小さいほうのの値"secondValue"を大きいほうの変数"firstvalue"に代入
			firstValue = secondValue;
			// 保存しておいた"temporaryValue"を"secondValue"に代入
			secondValue = temporaryValue;
		}
		if (firstValue > thirdValue) {  // 一つ目の値より三つ目が小さい場合
			// "temporaryValue"に"firstValue"を保存
			temporaryValue = firstValue;
			// 小さいほうのの値"thirdValue"を大きいほうの変数"firstvalue"に代入
			firstValue = thirdValue;
			// 保存しておいた"temporary"を"sthirdValue"に代入
			thirdValue = temporaryValue;
		}
		if (secondValue > thirdValue) {  // 二つ目の値より三つ目が小さい場合
			// "temporary"に"secondValue"を保存
			temporaryValue = secondValue;
			// 小さいほうのの値"thirdValue"を大きいほうの変数"firstvalue"に代入
			secondValue = thirdValue;
			// 保存しておいた"temporary"を"thirdValue"に代入
			thirdValue = temporaryValue;
		}
		
		// 降順にソートした旨を表示する
		System.out.println("\n昇順にソートしました。\n");
		// 一番小さい"firstValue"を表示する
		System.out.println("整数firstValue  : " + firstValue);
		// 次に小さい"secondValue"を表示する
		System.out.println("整数secondValue : " + secondValue);
		// 次に小さい"thirdValue"を表示する
		System.out.println("整数thirdValue  : " + thirdValue);
		
		//standardInputを閉じる
		standardInput.close();
	}
}
