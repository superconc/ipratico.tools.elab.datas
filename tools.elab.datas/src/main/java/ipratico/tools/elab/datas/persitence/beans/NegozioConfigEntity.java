package ipratico.tools.elab.datas.persitence.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NEGOZIO_CONFIG")
public class NegozioConfigEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NEGOZIO")
    private Long idNegozio;
	
	@Column(name = "NOME_NEGOZIO", nullable = false, length = 100)
	private String nomeNegozio;
	
	@Column(name = "SEQUENZA_CHIAMATA", nullable = false)
	private String sequenzaChiamata;
	
	@Column(name = "ID_CHIAMATA", nullable = false)
	private Integer idChiamata;
	
	@Column(name = "API_CALL", nullable = false, length = 500)
	private String apiCall;
	
	@Column(name = "API_KEY", nullable = false, length = 100)
	private String apiKey;
	
	@Column(name = "VALID", nullable = false, length = 1)
	private String valid;

	
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

	public String getSequenzaChiamata() {
		return sequenzaChiamata;
	}

	public void setSequenzaChiamata(String sequenzaChiamata) {
		this.sequenzaChiamata = sequenzaChiamata;
	}

	public String getApiCall() {
		return apiCall;
	}

	public void setApiCall(String apiCall) {
		this.apiCall = apiCall;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public Integer getIdChiamata() {
		return idChiamata;
	}

	public void setIdChiamata(Integer idChiamata) {
		this.idChiamata = idChiamata;
	}
	
	
}
