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

	/*
	 * 関数名           :minimumTwo
	 * メソッドの説明   :二値の最小値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static long minimumTwo (long firstValue, long secondValue) {
		// 最小値を表す変数をfirstValueで初期化する
		long minimumValue = firstValue;
		// もし最小値より"secondValue"の方が大きければ
		if(minimumValue > secondValue) {
			// "minimumValue"に"secondValue"を代入する
			minimumValue = secondValue;
		}
		// "minimumValue"を返却する
		return minimumValue;
	}

	/*
	 * 関数名           :minimumTwo
	 * メソッドの説明   :二値の最小値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static float minimumTwo (float firstValue, float secondValue) {
		// 最小値を表す変数をfirstValueで初期化する
		float minimumValue = firstValue;
		// もし最小値より"secondValue"の方が大きければ
		if(minimumValue > secondValue) {
			// "minimumValue"に"secondValue"を代入する
			minimumValue = secondValue;
		}
		// "minimumValue"を返却する
		return minimumValue;
	}

	/*
	 * 関数名           :minimumTwo
	 * メソッドの説明   :二値の最小値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static double minimumTwo (double firstValue, double secondValue) {
		// 最小値を表す変数をfirstValueで初期化する
		double minimumValue = firstValue;
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
	public static long minimumThree (long firstValue, long secondValue, long thirdValue) {
		// 最小値を表す変数をfirstValueで初期化する
		long minimumValue = firstValue;
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
	public static float minimumThree (float firstValue, float secondValue, float thirdValue) {
		// 最小値を表す変数をfirstValueで初期化する
		float minimumValue = firstValue;
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
	public static double minimumThree (double firstValue, double secondValue, double thirdValue) {
		// 最小値を表す変数をfirstValueで初期化する
		double minimumValue = firstValue;
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
	
	/*
	 * 関数名           :minimumArray
	 * メソッドの説明   :配列の最小値を返却する
	 * パラメータの説明 :配列longArray　最小値を求めるint型の配列
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static long minimumArray (long[] longArray) {
		// 最小値を表す変数を0個目の要素で初期化する
		long minimumValue = longArray[0];
		// 配列flongArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < longArray.length; countNumber++) {
			// もし"minimumValue"が"longArray[countNumber]"より大きければ
			if(minimumValue > longArray[countNumber]) {
				// "minimumValue"を代入する
				minimumValue = longArray[countNumber];
			}
		}
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	/*
	 * 関数名           :minimumArray
	 * メソッドの説明   :配列の最小値を返却する
	 * パラメータの説明 :配列floatingArray　最小値を求めるfloat型の配列
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static float minimumArray (float[] floatingArray) {
		// 最小値を表す変数を0個目の要素で初期化する
		float minimumValue = floatingArray[0];
		// 配列ffloatingArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < floatingArray.length; countNumber++) {
			// もし"minimumValue"が"floatingArray[countNumber]"より大きければ
			if(minimumValue > floatingArray[countNumber]) {
				// "minimumValue"を代入する
				minimumValue = floatingArray[countNumber];
			}
		}
		// "minimumValue"を返却する
		return minimumValue;
	}
	
	/*
	 * 関数名           :minimumArray
	 * メソッドの説明   :配列の最小値を返却する
	 * パラメータの説明 :配列doubleegerArray　最小値を求めるdouble型の配列
	 * 返り値           :minimumValue　最小値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static double minArray (double[] doubleArray) {
		// 最小値を表す変数を0個目の要素で初期化する
		double minimumValue = doubleArray[0];
		// 配列fdoubleArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < doubleArray.length; countNumber++) {
			// もし"minimumValue"が"doubleArray[countNumber]"より大きければ
			if(minimumValue > doubleArray[countNumber]) {
				// "minimumValue"を代入する
				minimumValue = doubleArray[countNumber];
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
	
	/*
	 * 関数名           :maximumTwo
	 * メソッドの説明   :二値の最大値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static long maximumTwo (long firstValue, long secondValue) {
		// 最大値を表す変数をfirstValueで初期化する
		long maximumValue = firstValue;
		// もし最小値より"secondValue"の方が大きければ
		if(maximumValue < secondValue) {
			// "maximumValue"に"secondValue"を代入する
			maximumValue = secondValue;
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
	
	/*
	 * 関数名           :maximumTwo
	 * メソッドの説明   :二値の最大値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static float maximumTwo (float firstValue, float secondValue) {
		// 最大値を表す変数をfirstValueで初期化する
		float maximumValue = firstValue;
		// もし最小値より"secondValue"の方が大きければ
		if(maximumValue < secondValue) {
			// "maximumValue"に"secondValue"を代入する
			maximumValue = secondValue;
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
	
	/*
	 * 関数名           :maximumTwo
	 * メソッドの説明   :二値の最大値を返却する
	 * パラメータの説明 :firstValue 　入力された一つ目の値
	 *                   secondValue　入力された二つ目の値
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static double maximumTwo (double firstValue, double secondValue) {
		// 最大値を表す変数をfirstValueで初期化する
		double maximumValue = firstValue;
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
	public static long maximumThree (long firstValue, long secondValue, long thirdValue) {
		// 最大値を表す変数をfirstValueで初期化する
		long maximumValue = firstValue;
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
	public static float maximumThree (float firstValue, float secondValue, float thirdValue) {
		// 最大値を表す変数をfirstValueで初期化する
		float maximumValue = firstValue;
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
	public static double maximumThree (double firstValue, double secondValue, double thirdValue) {
		// 最大値を表す変数をfirstValueで初期化する
		double maximumValue = firstValue;
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
	
	/*
	 * 関数名           :maximumArray
	 * メソッドの説明   :配列の最大値を返却する
	 * パラメータの説明 :配列longArray　最小値を求めるlong型の配列
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static long maximumArray (long[] longArray) {
		// 最大値を表す変数を0個目の要素で初期化する
		long maximumValue = longArray[0];
		// 配列flongArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < longArray.length; countNumber++) {
			// もし"maximumValue"が"longArray[countNumber]"より小さければ
			if(maximumValue < longArray[countNumber]) {
				// "maximumValue"を代入する
				maximumValue = longArray[countNumber];
			}
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
	
	/*
	 * 関数名           :maximumArray
	 * メソッドの説明   :配列の最大値を返却する
	 * パラメータの説明 :配列floatingArray　最小値を求めるfloat型の配列
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static float maximumArray (float[] floatingArray) {
		// 最大値を表す変数を0個目の要素で初期化する
		float maximumValue = floatingArray[0];
		// 配列ffloatingArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < floatingArray.length; countNumber++) {
			// もし"maximumValue"が"floatingArray[countNumber]"より小さければ
			if(maximumValue < floatingArray[countNumber]) {
				// "maximumValue"を代入する
				maximumValue = floatingArray[countNumber];
			}
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
	
	/*
	 * 関数名           :maximumArray
	 * メソッドの説明   :配列の最大値を返却する
	 * パラメータの説明 :配列doubleArray　最小値を求めるdouble型の配列
	 * 返り値           :maximumValue　最大値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static double maximumArray (double[] doubleArray) {
		// 最大値を表す変数を0個目の要素で初期化する
		double maximumValue = doubleArray[0];
		// 配列fdoubleArrayの要素数から1引いた値だけ繰り返す
		for (int countNumber = 1; countNumber < doubleArray.length; countNumber++) {
			// もし"maximumValue"が"doubleArray[countNumber]"より小さければ
			if(maximumValue < doubleArray[countNumber]) {
				// "maximumValue"を代入する
				maximumValue = doubleArray[countNumber];
			}
		}
		// "maximumValue"を返却する
		return maximumValue;
	}
}
