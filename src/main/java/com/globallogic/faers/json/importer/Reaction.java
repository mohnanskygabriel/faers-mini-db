package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reaction")
public class Reaction implements Serializable {

	static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@SerializedName("reactionmeddrapt")
	@Column(name = "meddra_pt")
	private String reactionMedDRAPT;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReactionMedDRAPT() {
		return reactionMedDRAPT;
	}

	public void setReactionMedDRAPT(String reactionMedDRAPT) {
		this.reactionMedDRAPT = reactionMedDRAPT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reactionMedDRAPT == null) ? 0 : reactionMedDRAPT.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reaction other = (Reaction) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reactionMedDRAPT == null) {
			if (other.reactionMedDRAPT != null)
				return false;
		} else if (!reactionMedDRAPT.equals(other.reactionMedDRAPT))
			return false;
		return true;
	}

}
