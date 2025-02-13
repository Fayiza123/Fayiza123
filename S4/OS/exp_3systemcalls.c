#include<sys/types.h>
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<sys/wait.h>
void main(){
      int status,pid,child_pid;
      pid=fork();
      if(pid==-1)
      {
          printf("Child process creation failed.\n");
          exit(0);
      }else if(pid==0){
          printf("Input child process for the processID:%d\n",getpid());
          
          execlp("/bin/date","date",NULL);
          exit(0);
      }
      else{
             child_pid=wait(&status);
             printf("Input parent process for the processID:%d\n",getpid());
             printf("Child process created successfully");
          }
}                    
