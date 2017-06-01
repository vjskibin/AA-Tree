package skibin;
import java.util.Scanner;
/**
 * Created by Сусанин on 18.05.2017.
 */
public class AATreeTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        AATree aat = new AATree();
        System.out.println("AATree Tree Test\n");
        char ch;
        do
        {
            System.out.println("\nAATree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. clear");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    aat.insert( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ aat.search( scan.nextInt() ));
                    break;
                case 3 :
                    System.out.println("Nodes = "+ aat.countNodes());
                    break;
                case 4 :
                    System.out.println("Empty status = "+ aat.isEmpty());
                    break;
                case 5 :
                    System  .out.println("\nTree Cleared");
                    aat.clear();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            System.out.print("\nPost order : ");
            aat.postorder();
            System.out.print("\nPre order : ");
            aat.preorder();
            System.out.print("\nIn order : ");
            aat.inorder();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}