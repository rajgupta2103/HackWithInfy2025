import java.util.*;

class job{
    String id;
    int deadline;
    int profit;
    job(String j,int d,int p){
        id=j;
        deadline=d;
        profit=p;
    }
}
public class jobsequencing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        job[] jb=new job[n];

        for(int i=-0;i<n;i++) {
            String j = sc.next();
            int d = sc.nextInt();
            int p = sc.nextInt();
            jb[i] = new job(j, d, p);
        }
            Arrays.sort(jb, (a,b)->b.profit-a.profit);
        }
    }
