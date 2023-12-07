/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

/**
 *
 * @author MSI LAPTOP
 */
public class Magazine extends Book{
     
    private int issueNo; 

    public Magazine( int issueNo, String title, Auther a1, Date d1, String genre, int edition, int no, boolean isLoaned) {
        super(title, a1, d1, genre, edition, no, isLoaned);
        this.issueNo = issueNo;
    }

    
    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "issue no : "+ this.getIssueNo(); 
    
    }

    @Override
    public boolean inLoan() {
        return super.inLoan(); //To change body of generated methods, choose Tools | Templates.
    }
    
}