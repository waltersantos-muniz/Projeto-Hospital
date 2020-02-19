
package revisão;


public class Enfermeiro extends Funcionario{
    private String coren;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
    public double gerarBonus(){
        return calcularSalario()*0.15;
        
    }
    
}
