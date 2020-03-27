package rd.ecommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_CLIENTE")

public class Cliente  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_CLIENTE")
    private Long id;

    @Column(name="DS_TELEFONE")
    private String telefone;

    @Column(name="DS_RG")
    private String rg;

    @Column(name="DS_CPF")
    private String cpf;

    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario user;
}
