package Week11;

public class Comparator<R extends Comparable<R> >{

    public R getMax(R n, R m){

   /*     if (n > m){
            return n;
        } else{
            return m;
        }*/
        return (n.compareTo(m) > 0 ? n : m); //if result is above 0 return n else return m
    }

    public static void main(String[] args) {
        Comparator c = new Comparator();
        System.out.println(c.getMax(3,4));
        System.out.println(c.getMax(3.1, 4.1));
        System.out.println(c.getMax("10", "20"));
    }
}
