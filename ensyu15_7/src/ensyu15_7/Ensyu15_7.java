package ensyu15_7;

/*
 *  クラス名 :Ensyu15_7
 *  概要     :演習問題15-7の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.28
 */
public class Ensyu15_7 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :コマンドライン引数で与えられたすべての数値を加算する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.28
	 */
	public static void main(String[] args) {
		// 合計を格納する変数を初期化する
		double sumValue = 0;
		// 拡張for文を用いて引数として与えられたすべての値を格納していく
		for(String doubleString : args) {
			// "sumValue"に加算していく
			sumValue += Double.parseDouble(doubleString);
		}
		// 合計を表示する
		System.out.print("合計は " + sumValue + " です。");
	}
}
