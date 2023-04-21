package ensyu9_3;

/*
 *  クラス名 :Ensyu9_3
 *  概要     :演習問題9-3の銀行口座クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.21
 */
public class Account {
	// フィールドの宣言
	// 口座名義
	private String accountHolder;
	// 口座番号
	private String accountNumber;
	// 預金残高
	private long depositBalance;
	// 口座開設日
	private Day openingDay;
	
	// コンストラクタ
	public Account(String accountHolder, String accountNumber, long depositBalance, Day openingDay){
		// フィールドの"accountHolder"に引数の"accountHolder"を代入する
		this.accountHolder = accountHolder;
		// フィールドの"accountNumber"に引数の"accountNumber"を代入する
		this.accountNumber = accountNumber;
		// フィールドの"depositBalance"に引数の"depositBalance"を代入する
		this.depositBalance = depositBalance;
		// フィールドの"openingDay"に引数の"openingDay"のコピーへの参照を代入する
		this.openingDay = new Day(openingDay);
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
	 * 関数名           :getOpeningDay
	 * メソッドの説明   :口座開設日を取得する
	 * パラメータの説明 :なし
	 * 返り値           :口座開設日
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public Day getOpeningDay() {
		// 口座開設日を返却する
		return new Day(openingDay);
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
	 * メソッドの説明   :口座開設日を
	 * パラメータの説明 :なし
	 * 返り値           :文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public String toString() {
		// 返却する
		return String.format("口座名義 : %s\n口座番号 : %s\n口座開設日 : %s\n" +
				"預金残高 : %d 円", accountHolder, accountNumber, openingDay.toString(), depositBalance);
	}
	

}
