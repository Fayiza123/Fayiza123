#include<stdio.h>
#include<stdlib.h>
#include<sys/shm.h>
#include<sys/ipc.h>
#include<string.h>
#include<unistd.h>
void main()
{
     int id;
     void *sm;
     char buf[100];
     id=shmget((key_t)1222,1024,0666|IPC_CREAT);
     printf("Key of shared memory is %d\n",id);
     sm=shmat(id,NULL,0);
     printf("Process attached at %p\n",sm);
     printf("Enter data written to memory:\n");
     
     read(0,buf,100);
     strcpy(sm,buf);
     
     printf("Written data is:\n %s \n",(char*)sm);
}      
