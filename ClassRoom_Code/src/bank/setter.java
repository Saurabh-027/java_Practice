package bank;

public class setter {
    public  static void main(String [] args){
        Bank bank = new Bank();
        bank.setBranchAddress("Patel Nagar");
        bank.setBranchCode(45);
        bank.setBranchName("SBI");

            System.out.println("Branch Name: " + bank.getBranchName());
            System.out.println("Branch Code: " + bank.getBranchCode());
            System.out.println("Branch Address: " + bank.getBranchAddress());
    }
}
