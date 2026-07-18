import java.util.*;

public class Librarymanagementsystem {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int [] bookId = new int[100];
        String [] bookName = new String[100];
        String [] author = new String[100];
        int [] quantity = new int[100];
        int total = 0;
        int choice1;
        int searchid;
        int bookid2;
        int bookid3;
        int bookid4;
        int bookid5;
        String choice2;
        do{
            System.out.println("      Menu      ");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Update Book");
            System.out.println("7. Delete Book");
            System.out.println("8. Exit");
            System.out.println(("Enter Your Choice"));
            choice1 = sc.nextInt();

            switch(choice1){
                case 1: 
                System.out.println("Enter Book ID");
                bookId[total] = sc.nextInt();
                sc.nextLine();
                System.out.println(" Enter Book Name");
                bookName[total] = sc.nextLine();
                System.out.println("Enter Author Name");
                author[total] = sc.nextLine();
                System.out.println("Enter Quantity");
                quantity[total] = sc.nextInt();
                System.out.println("Book Added Successfully");
                total++;
                break;

                case 2: 
                for(int i=0; i<total; i++){
                        System.out.println("Book ID :" + bookId[i]);
                        System.out.println("Book Name :" + bookName[i]);
                        System.out.println("Author Name :" + author[i]);
                        System.out.println("Quantity" + quantity[i]);
                }
                break;

                case 3:
                    System.out.println("Enter Book ID to search");
                    searchid = sc.nextInt();
                    boolean found = false;
                    for(int i=0; i<total; i++){
                    if(searchid == bookId[i]){
                        System.out.println("Book Found");
                        System.out.println("Book ID :" + bookId[i]);
                        System.out.println("Book Name :" + bookName[i]);
                        System.out.println("Author Name :" + author[i]);
                        System.out.println("Quantity" + quantity[i]);
                        found = true;
                        break;
                    }
            }
            if(!found){
                System.out.println("Book Not Found");
            }
             break;

            case 4:
                System.out.println("Enter Book ID to Issue");
                bookid2 = sc.nextInt();
                boolean found2 = false;
                for(int i =0; i<total; i++){
                    if(bookid2 == bookId[i]){
                    System.out.println("Book Found");
                        System.out.println("Book ID :" + bookId[i]);
                        System.out.println("Book Name :" + bookName[i]);
                        System.out.println("Author Name :" + author[i]);
                        System.out.println("Quantity" + quantity[i]);
                        found2 = true;
                        if(quantity[i]>0){
                            System.out.println("Book Issued Successfully");
                            quantity[i]--;
                            System.out.println("Remaining Quantity:" + quantity[i]);
                        }else{
                            System.out.println("Book Not Available");
                        }
                        break;
                    }
                }
                if(!found2){
                    System.out.println("Book Not Found");
                }
                break;

                case 5:
                    System.out.println("Enter Book ID to Return");
                    bookid3 = sc.nextInt();
                    boolean found3 = false;
                    for(int i=0; i<total; i++){
                        if(bookid3 == bookId[i]){
                     System.out.println("Book ID :" + bookId[i]);
                    System.out.println("Book Name :" + bookName[i]);
                    System.out.println("Author Name :" + author[i]);
                    System.out.println("Quantity" + quantity[i]);
                    found3 = true;
                    System.out.println("Book Returned Successfully");
                    quantity[i]++;
                    System.out.println("New Quantity: " + quantity[i]);
                    break;
                }
            }
            if(!found3){
                System.out.println("Book Not Found");
            }
            break;

            case 6:
                System.out.println("Enter Book ID to Update");
                bookid4 = sc.nextInt();
                sc.nextLine();

                boolean found4 = false;
                for(int i=0; i<total; i++){
                    if(bookid4 == bookId[i]){
                    System.out.println("Book ID :" + bookId[i]);
                    System.out.println("Book Name :" + bookName[i]);
                    System.out.println("Author Name :" + author[i]);
                    System.out.println("Quantity" + quantity[i]);
                    found4 = true;    

                    System.out.println("Enter New Book name");
                    bookName[i] = sc.nextLine();
                    System.out.println("Enter New Author ");
                    author[i] = sc.nextLine();
                    System.out.println("Enter New Quantity");
                    quantity[i] = sc.nextInt();

                    System.out.println("Book ID :" + bookId[i]);
                    System.out.println("Updated Name :" + bookName[i]);
                    System.out.println("Updated Author :" + author[i]);
                    System.out.println("Update Quantity" + quantity[i]);
                
                    break;
                    }
                }
                if(!found4){
                    System.out.println("Book Not Found");
                }
                break;

                case 7:
                    System.out.println("Enter Book ID to Delete");
                    bookid5 = sc.nextInt();
                    boolean found5 = false;
                    for(int i=0; i<total; i++){
                       if(bookid5 == bookId[i]){
                    System.out.println("Book ID :" + bookId[i]);
                    System.out.println("Book Name :" + bookName[i]);
                    System.out.println("Author Name :" + author[i]);
                    System.out.println("Quantity" + quantity[i]);
                    found5 = true;    

                    System.out.println("Are you sure you want to delete this book: Yes/No");
                    choice2 = sc.next();

                    if(choice2.equalsIgnoreCase("Yes")){
                    for(int j=i; j<total-1; j++)  {
                        bookId[j] = bookId[j+1];
                        bookName[j] = bookName[j+1];
                        author[j] = author[j+1];
                        quantity[j] = quantity[j+1];
                    }
                        total--;
                        System.out.println("Book Deleted Succesfully");
                    
                    }
                    break;
                       }
                    }
                    if(!found5){
                        System.out.println("Book Not Found");
                    }
                     break;

                     case 8:
                        break;

                        default:
                            System.out.println("Invalid Choice");
        }
    } while(choice1!=8);

    sc.close();
}
}

        

    
    
