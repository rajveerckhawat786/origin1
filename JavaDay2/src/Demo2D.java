
public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix;
		matrix = new int [3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 10;
		matrix[0][2] = 100;
		
		matrix[1][0] = 1;
		matrix[1][1] = 10;
		matrix[1][2] = 100;
		
		matrix[2][0] = 1;
		matrix[2][1] = 10;
		matrix[2][2] = 100;
		
		for(int i = 0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
