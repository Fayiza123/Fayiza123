#include<stdio.h>
void main()
{
    int n,p[10],at[10],bt[10],prio[10],ct[10],tt[10],wt[10],temp[10],count=0,smallest,time,i;
    double avg_tt=0,avg_wt=0,end=0;
    printf("enter the number of processes:\n");
    scanf("%d",&n);
    printf("Enter the arrival time and burst time for all the processes:");
    for(int i=0;i<n;i++)
    {
       printf("p%d:",i+1);
       scanf("%d%d%d",&at[i],&bt[i],&prio[i]);
       temp[i]=bt[i];
    }   

    prio[9]=9876;
    
    for(time=0;count != n;time++)
    {
        smallest=9;
        for(int i=0;i<n;i++)
        {
            if(at[i]<=time&&prio[i]<prio[smallest]&&bt[i]>0)
            {
                smallest=i;
            }
        }        
            bt[smallest]--;
            
            if(bt[smallest]==0)
            
                count++;
                end=time+1;
                ct[smallest]=end;
                wt[smallest]=end-at[smallest]-temp[smallest];
                tt[smallest]=end-at[smallest];
            
        
    }
    
    printf("\n--------------------------------------------------------------\n");
    printf("\np\tAT\tBT\tprio\tCT\tTT\tWT\n");
    printf("\n--------------------------------------------------------------\n");
    for(int i=0;i<n;i++)
    {
        printf("\np%d\t%d\t%d\t%d\t%d\t%d\t%d\n",i+1,at[i],temp[i],prio[i],ct[i],tt[i],wt[i]);
        
        avg_tt += tt[i];
        avg_wt += wt[i];
    } 
    
    printf("\n----------------------------------------------------------\n");
    
    printf("\nGantt chart\n");
    printf("\n----------------------------------------------------------\n");
    for(int i=0;i<n;i++)
    {
        printf("\tp%d\t|",i+1);
    }
    printf("\n");
    printf("\n-----------------------------------------------------------\n");
    printf("1");
    for(int i=0;i<n;i++)
    {
       
       printf("\t%d\t",ct[i]); 
    }
    printf("\n");   
    printf("\nThe average turnaround time is:%lf\n",avg_tt/n);
    printf("\nThe average waiting time is:%lf\n",avg_wt/n);
}    
                                   
