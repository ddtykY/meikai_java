package ensyu7_12;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_12
 *  概要     :演習問題7-12の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.17
 */
public class Ensyu7_12 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :printBits
	 * メソッドの説明   :与えられた"integerValue"のビット構成を表示する
	 * パラメータの説明 :integerValue　ビット構成を表示する整数
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static void printBits(int integerValue) {
		// 32回ビットを表示する処理を繰り返す
		for(int countNumber = 31; countNumber >= 0; countNumber--) {
			// "integerValue"を右に"countNumber"だけシフトさせた時の最下位ビットを表示する
			System.out.print(((integerValue >>> countNumber & 1) == 1 ) ? 1 : 0);
		}
	}
	
	/*
	 * 関数名           :rRotate
	 * メソッドの説明   :整数"x"を右に"n"ビット回転した値を返す
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　回転する整数
	 *                   n　回転するビット数
	 * 返り値           :rightRotate　整数"x"を右に"n"ビット回転した値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int rRotate(int x, int n) {
		// 整数"x"を右に"n"ビット回転した値を格納する変数
		int rightRotate = x;
		
		for(int countNumber = 0; countNumber < n; countNumber++) {
			// もし最下位ビットが0なら
			if((rightRotate & 1) == 1) {
				// ビットを反転させる
				rightRotate = ~rightRotate;
				// 右に一つシフトする
				rightRotate >>>= 1;
				// もう1度反転させる
				rightRotate = ~rightRotate;
			// もし最下位ビットが0なら
			} else {
				// 右に一つシフトする
				rightRotate >>>= 1;
			}
		}
		// "rightRotate"を返却する
		return rightRotate;
	}
	
	/*
	 * 関数名           :lRotate
	 * メソッドの説明   :整数"x"を左に"n"ビット回転した値を返す
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　回転する整数
	 *                   n　回転するビット数
	 * 返り値           :rightRotate　整数"x"を左に"n"ビット回転した値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int lRotate(int x, int n) {
		// 整数"x"を左に"n"ビット回転した値を格納する変数
		int leftRotate = x;
		
		for(int countNumber = 0; countNumber < n; countNumber++) {
			// もし最上位ビットが1なら
			if(((leftRotate >>> 31 & 1)) == 1) {
				// ビットを反転させる
				leftRotate = ~leftRotate;
				// 左に一つシフトする
				leftRotate <<= 1;
				// もう1度反転させる
				leftRotate = ~leftRotate;
			// もし最上位ビットが0なら
			} else {
				// 左に一つシフトする
				leftRotate <<= 1;
			}
		}
		// "leftRotate"を返却する
		return leftRotate;
	}

	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドrRotateとlRotateを実行し結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	public static void main(String[] args) {
		// 整数値の入力を促す
		System.out.print("整数 : ");
		// "integerValue"を入力された値で初期化する
		int integerValue = standardInput.nextInt();
		
		// 回転させる量の入力を促す
		System.out.print("回転数 : ");
		// "rotateNumber"を入力された値で初期化する
		int rotateNumber = standardInput.nextInt();
		
		
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "integerValue"のビット構成を表示する
		printBits(integerValue);
		
		// "rightIntegerValue"をメソッドrRotateを呼び出し返却された値で初期化する
		int rightIntegerValue = rRotate(integerValue, rotateNumber);
		// "integerValue"を右に"rotateNumber"だけ回転させたことを伝える
		System.out.println("\n\n右に" + rotateNumber + "ビット回転させました");
		// "rightintegerValue"の値を表示する
		System.out.println("rightIntegerValue : " + rightIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "integerValue"を右に"rotateNumber"回転させた値のビット構成を表示する
		printBits(rightIntegerValue);
		
		// "leftIntegerValue"をメソッドlRotateを呼び出し返却された値で初期化する
		int leftIntegerValue = lRotate(integerValue, rotateNumber);
		// "integerValue"を左に"rotateNumber"だけ回転させたことを伝える
		System.out.println("\n\n左に" +rotateNumber + "ビット回転させました");
		// "leftintegerValue"の値を表示する
		System.out.println("leftIntegerValue : " + leftIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "integerValue"を左に"rotateNumber"回転させた値のビット構成を表示する
		printBits(leftIntegerValue);
		
	}
	
}