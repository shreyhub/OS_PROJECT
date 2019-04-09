import java.util.Scanner;
interface Input{
void input();
}

public class  OS2 implements Input{
 int no_of_processes, total, random1, counter, time_quantum_p; 
 int wait_time_p, turnaround_time_p ,pos,z,b,local_var,m; 
float average_wait_time_P, average_turnaround_time_p;  

int []p=new int[10];
int []prio=new int[10]; int[]a_time=new int[10];
int []b_time=new int[10]; 
int[]temp=new int[10];



public void input(){
	System.out.println("Enter Total Number of Processes"); 
	Scanner op=new Scanner(System.in);
     	no_of_processes=op.nextInt();  
	
random1 =no_of_processes; 
	int  k=0; 

  	while(k<no_of_processes) {
	p[k]=k+1;	
	prio[k]=0;
	System.out.println("Enter total Details of Process"+(k+1));
        System.out.println("Arrival Time:"); 
	a_time[k]=op.nextInt(); 
	System.out.println("Burst Time:"); 
	b_time[k]=op.nextInt();
	temp[k] = b_time[k]; k++;}
	System.out.println("Enter the Time Quantum:"); 
      	time_quantum_p=op.nextInt();
	}

public static void  main(String[] aa){

OS2 o=new OS2();
o.input();
}
}



