package ensyu7_17;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_17
 *  概要     :演習問題7-17の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.17
 */
public class Ensyu7_17 {
	/*
	 * 関数名           :linearSearchR
	 * メソッドの説明   :配列aのもっとも末尾側にある"key"と等しい要素を見つける
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列a　探索する配列
	 *                   key　キー値
	 * 返り値           :keyElement　キー値と等しい値を持つ要素の要素番号を表す。探索に失敗した場合-1となる
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int linearSearchR(int[] a, int key) {
		// キー値と等しい値を持つ要素の番号を格納する変数を-1で初期化する
		int keyElement = -1;
		
		// for文の制御に使う"countNumber"を配列aの要素数から1を引いた値で初期化し0以上の間繰り返す
		for(int countNumber = a.length-1; countNumber >= 0; countNumber--) {
			// もし"key"とa[countNumber]が等しいなら
			if(key == a[countNumber]) {
				// "keyElement"に"countNumber"を代入する
				keyElement = countNumber;
				// 繰り返しを抜ける
				break;
			}
		}
		// "keyElement"を返却する
		return keyElement;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドlinearSearchRを実行し結果にその結果にあったメッセージを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 配列の要素数を表す変数を0で初期化する
		int elementNumber = 0;
		
		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数 : ");
			// 入力された値を"elementNumber"に代入
			elementNumber = standardInput.nextInt();
		// 0以下の値が入力されている間繰り返す
		} while (elementNumber <= 0);
		
		// 要素数が"elementNumber"のint型の配列を生成
		int[] integerValueArray = new int[elementNumber];
		
		// "integerValueArray"の要素数分、要素を入力させる処理を繰り返す
		for(int countNumber = 0; countNumber < elementNumber; countNumber++) {
			// 要素の入力を促す
			System.out.print("integerValueArary[" + countNumber + "] = ");
			// 入力された値をintegerValueArary[countNumber]に代入する
			integerValueArray[countNumber] = standardInput.nextInt();
		}
		
		// 探す値の入力を促す
		System.out.print("探す値 : ");
		// int型の変数"keyValue"に入力された値を代入する
		int keyValue = standardInput.nextInt();
		
		// linearSearchRを呼び出し探索を行う。その結果でint型の"idArray"を初期化
		int idArray = linearSearchR(integerValueArray, keyValue);
		
		// もし"idArray"が-1なら
		if (idArray == -1) {
			// 探索に失敗した旨を表示する
			System.out.println("その値の要素は存在しません");
		// もし"idArray"が-1でないなら
		} else {
			// どの要素にあるかを表示する
			System.out.println("その値はintegerValueArray[" + idArray + "]にあります。");
		}
	}
}
