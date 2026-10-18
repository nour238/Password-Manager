import java.util.Scanner;
public class menu {
    public static void main() {
    }
    public static void mainMenu(){
        Scanner textInput = new Scanner(System.in);
        System.out.println("Welcome Back,");
        System.out.println("1. Show Entrys");
        System.out.println("2. New Entry");
        System.out.println("3. Save & Quit");
        int operation = textInput.nextInt();
        textInput.nextLine();
        switch (operation){
            case 1:
                Entry.showEntrys();
                break;
            case 2:
                Entry.createEntry(textInput);
                break;
            case 3:
                vault.save();
                break;
            default:
                System.out.println("Please type '1' '2' or '3'!");
        }
    }


}
