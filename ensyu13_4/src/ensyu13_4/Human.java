package ensyu13_4;

/**
 * 演習問題9-4で作成した人間クラス
 * @author 	yuki yamakawa
 */
public class Human {
	// 名前
	private String userName;
	// 身長
	private double userHeight;
	// 体重
	private double userWeight;
	// 誕生日
	private Day birthDay;
	
	
	// 身長の最小値
	final double MINIMUM_HEIGHT = 101;
	// 身長の最大値
	final double MAXIMUM_HEIGHT = 300;
	// 体重の最小値
	final double MINIMUM_WEIGHT = 1;
	// 体重の最大値
	final double MAXIMUM_WEIGHT = 500;
	
	/**
	 * 人間を生成するコンストラクタ
	 * 
	 * @param userName 人の名前
	 * @param userHeight 身長
	 * @param userWeight 体重
	 * @param birthDay 誕生日
	 */
	public Human(String userName, double userHeight, double userWeight, Day birthDay){
		// フィールドの"userName"に仮引数の"userName"を代入する
		this.userName = userName;
		// フィールドの"userHeight"に仮引数の"userHeight"を代入する
		this.userHeight = userHeight;
		// フィールドの"userWeight"に仮引数の"userWeight"を代入する
		this.userWeight = userWeight;
		// フィールドの"birthDay"に引数の"birthDay"のコピーへの参照を代入する
		this.birthDay = new Day(birthDay);
	}
	
	/**
	 * 身長を取得する
	 * @return userHeight 身長
	 */
	public double getHeight() {
		// "userHeight"を返却する
		return userHeight;
	}
	
	/**
	 * 体重を取得する
	 * @return userWeight 体重
	 */
	public double getWeight() {
		// "userWeight"を返却する
		return userWeight;
	}
	
	/**
	 * 誕生日を取得する
	 * @return new Day(birthDay) 誕生日を表すDay型のインスタンス
	 */
	public Day getBirthDay() {
		// "birthDay"を返却する
		return new Day(birthDay);
	}
	
	/**
	 * 標準体重を表示し、現在の体重との差を求める
	 */
	public void printStandardWeight() {
		// 標準体重を格納する変数
		double standardWeight = (userHeight - 100) * 0.9;
		// 標準体重を表示する
		System.out.println(userHeight +"cm の標準体重は " + standardWeight + "kg です\n" );
		
		// 標準体重との差を表示する
		System.out.print("あなたの体重は 標準体重");
		// もし"userWeight"が"standardWeight"より大きければ
		if(userWeight > standardWeight) {
			// 差を表示する
			System.out.printf(" +" + Math.round(userWeight - standardWeight) + "kg です\n");
		// もし"userWeight"が"standardWeight"より小さければ
		} else if(userWeight < standardWeight) {
			// 差を表示する
			System.out.printf(" -" + Math.round(standardWeight - userWeight) + "kg です\n");
		// もし等しいなら
		} else {
			// 等しいことを表示する
			System.out.println("と同じ です");
		}
	}
	

	/**
	 * 身長を変化させる
	 * @param changeValue 身長の変化量
	 */
	public void changeHeight(double changeValue) {
		// もし現在の身長と引数として与えられた数値の和が"MINIMUM_HEIGHT"より小さいなら
		if (userHeight + changeValue < MINIMUM_HEIGHT) {
			// 小さすぎると表示する
			System.out.println("小さすぎます");
		// もし現在の身長と引数として与えられた数値の和が"MAXIMUM_HEIGHT"より大きいなら
		} else if(userHeight + changeValue > MAXIMUM_HEIGHT) {
			// 大きすぎると表示する
			System.out.println("大きすぎます");
		// もし範囲内なら
		} else {
			// "userHeight"を"changeValue"だけ変化させる
			userHeight += changeValue;
		}
		// 変化後の身長を表示する
		System.out.println("現在の身長 : " + userHeight + "cm");
	}
	
	/**
	 * 体重を変化させる
	 * @param changeValue 体重の変化量
	 */
	public void changeWeight(double changeValue) {
		// もし現在の体重と引数として与えられた数値の和が"MINIMUM_WEIGHT"より小さいなら
		if (userWeight + changeValue < MINIMUM_WEIGHT) {
			// 小さすぎると表示する
			System.out.println("軽すぎます");
		// もし現在の体重と引数として与えられた数値の和が"MAXIMUM_WEIGHT"より大きいなら
		} else if(userWeight + changeValue > MAXIMUM_WEIGHT) {
			// 大きすぎると表示する
			System.out.println("重すぎます");
		// もし範囲内なら
		} else {
			// "userWeight"を"changeValue"だけ変化させる
			userWeight += changeValue;
		}
		// 変化後の体重を表示する
		System.out.println("現在の体重 : " + userWeight + "kg");
	}
	
	/**
	 * 人に関する名前や誕生日などの情報を表す文字列を返却する
	 * @return 名前、身長、体重、誕生日を表す文字列
	 */
	public String toString() {
		// 返却する
		return String.format("名前 : %s\n身長 : %.2fcm\n体重 : %.2fkg\n" +
				"誕生日 : %s", userName, userHeight, userWeight, birthDay.toString());
	}
}
