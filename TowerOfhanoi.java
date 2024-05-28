public class TowerOfhanoi {
    static void towerOFHanoi(int n, char source, char auxiliary, char destination){
        if(n==1){
            System.out.println("move disk 1 from"+source+ "to" +destination);
            return;
        }
        towerOFHanoi(n-1, source, destination,auxiliary);
        System.out.println("move disk"+n+"from"+source+"to"+destination);
        towerOFHanoi(n-1, auxiliary,source,destination);
    }
public static void main(String[] args) {
    int numberofDisks=3;
    towerOFHanoi(numberofDisks, 'A', 'B', 'C');
}
}
