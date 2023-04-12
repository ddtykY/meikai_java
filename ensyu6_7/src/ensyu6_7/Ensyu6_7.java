package ensyu6_7;

import java.util.Random;
import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_7
 *  概要     :演習問題6-7の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.12
 */
public class Ensyu6_7 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :線形探索を行う。キー値と同じ値の要素が複数個存在する場合
	 *                   もっとも末尾側の要素を見つける(List6-9の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.12
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成
		Random randomNumber = new Random();
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 要素数を表すint型の変数"ELEMENT_NUMBER"を12で初期化する
		final int ELEMENT_NUMBER = 12;
		// "ELEMENT_NUMBER"の数だけの要素数を持つint型の配列を生成する
		int[] integerValueArray = new int[ELEMENT_NUMBER];
		
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < ELEMENT_NUMBER; indexArray++) {
			// integerValueArray[indexArray]に0～9の乱数を代入する
			integerValueArray[indexArray] = randomNumber.nextInt(10);
		}
		
		// integerValueArray[indexArray]の全要素を表示する旨を示す
		System.out.print("配列 integerValueArray の全要素の値\n {  ");
		// for文をint型の変数"indexArray"で制御し、これを0で初期化、integerValueArrayの要素数分繰り返す
		for (int indexArray = 0; indexArray < ELEMENT_NUMBER; indexArray++) {
			// integerValueArray[indexArray]を表示する
			System.out.print(integerValueArray[indexArray] + "  ");
		}
		// 要素の表示の終わり
		System.out.println("}");
		
		// 探す値の入力を促す
		System.out.print("探す値 : ");
		// 探索する値を表すint型の変数"keyValue"を入力された値で初期化する
		int keyValue = standardInput.nextInt();
		
		// 末尾側からの探索に使うint型の変数"seekValue"をintegerValueArrayの要素数から1引いた値で初期化
		int seekValue = ELEMENT_NUMBER - 1;
		
		// "seekValue"が0以上の間"keyValue"と等しい値がないか確認する
		while (seekValue >= 0) {
			// もしintegerValueArray[indexNumber]と探す値"keyNumber"が等しいなら
			if(integerValueArray[seekValue] == keyValue) {
				// 繰り返しを抜ける
				break;
			}
			// "seekValue"をデクリメントする
			seekValue--;
		}
		
		// もし"seekValue"が0以上なら
		if(seekValue >= 0) {
			// どこに探す値"keyValue"と等しい値が格納されていたか表示する
			System.out.println("それは integerValueArray[" + seekValue + "] にあります。");
		// もし"seekValue"が0より小さければ
		} else {
			// 探索が失敗した旨を表示する
			System.out.println("それはありません。");
		}
	}
}