package ensyu15_5;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu15_5
 *  概要     :演習問題15-5の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Ensyu15_5 {
	// Randomクラスのインスタンスを生成
	private static Scanner standardInput = new Scanner(System.in);
	// 勝ちであることを表す定数
	public static final int WIN_VALUE = 1;
	// 引き分けであることを表す定数
	public static final int DROW_VALUE = 0;
	// 負けであることを表す定数
	public static final int LOSE_VALUE = -1;
	
	
	/*
	 * 関数名           :judgeWinLose
	 * メソッドの説明   :じゃんけんの結果を求める
	 * パラメータの説明 :firstPlayer　一人目の手
	 *                   secondPlayer　二人目の手
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public static int judgeWinLose(int firstPlayer, int secondPlayer) {
		// じゃんけんの手の形の種類
		final int KIND_OF_HAND = 3;
		// 結果を格納する変数
		int winnerPlayer = 0;
		switch((firstPlayer - secondPlayer + KIND_OF_HAND) % KIND_OF_HAND) {
		// もし0なら
		case 0 : 
			// "winnerPlayer"をDROW_VALUEとする
			winnerPlayer = DROW_VALUE;
			// switch文を抜ける
			break;
		// もし1なら
		case 1 : 
			// "winnerPlayer"をLOSE_VALUEとする
			winnerPlayer = LOSE_VALUE;
			// switch文を抜ける
			break;
		// もし2なら
		case 2 : 
			// "winnerPlayer"をWIN_VALUEとする
			winnerPlayer = WIN_VALUE;
			// switch文を抜ける
			break;
		}
		// "winnerPlayer"を返却する
		return winnerPlayer;
	}
	/*
	 * 関数名           :judgeWinLoseThree
	 * メソッドの説明   :三人のじゃんけんの結果を求める
	 * パラメータの説明 :firstPlayer　一人目
	 *                   secondPlayer　二人目
	 *                   thirdPlayer　三人目
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.28
	 */
	public static void judgeWinLoseThree(Player firstPlayer, Player secondPlayer, Player thirdPlayer) {
		// 一人目の手の形でint型の変数を初期化する
		int firstHand = firstPlayer.getHandType();
		// 二人目の手の形でint型の変数を初期化する
		int secondHand = secondPlayer.getHandType();
		// 三人目の手の形でint型の変数を初期化する
		int thirdHand = thirdPlayer.getHandType();
		
		// もし三つの値の合計を3で割った余りが0なら
		if((firstHand + secondHand + thirdHand) % 3 == 0) {
			// あいこであると表示する
			System.out.println("あいこです");
			// もし二人目と三人目が同じ手ならプレイヤーとその他について考える
		} else if(secondHand == thirdHand) {
			// もし一人目が二人目に勝っているなら
			if(judgeWinLose(firstHand, secondHand) == WIN_VALUE) {
				// 一人目の勝ちであることを表示する
				System.out.println(firstPlayer.getplayerName() + " の勝ち");
			// もし一人目が二人目に負けているなら
			} else if (judgeWinLose(firstHand, secondHand) == LOSE_VALUE) {
				// 一人目の負けであることを表示する
				System.out.println(firstPlayer.getplayerName() + " の負け");
			}
			// もし一人目と三人目が同じ手なら二人目とその他について考える
		} else if(firstHand == thirdHand) {
			// もし二人目が一人目に勝っているなら
			if(judgeWinLose(secondHand, firstHand) == WIN_VALUE) {
				// 二人目の勝ちであることを表示する
				System.out.println(secondPlayer.getplayerName() + " の勝ち");
			// もし二人目が一人目に負けているなら
			} else if (judgeWinLose(secondHand, firstHand) == LOSE_VALUE) {
				// 二人目の負けであることを表示する
				System.out.println(secondPlayer.getplayerName() + " の負け");
			}
		// もし一人目と二人目が同じ手なら三人目とその他について考える
		} else if(firstHand == secondHand) {
			// もし三人目が一人目に勝っているなら
			if(judgeWinLose(thirdHand, firstHand) == WIN_VALUE) {
				// 二人目の勝ちであることを表示する
				System.out.println(thirdPlayer.getplayerName() + " の勝ち");
			// もし三人目が一人目に負けているなら
			} else if (judgeWinLose(thirdHand, firstHand) == LOSE_VALUE) {
				// 二人目の負けであることを表示する
				System.out.println(thirdPlayer.getplayerName() + " の負け");
			}
		}
	}
	
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成したPlayerクラス群の動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.27
	 */
	public static void main(String[] args) {
		// プレイヤーの名前の入力を促す
		System.out.print("プレイヤー名 : ");
		// String型の変数を入力された値で初期化する
		String playerName = standardInput.next();
		
		// Playerクラスの配列を生成する
		// 今回はプレイヤーが3人で、うち二人はコンピュータとする
		Player[] joinPlayer = {
				new HumanPlayer(playerName),
				new ComputerPlayer(),
				new ComputerPlayer(),
		};
		
		// それぞれの手の形を設定する
		for(Player playerHand : joinPlayer) {
			// メソッドdecideHandTypeを呼び出す
			playerHand.decideHandType();
		}
		// 改行する
		System.out.println();
		
		// それぞれの手の形を表示する
		for(Player playerHand : joinPlayer) {
			// メソッドprintHandを呼び出す
			System.out.println(playerHand.toString());
		}
		// 改行する
		System.out.println();
		
		// メソッドjudgeWinLoseThreeを呼び出す
		judgeWinLoseThree(joinPlayer[0], joinPlayer[1], joinPlayer[2]);
	}
}
