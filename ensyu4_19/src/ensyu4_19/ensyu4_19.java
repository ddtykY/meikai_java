package ensyu4_19;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_19
 *  概要     :演習問題4-19の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class ensyu4_19 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :入力された月の季節を表示し、1～12以外の値が入力された場合には再入力させる(List4-1の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// もう一度行うかどうかの確認に用いる
		int retryCheck;
		//入力された整数値を格納する変数
		int monthNumber;
		
		do { // 入力された月の季節を表示し、"retryCheck"が1である場合繰り返す
			do { // 入力された値が1～12でないうちは繰り返す
				// 季節を求めることを伝え、整数値の入力を促す
				System.out.print("季節を求めます。\n何月ですか : ");
				// 入力された整数値をint型の変数"monthNumber"に代入する
				monthNumber = standardInput.nextInt();
				// 少し見づらかったため改行文字を出力する
				System.out.println();
			} while (monthNumber < 1 || monthNumber > 12); // 入力された値が1～12でない場合繰り返す
			
			if (monthNumber >= 3 && monthNumber <= 5) { // 入力された値(月)が3～5の場合
				// 季節が春である旨を表示する
				System.out.println("それは春です");
			} else if (monthNumber >= 6 && monthNumber <= 8) { // 入力された値(月)が6～8の場合
				// 季節が夏である旨を表示する
				System.out.println("それは夏です");
			} else if (monthNumber >= 9 && monthNumber <= 11) { // 入力された値(月)が9～11の場合
				// 季節が秋である旨を表示する
				System.out.println("それは秋です");
			} else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) { // 入力された値(月)が1・2・12の場合
				// 季節が冬である旨を表示する
				System.out.println("それは冬です");
			}
			
			// もう1度行うかどうかの選択を促す
			System.out.print("\nもう一度？ 1…Yes / 0…No : ");
			// int型の変数"retryCheck"に入力された値を代入する
			retryCheck = standardInput.nextInt();
			// 改行文字を出力する
			System.out.println();
		} while (retryCheck == 1); // "retryCheck"が1である（もう一度行うが選択された）場合繰り返す
	}
}
