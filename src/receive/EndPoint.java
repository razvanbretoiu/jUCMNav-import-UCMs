package receive;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="endPoint")
public class EndPoint {

	private int id;
	
	private int idTarget;

	public EndPoint(int id, int idTarget) {
		super();
		this.id = id;
		this.idTarget = idTarget;
	}

	
	
	public EndPoint() {
		super();
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	@XmlElement(name="id")
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the idTarget
	 */
	public int getIdTarget() {
		return idTarget;
	}

	/**
	 * @param idTarget the idTarget to set
	 */
	@XmlElement(name="idTarget")
	public void setIdTarget(int idTarget) {
		this.idTarget = idTarget;
	}
	
	
}
