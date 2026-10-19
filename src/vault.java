import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class vault {

    static void main(){
    }
    public static void load(){

    }
    public static void save(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("passwords.vault"))) {
            oos.writeObject(Entry.entries);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
