import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Map<Integer,ArrayList<Transaction>> transactionHistory = new HashMap<>();
    private ArrayList<Customer> customers = new ArrayList<>();


    public void createAccount(Account account){
       accounts.add(account);
    }
    public void updateBalance(int AccountNumber, double amount){

    }

    public void addTransaction(int accountNumber, Transaction transaction){
        if (transactionHistory.containsKey(accountNumber)) {
            transactionHistory.get(accountNumber).add(transaction);
        } else{
            ArrayList<Transaction> newTransactionList = new ArrayList<>();
            newTransactionList.add(transaction);
            transactionHistory.put(accountNumber, newTransactionList);
        }
    }
    public ArrayList<Transaction> getTransactionHistory(int accountNumber){
        return transactionHistory.getOrDefault(accountNumber,new ArrayList<>());
    }
    public void listAccounts(){
        for (Account account : accounts){
            System.out.println(account);
        }
    }
    public void manageCustomerInfo(){

    }


}
