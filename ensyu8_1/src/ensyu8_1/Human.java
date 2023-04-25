package ensyu8_1;

/*
 *  クラス名 :Human
 *  概要     :演習問題8-1の人間クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.20
 */
public class Human {
	// フィールドの宣言を行う
	// 名前
	private String userName;
	// 身長
	private double userHeight;
	// 体重
	private double userWeight;

	// コンストラクタ
	Human(String userName, double userHeight, double userWeight){
		// フィールドの"userName"に仮引数の"userName"を代入する
		this.userName = userName;
		// フィールドの"userHeight"に仮引数の"userHeight"を代入する
		this.userHeight = userHeight;
		// フィールドの"userWeight"に仮引数の"userWeight"を代入する
		this.userWeight = userWeight;
	}
	
	/*
	 * 関数名           :getHeight
	 * メソッドの説明   :身長（"userHeight"）を取得する
	 * パラメータの説明 :なし
	 * 返り値           :userHeight　身長
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	double getHeight() {
		// "userHeight"を返却する
		return userHeight;
	}
	
	/*
	 * 関数名           :getWeight
	 * メソッドの説明   :体重（"userWeight"）を取得する
	 * パラメータの説明 :なし
	 * 返り値           :userWeight　体重
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	double getWeight() {
		// "userWeight"を返却する
		return userWeight;
	}
	
	/*
	 * 関数名           :putSpec
	 * メソッドの説明   :基本的な情報を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	void putSpec() {
		// 名前を表示する
		System.out.println("名前 : " + userName);
		// 身長を表示する
		System.out.println("身長 : " + userHeight + "cm");
		// 体重を表示する
		System.out.println("体重 : " + userWeight + "kg");
	}
	
	/*
	 * 関数名           :printStandardWeight
	 * メソッドの説明   :標準体重を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	void printStandardWeight() {
		// 標準体重を格納する変数
		double standardWeight = (userHeight - 100) * 0.9;
		// 標準体重を表示する
		System.out.printf("%.1fcm の標準体重は %.1fkg です\n", userHeight, standardWeight);
		
		// 標準体重との差を表示する
		System.out.print("あなたの体重は 標準体重");
		// もし"userWeight"が"standardWeight"より大きければ（誤差0.1kg内で）
		if(userWeight-0.1 >= standardWeight) {
			// 差を表示する
			System.out.printf(" +%.1fkg です\n", (userWeight - standardWeight));
		// もし"userWeight"が"standardWeight"より小さければ（誤差0.1kg内で）
		} else if(userWeight+0.1 <= standardWeight) {
			// 差を表示する
			System.out.printf(" -%.1fkgです\n", (standardWeight - userWeight));
		// もし誤差が0.1以内なら
		} else {
			// 等しいことを表示する
			System.out.println("と同じ です");
		}
	}
	
	/*
	 * 関数名           :changeHeight
	 * メソッドの説明   :身長を変化させる
	 * パラメータの説明 :changeValue　身長の変化量
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	void changeHeight(double changeValue) {
		// "userHeight"を"changeValue"だけ変化させる
		userHeight += changeValue;
	}
	
	/*
	 * 関数名           :changeWeight
	 * メソッドの説明   :体重を変化させる
	 * パラメータの説明 :changeValue　体重の変化量
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.20
	 */
	void changeWeight(double changeValue) {
		// "userWeight"を"changeValue"だけ変化させる
		userWeight += changeValue;
	}
	
}
