package msnger;

import java.util.Scanner;

interface Message{
	void sendmsg();
}
class SMSapp implements Message{
	public void sendmsg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mobile number");
		long num = sc.nextLong();
		System.out.println("enter message");
		String sms = sc.next();
		
	}
}
class EmailApp implements  Message{
	public void sendmsg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mailId");
		String email = sc.next();
		System.out.println("enter subject");
		String email1 = sc.next();
		System.out.println("enter content");
		String email2 = sc.next();
		
	}
}
class whatsapp implements  Message{
	public void sendmsg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		String msg = sc.next();
		System.out.println("enter message ");
		String msg1 = sc.next();
		
		
	}
}
	


public class MessengerApp {

	public static void main(String[] args) {
		Message sms = new SMSapp();
		Message mail = new EmailApp();
		Message whatsapp = new whatsapp();
		Scanner scanner=new Scanner(System.in);
        int ch;
        do{
        	System.out.println("msg:");
            System.out.println("1-SMS msg");
            System.out.println("2-Email msg");
            System.out.println("3-whatsapp msg");
            System.out.println("4-Exit");
            System.out.print(" enter your choice: ");
            ch=scanner.nextInt();
            if(ch == 1){
            	sms.sendmsg();
            }
            else if(ch == 2){
            	mail.sendmsg();
        		
            }
            else if(ch == 3){
            	whatsapp.sendmsg();
            }
            else if(ch==4){
            	System.exit(0);
               
            }
            else{
                System.out.println("Invalid choice");
            }
        }
        while(true);
    }		
		
		
				
}
