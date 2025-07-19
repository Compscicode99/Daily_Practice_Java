class PROB3{
    public static void main(String[] args) {
        add(2.3, 2.2);
        add(5, 4);
        add(7, 8, 9);
    }

    public static void add(int a,int b){
        System.out.println(a+b);
    }
 public static void add(double  a,double  b)   {
    System.out.println(a+b);
 }
 public static void add(int a,int b,int c){
    System.out.println(a+b+c);
 }
}