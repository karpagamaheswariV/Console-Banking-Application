package model;

public class Bank {
	private int bank_id;
	private String bankName;
	private String bankBranch;
	
	//constructor
	public Bank(int bank_id, String bankName, String bankBranch) {
		super();
		this.bank_id = bank_id;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
	}
	
	
	//getters and setters
	public int getBankId() {
		return bank_id;
	}
	public void setBankId(int bankId) {
		this.bank_id=bankId;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	

}