import java.util.Scanner;

public class Railway {
    String name;
    String coach;
    Long mobile;
    int amt;
    int totalamt;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
         name=sc.nextLine();
        System.out.println("enter coach \n 1.first Ac \n 2.Second Ac\n 3.Third Ac\n 4.Sleeper");
        coach=sc.nextLine();
        System.out.println("enter mob no.");
        mobile=sc.nextLong();
        System.out.println("enter amt");
         amt= sc.nextInt();
    }
    void update(){
        if(coach.equals("first Ac")){
            totalamt=amt+700;
        }else if(coach.equals("Second Ac")){
            totalamt=amt+500;
        }else if(coach.equals("Third Ac")){
            totalamt=amt+250;
        }else if(coach.equals("Sleeper")){
            totalamt=amt;
        }else{
            System.out.println("invalid input");
        }
    }
void display() {
    System.out.println("name of the passenger: " + name);
    System.out.println("name of the coach: " + coach);
    System.out.println("mobile number of passenger: " + mobile);
    System.out.println("total amt of passenger " + totalamt);
}
    public static void main(String[] args) {
Railway obj=new Railway();
obj.accept();
obj.update();
obj.display();
    }
}
