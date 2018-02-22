ublic class TabelaVerdade
{
    Formula subformula;
    int valor;

    public void setSubformula(Formula subformula)
    {
        this.subformula = subformula;
    }

    public void setValor(int valor)
    {
        this.valor = valor;
    }

    public TabelaVerdade setTabela()
    {
        TabelaVerdade tabela = new TabelaVerdade();
        return tabela;
    }
}
