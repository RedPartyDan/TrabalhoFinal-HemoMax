package hemomax.api.domain.normalidade;

import hemomax.api.domain.instituicao.Instituicao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "normalidades")
@Entity(name = "normalidade")
@EqualsAndHashCode(of = "id")
public class Normalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private boolean ativo;
    @OneToOne(mappedBy = "normalidade")
    private Instituicao instituicao;
    public Normalidade(){
        this.ativo = true;
    }

    public Long getId() {
        return id;
    }
    public void excluir() {
        this.ativo = false;
    }
}
