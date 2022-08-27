package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Funcionario {

    private long id;
    private String cpf;
    private String nome;
    private String sobrenome;
    private Calendar dataNascimento;

    public Funcionario() {
        super();
    }

    public Funcionario(long id, String cpf, String nome, String sobrenome, Calendar dataNascimento) {
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" + "id=" + id + ", cpf='" + cpf + '\'' + ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' + ", dataNascimento=" + calendarToString(dataNascimento) + '}';
    }

    private static String calendarToString(Calendar data) {
        if (data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(data.getTime());
        }
        return "00/00/0000 00:00";
    }
}
