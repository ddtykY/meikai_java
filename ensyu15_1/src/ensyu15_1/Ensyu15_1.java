package ensyu15_1;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu15_1
 *  概要     :演習問題15-1の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Ensyu15_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :文字列を読み込んでその文字列を逆順に表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.27
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列の入力を促す
		System.out.print("文字列 : ");
		// 入力された文字列をString型の変数に格納する
		String scanString = standardInput.next();
		
		// 逆順表示する旨を示す
		System.out.print("逆順   : ");
		// 文字列の長さだけ繰り返す
		for(int countNumber = scanString.length()-1; countNumber >= 0; countNumber--) {
			// 文字列を表示していく
			System.out.print(scanString.charAt(countNumber));
		}
	}
}
