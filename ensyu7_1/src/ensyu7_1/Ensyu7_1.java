package ensyu7_1;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_1
 *  概要     :演習問題7-1の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.14
 */
public class Ensyu7_1 {
	/*
	 * 関数名           :signOf
	 * メソッドの説明   :受け取った引数の値が正・負・0のいずれであるか判定する
	 *                   ※この問題では教本で関数名や引数名が指定されている
	 * パラメータの説明 :n　正・負・0を判定されるint型の値
	 * 返り値           :-1　引数が負の値の場合
	 *                    0　引数が0の場合
	 *                    1　引数が正の値の場合
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	static int signOf(int n) {
		// もし"n"が0未満なら
		if(n < 0) {
			// -1を返す
			return -1;
		// もし"n"が0なら
		} else if(n == 0) {
			// 0を返す
			return 0;
		// もし"n"が0より大きいなら
		} else {
			// 1を返す
			return 1;
		}
	}
	
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :signOfを実行する、変数を与え返ってきた値によって正・負・0のいずれかを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.14
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値の入力を促す
		System.out.print("整数値 : ");
		// 判定されるint型の変数"integerValue"を入力された値で初期化する
		int integerValue = standardInput.nextInt();
		
		// 入力された値をメソッドsignOfに与え-1が返ってきたとき
		if(signOf(integerValue) == -1) {
			// 負である旨を表示する
			System.out.println("その値は 負 です。");
		// 0が返ってきた場合
		} else if(signOf(integerValue) == 0) {
			// 0である旨を表示する
			System.out.println("その値は 0 です。");
		// 1が返ってきた場合
		} else if(signOf(integerValue) == 1) {
			// 正である旨を表示する
			System.out.println("その値は 正 です。");
		}
	}
}
