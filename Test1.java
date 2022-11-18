public class Test1{
    public static void main(String[] args) {
        int a ;
        int k = 7;
        System.out.printf("%d%n", k);
        Test3 t3 = new Test3();
        a = t3.jet(k,4);
        System.out.printf("%d%n", a);
    }
}
class Test2{
    public int add(int x, int y){

        int t = x + y;
        return t ;
    }
}