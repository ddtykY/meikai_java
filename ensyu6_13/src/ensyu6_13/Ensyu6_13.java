package ensyu6_13;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_13
 *  概要     :演習問題6-13の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_13 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :配列aの全要素を配列bに対して逆順にコピーする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.13
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// 要素数を表す変数を0で初期化
		int elementNumber = 0;
		// 要素数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数: ");
			// 要素数を表すint型の変数"elementNumber"に入力された値を代入する
			elementNumber = standardInput.nextInt();
		// "elementNumber"が0以下(正の整数ではない)なら繰り返す
		} while (elementNumber <= 0 );

		// 配列aにあたる要素数が"elementNumber"であるint型の配列を生成
		int[] firstIntegerValueArray = new int[elementNumber];
		// 配列bにあたる要素数が"elementNumber"であるint型の配列を生成(コピー先)
		int[] secondIntegerValueArray = new int[elementNumber];

		// for文をint型の変数"indexArray"で制御し、これを0で初期化、firstIntegerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// firstIntegerValueArray[indexArray]へ代入する数値の入力を促す
			System.out.print("a[" + indexArray + "] = ");
			// firstIntegerValueArray[indexArray]に入力された値を代入する
			firstIntegerValueArray[indexArray] = standardInput.nextInt();
			
		}
		
		// 逆順にコピーした旨を表示する
		System.out.println("\naの全要素をbに逆順にコピーしました。\n");
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、firstIntegerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// firstIntegerValueArray[indexArray]をsecondIntegerValueArray[elementNumber-1-indexArray]に代入する
			// つまり配列aを配列bと逆になるようにコピーする
			secondIntegerValueArray[elementNumber-1-indexArray] = firstIntegerValueArray[indexArray]; 
		}
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、firstIntegerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < elementNumber; indexArray++) {
			// secondIntegerValueArray[indexArray]を表示する
			System.out.println("b[" + indexArray + "] = " + secondIntegerValueArray[indexArray]);
		}
	}
}