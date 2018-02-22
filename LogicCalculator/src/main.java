class main
{
	public static void main(String[] args)
	{
		Node node = new Node();
		node.insert("A∧B→C∨¬D");
		
		Formule formula = new Formule(Node.root);
		
		formula.order();
		System.out.println(" ");
		formula.getTruthTable();
	}
}