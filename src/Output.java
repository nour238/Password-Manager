import java.util.Scanner;
public class Output {
    public static void main() {
    }
    public static void getOperator(){
        Scanner textInput = new Scanner(System.in);
        System.out.println("Welcome Back,");
        System.out.println("1. Show Entrys");
        System.out.println("2. New Entry");
        System.out.println("3. Save & Quit");
        int operation = textInput.nextInt();
        textInput.nextLine();
        switch (operation){
            case 1:
                showEntrys();
                break;
            case 2:
                Input.newEntry(textInput);
                break;
            case 3:
                Input.saveVault();
                break;
            default:
                System.out.println("Please type '1' '2' or '3'!");
        }
    }
    public static void showEntrys(){
        Entry currentEntry = new Entry(null,null,null);
        for(int i = 0; i <Input.entries.size(); i++){
            currentEntry = Input.entries.get(i);
            System.out.println(currentEntry.name + " " + currentEntry.username + " " + currentEntry.password);
        }
        getOperator();
    }
    public static Entry getEntry(Scanner textInput){
        System.out.println("What is the Name of the Entry?");
        String name = textInput.nextLine();
        System.out.println("What is the Username of the Entry?");
        String username = textInput.nextLine();
        System.out.println("What is the Password of the Entry?");
        String password = textInput.nextLine();
        Entry newEntry = new Entry(name,username,password);
        return newEntry;
    }
}
