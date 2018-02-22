
public class Node {

	String value;
	String node;
	Node prev;
	Node post;
	boolean boole ;
	
	
	public static Node root; 
	
	
	public Node(String value)
	{
		this.value = value;
		System.out.println("Nodo criado com " + value);
	}
	
	public Node() {}
	
	public void insert(String value)
	{
		insert(root, value);
	}
	
	public void insert(Node no, String value)
	{
		
		if (no == null)
		{
			root = new Node(value);
			root.insert(value);
		}
		else {
			tree(no, value);
		}

	}
	
	private void tree(Node no, String value)
	{
		System.out.println("A string é " + value);
		System.out.println("Procurando por →");
		for (int i=0; i<value.length(); i++)
		{
			char index = value.charAt(i);
			System.out.println("o index é "+index);
			if (index == '→')
			{
				String vlPrev = value.substring(0, i);
				String vlPost = value.substring(i+1, value.length());
				System.out.println(index + " é →");
				no.node = "" + index;

				no.prev = new Node(vlPrev);
				tree(no.prev, vlPrev);

				no.post = new Node(vlPost);
				tree(no.post, vlPost);

				return;
				
			}
			
		}
		System.out.println("A string é " + value);
		System.out.println("Procurando por ∨");
		for (int i=0; i<value.length(); i++)
		{
			char index = value.charAt(i);
			System.out.println("o index é "+index);
			if (index == '∨')
			{
				String vlPrev = value.substring(0, i);
				String vlPost = value.substring(i+1, value.length());
				System.out.println(index + " é ∨");
				no.node = "" + index;

				no.prev = new Node(vlPrev);
				tree(no.prev, vlPrev);

				no.post = new Node(vlPost);
				tree(no.post, vlPost);
	
				return;
			}
		}

		System.out.println("A string é " + value);
		System.out.println("Procurando por ∧");
		for (int i=0; i<value.length(); i++)
		{
			char index = value.charAt(i);
			System.out.println("o index é "+index);
			if (index == '∧')
			{
				String vlPrev = value.substring(0, i);
				String vlPost = value.substring(i+1, value.length());
				System.out.println(index + " é ∧");
				no.node = "" + index;

				no.prev = new Node(vlPrev);
				tree(no.prev, vlPrev);
				
				no.post = new Node(vlPost);
				tree(no.post, vlPost);
		
				return;
			}
		}

		System.out.println("A string é " + value);
		System.out.println("Procurando por ¬");
		for (int i=0; i<value.length(); i++)
		{
			char index = value.charAt(i);
			System.out.println("o index é "+index);
			if (index == '¬')
			{
				String vlPost = value.substring(i+1, value.length());
				System.out.println(index + " é ¬");
				no.node = "" + index;
			
				no.post = new Node(vlPost);
				tree(no.post, vlPost);
			
				return;
			}
		}
		System.out.println(" ");
		no.node = "" + value;
		System.out.println(" ");

		return;
	}
	
	public Node getRoot()
	{
		return Node.root;
	}
	
}

