package ensyu14_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu14_2
 *  概要     :演習問題14-2の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Ensyu14_2 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :inputData
	 * メソッドの説明   :入力された文字列を返却する
	 * パラメータの説明 :dataName　入力させる内容
	 * 返り値           :inputData　入力された文字列
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.26
	 */
	public static String inputData(String dataName) {
		// 入力を促す
		System.out.print(dataName + " : ");
		//入力された値を返却する
		return standardInput.next();
	}
	
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成した着せ替え可能なロボットペットクラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.26
	 */
	public static void main(String[] args) {
		// 種類の表示の際に何個表示したら改行するのかを格納する定数
		final int NEW_LINE = 5;
		
		// メソッドinputDataを呼び出してペットの名前を決める
		String petName = inputData("ペットの名前");
		// メソッドinputDataを呼び出して飼い主の名前を決める
		String masterName = inputData("飼い主の名前");
		
		// 着せ替え可能なロボットペットクラスのインスタンスを生成
		SkinnableRobotPet myPet = new SkinnableRobotPet(petName, masterName);
		
		// メソッドintroduceNameを呼び出しペットに自己紹介させる
		myPet.introduceName();
		// スキンに対応する数字を格納する変数
		int kindSkin = 0;
		
		// スキンの種類の数でint型の変数を初期化する
		int numberOfKind = Skinnable.skinColor.length;
		// 現在のスキンを表示する
		System.out.println("現在は " + myPet.putSkinColor() + " です。");
		
		// スキンの種類の表示をしていく
		System.out.print("スキンの種類 (");
		// スキンの種類だけ繰り返す
		for(int countSkin = 0; countSkin < numberOfKind; countSkin++) {
			// 図形に対応する文字列を表示する
			System.out.print(countSkin + "…" + Skinnable.skinColor[countSkin]);
			// 最後の要素であれば
			if(countSkin == numberOfKind-1) {
				// 入力を促す
				System.out.print(") : ");
			// もし"countSkin"を"NEW_LINE"で割った数が"NEW_LINE-1"なら
			} else if(countSkin % NEW_LINE == NEW_LINE-1) {
				// 改行する
				System.out.println();
			// もし最後の要素でなければ
			}else if(countSkin != numberOfKind-1) {
				// 文字列の区切りを表示
				System.out.print("/");
			} 
		}
		// 入力された値を"kindSkin"に代入する
		kindSkin = standardInput.nextInt();
		// 負の値かnumberOfKind以上の値が入力されている間繰り返す
		while(kindSkin < 0 || kindSkin >= numberOfKind) {
			// 不正な値であることを伝えもう一度入力を促す
			System.out.print("不正な値です。もう一度入力してください : ");
			// 入力された値を"kindSkin"に代入する
			kindSkin = standardInput.nextInt();
		}
		// スキンを変更する
		myPet.changeSkin(kindSkin);
		
		
		
	}
}
