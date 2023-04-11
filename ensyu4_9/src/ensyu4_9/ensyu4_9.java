package ensyu4_9;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_9
 *  概要     :演習問題4-9の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.07
 */
public class ensyu4_9 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を読み込んで1からその値までの積を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.07
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 入力された値を格納する変数"integerValue"を宣言する
		int integerValue;
		
		// 整数値を入力させる処理を1～12の値が入力されるまで繰り返す
		// この時、正の整数値であるため1以上、12より大きいとオーバーフローして結果が変わるため12以下で制限する
		do {
			// 正の整数値の入力を促す
			System.out.print("整数値 : ");
			// int型の変数"integerValue"に入力された値を代入する
			integerValue = standardInput.nextInt();
			//もし0以下が入力されたら
			if(integerValue <= 0) {
				// 正の整数値を入力するよう伝える
				System.out.println("正の整数値を入力してください");
			// もし13以上が入力されたら
			} else if (integerValue >= 13) {
				// オーバーフローするため12以下を入力するよう伝える
				System.out.println("オーバーフローするため12以下の値を入力してください");
			}
		// "integerValue"が正の整数値でないかあるいは13以上でない場合繰り返す
		} while (integerValue <= 0 || integerValue >= 13);
		
		// 1から"integerValue"までの積を求めることを伝える
		System.out.print(1 + "から" + integerValue + "までの積は");
		
		// 積の結果を代入するint型の変数"productValue"を初期化する
		int productValue = 1;
		
		 // デクリメントされていく"integerValue"が0より大きい間繰り返すことで入力された値から1までの積を実現する
		while (integerValue > 0) {
			// "productVAlue"に"integerValue"を掛ける
			productValue *= integerValue;
			// "integerNumber"をデクリメントする
			integerValue--;
		}
		
		// 全ての積の計算結果である"productValue"を表示する
		System.out.println(productValue + "です。");
	}
}