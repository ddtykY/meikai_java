package ensyu4_2;

//Randomクラスを用いるためにimportする
import java.util.Random;
//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu4_2
 * 概要    :演習問題4_2の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.06
 */
public class ensyu4_2 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :2桁の整数値を当てさせる数当てゲーム
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		// Randomクラスのインスタンスを作成
		Random randomNumber = new Random();
		
		// 0～89の乱数を生成しそこに10を加算することで2桁の整数値(0～99)を作成し
		// それをゲームの答えを表すint型の変数"answerNumber"に代入する
		int answerNumber = randomNumber.nextInt(90) + 10; 
		
		// プレイヤーの解答を格納するint型の変数
		int playerNumber;
		// プレイヤーに解答をさせる処理をプレイヤーが正解するまで繰り返す
		do {
			// 解答することを促す
			System.out.print("いくつかな（2桁） : ");
			// "playerNumber"に入力した値を代入する
			playerNumber = standardInput.nextInt();
			
			// プレイヤーの解答がゲームの答えより大きければ
			if (playerNumber > answerNumber) {
				// 答えはその解答よりも小さいということを伝える
				System.out.println("もっと小さな数だよ"); 
			}
			// プレイヤーの解答がゲームの答えより小さければ
			else if (playerNumber < answerNumber) {
				// 答えはその解答よりも大きいということを伝える
				System.out.println("もっと大きな数だよ");
			}
		} // プレイヤーの解答が間違っている限り繰り返す
 		  while (playerNumber != answerNumber);
		
		// 繰り返しを終えてプレイヤーの解答がゲームの答えと一致した場合、正解である旨を伝える
		System.out.println("正解です。");
		
		// standardInputを閉じる
		standardInput.close();
	}
}
