package todyprac;

import java.util.Scanner;

public class twoDarray {
	
	public static void main (String[] args)
	{ 
	 	   {
		      
		      int[][] values =
		      {
		         { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },
		         { 11, 21, 31 }
		      };

		      for (int row = 0; row < 4; row++)
		      {
		         for (int col = 0; col < 3; col++)
		         {
		            System.out.print(values[row][col] + " ");
		         }

		         System.out.println();    
		      }
		   }
		}	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int[][]ar = new int [3][3];
		//Scanner sc= new Scanner(System.in);
		int val =1;
	    int row =0;
	    
		 
	    while (row<3)
		
		{
	    	int col =0;
			while (col<3) 
			{
				ar[row][col] = val;
				val +=1;
				col++;
				}
			row++;
		}
	
		for(int i=0;i<3;i++)	
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j] + " ");
			}
		}
		
	}
	
	
//for(int i=0;i<4;i++)
}
*/
