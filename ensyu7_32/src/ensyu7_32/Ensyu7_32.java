package ensyu7_32;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_32
 *  概要     :演習問題7-32の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.19
 */
public class Ensyu7_32 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名           :printBits
	 * メソッドの説明   :与えられたbyte型の"x"のビット構成を表示する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　ビット構成を表示する値
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static void printBits(byte x) {
		// 32回ビットを表示する処理を繰り返す
		for(int countNumber = 7; countNumber >= 0; countNumber--) {
			// "integerValue"を右に"countNumber"だけシフトさせた時の最下位ビットを表示する
			System.out.print(((x >>> countNumber & 1) == 1 ) ? 1 : 0);
		}
		// 全て表示したのち改行する
		System.out.println();
	}
	
	/*
	 * 関数名           :printBits
	 * メソッドの説明   :与えられたshort型の"x"のビット構成を表示する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　ビット構成を表示する値
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static void printBits(short x) {
		// 32回ビットを表示する処理を繰り返す
		for(int countNumber = 15; countNumber >= 0; countNumber--) {
			// "integerValue"を右に"countNumber"だけシフトさせた時の最下位ビットを表示する
			System.out.print(((x >>> countNumber & 1) == 1 ) ? 1 : 0);
		}
		// 全て表示したのち改行する
		System.out.println();
	}
	
	/*
	 * 関数名           :printBits
	 * メソッドの説明   :与えられたint型の"x"のビット構成を表示する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　ビット構成を表示する値
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static void printBits(int x) {
		// 32回ビットを表示する処理を繰り返す
		for(int countNumber = 31; countNumber >= 0; countNumber--) {
			// "integerValue"を右に"countNumber"だけシフトさせた時の最下位ビットを表示する
			System.out.print(((x >>> countNumber & 1) == 1 ) ? 1 : 0);
		}
		// 全て表示したのち改行する
		System.out.println();
	}
	
	
	/*
	 * 関数名           :printBits
	 * メソッドの説明   :与えられたlong型の"x"のビット構成を表示する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　ビット構成を表示する値
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static void printBits(long x) {
		// 32回ビットを表示する処理を繰り返す
		for(int countNumber = 63; countNumber >= 0; countNumber--) {
			// "integerValue"を右に"countNumber"だけシフトさせた時の最下位ビットを表示する
			System.out.print(((x >>> countNumber & 1) == 1 ) ? 1 : 0);
		}
		// 全て表示したのち改行する
		System.out.println();
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :多重定義されたメソッドprintBitsを実行しその結果をそれぞれ表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	public static void main(String[] args) {
		// byte型の値の入力を促す
		System.out.print("byte型の値 : ");
		// byte型の変数を入力された値で初期化する
		byte byteValue = standardInput.nextByte();
		// メソッドprintBitsを呼び出しビット構成を表示する
		printBits(byteValue);
		
		// short型の値の入力を促す
		System.out.print("\nshort型の値 : ");
		// short型の変数を入力された値で初期化する
		short shortValue = standardInput.nextShort();
		// メソッドprintBitsを呼び出しビット構成を表示する
		printBits(shortValue);

		// int型の値の入力を促す
		System.out.print("\nint型の値 : ");
		// int型の変数を入力された値で初期化する
		int integerValue = standardInput.nextInt();
		// メソッドprintBitsを呼び出しビット構成を表示する
		printBits(integerValue);

		// long型の値の入力を促す
		System.out.print("\nlong型の値 : ");
		// long型の変数を入力された値で初期化する
		long longValue = standardInput.nextLong();
		// メソッドprintBitsを呼び出しビット構成を表示する
		printBits(longValue);
	}
}