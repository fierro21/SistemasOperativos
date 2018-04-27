/*
    Programa:   pipes.c
    Funcion:    Muestra el uso de de tuberias (pipes) para comunicar procesos padre e hijo
    Autores:    Dave Mathew y Richard Stone (Beginning Linux Programming, 4th Edition)
*/


#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
   int data_processed;
   int fd[2];
   const char some_data[] = "";
   char buffer[BUFSIZ + 1];
   pid_t fork_result;
   int n,i,a;
    

   n=atoi(some_data);
   printf("Ingrese un numero\n");
   scanf("%d",&n);
   
   memset(buffer, '\0', sizeof(buffer));
   if (pipe(fd) == 0) {
      fork_result = fork();
      if (fork_result == -1) {
	 fprintf(stderr, "Error en fork()");
	 exit(EXIT_FAILURE);
      }
      if (fork_result == 0) {

     data_processed = read(fd[1], buffer, BUFSIZ);
     printf("Proceso hijo: ");
 
  for(i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              printf("No es primo\n");
            }else{
                printf("Si es primo\n");
         }
	 exit(EXIT_SUCCESS);
      }
      else {
	 data_processed = write(fd[0], some_data, strlen(some_data));
	 printf("Proceso padre: Escribi %d\n",n);
    
      }
   }
   exit(EXIT_SUCCESS);
}
