package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Aluguel {
    private Long id;
    private Calendar date;
    private Calendar dateEntrega;
    private int multa;
    private String status;
    private Boolean situacao;
    private Livro livro;
    private List<Pessoa> pessoas = new ArrayList<>(3);

    public Aluguel() {
        super();
    }

    public Aluguel(Long id, Calendar date, Calendar dateEntrega, int multa, String status, Boolean situacao, Livro livro) {
        super();
        this.id = id;
        this.date = date;
        this.dateEntrega = dateEntrega;
        this.multa = multa;
        this.status = status;
        this.situacao = situacao;
        this.livro = livro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Calendar getDateEntrega() {
        return dateEntrega;
    }

    public void setDateEntrega(Calendar dateEntrega) {
        this.dateEntrega = dateEntrega;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nAluguel{" + "id=" + id + ", date=" + date + calendarToString(date) + ", dateEntrega=" + dateEntrega + calendarToString(dateEntrega) +
                ", multa=" + multa + ", status='" + status + '\'' + ", situacao=" + situacao + ", livro=" + livro + ", pessoas=" + pessoas + '}';
    }

    private static String calendarToString(Calendar data) {
        if(data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(data.getTime());
        }
        return "00/00/0000";
    }
}