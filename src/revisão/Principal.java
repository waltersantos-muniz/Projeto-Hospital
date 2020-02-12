
package revisão;


public class Principal {

 
    public static void main(String[] args) {
        System.out.println("----Paciente----");
     Paciente p = new Paciente();
     p.setCPF("712.316.210-28");
     p.setIdade(17);
     p.setNome("Levi Guilherme Isaac Viana");
     p.setRg("27.586.620-8");
     p.setSenha(123456789);
     System.out.println("CPF: "+p.getCPF());
     System.out.println("Senha: "+p.getSenha());
     System.out.println("RG: "+p.getRg());
     System.out.println("Nome: "+p.getNome());
     System.out.println("Idade: "+p.getIdade());
        System.out.println("----Funcionário---- ");
     
     Funcionário f = new Funcionário();
     f.setCPF("441.456.693-20");
     f.setIdade(12);
     f.setMatricula(245681);
     f.setNome("Bianca Rebeca Giovanna da Cruz");
     f.setRg("35.673.998-3");
     f.setSenha("123456789");
     System.out.println("CPF: "+f.getCPF());
     System.out.println("Senha: "+f.getSenha());
     System.out.println("RG: "+f.getRg());
     System.out.println("Nome: "+f.getNome());
     System.out.println("Idade: "+f.getIdade());
     System.out.println("Matricula : "+f.getMatricula());
        System.out.println("----Enfermeiro-----");
     
     Enfermeiro e = new Enfermeiro();
     e.setCPF("351.302.769-90");
     e.setIdade(13);
     e.setMatricula(245682);
     e.setNome("Roberto Marcelo Castro");
     e.setRg("351.302.769-90");
     e.setSenha("123456789");
     e.setCoren("55555555");
     System.out.println("CPF: "+e.getCPF());
     System.out.println("Senha: "+e.getSenha());
     System.out.println("RG: "+e.getRg());
     System.out.println("Nome: "+e.getNome());
     System.out.println("Idade: "+e.getIdade());
     System.out.println("Matricula: "+e.getMatricula());
     System.out.println("Coren: "+e.getCoren());
        System.out.println("----Médico----- ");
     
     Médico m = new Médico();
     m.setCrm("654645465");
     m.setEspecialiade("Fonodialogo");
     m.setCPF("416.293.337-51");
     m.setIdade(11);
     m.setMatricula(245683);
     m.setNome("Ana Gabriela Simone Porto");
     m.setRg("15.739.364-1");
     m.setSenha("123456789");
     System.out.println("CPF: "+m.getCPF());
     System.out.println("Senha: "+m.getSenha());
     System.out.println("RG: "+m.getRg());
     System.out.println("Nome: "+m.getNome());
     System.out.println("Idade: "+m.getIdade());
     System.out.println("Matricula: "+m.getMatricula());
    }
    
}
