package Serialization;

import javax.management.ObjectName;
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User userDetails=new User();
        userDetails.name="Hasitha";
        userDetails.age=22;
        FileOutputStream Fileout=new FileOutputStream("userinfo.ser");
        ObjectOutputStream output=new ObjectOutputStream(Fileout);
        output.writeObject(userDetails);

        output.close();
        Fileout.close();
        System.out.println("Done");

        User getfromfile=new User();
        FileInputStream filein=new FileInputStream("userinfo.ser");
        ObjectInputStream in=new ObjectInputStream(filein);
        userDetails=(User) in.readObject();
        in.close();
        filein.close();
        System.out.println("done");
        System.out.println(userDetails.name);
        System.out.println(userDetails.age);



    }
}