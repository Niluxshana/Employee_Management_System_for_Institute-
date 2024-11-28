package Classpackage;
import java.io.IOException;
import java.io.BufferedReader;

public class EmployeeDetails {
    private String empID;
    private String empName;
    private String depart;
    private String design;
    
    FileManagement fileCreation = new FileManagement("Employee");
    
    public EmployeeDetails(){}

    public EmployeeDetails(String empID, String empName, String depart, String design) {
        this.empID = empID;
        this.empName = empName;
        this.depart = depart;
        this.design = design;
    }
    
    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public FileManagement getFileCreation() {
        return fileCreation;
    }

    public void setFileCreation(FileManagement fileCreation) {
        this.fileCreation = fileCreation;
    }
    
   public boolean addEmp()
    {
        if(!fileCreation.createNewFile())
        {
            String Record=empID+" "+empName+" "+depart+" "+design;
            System.out.println("Record"+Record);
            return fileCreation.writeDataToFile(Record);
        }
        return false; 
}
   
   public boolean searchEmpID (String userID){
       boolean isFound =false;
       try {
   String [] user = null;
   BufferedReader bufferedReader  = fileCreation.readAFile();
   String employee;
   outerloop:
   while ((employee = bufferedReader.readLine()) !=null) {
       user = employee.split(" ");
       for(String word : user ) {
           if(word.equals(userID)){
               isFound = true;
               this.setEmpID(user[0]);
               this.setEmpName(user[1]);
               this.setDepart(user[2]);
               this.setDesign(user[3]);
               break outerloop;
           }   } }}

catch (IOException ex){
    System.out.println("Error Search Employee");
}
return isFound;
   }
   
   public boolean searchEmpDep (String userID){
       boolean isFound =false;
       try {
   String [] user = null;
   BufferedReader bufferedReader  = fileCreation.readAFile();
   String employee;
   outerloop:
   while ((employee = bufferedReader.readLine()) !=null) {
       user = employee.split(" ");
       for(String word : user ) {
           if(word.equals(userID)){
               isFound = true;
               this.setEmpID(user[0]);
               this.setEmpName(user[1]);
               this.setDepart(user[2]);
               this.setDesign(user[3]);
               break outerloop;
           }   } }}

catch (IOException ex){
    System.out.println("Error Search Employee");
}
return isFound;
   }
   public boolean searchEmpDes (String userID){
       boolean isFound =false;
       try {
   String [] user = null;
   BufferedReader bufferedReader  = fileCreation.readAFile();
   String employee;
   outerloop:
   while ((employee = bufferedReader.readLine()) !=null) {
       user = employee.split(" ");
       for(String word : user ) {
           if(word.equals(userID)){
               isFound = true;
               this.setEmpID(user[0]);
               this.setEmpName(user[1]);
               this.setDepart(user[2]);
               this.setDesign(user[3]);
               break outerloop;
           }   } }}

catch (IOException ex){
    System.out.println("Error Search Employee");
}
return isFound;
   }
}
