package ensyu6_1;

/*
 *  クラス名 :Ensyu6_1
 *  概要     :演習問題6-1の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.11
 */
public class Ensyu6_1 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.11
	 */
	public static void main(String[] args) {
		// 要素型がdouble型で要素数が5の配列を生成
		double[] firstArray = new double[5];
		
		// firstArray[0]に17を代入
		firstArray[0] = 17.2;
		// firstArray[1]に-11を代入
		firstArray[1] = -11;
		// firstArray[3]に61を代入
		firstArray[3] = 61;
		// firstArray[0]に34.4を代入
		firstArray[4] = firstArray[0] * 2;
		
		// for文をint型の変数"indexFirstArry"で制御し、これを0で初期化する
		// 今回は要素数が5なので処理を5回繰り返す
		for (int indexFirstArray = 0; indexFirstArray < 5; indexFirstArray++) {
			// 配列firstArray[indexFirstArray]を表示する
			System.out.println("firstArray[" + indexFirstArray + "] = " + firstArray[indexFirstArray]);
		}
	}
}
