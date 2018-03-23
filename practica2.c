#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

main(){
        int n,cont,sum,fac,x,return_value;

        printf("Ingrese un numero ");	
        scanf("%d",&n);

        
	    printf("Creando procesos con fork\n");
	    return_value=fork();
	
          if(return_value==0){

             fac=1;
             for(x=1; x<=n; x++)
          
                   fac=x*fac;
                     
                    
             printf("El factorial es  %d\n",fac, getpid());   
           
           

	}else{
           cont=1;
           sum=0;
           while(cont<=n){
           sum=cont+sum;
           cont++;

             }    
	printf("La suma es %d\n",sum, getpid());  

		}




}
