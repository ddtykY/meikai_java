package ensyu7_13;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_13
 *  概要     :演習問題7-13の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.17
 */
public class Ensyu7_13 {
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
	 * 関数名           :rightRotate
	 * メソッドの説明   :整数"integerValue"を右に"rotateNumber"ビット回転した値を返す
	 * パラメータの説明 :integerValue　回転する整数
	 *                   rotateNumber　回転するビット数
	 * 返り値           :rightRotate　整数"integerValue"を右に"rotateNumber"ビット回転した値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int rightRotate(int integerValue, int rotateNumber) {
		// 整数"integerValue"を右に"rotateNumber"ビット回転した値を格納する変数
		int rightRotate = integerValue;
		
		for(int countNumber = 0; countNumber < rotateNumber; countNumber++) {
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
	 * 関数名           :leftRotate
	 * メソッドの説明   :整数"integerValue"を左に"rotateNumber"ビット回転した値を返す
	 * パラメータの説明 :integerValue　回転する整数
	 *                   rotateNumber　回転するビット数
	 * 返り値           :rightRotate　整数"integerValue"を左に"rotateNumber"ビット回転した値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int leftRotate(int integerValue, int rotateNumber) {
		// 整数"integerValue"を左に"n"ビット回転した値を格納する変数
		int leftRotate = integerValue;
		
		for(int countNumber = 0; countNumber < rotateNumber; countNumber++) {
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
	 * 関数名           :set
	 * メソッドの説明   :"x"の"pos"ビット目を1にした値を返却する
	 *                  ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　"pos"ビット目を変更する対象の値
	 *                   pos　何ビット目を変更するかを示す値
	 * 返り値           :setBits　"x"の"pos"ビット目を1にした値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int set(int x, int pos) {
		//"x"の"pos"ビット目を1にした値を格納する変数をxで初期化する
		int setBits = x;
		
		// もし"setBits"の"pos"ビット目が0なら
		if((setBits >>> pos & 1 ) != 1) {
			// "setBits"を"pos+1"回右回転させる
			setBits = rightRotate(setBits, pos+1);
			// "setBits"のビットを反転させる
			setBits = ~setBits;
			// 左にシフトする
			setBits <<= 1;
			// "setBits"のビットを反転させる
			setBits = ~setBits;
			// "setBits"を"pos-1"回左回転させる
			setBits = leftRotate(setBits, pos);
		}
		// "setBits"を返却する
		return setBits;
	}
	
	/*
	 * 関数名           :reset
	 * メソッドの説明   :"x"の"pos"ビット目を0にした値を返却する
	 *                  ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　"pos"ビット目を変更する対象の値
	 *                   pos　何ビット目を変更するかを示す値
	 * 返り値           :setBits　"x"の"pos"ビット目を0にした値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int reset(int x, int pos) {
		//"x"の"pos"ビット目を1にした値を格納する変数をxで初期化する
		int resetBits = x;
		
		// もし"resetBits"の"pos"ビット目が1なら
		if((resetBits >>> pos & 1 ) == 1) {
			// "resetBits"を"pos"回右回転させる
			resetBits = rightRotate(resetBits, pos);
			// 右にシフトする
			resetBits >>>= 1;
			// "resetBits"を"pos+1"回左回転させる
			resetBits = leftRotate(resetBits, pos+1);
		}
		// "resetBits"を返却する
		return resetBits;
	}
	
	/*
	 * 関数名           :inverse
	 * メソッドの説明   :"x"の"pos"ビット目を反転した値を返却する
	 *                  ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　"pos"ビット目を変更する対象の値
	 *                   pos　何ビット目を変更するかを示す値
	 * 返り値           :setBits　"x"の"pos"ビット目を反転にした値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int inverse(int x, int pos) {
		//"x"の"pos"ビット目を1にした値を格納する変数をxで初期化する
		int inverseBits = x;
		
		// もし"inverseBits"の"pos"ビット目が1なら
		if((inverseBits >>> pos & 1 ) == 1) {
			// メソッドresetを呼び出し"inverseBits"に代入する
			inverseBits = reset(inverseBits, pos);
		// もし"resetBits"の"pos"ビット目が0なら
		} else {
			// メソッドsetを呼び出し"inverseBits"に代入する
			inverseBits = set(inverseBits, pos);
		}
		// "inverseBits"を返却する
		return inverseBits;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドsetとresetとinverseを実行し結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	public static void main(String[] args) {
		// ビット数の最大値を表す値
		final int MAXIMUM_BIT = 31;
		
		// 整数値の入力を促す
		System.out.print("整数 : ");
		// "integerValue"を入力された値で初期化する
		int integerValue = standardInput.nextInt();
		
		// 参照するビットの位置を格納する値"positionBit"
		int positionBit = 0;
		
		// 0～"MAXIMUM_BIT"の値が入力されるまで繰り返す
		do {
			// 何ビット目を参照するかを問う
			System.out.print("何ビット目 : ");
			// "rotateNumber"を入力された値で初期化する
			positionBit = standardInput.nextInt();
		// 0～"MAXIMUM_BIT"以外の値が入力されている間繰り返す
		} while (positionBit < 0 || positionBit > MAXIMUM_BIT);
		
		
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "integerValue"のビット構成を表示する
		printBits(integerValue);
		
		// "setIntegerValue"をメソッドsetを呼び出し返却された値で初期化する
		int setIntegerValue = set(integerValue, positionBit);
		// "positionBit"を1にした旨を伝える
		System.out.println("\n\n" + positionBit + "ビット目を1にしました");
		// "setIntegerValue"の値を表示する
		System.out.println("setIntegerValue : " + setIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "setIntegerValue"のビット構成を表示する
		printBits(setIntegerValue);

		// "resetIntegerValue"をメソッドresetを呼び出し返却された値で初期化する
		int resetIntegerValue = reset(integerValue, positionBit);
		// "positionBit"を0にした旨を伝える
		System.out.println("\n\n" + positionBit + "ビット目を0にしました");
		// "resetIntegerValue"の値を表示する
		System.out.println("resetIntegerValue : " + resetIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "resetIntegerValue"のビット構成を表示する
		printBits(resetIntegerValue);
		
		// "inverseIntegerValue"をメソッドinverseを呼び出し返却された値で初期化する
		int inverseIntegerValue = inverse(integerValue, positionBit);
		// "positionBit"を反転した旨を伝える
		System.out.println("\n\n" + positionBit + "ビット目を反転しました");
		// "inverseIntegerValue"の値を表示する
		System.out.println("inverseIntegerValue : " + inverseIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "inverseIntegerValue"のビット構成を表示する
		printBits(inverseIntegerValue);
	}
}