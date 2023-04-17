package ensyu7_9;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_9
 *  概要     :演習問題7-9の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_9 {
	// Scannerクラスのインスタンスを作成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :readPlusInt
	 * メソッドの説明   :キーボードから正の整数値を読み込んでその値を返却する
	 *                   0や負の値が入力されたら再入力させる
	 *                   ※この問題では教本により関数名や引数名が指定されている
	 * パラメータの説明 :なし
	 * 返り値           :plusIntegerValue　キーボードから読み込んだ正の整数値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static int readPlusInt() {
		// 読み込んだ正の整数値を格納する変数"plusIntegerValue"を0で初期化する
		int plusIntegerValue = 0;
		// 正の整数値が入力されるまで数値を入力させる処理を繰り返す
		do {
			// 正の整数値の入力を促す
			System.out.print("正の整数値 : ");
			// 入力された値をplusIntegerValueに代入する
			plusIntegerValue = standardInput.nextInt();
		// "plusIntegerValue"が0以下の(正の整数でない)間繰り返す
		} while(plusIntegerValue <= 0);
		// "plusIntegerValue"を返却する
		return plusIntegerValue;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドreadPlusIntを呼び出し入力された正の整数値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// メソッドreadPlusIntを呼び出し、返却された値を表示する
		System.out.println("入力された正の整数値 : " + readPlusInt());
	}
}

