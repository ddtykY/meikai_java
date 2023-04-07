package ensyu3_7;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
* クラス名:ensyu3_7
* 概要    :演習3-7の回答クラスです。
* 作成者  :山川勇輝
* 作成日  :2023.04.06
*/
public class ensyu3_7 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んでそれを3で割った値に応じて文章を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値"integerValue"の入力を促す
		System.out.print("正の整数integerValue : ");
		// int型の変数"integerValue"に入力された整数値を代入する
		int integerValue = standardInput.nextInt();
		
		
		if (integerValue <= 0) { // "integerValue"が0以下、つまり正でない値が入力された場合
			// 入力された値が正でない旨を表示する
			System.out.println("正でない値が入力されました。");
		} else if (integerValue % 3 == 0){ // "integerValue"が3で割り切れる場合
			// 入力された値が3で割り切れる旨を表示する
			System.out.println("その値は3で割り切れます。");
		} else if (integerValue % 3 == 1){ // "integerValue"を3で割った余りが1の場合
			// 入力された値を3で割った余りが1である旨を表示する
			System.out.println("その値を3で割った余りは1です。");
		} else { // "integerValue"が正の整数で3で割った余りが2の場合
			// 入力された値を3で割った余りが2となることを表示する
			System.out.println("その値を3で割った余りは2です。");	
		}
		
		//standardInputを閉じる
		standardInput.close();
	}
}
