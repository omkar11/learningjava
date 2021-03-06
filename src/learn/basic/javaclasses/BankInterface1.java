
package learn.basic.javaclasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public interface BankInterface1 {
	public String createAccountInBank(String name, String dob, String addes, String pan, String adhar, String money,
			String mobNo) throws IOException;

	public Customer[] getAllCustomersInBank();

	public Customer updateAccountFromAccountNo(String acno, String name, String addes, String dob, String pan,
			String adhar, String mobNo);

	public ArrayList<Customer> deleteAccount(String delcust);

	public Customer depositMoney(int amount, String accountNumber);

	public Customer withdrawMoney(int amount, String accountNumber);

	public Customer getAccountFromAccountNumber(String AccountNo1);

	public void printAll();

	public void writeFile() throws IOException;

	public void printOneAcc(String oneCustomer);

	public void readFile() throws IOException;

	public void readFile_Version1() throws IOException;

	public void createHandle() throws IOException;

	public void updateHandle();

	public void deleteHandle();

	public void printOneHandle();

	public int depositHandle();

	public int withdrawHandle();

	public String getValidAcccountNumber();

}
