package ensyu5_7;

/*
 *  クラス名 :Ensyu5_7
 *  概要     :演習問題5-7の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.11
 */
public class Ensyu5_7 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :0.0から1.0まで0.001おきにその値とその値の2乗を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.11
	 */
	public static void main(String[] args) {
		// 表として見やすいように列の名前を表示する
		System.out.println("float変数      2乗");
		// 数字と列の名前を区切る
		System.out.println("------------------------");
		
		// for文をfloat型の変数"floatValue"で制御し、これを0.0で初期化する
		// "floatValue"が1.0になるまで繰り返し更新のたびに0.001加算する
		for(float floatValue = 0.0F; floatValue <= 1.0; floatValue += 0.001) {
			// "floatValue"を表示する
			System.out.printf("%8.7f", floatValue);
			
			// "floatValue"の2乗を表示する
			System.out.printf("%12.7f", floatValue * floatValue);
			
			// 二つの数を表示したため改行する
			System.out.println();
		}
	}
}
