package ipratico.tools.elab.datas.persitence.entities.prova;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "automobile")
public class Automobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String marca;
    private String modello;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @OneToMany(mappedBy = "automobile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Multa> multe = new ArrayList<>();

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Multa> getMulte() {
        return multe;
    }

    public void setMulte(List<Multa> multe) {
        this.multe = multe;
    }
}
