import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    static List<Entry> entries = new ArrayList<>();
    static void main(){
    }
    public static void newEntry(Scanner textInput){
        Entry newEntry = Output.getEntry(textInput);
        entries.add(newEntry);
        Output.getOperator();
    }
    public static void loadVault(){

    }
    public static void saveVault(){

    }
}
