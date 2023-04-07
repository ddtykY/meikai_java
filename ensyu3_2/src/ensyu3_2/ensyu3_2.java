package ensyu3_2;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu3_2
 * 概要    :演習3-2の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu3_2 {
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
		
		
		// 整数値"firstValue"の入力を促す
		System.out.print("整数firstValue : ");
		// int型の変数"firstValue"に入力された整数値を代入する
		int firstValue = standardInput.nextInt();
		
		// 整数値"secondValue"の入力を促す
		System.out.print("整数secondValue : ");
		// int型の変数"secondValue"に入力された整数値を代入する
		int secondValue = standardInput.nextInt();
		
		if(firstValue % secondValue == 0) {// "firstValue"を"secondValue"で割った余りが0つまり"secondValue"が"firstValue"の約数なら
			// "secondValue"は"firstValue"の約数である旨を表示する
			System.out.println("secondValueはfirstValueの約数です。");
		} else {// "firstValue"を"secondValue"で割った余りが0でない、つまり"secondValue"が"firstValue"の約数でないなら
			// "secondValue"は"firstValue"の約数ではないその旨を表示する
			System.out.println("secondValueはfirstValueの約数ではありません。");
		}
		
		//standardInputを閉じる
		standardInput.close();
	}

}
