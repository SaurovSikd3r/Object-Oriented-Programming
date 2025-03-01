package project2;

public class ProductInformation {

 String product; String email;  String emailpassword;  String chossenSubject;  String chossenSubjectTitle;  String chossenSubjectSection;    

    public ProductInformation(String product,  String email,  String emailpassword,  String chossenSubject,  String chossenSubjectTitle,  String chossenSubjectSection) {
   
 this.product=product;
 this.email=email;
 this.emailpassword=emailpassword;
 this.chossenSubject=chossenSubject;
 this.chossenSubjectTitle=chossenSubjectTitle;
 this.chossenSubjectSection=chossenSubjectSection;
    
    }

    public String getStudent() {
        return product;
    }

    public void setStudent(String product) {
        this.product = product;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailpassword() {
        return emailpassword;
    }

    public void setEmailpassword(String emailpassword) {
        this.emailpassword = emailpassword;
    }

    public String getChossenSubject() {
        return chossenSubject;
    }

    public void setChossenSubject(String chossenSubject) {
        this.chossenSubject = chossenSubject;
    }

    public String getChossenSubjectTitle() {
        return chossenSubjectTitle;
    }

    public void setChossenSubjectTitle(String chossenSubjectTitle) {
        this.chossenSubjectTitle = chossenSubjectTitle;
    }

    public String getChossenSubjectSection() {
        return chossenSubjectSection;
    }

    public void setChossenSubjectSection(String chossenSubjectSection) {
        this.chossenSubjectSection = chossenSubjectSection;
    }

   public String toString(){
       
       return this.product+"   "+this.email+"    "+this.emailpassword+"    "+this.chossenSubject+"   "+this.chossenSubjectTitle+"   "+this.chossenSubjectSection+"   ";
       
   }
        
}
