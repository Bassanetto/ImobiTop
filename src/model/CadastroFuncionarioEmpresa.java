package model;

public class CadastroFuncionarioEmpresa {
    // passar sexo, tipoServico e estado dps!
    private String nome;
    private String cpf;
    // private String sexo;
    private String telefone;
    // private String tipoServico;
    private String cidade;
    // private String estado;

    public CadastroFuncionarioEmpresa(String nome, String cpf, String telefone, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
    //    this.sexo = sexo;
        this.telefone = telefone;
    //    this.tipoServico = tipoServico;
        this.cidade = cidade;
    //    this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   // public String getSexo() {
   //     return sexo;
   // }

   // public void setSexo(String sexo) {
   //     this.sexo = sexo;
   // }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   // public String getTipoServico() {
   //     return tipoServico;
   // }

   // public void setTipoServico(String tipoServico) {
   //     this.tipoServico = tipoServico;
   // }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //public String getEstado() {
    //    return estado;
    //}

    //public void setEstado(String estado) {
    //    this.estado = estado;
    //}
}
