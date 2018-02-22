public class Operacao
{
    Formula formula;
    Formula subformula;
    int valor;

    private void divideFormula()
    {
        System.out.println("dividido");
        this.subformula = formula;
    }

    private int AND(Formula subformula)
    {

        return 0;
    }
    private int OR(Formula subformula)
    {

        return 0;
    }
    private int THEN(Formula subformula)
    {

        return 0;
    }
    private int NOT(Formula subformula)
    {

        return 0;
    }

    public int getValor(Formula subformula) {
        return valor;
    }

    public Formula getSubformula() {
        return subformula;
    }
}