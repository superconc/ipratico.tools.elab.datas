package ipratico.tools.elab.datas.persitence.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NEGOZIO_TIPI")
public class NegozioTipiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NEGOZIO_TIPI")
    private Long idNegozioTipi;

    @ManyToOne
    @JoinColumn(name = "ID_NEGOZIO", nullable = false)
    private NegozioEntity negozio;

    @Column(name = "MARCHIO", nullable = false, length = 250)
    private String marchio;

    // Getters e setters
    public Long getIdNegozioTipi() {
        return idNegozioTipi;
    }

    public void setIdNegozioTipi(Long idNegozioTipi) {
        this.idNegozioTipi = idNegozioTipi;
    }

    public NegozioEntity getNegozio() {
        return negozio;
    }

    public void setNegozio(NegozioEntity negozio) {
        this.negozio = negozio;
    }

    public String getMarchio() {
        return marchio;
    }

    public void setMarchio(String marchio) {
        this.marchio = marchio;
    }
}
