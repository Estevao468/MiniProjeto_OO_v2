package controle;
import modelo.*;

/**
 * Classe responsável pelo controle de comprimidos.
 * @author Henrique Pucci
 * @since 2022
 * 
 */
public class ControleLiquido {
    private Liquido[] l;
    private int qtdLiquidos;
    
    
    public ControleLiquido(ControleDados d) {
        l = d.getLiquidos();
        qtdLiquidos = d.getQtdLiquidos();
    }
    
    /**
     * Método responsável pelo listamento de líquidos pelos seus nomes
     * @return String com os nomes dos líquidos
     * 
     */
    public String[] getNomeLiquido() {
        String[] liquidos = new String[qtdLiquidos]; 
        for(int i = 0; i < qtdLiquidos; i++) { 
            liquidos[i] = l[i].getNome();
        } 
        return liquidos;
        
    }
    
    public int getQtd(){
        return qtdLiquidos;
    }
    
    public void setQtd(int qtd){
        this.qtdLiquidos = qtd;
    }

    public String getNome(int i){
        return l[i].getNome();
    }

    public String getMarca(int i){
        return l[i].getMarca();
    }
    
    public String getFrequencia(int i) {
    	return l[i].getFrequencia();
    }
    
    public String getGotasPorDia(int i) {
    	return Integer.toString(l[i].getGotasporDia());
    }

    public String getLiquidosTotal(int i){
        return Integer.toString(l[i].getMlsTotal());
    }
}
