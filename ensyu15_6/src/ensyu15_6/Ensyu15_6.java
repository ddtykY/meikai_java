package ensyu15_6;

/*
 *  クラス名 :Ensyu15_6
 *  概要     :演習問題15-6の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.28
 */
public class Ensyu15_6 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :コマンドライン引数で与えられた半径を持つ円周の長さと面積を求めて表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.28
	 */
	public static void main(String[] args) {
		// 引数として与えられた値の数だけ繰り返す
		for(int countNumber = 0; countNumber < args.length; countNumber++) {
			// コマンドラインで与えられた引数をdouble型の変数に代入する
			double radiusLength = Double.parseDouble(args[countNumber]);
			// 半径を表示する
			System.out.println("半径が " + radiusLength + " である円は\n");
			// "radiusLength"が0以下の値なら
			if(radiusLength <= 0) {
				// 半径が0以下の円は存在しないことを表示する
				System.out.println("存在しません");
			// もし"radiusLength"が正の値なら
			} else {
				// 演習を求める
				double circumferenceLength = 2 * Math.PI * radiusLength;
				// 円周を求めて表示する
				System.out.printf("周の長さが %.3f で\n", circumferenceLength);
				// 演習を求める
				double circleArea = Math.PI * radiusLength * radiusLength;
				// 円周を求めて表示する
				System.out.printf("面積が %.3f です\n", circleArea);
			}
			// 区切りを表示するする
			System.out.println("--------------------------------------");
		}
	}
}
