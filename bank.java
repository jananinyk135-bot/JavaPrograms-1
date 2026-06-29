import java.util.*;
class bank{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
try{
int password = sc.nextInt();
if (password != 1234) {
throw new Exception("Wrong Pin");
}
int balance = 10000;
System.out.println("1. Check Balance 2. Withdraw Money 3. Deposit Money 4.Exit");
while(true){
System.out.println("Enter your choice (1/2/3/4):");
int ch = sc.nextInt();
switch(ch){
case 1 :
System.out.println(balance);
break;
case 2:
int withdraw = sc.nextInt();
if(withdraw <= balance && withdraw%100 == 0){
balance -= withdraw;
System.out.println("After withdraw:"+balance);
}else{
System.out.println("Insufficient Balance");
}
break;
case 3:
int deposit = sc.nextInt();
if(deposit%100 == 0 && deposit>40000){
balance += deposit;
System.out.println("After deposit:"+balance);
}else{
System.out.println("Excess amount cannot be deposited");
}
break;
case 4:
return ;
}
default:
System.out.println("Invalid Option");
}
}catch(Exception e){
System.out.println(e.getMessage());
}
finally{
System.out.println("Thank you!");
}
}}








