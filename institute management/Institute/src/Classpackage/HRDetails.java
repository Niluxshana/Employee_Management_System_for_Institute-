package Classpackage;
import java.io.BufferedReader;
import java.io.IOException;

public class HRDetails {
    private String HID;
    private String HPass;
    private String HRType;

    FileManagement fileCreation=new FileManagement("HR.txt");
    
    public HRDetails () {}

    public HRDetails(String HID, String HPass) {
        this.HID = HID;
        this.HPass = HPass;
    }

    public HRDetails(String HID, String HPass, String HRType) {
        this.HID = HID;
        this.HPass = HPass;
        this.HRType = HRType;
        System.out.println(HID+HPass+HRType);
    }

    public String getHID() {
        return HID;
    }

    public void setHID(String HID) {
        this.HID = HID;
    }

    public String getHPass() {
        return HPass;
    }

    public void setHPass(String HPass) {
        this.HPass = HPass;
    }

    public String getHRType() {
        return HRType;
    }

    public void setHRType(String HRType) {
        this.HRType = HRType;
    }

    public FileManagement getFileCreation() {
        return fileCreation;
    }

    public void setFileCreation(FileManagement fileCreation) {
        this.fileCreation = fileCreation;
    }
    
    public boolean addNewUser()
    {
        if(!fileCreation.createNewFile())
        {
            String Record=HID+" "+HPass+" "+HRType;
            System.out.println("Record"+Record);
            return fileCreation.writeDataToFile(Record);
        }
        return false; 
    }
    public boolean validateLogin()
    {
        try
        {
            String[] words=null;
            BufferedReader bufferedReader=fileCreation.readAFile();
            String user;
            while((user=bufferedReader.readLine()) !=null)
            {
                words=user.split(" ");
                if (words[0].equals(HID)&& words[1].equals(HPass))
                {
                    this.setHID(words[0]);
                    this.setHPass(words[1]);
                    this.setHRType(words[2]);
                    return true;
                }
            }
        }
        catch(IOException ex)
        {
            System.out.println("Enter validation Login"+ex);
            return false;
        }
        return false;
}
}
