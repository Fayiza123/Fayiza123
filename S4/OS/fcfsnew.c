#include <stdio.h>
void main()
{
    
    int p[10],bt[10],wt[10],tt[10],n;
    float avg_tt=0.0,avg_wt=0.0;
    printf("Enter the number of processes\n");
    scanf("%d",&n);
    
    printf("Enter the burst time of each processes:\n");
    for(int i=0;i<n;i++)
    {
        p[i]=i+1;
        printf("p%d:",i+1);
        scanf("%d",&bt[i]);
    }
    
    wt[0]=0;
    for(int i=1;i<n;i++)
    {
        wt[i]=wt[i-1]+bt[i-1];
        avg_wt += wt[i];
    }
    avg_wt /= n;
    
    for(int i=0;i<n;i++)
    {
        tt[i]=wt[i]+bt[i];
        avg_tt += tt[i];
    }
    avg_tt /= n;
    
    printf("\nProcess\tBT\tWT\tTT\n");
    for(int i=0;i<n;i++)
    printf("\np%d\t\t%d\t\t%d\t\t%d\n",p[i],bt[i],wt[i],tt[i]);
    
    printf("average waiting time:%f",avg_wt);
    printf("Average turnaround time:%f",avg_tt);
    printf("\nGantt chart\n");
    printf("\n--------------------------------------\n");
    for(int i=0;i<n;i++)
    {
        printf("\tp%d\t|",p[i]);
    }
    
    printf("\n--------------------------------------\n");
    
    printf("%d\t",wt[0]);
    for(int i=0;i<n;i++)
    {
       
       printf("\t%d\t",tt[i]);
    }
    printf("\n");    
}
             
