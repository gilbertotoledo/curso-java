package projeto;

/**
 *
 * @author Gilberto Toledo
 */
public class Vendedor extends Funcionario{
    private int QuantVendas;
    private Double Comissao;
    
    public Vendedor(String Nome, String CPF, String Telefone) {
        super(Nome, CPF, Telefone);
    }
    
    @Override
    public Double getSalario(){
        return this.Salario+(this.QuantVendas*this.Comissao);
    }
    
    public int getQuantVendas() {
        return QuantVendas;
    }

    public void setQuantVendas(int QuantVendas) {
        this.QuantVendas = QuantVendas;
    }

    public Double getComissao() {
        return Comissao;
    }

    public void setComissao(Double Comissao) {
        this.Comissao = Comissao;
    }
    
    
    
}
