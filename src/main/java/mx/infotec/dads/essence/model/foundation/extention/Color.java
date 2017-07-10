package mx.infotec.dads.essence.model.foundation.extention;

/**
 * This Enum represents the color used into the kernel specification, it depends
 * on the implementation used into the model,.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public enum Color {
    GREEN("59DF70"), YELLOW("FFFF65"), BLUE("5E8ED1");

    private String hexadecimal;

    Color(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

}
