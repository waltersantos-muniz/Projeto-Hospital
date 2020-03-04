
package model;


public class Medico extends Funcionario{
    private String crm;
    private String especialiade;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialiade() {
        return especialiade;
    }

    public void setEspecialiade(String especialiade) {
        this.especialiade = especialiade;
    }
    public double gerarBonus(){
        return calcularSalario()*0.30;
    }
    
}
