package ensyu7_14;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_14
 *  概要     :演習問題7-14の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.17
 */
public class Ensyu7_14 {
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
	 * 関数名           :setN
	 * メソッドの説明   :"x"の"pos"ビット目から"n"個のビットを1にした値を返却する
	 *                  ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　"pos"ビット目を変更する対象の値
	 *                   pos　何ビット目を変更するかを示す値
	 *                   n　連続する何個のビットを1にするかを示す値
	 * 返り値           :setContinueBits　"x"の"pos"ビット目を1にした値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int setN(int x, int pos, int n) {
		//"x"の"pos"ビット目を1にした値を格納する変数をxで初期化する
		int setContinueBits = x;
		
		// "setContinueBits"を"pos"回右回転させる
		setContinueBits = rightRotate(setContinueBits, pos);
		
		// "n"回以下の処理を繰り返す
		for (int countNumber = 0; countNumber < n; countNumber++) {
			// もし最下位ビットが1なら
			if((setContinueBits & 1) == 1) {
				// 右に1回転する
				setContinueBits = rightRotate(setContinueBits, 1);
			// もし最下位ビットが0なら
			} else {
				//反転させる
				setContinueBits = ~setContinueBits;
				// 右にシフトさせる
				setContinueBits >>>= 1;
				// 反転させる
				setContinueBits = ~setContinueBits;
			}
		}
		// 左に"pos+n"だけ回転する
		setContinueBits = leftRotate(setContinueBits, pos+n);
		
		// "setContinueBits"を返却する
		return setContinueBits;
	}
	
	/*
	 * 関数名           :resetN
	 * メソッドの説明   :"x"の"pos"ビットから"n"このビットを0にした値を返却する
	 *                  ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　"pos"ビット目を変更する対象の値
	 *                   pos　何ビット目を変更するかを示す値
	 *                   n　連続する何個のビットを0にするかを示す値
	 * 返り値           :setBits　"x"の"pos"ビット目を0にした値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int resetN(int x, int pos, int n) {
		//"x"の"pos"ビット目を1にした値を格納する変数をxで初期化する
		int resetContinueBits = x;
		
		// "resetContinueBits"を"pos"回右回転させる
		resetContinueBits = rightRotate(resetContinueBits, pos);

		// "n"回以下の処理を繰り返す
		for (int countNumber = 0; countNumber < n; countNumber++) {
			// もし最下位ビットが1なら
			if((resetContinueBits & 1) == 1) {
				// 右にシフトさせる
				resetContinueBits >>>= 1;
				// もし最下位ビットが0なら
			} else {
				// 右に1回転する
				resetContinueBits = rightRotate(resetContinueBits, 1);
			}
		}
		// 左に"pos+n"だけ回転する
		resetContinueBits = leftRotate(resetContinueBits, pos+n);
		// "resetBits"を返却する
		return resetContinueBits;
	}
	
	/*
	 * 関数名           :inverseN
	 * メソッドの説明   :"x"の"pos"ビットから"n"個のビットを反転した値を返却する
	 *                  ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :x　"pos"ビット目を変更する対象の値
	 *                   pos　何ビット目を変更するかを示す値
	 *                   n　連続する何個のビットを反転するかを示す値
	 * 返り値           :setBits　"x"の"pos"ビット目を反転にした値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.17
	 */
	static int inverseN(int x, int pos, int n) {
		//"x"の"pos"ビット目を1にした値を格納する変数をxで初期化する
		int inverseContinueBits = x;
		
		// "inverseContinueBits"を"pos"回右回転させる
		inverseContinueBits = rightRotate(inverseContinueBits, pos);
		
		// "n"回以下の処理を繰り返す
		for (int countNumber = 0; countNumber < n; countNumber++) {
			// もし"inverseBits"の最下位が1なら
			if((inverseContinueBits & 1 ) == 1) {
				// 右にシフトさせる
				inverseContinueBits >>>= 1;
				// 
			} else {
				//反転させる
				inverseContinueBits = ~inverseContinueBits;
				// 右にシフトさせる
				inverseContinueBits >>>= 1;
				//反転させる
				inverseContinueBits = ~inverseContinueBits;
			}
		}
		// 左に"pos+n"だけ回転する
		inverseContinueBits = leftRotate(inverseContinueBits, pos+n);
		// "inverseContinueBits"を返却する
		return inverseContinueBits;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドsetNとresetNとinverseNをを実行し結果を表示する
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
		// 何個連続するのかを示した値を格納する変数"continueNumber"
		int continueNumber = 0;
		
		// 0～"MAXIMUM_BIT"の値が入力されるまで繰り返す
		do {
			// 何ビット目を参照するかを問う
			System.out.print("何ビット目 : ");
			// "positionBit"を入力された値で初期化する
			positionBit = standardInput.nextInt();
		// 0～"MAXIMUM_BIT"以外の値が入力されている間繰り返す
		} while (positionBit < 0 || positionBit > MAXIMUM_BIT);
		
		// 0～"MAXIMUM_BIT"の値が入力されるまで繰り返す
		do {
			// 何個の連続するビットを変換するのかを問う
			System.out.print("何個 : ");
			// "continueNumber"を入力された値で初期化する
			continueNumber = standardInput.nextInt();
		// 0～"MAXIMUM_BIT-positionBit"以外の値が入力されている間繰り返す
		} while (continueNumber < 0 || continueNumber > MAXIMUM_BIT+1 - positionBit);
		
		
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "integerValue"のビット構成を表示する
		printBits(integerValue);
		
		// "setIntegerValue"をメソッドsetNを呼び出し返却された値で初期化する
		int setIntegerValue = setN(integerValue, positionBit, continueNumber);
		// "positionBit"を1にした旨を伝える
		System.out.println("\n\n" + positionBit + "ビットから" + continueNumber + "個のビットを1にしました");
		// "setIntegerValue"の値を表示する
		System.out.println("setIntegerValue : " + setIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "setIntegerValue"のビット構成を表示する
		printBits(setIntegerValue);
		
		
		// "resetIntegerValue"をメソッドsetNを呼び出し返却された値で初期化する
		int resetIntegerValue = resetN(integerValue, positionBit, continueNumber);
		// "positionBit"を1にした旨を伝える
		System.out.println("\n\n" + positionBit + "ビットから" + continueNumber + "個のビットを0にしました");
		// "resetIntegerValue"の値を表示する
		System.out.println("resetIntegerValue : " + resetIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "resetIntegerValue"のビット構成を表示する
		printBits(resetIntegerValue);
		
		// "inverseIntegerValue"をメソッドsetNを呼び出し返却された値で初期化する
		int inverseIntegerValue = inverseN(integerValue, positionBit, continueNumber);
		// "positionBit"を1にした旨を伝える
		System.out.println("\n\n" + positionBit + "ビットから" + continueNumber + "個のビットを反転させました");
		// "inverseIntegerValue"の値を表示する
		System.out.println("inverseIntegerValue : " + inverseIntegerValue);
		// ビット構成を表示することを伝える
		System.out.print("ビット構成 : ");
		// "inverseIntegerValue"のビット構成を表示する
		printBits(inverseIntegerValue);

	}
}