
public class TruthTable 
{
	private Node formule;
	private boolean[][] possibilities;
	private int rows, cols;
	int row = 0;
	int colum = 0;
	
	
	public void setFormule(Node seed)
	{
		this.formule = seed;
	}
	
	public void setPossibilities(boolean[][] p)
	{
		this.possibilities = p;
		this.rows = possibilities.length;
		this.cols = possibilities[0].length;
	}
	
	public void getTruthTable()
	{

		getTruthTable(this.formule, this.possibilities);
	}
	
	private void getTruthTable(Node no, boolean[][] p)
	{
		
		if (no != null) {
			
			getTruthTable(no.prev, p);
			getTruthTable(no.post, p);
			
			if (no.value.equals(no.node))
            {				
				no = getResult(no);
				colum++;
				if (colum == cols)
				{
					getModel(formule);
					System.out.println(" ");
					if (row != rows-1)
					{
						colum=0;
						row++;
						getTruthTable(this.formule, p);
					}
					
				}
				
            }
		
		}	

	}
	
	private Node getResult(Node no)
	{
		no.boole = this.possibilities[row][colum];
		
		return no;
		
	}
	
	private void getModel(Node no)
	{
		if (no != null) {
            getModel(no.prev);
            getModel(no.post);  
      
        	if (no.node.equals("¬"))
        	{
        		no.boole = !no.post.boole;
        	}
        	
        	else if (no.node.equals("∧"))
        	{
        		no.boole = (no.prev.boole & no.post.boole);
        	}
        	
        	else if (no.node.equals("∨"))
        	{
        		no.boole = (no.prev.boole | no.post.boole);
        	}
        	else if (no.node.equals("→"))
        	{
        		if (no.post.boole == false)
        		{
        			no.boole = false;
        		}
        		else
        		{
        			no.boole = true;
        		}
        	}

        	System.out.println(no.value + " = " + no.boole);
            
        }
	}
}
	

