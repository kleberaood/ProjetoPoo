package ProjetoClinica;

public class Clinica {
    public static void main (String args []){
        Paciente paciente = new Paciente();
        paciente.nome = "Fulano";
        paciente.endereco = "jurunas";
        paciente.numeroCartao = 232312;

        medico medico = new medico();
        medico.nome = "pedro";
        medico.crm = 123312;
        medico.especialidade = "Cardiologista";

        AtendimentoMedico atendimento = new AtendimentoMedico();
        atendimento.dataConsulta = "20/04/2015";
        atendimento.paciente = paciente;
        atendimento.medico = medico;


    }
}
