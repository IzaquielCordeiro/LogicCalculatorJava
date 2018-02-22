public class Possibilities{
		
	 private int n;
	 
	public boolean[][] createTable(int n)
	{
		this.n = n;
		int col = n;
		int aux = 0;
		int row = (int)Math.pow(2, n);
		boolean[][] possibilites = new boolean[(int) Math.pow(2, n)][col];
		
		 for (int i =0; i != row; i++)
		    {
		        String bin = Integer.toBinaryString(i);
		    	
		    	while (bin.length() < col)
		    	{
		         bin = "0" + bin;
		    	}
		
		     boolean[] boolArray = new boolean[col];
		     char[] chars = bin.toCharArray();
		     
		     for (int j = 0; j < col; j++) {
		         if (chars[j] == '0')
		         {
		        	 boolArray[j] = false;
		         }
		         else
		         {
		        	 boolArray[j] = true;
		         }
		     }
		     
		     //atom created
		     
		     for (int k =0; k<col; k++)
		     {
		    	 possibilites[aux][k] = boolArray[k];
		     }
		     aux += 1;
		     
		    }
		 
		return possibilites;
		}
	
	public void getPossibilites(int n, Node formule)
	{
		this.n= n;
		boolean[][] p = createTable(this.n);

		

		TruthTable tt = new TruthTable();
		tt.setFormule(formule);
		tt.setPossibilities(p);
		tt.getTruthTable();
	}
}
	 
	 
	

