package ipratico.tools.elab.datas.enums;

public enum NumeroCallEnum {
	CALL_UNO(1),
    CALL_DUE(2),
	CALL_TRE(3);

    private final int numero;

    // Costruttore dell'enum
    NumeroCallEnum(int numero) {
        this.numero = numero;
    }

    // Metodo per ottenere il valore intero associato
    public int getNumero() {
        return numero;
    }

    // Metodo per ottenere un NumeroCallEnum dall'intero
    public static NumeroCallEnum fromNumero(int numero) {
        for (NumeroCallEnum call : values()) {
            if (call.numero == numero) {
                return call;
            }
        }
        throw new IllegalArgumentException("Numero di chiamata non valido: " + numero);
    }

}
