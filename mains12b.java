class mains12b{
public static void main(String[] args) {
int ip = 5;
for(int i=1;i<=ip;i++){
for(int j=1;j<=ip;j++){
if(j ==i || i==ip-j+1){ //i+j==ip+1
 System.out.print("* ");
}else{
 System.out.print("  ");
}
            }
            System.out.println();
        }
    }
}