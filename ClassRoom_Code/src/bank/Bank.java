//Write a Java program that have a class Bank it has a private variable Branch name,
// Branch code, Branch Address, create methods to set and get values of these variables.
package bank;

public class Bank {

    private String branchAddress;
    private int branchCode;
    private String branchName;

    void setBranchName(String name) {
        this.branchName = name;
    }

    void setBranchCode(int code) {
        this.branchCode = code;
    }

    void setBranchAddress(String address) {
        this.branchAddress = address;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public String getBranchAddress() {
        return this.branchAddress;
    }

    public int getBranchCode() {
        return this.branchCode;
    }
}
