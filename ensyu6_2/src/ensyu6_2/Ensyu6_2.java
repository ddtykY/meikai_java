package ensyu6_2;

/*
 *  クラス名 :Ensyu6_2
 *  概要     :演習問題6-2の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.11
 */
public class Ensyu6_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :要素型がint型で要素数が5の配列の要素に対して
	 *                   先頭から順に5,4,3,2,1を代入して表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.11
	 */
	public static void main(String[] args) {
		// 要素型がint型で要素数が5の配列を生成
		int[] firstArray = new int[5];
		
		// for文をint型の変数"indexFirstArry"で制御し、これを0で初期化する
		// firstArrayの要素数分繰り返し更新のたびに"indexFirstArry"をインクリメントする
		for (int indexFirstArray = 0; indexFirstArray < firstArray.length; indexFirstArray++) {
			// firstArray[indexFirstArray]に先頭から順に5,4,3,2,1を代入する必要があるため
			// "5-indexFirstArray"を代入する
			firstArray[indexFirstArray] = 5 - indexFirstArray;
			
			// 配列firstArray[indexFirstArray]を表示する
			System.out.println("firstArray[" + indexFirstArray + "] = " + firstArray[indexFirstArray]);
		}
		
	}
}