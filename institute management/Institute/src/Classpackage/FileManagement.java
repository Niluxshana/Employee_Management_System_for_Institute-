package Classpackage;
import java.io.*;

public class FileManagement {
    private static String FILE_PATH="D:\\";
    File file;
    private String fileName;
    public FileManagement(String fileName)
    {
        this.fileName=fileName;
        createNewFile();

    }
    public boolean createNewFile()
    {
        try
        {
            file=new File(FILE_PATH+fileName);
                    if(file.createNewFile())
                    {
                        System.out.println("File Created: "+file.getName());
                        return true;
                    }
                    else
                    {
                        System.out.println("File Already Exist!");
                        return false;
                    }
        }
        catch(IOException ex)
        {
            System.out.println("Something went wrong with file"+ex);
            return false;
        }
    }
    public boolean writeDataToFile(String Record)
    {
        try
        {
            file.createNewFile();
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            
            bufferedWriter.write(Record);
            bufferedWriter.newLine();
            bufferedWriter.close();
            return true;
        }
        catch (IOException ex)
        {
            System.out.println("Something went wrong with writting"+ex);
            return false;
        }
                
    }
    public BufferedReader readAFile()
    {
        if(!createNewFile())
        {
            try
            {
                FileReader fileReader=new FileReader(file);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                return bufferedReader;
            }
            catch(IOException ex)
            {
                System.out.println("Something went wrong with reading the file"+ex);
            }
        }
        return null;
    }
}
