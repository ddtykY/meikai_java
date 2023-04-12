package ensyu6_3;

/*
 *  クラス名 :Ensyu6_3
 *  概要     :演習問題6-3の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.11
 */
public class Ensyu6_3 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :要素型がdouble型で要素数が5の配列の要素に対して
	 *                   先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.11
	 */
	public static void main(String[] args) {
		// 要素型がdouble型で要素数が5の配列を生成
		double[] doubleValueArray  = new double[5];
		
		// for文をint型の変数"indexArray"で制御し、これを1で初期化する
		// doubleValueArrayの要素数分繰り返し更新のたびに"indexArry"をインクリメントする
		for (int indexArray = 0; indexArray < doubleValueArray.length; indexArray++) {
			// firstArray[indexArray]に先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入する必要があるため
			// "(1 + indexArray) + (1 + indexArray) * 0.1"を代入する
			// "(1+indexArray) * 1.1"を代入すると"indexArray"が3の時に誤差が生じて表示がおかしくなる
			doubleValueArray[indexArray] = (1 + indexArray) + (1 + indexArray) * 0.1;
			
			// 配列doubleValueArray[indexArray]を表示する
			System.out.println("doubleValueArray[" + indexArray + "] = " + doubleValueArray[indexArray]);
		}
		
	}
}