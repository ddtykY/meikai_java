package ensyu8_2;

/*
 *  クラス名 :Car
 *  概要     :教本の自動車クラスを改変したものです
 *  作成者   :山川勇輝
 *  作成日   :2023.04.20
 */
public class Car {
	// フィールドの宣言
	// 名前
	private String carName;
	// ナンバー
	private String carNumber;
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
	// タンク容量
	private double fuelTank;
	// 残り燃料
	private double amountFuel;
	// 燃費
	private double fuelConsumption;
	
	
	// コンストラクタ
	Car(String carName, String carNumber, int carWidth, int carHeight, int carLength,  
			double fuelTank, double amountFuel, double fuelConsumption){
		// フィールドの"carName"に仮引数の"carName"を代入する
		this.carName = carName;
		// フィールドの"carNumber"に仮引数の"carNumber"を代入する
		this.carNumber = carNumber;
		// フィールドの"carWidth"に仮引数の"carWidth"を代入する
		this.carWidth = carWidth;
		// フィールドの"carHeight"に仮引数の"carHeight"を代入する
		this.carHeight = carHeight;
		// フィールドの"carLength"に仮引数の"carLength"を代入する
		this.carLength = carLength;
		// フィールドの"fuelTank"に仮引数の"fuelTank"を代入する
		this.fuelTank = fuelTank;
		// フィールドの"amountFuel"に仮引数の"amountFuel"を代入する
		this.amountFuel = amountFuel;
		// フィールドの"fuelConsumption"に仮引数の"fuelConsumption"を代入する
		this.fuelConsumption = fuelConsumption;
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
	double getXCoordinate() {
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
	double getYCoordinate() {
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
	double getFuel() {
		// "amountFuel"を返却する
		return amountFuel;
	}
	
	
	/*
	 * 関数名           :putSpec
	 * メソッドの説明   :スペックを表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	void putSpec() {
		// 名前を表示する
		System.out.println("名前 : " + carName);
		// ナンバーを表示する
		System.out.println("ナンバー : " + carNumber);
		// 車幅を表示する
		System.out.println("車幅 : " + carWidth + "mm");
		// 車高を表示する
		System.out.println("車高 : " + carHeight + "mm");
		// 車長を表示する
		System.out.println("車長 : " + carLength + "mm");
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
	boolean movePossible(double xDistance, double yDistance) {
		// 移動可能か表す変数を初期化する
		boolean movePossible = true;
		// 移動距離を表す変数をX座標とY座標から求め初期化する
		double moveDistance = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
		
		// 消費燃料を表す変数を初期化する
		double usedFuel = moveDistance / fuelConsumption;
		
		// もし移動距離が燃料より大きく移動不可能なら
		if(usedFuel > amountFuel) {
			// "movePossible"をfalseにする
			movePossible = false;
		// もし移動距離のほうが小さく移動可能なら
		} else {
			// 移動距離の分燃料を減らす
			amountFuel -= usedFuel;
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
	
	/*
	 * 関数名           :addFuel
	 * メソッドの説明   :燃料を増やす
	 * パラメータの説明 :addFuel　加える燃料の量
	 * 返り値           :addPossible　加えた際にタンク容量を超えないか判別するため
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.20
	 */
	boolean addFuel(double addFuel) {
		// タンク容量を超えないか判別する変数
		boolean addPossible = true;
		
		// 現在の燃料と入力された燃料の和がタンク容量より大きいなら
		if(amountFuel + addFuel > fuelTank) {
			// "addPossible"をfalseにする
			addPossible = false;
		// タンク容量に収まるなら
		} else {
			// 燃料を増やす
			amountFuel += addFuel;
			// 現在の燃料を表示する
			System.out.println("給油後の量 : " + amountFuel + "L");
			// "addPossible"をtrueにする
			addPossible = true;
		}
		// "addPossible"を返却する
		return addPossible;
	}
}