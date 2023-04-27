package ensyu10_5;

/*
 *  クラス名 :Account
 *  概要     :銀行口座クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.25
 */
public class Account {
	// フィールドの宣言
	// 何番までの識別番号を与えたか
	private static int counterId = 0;

	// 口座名義
	private String accountHolder;
	// 口座番号
	private String accountNumber;
	// 預金残高
	private long depositBalance;
	// 識別番号
	private int userId;
	
	// 預金の最低額
	private final long MINIMUM_DEPOSIT = 0;
	
	// インスタンス初期化子
	{
		// メッセージを表示する
		System.out.println("明解銀行での口座開設ありがとうございます");
	}
	
	// コンストラクタ
	public Account(String accountHolder, String accountNumber, long depositBalance){
		// フィールドの"accountHolder"に引数の"accountHolder"を代入する
		this.accountHolder = accountHolder;
		// フィールドの"accountNumber"に引数の"accountNumber"を代入する
		this.accountNumber = accountNumber;
		// もし"depositBalance"がMINIMUM_DEPOSIT未満なら
		if(depositBalance < MINIMUM_DEPOSIT) {
			// "depositBalance"を"MINIMUM_DEPOSIT"とする
			depositBalance = MINIMUM_DEPOSIT;
		}
		// フィールドの"depositBalance"に引数の"depositBalance"を代入する
		this.depositBalance = depositBalance;
		// 識別番号"userId"を"counterId"をインクリメントした値とする
		userId = ++counterId;
	}

	/*
	 * 関数名           :getAccountHolder
	 * メソッドの説明   :口座名義を取得する
	 * パラメータの説明 :なし
	 * 返り値           :accountHolder　口座名義
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public String getAccountHolder() {
		// "AccountHolder"を返却する
		return accountHolder;
	}

	/*
	 * 関数名           :getAccountNumber
	 * メソッドの説明   :口座番号を取得する
	 * パラメータの説明 :なし
	 * 返り値           :accountNumber　口座番号
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public String getAccountNumber() {
		// "AccountNumber"を返却する
		return accountNumber;
	}

	/*
	 * 関数名           :getDepositBalance
	 * メソッドの説明   :預金残高を取得する
	 * パラメータの説明 :なし
	 * 返り値           :depositBalance　預金残高
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public long getDepositBalance() {
		// "depositBalance"を返却する
		return depositBalance;
	}
	
	/*
	 * 関数名           :getUserId
	 * メソッドの説明   :識別番号を取得する
	 * パラメータの説明 :なし
	 * 返り値           :userId　識別番号
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public long getUserId() {
		// "userId"を返却する
		return userId;
	}
	
	/*
	 * 関数名           :getMaxId
	 * メソッドの説明   :最後に与えた識別番号を取得する
	 * パラメータの説明 :なし
	 * 返り値           :counterId　最後に与えた識別番号
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int getMaxId() {
		// "counterId"を返却する
		return counterId;
	}

	/*
	 * 関数名           :makeDeposit
	 * メソッドの説明   :"amountMoney"だけ預金する
	 * パラメータの説明 :amountMoney　預金する金額
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public void makeDeposit(long amountMoney) {
		// 預金残高に"amountMoney"を加算する
		depositBalance += amountMoney;
		// 現在の残高を表示する
		System.out.println("現在の残高 : " + depositBalance + " 円");
	}

	/*
	 * 関数名           :withdrawDeposit
	 * メソッドの説明   :"amountMoney"だけおろす
	 * パラメータの説明 :amountMoney　おろす金額
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public void withdrawDeposit(long amountMoney) {
		// もし預金残高より"amountMoney"の方が大きければ
		if(depositBalance < amountMoney) {
			// 預金が足りないことを表示する
			System.out.println("預金残高が足りません");
			// もし預金が足りていれば
		} else {
			// 預金残高から"amountMoney"を減算する
			depositBalance -= amountMoney;
		}
		// 現在の残高を表示する
		System.out.println("現在の残高 : " + depositBalance + " 円");
	}
	
	/*
	 * 関数名           :toString
	 * メソッドの説明   :個人データの文字列を返却する
	 * パラメータの説明 :なし
	 * 返り値           :個人データの文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public String toString() {
		// 返却する
		return String.format("口座名義 : %s\n口座番号 : %s\n" +
				"預金残高 : %d 円", accountHolder, accountNumber, depositBalance);
	}
}
