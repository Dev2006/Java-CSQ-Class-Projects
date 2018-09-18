/*marksheet with student grade*/

import java.util.Scanner;

public class MohitMarksheet {

	public static void main(String[] args) 
	{
		        int score;
		       
		        Scanner scan = new Scanner(System.in);
				
		        System.out.print(" Welcome to Marksheet\n\n Please Enter Marks Obtained to check your result\n");
		  		  
		            score = scan.nextInt();
		            scan.close();
		      
			
				
		        System.out.print("\n Your Grade is ");
		        if(score>90)
		        {
		            System.out.print("A++\n \n Did you Cheat...Are you sure");
		        }
		        else if(score>80 && score<=90)
		        {
		            System.out.print("A");
		        }
		        else if(score>70 && score<=80)
		        {
		            System.out.print("A-");
		        }
		        else if(score>60 && score<=70)
		        {
		            System.out.print("B++");
		        }    
		        else if(score>50 && score<=60)
		        {
		            System.out.print("B");
		        }
		        else if(score>40 && score<=50)
			    {
			            System.out.print("C");
			    }   
		        else if (score>=33 && score<=40)
		        {
		            System.out.print("D\n\n"
		            		+ "\n I highly recomend joining Politics\n You can become the next Prime Minister");
		        }
		        else if(score<33)
		        {
		            System.out.print("Fail\n\n"
		            		+ "You need to cancel your Netflix subscription and start studying");
		    }
		}// TODO Auto-generated method stub

	}


