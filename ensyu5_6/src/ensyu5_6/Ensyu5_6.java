package ensyu5_6;

/*
 *  クラス名 :Ensyu5_6
 *  概要     :演習問題5-6の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.11
 */
public class Ensyu5_6 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と
	 *                   int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を横に並べて表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.11
	 */
	public static void main(String[] args) {
		
		// 表として見やすいように列の名前を表示する
		System.out.println("  float       int");
		// 数字と列の名前を区切る
		System.out.println("----------------------");
		
		//float型の変数"firstFloatValue"を0.0で初期化する
		float firstFloatValue = 0.0F;
		
		// for文をint型の変数"integerValue"で制御し、これを0で初期化する
		// "integerValue"が1000になるまで繰り返し更新のたびにインクリメントする
		for(int integerValue = 0; integerValue <= 1000; integerValue++) {
			// "secondFloatValue"を表示する
			System.out.printf("%8.7f", firstFloatValue);
			
			// "firstFloatValue"に0.001加算する
			firstFloatValue += 0.001F;
			
			// float型の変数"secondFloatValue"を"integerValue"をfloat型に変換し1000で割った値で初期化する
			float secondFloatValue = (float)integerValue / 1000;
			// "secondFloatValue"を表示する
			System.out.printf("%11.7f", secondFloatValue);
			
			// 二つの数を表示したため改行する
			System.out.println();
		}
	}
}
