package ensyu12_2;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu12_2
 *  概要     :演習問題12-2の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.25
 */
public class Ensyu12_2 {
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

		// 銀行口座クラスのインスタンスを生成する
		return new Account(accountHolder, accountNumber, depositBalance);
	}
	
	/*
	 * 関数名           :createAccountOrTime
	 * メソッドの説明   :Accountクラスのインスタンスを生成し返却この時timeアカウントの作成をするかも問う
	 * パラメータの説明 :なし
	 * 返り値           :入力された値をもとに作成したAccountクラスのインスタンス
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.25
	 */
	public static Account createOrdinalOrTime() {
		// Accountクラスの宣言
		Account ordinalOrTime = createAccount();
		// どちらの口座を作るか問う
		System.out.print("普通預金 … 0以上 / 定期預金 … 負の値 : ");
		// 入力された値を判定用の変数に代入する
		int kindAccount = standardInput.nextInt();
		// 入力された値が0以上なら
		if(kindAccount < 0) {
			// 定期預金の額の入力を促す
			System.out.print("定期預金額 : ");
			// 入力された値を代入する
			long timeDeposit = standardInput.nextLong();
			// メソッドcreateAccountを利用し
			ordinalOrTime = new TimeAccount(ordinalOrTime, timeDeposit);
		}
		// 改行文字の出力
		System.out.println();
		// accountOrTimeを返却する
		return ordinalOrTime;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成したAccount、TimeAccountクラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.25
	 */
	public static void main(String[] args) {
		// 一人目の方が多いか判定する定数
		final int first_IS_MORE = 1;
		// 等しいか判定する定数
		final int EQUAL_BALANCE = 0;
		// 二人目の方が多いか判定する定数
		final int SECOND_IS_MORE = -1;
		
		// 一人目のアカウントの作成を促す
		System.out.println("一人目の口座");
		// メソッドcreateOrdinalOrTimeを呼び出しインスタンスを生成する
		Account firstAccount = createOrdinalOrTime();
		// toStringメソッドを呼び出す
		System.out.println(firstAccount.toString());
		
		// 二人目のアカウントの作成を促す
		System.out.println("\n二人目の口座");
		// メソッドcreateOrdinalOrTimeを呼び出しインスタンスを生成する
		Account secondAccount = createOrdinalOrTime();
		// toStringメソッドを呼び出す
		System.out.println(secondAccount.toString());
		
		
		// メソッドcompBalanceを呼び出し返却された値でint型の変数を初期化する
		int compareBalance = TimeAccount.compBalance(firstAccount, secondAccount);
		// もし"compareBalance"がfirst_IS_MOREなら
		if(compareBalance == first_IS_MORE) {
			// firstAccountの方が多いことを表示する
			System.out.println("\n一人目の方が合計額が多いです");
		// もしEQUAL_BALANCEなら
		} else if(compareBalance == EQUAL_BALANCE) {
			// firstAccountの方が多いことを表示する
			System.out.println("\n合計額は等しいです");
		// もしSECOND_IS_MOREなら
		}else if(compareBalance == SECOND_IS_MORE) {
			// firstAccountの方が多いことを表示する
			System.out.println("\n二人目の方が合計額が多いです");
		}

	}
}
