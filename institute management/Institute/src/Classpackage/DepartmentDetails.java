package Classpackage;

public class DepartmentDetails {
    private String DepName;
    private String Designation;
    
    FileManagement fileCreation = new FileManagement("Department");
    
    public DepartmentDetails(){}

    public DepartmentDetails(String DepName, String Designation) {
        this.DepName = DepName;
        this.Designation = Designation;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String DepName) {
        this.DepName = DepName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public FileManagement getFileCreation() {
        return fileCreation;
    }

    public void setFileCreation(FileManagement fileCreation) {
        this.fileCreation = fileCreation;
    }
    public boolean addDepartment()
    {
        if(!fileCreation.createNewFile())
        {
            String Record=DepName+" "+Designation;
            System.out.println("Record"+Record);
            return fileCreation.writeDataToFile(Record);
        }
        return false; 
}
}
