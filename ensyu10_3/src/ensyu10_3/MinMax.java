package ensyu10_3;

/*
 *  クラス名 :MinMax
 *  概要     :最小値や最大値を求めるメソッドを集めたユーティリティクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class MinMax {
	
	//--- 二値の最小値を求める ---//
	/*
	 * 関数名           :minimumTwo
	 * メソッドの説明   :二値の最小値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int minimumTwo (int firstValue, int secondValue) {
		// 最小値を表す変数をfirstValueで初期化する
		int minimumValue = firstValue;
		// もし最小値より"secondValue"の方が大きければ
		if(minimumValue > secondValue) {
			// "minimumValue"に"secondValue"を代入する
			minimumValue = secondValue;
		}
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	//--- 三値の最小値を求める ---//
	/*
	 * 関数名           :minimumThree
	 * メソッドの説明   :三値の最小値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 *                   thirdValue 　入力された二つ目の値
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int minimumThree (int firstValue, int secondValue, int thirdValue) {
		// 最小値を表す変数をfirstValueで初期化する
		int minimumValue = firstValue;
		// 最小値より"secondValue"の方が大きければ
		if(minimumValue > secondValue) {
			// "minimumValue"に"secondValue"を代入する
			minimumValue = secondValue;
		}
		// 最小値より"thirdValue"の方が大きければ
		if(minimumValue > thirdValue) {
			// "minimumValue"に"thirdValue"を代入する
			minimumValue = thirdValue;
		}
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	//--- 配列の最小値を求める ---//
	/*
	 * 関数名           :minimumArray
	 * メソッドの説明   :配列の最小値を返却する
	 * パラメータの説明 :配列integerArray　最小値を求めるint型の配列
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int minimumArray (int[] integerArray) {
		// 最小値を表す変数を0個目の要素で初期化する
		int minimumValue = integerArray[0];
		// 配列fintegerArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < integerArray.length; countNumber++) {
			// もし"minimumValue"が"integerArray[countNumber]"より大きければ
			if(minimumValue > integerArray[countNumber]) {
				// "minimumValue"を代入する
				minimumValue = integerArray[countNumber];
			}
		}
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	//--- 二値の最大値を求める ---//
	/*
	 * 関数名           :maximumTwo
	 * メソッドの説明   :二値の最大値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int maximumTwo (int firstValue, int secondValue) {
		// 最大値を表す変数をfirstValueで初期化する
		int maximumValue = firstValue;
		// もし最小値より"secondValue"の方が大きければ
		if(maximumValue < secondValue) {
			// "maximumValue"に"secondValue"を代入する
			maximumValue = secondValue;
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
	
	//--- 三値の最大値を求める ---//
	/*
	 * 関数名           :maximumThree
	 * メソッドの説明   :三値の最大値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 *                   thirdValue 　入力された二つ目の値
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int maximumThree (int firstValue, int secondValue, int thirdValue) {
		// 最大値を表す変数をfirstValueで初期化する
		int maximumValue = firstValue;
		// もし最小値より"secondValue"の方が小さければ
		if(maximumValue < secondValue) {
			// "minimumValue"に"secondValue"を代入する
			maximumValue = secondValue;
		}
		// 最大値より"thirdValue"の方が小さければ
		if(maximumValue < thirdValue) {
			// "maximumValue"に"thirdValue"を代入する
			maximumValue = thirdValue;
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
	
	//--- 配列の最大値を求める ---//
	/*
	 * 関数名           :maximumArray
	 * メソッドの説明   :配列の最大値を返却する
	 * パラメータの説明 :配列integerArray　最小値を求めるint型の配列
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int maximumArray (int[] integerArray) {
		// 最大値を表す変数を0個目の要素で初期化する
		int maximumValue = integerArray[0];
		// 配列fintegerArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < integerArray.length; countNumber++) {
			// もし"maximumValue"が"integerArray[countNumber]"より小さければ
			if(maximumValue < integerArray[countNumber]) {
				// "maximumValue"を代入する
				maximumValue = integerArray[countNumber];
			}
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
	
}
