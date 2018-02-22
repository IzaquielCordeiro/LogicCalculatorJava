import java.util.ArrayList;

public class Formule
{
	Node root;
	static int n = 0;
	
	public Formule(Node no)
	{
		root = no;
	}
	
	private static void order(Node no) {
	
        if (no != null) {
            order(no.prev);
            order(no.post);
            
            if (no.value.equals(no.node))
            {
            	n += 1;
            }
            else
            {
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
            }
        }
        
    }


	public void order()
	{
		order(this.root);
	}
	
	public void getTruthTable()
	{
		Possibilities ps = new Possibilities();
		ps.getPossibilites(n, this.root);
	}
    
}
