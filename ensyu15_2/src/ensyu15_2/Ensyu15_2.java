package ensyu15_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu15_2
 *  概要     :演習問題15-2の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Ensyu15_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :文字列を読み込んでその全文字の文字コードを表示する
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
		
		// 文字列の長さだけ繰り返す
		for(int countNumber = 0; countNumber < scanString.length(); countNumber++) {
			// 文字列に対応する文字コードを16進数で表示する
			System.out.printf("%s : %x\n", scanString.charAt(countNumber), scanString.codePointAt(countNumber));
		}
	}
}
