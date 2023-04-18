package ensyu7_21;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_21
 *  概要     :演習問題7-21の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_21 {
	/*
	 * 関数名           :aryExchng
	 * メソッドの説明   :配列aと配列bの全要素の値を交換する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　要素を交換される一つ目の配列
	 *                   配列b　要素を交換される二つ目の配列
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static void aryExchng(int[] a, int[] b) {
		// int型の変数を配列aと配列bの短いほうの長さで初期化する
		int minimumLength = a.length < b.length ? a.length : b.length;
		// 一時的に値を保存する変数を0で初期化する
		int temporaryValue = 0;
		
		// "minimumLength"回入れ替え処理を繰り返す
		for(int countNumber = 0; countNumber < minimumLength; countNumber++) {
			// "temporaryValue"に"a[countNumber]"を代入
			temporaryValue = a[countNumber];
			// "a[countNumber]"に"b[countNumber]"を代入
			a[countNumber] = b[countNumber];
			// "b[countNumber]"に"temporaryValue"を代入
			b[countNumber] = temporaryValue;
		}
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドaryExchngを実行しその結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		// for文の制御に用いる変数
		int countNumber = 0;
		
		// 配列の要素数を表す変数を0で初期化する
		int firstElementNumber = 0;
		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("一つ目の配列の要素数 : ");
			// 入力された値を"firstElementNumber"に代入
			firstElementNumber = standardInput.nextInt();
		// 0以下の値が入力されている間繰り返す
		} while (firstElementNumber <= 0);

		// 要素数が"firstElementNumber"のint型の配列を生成
		int[] firstValueArray = new int[firstElementNumber];
		
		// "firstValueArray"の要素数分、要素を入力させる処理を繰り返す
		for(countNumber = 0; countNumber < firstElementNumber; countNumber++) {
			// 要素の入力を促す
			System.out.print("firstValueArary[" + countNumber + "]  = ");
			// 入力された値をfirstValueArary[countNumber]に代入する
			firstValueArray[countNumber] = standardInput.nextInt();
		}
		
		// 改行文字の出力
		System.out.println();
		
		// 配列の要素数を表す変数を0で初期化する
		int secondElementNumber = 0;
		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("二つ目の配列の要素数 : ");
			// 入力された値を"secondElementNumber"に代入
			secondElementNumber = standardInput.nextInt();
		// 0以下の値が入力されている間繰り返す
		} while (secondElementNumber <= 0);

		// 要素数が"secondElementNumber"のint型の配列を生成
		int[] secondValueArray = new int[secondElementNumber];
		
		// "secondValueArray"の要素数分、要素を入力させる処理を繰り返す
		for(countNumber = 0; countNumber < secondElementNumber; countNumber++) {
			// 要素の入力を促す
			System.out.print("secondValueArary[" + countNumber + "] = ");
			// 入力された値をsecondValueArary[countNumber]に代入する
			secondValueArray[countNumber] = standardInput.nextInt();
		}
		
		// メソッドaryExchngを呼び出し配列firstValueArrayと配列secondValueArrayを入れ替える
		aryExchng(firstValueArray, secondValueArray);
		// 配列の要素を入れ替えたことを伝える
		System.out.println("\n配列の全要素を入れ替えました\n");
		
		// 配列firstValueArrayを表示する
		for(countNumber = 0; countNumber < firstValueArray.length; countNumber++) {
			// "firstValueArray[countNumber]"を表示する
			System.out.println("firstValueArray[" + countNumber + "]   = " + firstValueArray[countNumber]);
		}
		
		// 改行文字の出力
		System.out.println();
		
		// 配列secondValueArrayを表示する
		for(countNumber = 0; countNumber < secondValueArray.length; countNumber++) {
			// "secondValueArray[countNumber]"を表示する
			System.out.println("secondValueArray[" + countNumber + "]  = " + secondValueArray[countNumber]);
		}
	}
}