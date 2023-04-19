package ensyu7_31;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_31
 *  概要     :演習問題7-31の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.19
 */
public class Ensyu7_31 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名           :absolute
	 * メソッドの説明   :int型の変数"x"の絶対値を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　x絶対値を求める値
	 * 返り値           :"x"の絶対値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int absolute(int x) {
		// "x"の絶対値を返却する
		return x > 0  ? x : -x;
	}
	
	/*
	 * 関数名           :absolute
	 * メソッドの説明   :long型の変数"x"の絶対値を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　x絶対値を求める値
	 * 返り値           :"x"の絶対値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static long absolute(long x) {
		// "x"の絶対値を返却する
		return x > 0  ? x : -x;
	}
	
	/*
	 * 関数名           :absolute
	 * メソッドの説明   :float型の変数"x"の絶対値を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　x絶対値を求める値
	 * 返り値           :"x"の絶対値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static float absolute(float x) {
		// "x"の絶対値を返却する
		return x > 0  ? x : -x;
	}
	
	/*
	 * 関数名           :absolute
	 * メソッドの説明   :double型の変数"x"の絶対値を返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　x絶対値を求める値
	 * 返り値           :"x"の絶対値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static double absolute(double x) {
		// "x"の絶対値を返却する
		return x > 0  ? x : -x;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :多重定義されたメソッドabsoluteを実行しその結果をそれぞれ表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	public static void main(String[] args) {
		// int型の値の入力を促す
		System.out.print("int型の値 : ");
		// int型の変数を入力された値で初期化する
		int integerValue = standardInput.nextInt();
		// メソッドabsoluteを呼び出し絶対値を表示する
		System.out.println("その絶対値は " + absolute(integerValue) + " です\n");
		
		// long型の値の入力を促す
		System.out.print("long型の値 : ");
		// long型の変数を入力された値で初期化する
		long longValue = standardInput.nextLong();
		// メソッドabsoluteを呼び出し絶対値を表示する
		System.out.println("その絶対値は " + absolute(longValue) + " です\n");
		
		// float型の値の入力を促す
		System.out.print("float型の値 : ");
		// float型の変数を入力された値で初期化する
		float floatValue = standardInput.nextFloat();
		// メソッドabsoluteを呼び出し絶対値を表示する
		System.out.println("その絶対値は " + absolute(floatValue) + " です\n");
		
		// double型の値の入力を促す
		System.out.print("double型の値 : ");
		// double型の変数を入力された値で初期化する
		double doubleValue = standardInput.nextDouble();
		// メソッドabsoluteを呼び出し絶対値を表示する
		System.out.println("その絶対値は " + absolute(doubleValue) + " です\n");
	}
}