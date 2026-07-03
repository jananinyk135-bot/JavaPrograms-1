class mains12a{
public static void main(String[] args) {
int ip = 5;
for(int i=1;i<=ip;i++){
for(int j=1;j<=ip;j++){
if(j == 1 || i==j || j== ip){
 System.out.print("* ");
}else{
 System.out.print("  ");
}
            }
            System.out.println();
        }
    }
}