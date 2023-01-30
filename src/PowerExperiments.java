public class PowerExperiments {
    static int count = 0;
    //     //1 1. n+2  2. O(n)
    //     //2 1. n+5 2. O(n)
    //     //3 1. n^2+1 2. O(n^2) 

    public static void main(String[] args) throws Exception {
        simplePowerExperiments();
        
    }

    static double power(double x, int n){
        double p = 1;
        count++;
        for(int i = 1; i <= n; i++){
            p *= x;
            count++;
        }

        return p;
        //O(n)
    }
    static int smartPower(double x, int n){
        int p=1;
        count++;
        double q=x;
        count++;
        int m=n;
        count++;
        while(m>0){
            if(m%2 == 1){
                p = (int)(p*q);
                count++;
            }
            m = (int)(Math.floor(m/2));
            count++;
            q = q*q;
            count++;
        }
        //O(logn)  
        return (p);
    }
    static void simplePowerExperiments(){
        System.out.println("n,count,ops/logn");
        for(int i=0;i<20;i++){
            count = 0;
            smartPower(2, i);
            float logn = (int)(100*count/Math.log(i));   
            logn = logn/100; //2dp
            System.out.println(i + "," + count + ", " + logn);
        }
    }
}
