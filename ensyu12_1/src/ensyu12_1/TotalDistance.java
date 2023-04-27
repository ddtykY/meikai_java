package ensyu12_1;

class TotalDistance extends Car {
	// フィールドの宣言
	// 総走行距離
	private double totalDistance;
	
	// 燃料がいくらかを格納しておく変数
	private double temporaryAmountFuel;
	
	
	// コンストラクタ
	TotalDistance(String carName, int carWidth, int carHeight, int carLength,  
			double amountFuel, Day purcaseDay){
		// Carクラスのコンストラクタの呼び出し
		super(carName, carWidth, carHeight, carLength, amountFuel, purcaseDay);
		// "temporaryAmountFuel"を"amountFuel"とする
		temporaryAmountFuel = amountFuel;
		// 総走行距離を0とする
		totalDistance = 0;
	}
	
	/*
	 * 関数名           :getTotalDistance
	 * メソッドの説明   :総走行距離を取得する
	 * パラメータの説明 :なし
	 * 返り値           :totalDistance　総走行距離
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.25
	 */
	public double getTotalDistance() {
		// "totalDistance"を返却する
		return totalDistance;
	}
	
	/*
	 * 関数名           :calculateTotalDistance
	 * メソッドの説明   :総走行距離を調べる
	 * パラメータの説明 :なし
	 * 返り値           :totalDistance　総走行距離
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public double calculateTotalDistance() {
		// "temporaryAmountFuel"と現在の残り燃料の差分を総走行距離に加算する
		totalDistance += (temporaryAmountFuel - getFuel());
		// "temporaryAmmountFuel"を現在の燃料とする
		temporaryAmountFuel = getFuel();
		// "totalDistance"を返却する
		return totalDistance;
	}
	
}
