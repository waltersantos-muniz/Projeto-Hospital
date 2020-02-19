
package revisão;
import java.util.ArrayList;

public class Hospital {
    private String nome;
    private int idHospital;
    private String endereco;
    private  ArrayList<Funcionario> funcionarios = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    } 
    public void listarTodosFuncionarios(){
       for(Funcionario f : funcionarios){
           System.out.println("Nome: "+f.getNome());
       }
    }
    public void listarMedicos(){
        for(Funcionario f : funcionarios){
            if(f instanceof Medico){
                System.out.println("Nome: "+f.getNome());    
            }   
       }
    }
    public void listarEnfermeiros(){
        for(Funcionario f : funcionarios){
            if(f instanceof Enfermeiro){
                System.out.println("Nome: "+f.getNome());    
            }   
       }
    }
    
    public Hospital(int id,String end, String nome){
        this.idHospital = id;
        this.endereco = end;
        this.nome = nome;
    }
}
