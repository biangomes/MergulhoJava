package modelo;

public class Pessoa {
    private String nome;
    private String documento;
    private Double rendimentoAnual;
    private TIpoPessoa tipo = TIpoPessoa.FISICA;

    public Pessoa() {}

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(Double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public TIpoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TIpoPessoa tipo) {
        this.tipo = tipo;
    }
}
