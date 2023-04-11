package ensyu4_10;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_10
 *  概要     :演習問題4-10の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_10 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ個数だけ*を表示しその値が1未満であれば改行文字を出力しないようにする(List4-11の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// *を表示する個数の入力を促す
		System.out.print("何個表示しますか : ");
		// 入力された値をint型の変数"quantityNumber"に代入する
		int quantityNumber = standardInput.nextInt();
		
		// 入力された"quantityNumber"回繰り返す
		for(int i = 0; i < quantityNumber; i++) {
			// *を表示する
			System.out.print('*');
		}
		
		// "quantityNumber"が1以上であれば
		if (quantityNumber >= 1) {
			//改行文字を出力する
			System.out.println();
		}
	}
}
	