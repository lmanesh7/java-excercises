public class multiplication {
	public static void main(String[] args) 
	{
		//first matrix
		int x[][]={{2,4,6},{4,6,8},{5,8,7}};  
		//second matrix
		int y[][]={{6,8,4},{12,8,4},{24,31,8}}; 
		//matrix which stores multiplication of the two
		int z[][]=new int[3][3];  
		
		for(int i=0,j=2;i<3;i++,j--)
			for(int k=0,l=2;k<3;k++,l--)
				z[i][k]=x[i][k]*y[j][l];
			
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
	}
}