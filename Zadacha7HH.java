class SumRiad{
    void Sum(){
     long[] a=new long[]{1,0};  
     long[] b;
     long pr;
     int n;
     long del;
     del=100000;
     n=1058;
     
     for(int i=2;i<=n;i++){
     b=FormB(i);
     long[] c=new long[2]; 
     pr=a[0]+b[0];
     c[0]=pr%del;
     if(pr/del>0){
         c[1]+=pr/del;
     }
     pr=a[1]+b[1];
     c[1]+=pr%del;
     a=c;
     } 
     
      for(int j=1;0<=j;j--){
        System.out.print(a[j]+" ");
        }
        System.out.println();
 }
    
  private  long[] FormB(int i){
        long[] a=new long[]{i,0};
        long pr;
        long del;
        del=100000;
        for (int j=2;j<=i;j++){
         long[] c=new long[2];   
         pr=a[0]*i;
         c[0]=pr%del;
         if (0<pr/del){
             c[1]+=pr/del;
         }
         pr=a[1]*i;
         c[1]+=pr%del;
         a=c;
        }
        
       /* for(int j=1;0<=j;j--){
            System.out.print(a[j]+" ");
        }
        System.out.println();*/
       return a; 
    }
    
    private int[] Umnogenie(int[] a,int[] b,int st){
       int[] c=new int[500];
        int i=1;
        int pr;
        int k;
        c[0]=0;
        for (int j=1;j<=st;j++){
         /* 
         pr=a[j]*i;
         a[j]=pr%1000000000000   
            */   
        pr=a[j]*b[0];
        pr+=c[i];
        c[i]=pr%1000;
        i++;
        if (pr/1000>0){
            c[i]=pr/1000;
        } 
        }
        k=499;
      
        while(0<k){
         if (c[k]!=0){
             c[0]=k;
             break;
         }
         k--;
        }
        return c;
    }
}
public class Zadacha7HH {
    public static void main(String[] args) {
        SumRiad sr=new SumRiad();
        sr.Sum();
    }
    
}
