import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class files {
    files(){
      System.out.println("THIS PROJECT IS JAVA PROGRAM TO CRAETE FILES, WRITE ON FILE, READ FROM FILES AND DELETE FROM FILES");
    }
 // a methood to write on a file.
    public void createFile(){
      System.out.println("CREATE A FILE OF YOUR CHOICE");
      try {
        File objFile = new File("program.txt");
        if(objFile.createNewFile()){
          System.out.println("file " + objFile.getName() +" is created succefully");
        }
        else{
          System.out.println(" The file " + objFile.getName() + " cannot be created / or already exist");
        }
      }
       catch (Exception e) {
        // TODO: handle exception
        System.out.println("An error has occured");
        e.printStackTrace();
      }
       }

       // a method to write on the method
   public  void writeFile(){
     try {
      FileWriter myWriter = new FileWriter("program.txt");
      myWriter.write("Write ant text hear");
      myWriter.close();
    } 
    catch (IOException e) {
      // TODO Auto-generated catch block
      System.out.println("an error has occured" );
      e.printStackTrace();
    }

   }

   // a method to read from file
   public void readFile(){
    try {
      File objFile = new File("program");
      Scanner objScanner = new Scanner(objFile);
      while(objScanner.hasNextLine());
       String string =objScanner.nextLine();
       System.out.println(string);
       objScanner.close();
    } 
    
    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      System.out.println("Error has occured/ cannot read from file");
      e.printStackTrace();
    }
   }

   // method to delete file

   public void deleteFile(){
     File deleteFile = new File("program");
       if(deleteFile.delete()){
        System.out.println(" The file was deleted successfully");
       }
       else{
        System.out.println("An error has occured or cannot delete from this file ");
       }

   }
   
    public static void main(String[] args) {
      
      //File objFile = new File(" ");
     files myFiles = new files();
     Scanner numScanner = new Scanner(System.in);
     
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter your name ");
    String name = myScanner.nextLine();
    System.out.println(name);

    System.out.println("Enter your email ");
    String email = myScanner.nextLine();
    System.out.println(email);

    System.out.println("Enter your password");
    String password = myScanner.nextLine();

    System.out.println("Confirm password");
    String confirmPassword = myScanner.nextLine();
    if(password != confirmPassword){
      System.out.println("Welcome to java files:");
    
    System.out.println("Enter the number");
    System.out.println("case 1: create file");
    System.out.println("case 2: Write on file");
    System.out.println("case 3: Read from file");
    System.out.println("case 4: Delete file");
      
      switch(numScanner.nextInt()){

        case  1:
        myFiles.createFile();
        break;

        case 2:
        myFiles.writeFile();
        break;

        case 3:
        myFiles.readFile();
        break;

        case 4:
        myFiles.deleteFile();
        break;

        default:
        System.out.println("Your serch does not exist please ry again");
      }
        numScanner.close();
        }
        else{
      System.out.println("The system does not regonize your confirm password.");
    }
      myScanner.close();
  }
}
