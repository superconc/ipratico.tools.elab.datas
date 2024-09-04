package ipratico.tools.elab.datas.enums;

public enum StatusNegozioConfigEnum {
	TRUE("Y"),
    FALSE("F");

    private final String valore;

    StatusNegozioConfigEnum(String valore) {
        this.valore = valore;
    }

    public String getValore() {
        return valore;
    }

    public static StatusNegozioConfigEnum fromValore(String valore) {
        for (StatusNegozioConfigEnum stato : values()) {
            if (stato.valore.equals(valore)) {
                return stato;
            }
        }
        throw new IllegalArgumentException("Valore non valido: " + valore);
    }
}
