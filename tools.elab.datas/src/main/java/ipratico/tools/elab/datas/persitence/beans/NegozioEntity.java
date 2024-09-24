package ipratico.tools.elab.datas.persitence.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NEGOZIO")
public class NegozioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NEGOZIO")
    private Long idNegozio;

    @Column(name = "NOME_NEGOZIO", nullable = false, length = 100)
    private String nomeNegozio;

    @Column(name = "INDIRIZZO", nullable = false, length = 255)
    private String indirizzo;

    @Column(name = "TIPO_NEGOZIO", nullable = false, length = 50)
    private String tipoNegozio;

    // Getters e setters
    public Long getIdNegozio() {
        return idNegozio;
    }

    public void setIdNegozio(Long idNegozio) {
        this.idNegozio = idNegozio;
    }

    public String getNomeNegozio() {
        return nomeNegozio;
    }

    public void setNomeNegozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTipoNegozio() {
        return tipoNegozio;
    }

    public void setTipoNegozio(String tipoNegozio) {
        this.tipoNegozio = tipoNegozio;
    }
}
