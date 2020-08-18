import java.util.Scanner;
/**
 *
 * @author miche
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.todoList = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            if(command.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                
                this.todoList.add(task);
            }
            
            if(command.equals("list")){
                this.todoList.print();
            }
            
            if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(number);
            }
            
            
        }
    }
}
