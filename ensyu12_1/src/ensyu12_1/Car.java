package ensyu12_1;

/*
 *  クラス名 :Car
 *  概要     :演習問題12-1の自動車クラスです
 *  作成者   :山川勇輝
 *  作成日   :2023.04.25
 */
public class Car {
	// フィールドの宣言
	// 名前
	private String carName;
	// 幅
	private int carWidth;
	// 高さ
	private int carHeight;
	// 長さ
	private int carLength;
	// 現在地X座標
	private double xCoordinate;
	// 現在地Y座標
	private double yCoordinate;
	// 残り燃料
	private double amountFuel;
	// 購入日
	private Day purchaseDay;

	// コンストラクタ
	Car(String carName, int carWidth, int carHeight, int carLength,  
			double amountFuel, Day purchaseDay){
		// フィールドの"carName"に仮引数の"carName"を代入する
		this.carName = carName;
		// フィールドの"carWidth"に仮引数の"carWidth"を代入する
		this.carWidth = carWidth;
		// フィールドの"carHeight"に仮引数の"carHeight"を代入する
		this.carHeight = carHeight;
		// フィールドの"carLength"に仮引数の"carLength"を代入する
		this.carLength = carLength;
		// フィールドの"amountFuel"に仮引数の"amountFuel"を代入する
		this.amountFuel = amountFuel;
		// フィールドのpurchaseDayに引数として与えられたインスタンスを代入する
		this.purchaseDay = new Day(purchaseDay);
		// X座標を0とする
		xCoordinate = 0;
		// Y座標を0とする
		yCoordinate = 0;
	}

	/*
	 * 関数名           :getXCoordinate
	 * メソッドの説明   :現在地X座標を取得する
	 * パラメータの説明 :なし
	 * 返り値           :xCoordinate　現在のX座標
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public double getXCoordinate() {
		// "xCoordinate"を返却する
		return xCoordinate;
	}

	/*
	 * 関数名           :getYCoordinate
	 * メソッドの説明   :現在地Y座標を取得する
	 * パラメータの説明 :なし
	 * 返り値           :yCoordinate　現在のY座標
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public double getYCoordinate() {
		// "yCoordinate"を返却する
		return yCoordinate;
	}

	/*
	 * 関数名           :getFuel
	 * メソッドの説明   :残り燃料を取得する
	 * パラメータの説明 :なし
	 * 返り値           :amountFuel　残り燃料
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public double getFuel() {
		// "amountFuel"を返却する
		return amountFuel;
	}
	
	/*
	 * 関数名           :getPurchaseDay
	 * メソッドの説明   :購入日を取得する
	 * パラメータの説明 :なし
	 * 返り値           :購入日
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public Day getPurchaseDay() {
		// purchaseDayを用いてDayクラスのインスタンスを生成し返却する
		return new Day(purchaseDay);
	}

	/*
	 * 関数名           :putSpec
	 * メソッドの説明   :スペックを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public void putSpec() {
		// 名前を表示する
		System.out.println("名前 : " + carName);
		// 車幅を表示する
		System.out.println("車幅 : " + carWidth + "mm");
		// 車高を表示する
		System.out.println("車高 : " + carHeight + "mm");
		// 車長を表示する
		System.out.println("車長 : " + carLength + "mm");
		// 購入日
		System.out.println("購入日 : " + purchaseDay.toString());
	}

	/*
	 * 関数名           :movePossible
	 * メソッドの説明   :X方向に"xDistance"・Y方向に"yDistance"移動
	 * パラメータの説明 :なし
	 * 返り値           :xDistance　X方向への移動距離
	 *                   yDistance　Y方向への移動距離
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	public boolean movePossible(double xDistance, double yDistance) {
		// 移動可能か表す変数を初期化する
		boolean movePossible = true;
		// 移動距離を表す変数をX座標とY座標から求め初期化する
		double moveDistance = Math.sqrt(xDistance * xDistance + yDistance * yDistance);

		// もし移動距離が燃料より大きく移動不可能なら
		if(moveDistance > amountFuel) {
			// "movePossible"をfalseにする
			movePossible = false;
		// もし移動距離のほうが小さく移動可能なら
		} else {
			// 移動距離の分燃料を減らす
			amountFuel -= moveDistance;
			// X座標を変化させる
			xCoordinate += xDistance;
			// Y座標を変化させる
			yCoordinate += yDistance;
			// "movePossible"をtrueにする
			movePossible = true;
		}
		// "movePossible"を返却する
		return movePossible;
	}
}