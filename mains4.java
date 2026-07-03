class mains4{
    public static void main(String[] args) {
        int ip = 5;
        for(int i=1;i<=ip;i++){
for(int k =1;k<=i;k++){
System.out.print(" ");
}
            for(int j=ip;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}