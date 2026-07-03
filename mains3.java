class mains3{
    public static void main(String[] args) {
        int ip = 5;
        for(int i=1;i<=ip;i++){
for(int k = ip-1;k>=i;k--){
System.out.print(" ");
}
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}