package Sort;

public class ShellSort {

    void shellSort(int [] a){
        int i,j,h;
        int r,temp;
        int x=0;
        for(r=a.length/2;r>=1;r/=2){
            for(i=r;i<a.length;i++){
                temp=a[i];
                j=i-r;
                while (j>0 &&temp<a[j]){
                    a[j+r]=a[j];
                    j-=r;
                }
                a[j+r]=temp;

            }
            x++;
            System.out.println("第"+x+"步排序结果:");
         for(h=0;h<a.length;h++){
             System.out.println(" "+a[h]);
         }
          System.out.print("\n");
        }




    }
}
