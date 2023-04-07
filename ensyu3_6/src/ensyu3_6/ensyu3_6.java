package ensyu3_6;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_6
* 概要    :演習3-6の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_6 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んでそれが10の倍数であるか表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 実数値"integerValue"の入力を促す
		System.out.print("正の整数integerValue : ");
		// int型の変数"integerValue"に入力された整数値を代入する
		int integerValue = standardInput.nextInt();
		
		
		if (integerValue <= 0) { // "integerValue"が0以下、つまり正でない値が入力された場合
			// 正でない値が入力された旨を表示する
			System.out.println("正でない値が入力されました。");
		} else if (integerValue % 10 == 0){ //　"integerValue"が10で割り切れる場合
			// 入力された値が10の倍数である旨を表示する
			System.out.println("その値は10の倍数です。");
		} else { //　"integerValue"が正であり10で割り切れない場合
			// 入力された値が10の倍数でない旨を表示する
			System.out.println("その値は10の倍数ではありません。");
		}
		
		//standardInputを閉じる
		standardInput.close();
	}
}
