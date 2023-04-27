package ensyu10_5;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu10_5
 *  概要     :演習問題10-5の銀行口座クラスの確認クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.25
 */
public class Ensyu10_5 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名           :createAccount
	 * メソッドの説明   :Accountクラスのインスタンスを生成し返却
	 * パラメータの説明 :なし
	 * 返り値           :入力された値をもとに作成したAccountクラスのインスタンス
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.25
	 */
	public static Account createAccount() {
		// 口座名義の入力を促す
		System.out.print("口座名義 : ");
		// 口座名義を入力した文字列で初期化する
		String accountHolder = standardInput.next();

		// 口座番号の入力を促す
		System.out.print("口座番号 : ");
		// 口座番号を入力した文字列で初期化する
		String accountNumber = standardInput.next();

		// 預金残高の入力を促す
		System.out.print("預金残高 : ");
		// 預金残高を入力した値で初期化する
		long depositBalance = standardInput.nextLong();
		// 改行文字の出力
		System.out.println();
		
		// 銀行口座クラスのインスタンスを生成する
		return new Account(accountHolder, accountNumber, depositBalance);
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成した日付クラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.21
	 */
	public static void main(String[] args) {
		// 口座の数を格納する変数
		int numberOfAccount = 0;
		
		// 正の整数値が入力されるまで繰り返す
		do {
			// いくつ口座を作るか問う
			System.out.println("いくつ口座を作りますか : ");
			// 入力された値を代入する
			numberOfAccount = standardInput.nextInt();
		// 0以下の値が入力されている間繰り返す
		} while(numberOfAccount <= 0);
		
		// Accountクラスの配列を生成する
		Account[] userAccount = new Account[numberOfAccount];
		
		// 口座の数だけ繰り返す
		for(int countNumber = 0; countNumber < numberOfAccount; countNumber++) {
			// いくつ目かを表示する
			System.out.println((countNumber+1) + "個目");
			// メソッドcreateAccountを呼び出しインスタンスを生成
			userAccount[countNumber] = createAccount();
		}
		
		// ループ処理を終了するかの判断のための変数
		boolean roopCheck = true;
		
		// 口座を識別するための変数
		int accountId = 0;
		// 無限ループ
		while(roopCheck) {
			// 区切りの出力
			System.out.println("---------------------------------------------------");

			// 行う処理について問う
			System.out.print("0 … 終了 / 1 … 個人情報の表示 / 2 … 預金残高の表示\n"+
					"3 … 預ける / 4 … 引き出す / 5 … 口座を切り替える: ");
			// 行う処理について格納する変数を入力された値で初期化する
			int switchProcess = standardInput.nextInt();

			// 改行文字の出力
			System.out.println();

			switch (switchProcess) {
			// 0なら
			case 0 : // 終了することを伝える
				System.out.println("終了します");
				// "roopCheck"をfalseにする
				roopCheck = false;
				// switch文を抜ける
				break;
				// 1なら
			case 1 : // 口座名義を表示する
				System.out.println("口座名義 : " + userAccount[accountId].getAccountHolder());
				// 口座番号を表示する
				System.out.println("口座番号 : " + userAccount[accountId].getAccountNumber());
				// 預金残高を表示する
				System.out.println("預金残高 : " + userAccount[accountId].getDepositBalance() + "円");
				// 識別番号を表示する
				System.out.println("識別番号 : " + userAccount[accountId].getUserId());
				// switch文を抜ける
				break;
				// 2なら
			case 2 : // メソッドgetDepositBalanceを呼び出す
				System.out.println(userAccount[accountId].getDepositBalance() + "円");
				// switch文を抜ける
				break;
				// 3なら
			case 3 : // 金額の入力を促す
				System.out.print("金額 : ");
				// メソッドmakeDepositを呼び出す
				userAccount[accountId].makeDeposit(standardInput.nextLong());
				// switch文を抜ける
				break;
				// 4なら
			case 4 : // 金額の入力を促す
				System.out.print("金額 : ");
				// メソッドwithdrawDepositを呼び出す
				userAccount[accountId].withdrawDeposit(standardInput.nextLong());
				// switch文を抜ける
				break;
				// 5なら
			case 5 : // 識別番号の入力を促す
				System.out.print("識別番号 : ");
				// 切り替える識別番号を表す変数を入力された値で初期化する
				int changeId = standardInput.nextInt();
				// もし"changeId"が0以下か最大の識別番号より大きいなら
				if(changeId <= 0 || changeId > Account.getMaxId()) {
					// そのようなアカウントはないことを示す
					System.out.println("そのようなアカウントは存在しません");
				// もし上記に該当しないなら
				} else {
					// "accountId"を"changeId-1"に変える
					accountId = changeId-1;
				}
				// switch文を抜ける
				break;
				// 該当するものがなければ
			default : // 正しい数値を入力するように表示する
				System.out.println("正しい値を入力してください。");
				// switch文を抜ける
				break;
			}
			// 改行文字の出力
			System.out.println();

		}
	}
}
