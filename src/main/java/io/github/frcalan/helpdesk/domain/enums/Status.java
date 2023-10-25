package io.github.frcalan.helpdesk.domain.enums;

public enum Status {
    ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static Status toEnum(Integer cod) {
        if(cod == null)
            return null;
        for(Status p : Status.values()) {
            if(cod.equals(p.codigo))
                return p;
        }
        throw new IllegalArgumentException("Status inválido");
    }
}
