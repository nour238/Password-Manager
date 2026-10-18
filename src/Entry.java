import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entry{
    static List<Entry> entries = new ArrayList<>();
    String name;
    String username;
    String password;
    public Entry(String name, String username,String password){
        this.name=name;
        this.username=username;
        this.password=password;
    }
    public static void createEntry(Scanner textInput){
        System.out.println("What is the Name of the Entry?");
        String name = textInput.nextLine();
        System.out.println("What is the Username of the Entry?");
        String username = textInput.nextLine();
        System.out.println("What is the Password of the Entry?");
        String password = textInput.nextLine();
        Entry newEntry = new Entry(name,username,password);
        entries.add(newEntry);
        menu.mainMenu();
    }
    public static void showEntrys(){
        Entry currentEntry = new Entry(null,null,null);
        for(int i = 0; i <entries.size(); i++){
            currentEntry = entries.get(i);
            System.out.println(currentEntry.name + " " + currentEntry.username + " " + currentEntry.password);
        }
        menu.mainMenu();
    }
}