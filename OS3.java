import java.util.Scanner;
interface Input{
void input();
}

interface Input2{void task();}

public class  OS implements Input2{
 int no_of_processes, total, random1, counter, time_quantum_p; 
 int wait_time_p, turnaround_time_p ,pos,z,b,local_var,m; 
float average_wait_time_P, average_turnaround_time_p;  

int []p=new int[10];
int []prio=new int[10]; int[]a_time=new int[10];
int []b_time=new int[10]; 
int[]temp=new int[10];


public void task(){
int lp=0;
	System.out.printf("\nProcess ID\t\tBurst Time\t Turnaround Time\t Waiting Time\t Priority");
      for(total = 0, lp = 0; random1!= 0;) { 

		    for(z=0;z<no_of_processes;z++){
			 	int temp1;
					pos=z;
			for(local_var=z+1;local_var<no_of_processes;local_var++)
			{
			    if(prio[local_var]<prio[pos])
				pos=local_var;
			}
		 
		temp1=prio[z];
	
		prio[z]=prio[pos];
	
		prio[pos]=temp1;
		 
			temp1=b_time[z];
			b_time[z]=b_time[pos];
			b_time[pos]=temp1;
		 			temp1=a_time[z];
				a_time[z]=a_time[pos];
			a_time[pos]=temp1;

			temp1=p[z];
				p[z]=p[pos];
			p[pos]=temp1;

			temp1=temp[z];
				temp[z]=temp[pos];
			temp[pos]=temp1;
		    }
            
			if(temp[lp] <= time_quantum_p && temp[lp] > 0) 
            { 
                  total = total + temp[lp]; 
                  temp[lp] = 0; 
                  counter = 1; 
            } 
            
			else if(temp[lp] > 0) 
            { 
                  temp[lp] = temp[lp] - time_quantum_p; 
                  total = total + time_quantum_p; 
            } 

	for(b=0;b<no_of_processes;b++)
		{
			if(b==lp)
			prio[b]+=1;
			else
			prio[b]+=2;
		}

            if(temp[lp] == 0 && counter == 1) 
            { 
                  random1--; 
                 System.out.println("\nProcess"+"["+p[lp]+"]\t\t");
		System.out.println(b_time[lp]+"\t\t");
		System.out.println((total - a_time[lp])+"\t\t");
		System.out.println((total - a_time[lp] -b_time[lp])+"\t\t");
		System.out.println(prio[lp]+"\t\t");
                  wait_time_p = (wait_time_p + total - a_time[random1] - b_time[lp]); 
                  turnaround_time_p = (turnaround_time_p + total - a_time[lp]); 
                  counter = 0; 
            } 
            if(lp ==no_of_processes- 1)lp = 0; 
            
	else if(a_time[lp + 1] <= total) 
                  lp++;
            else 
		lp = 0;		
      }
}

public static void  main(String[] aa){

OS o=new OS();
o.input();
}
}



