package mx.infotec.dads.essence.model.foundation.extention;

import java.io.Serializable;

/**
 * This Enum represents the color used into the kernel specification, it depends
 * on the implementation used into the model,.
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class SEColor implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String hexadecimal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHexadecimal() {
		return hexadecimal;
	}

	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}

}
