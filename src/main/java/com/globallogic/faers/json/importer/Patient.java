package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

	static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@SerializedName("patientonsetage")
	@Column(name = "onset_age")
	private String patientOnsetAge;

	@SerializedName("patientonsetageunit")
	@Column(name = "onset_age_unit", columnDefinition = "smallint")
	private Integer patientOnsetAgeUnit;

	@SerializedName("patientsex")
	@Column(name = "sex", columnDefinition = "smallint")
	private Integer patientSex;

	@SerializedName("patientweight")
	@Column(name = "weight", columnDefinition = "real")
	private Double patientWeight;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "patient_drug_mapping", joinColumns = @JoinColumn(name = "patient_id", foreignKey = @ForeignKey(name = "fk_patient_drug_mapping_patient_id_patient_id")), inverseJoinColumns = @JoinColumn(name = "drug_id", foreignKey = @ForeignKey(name = "fk_patient_drug_mapping_drug_id_drug_id")))
	private List<Drug> drug = null;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "patient_reaction_mapping", joinColumns = @JoinColumn(name = "patient_id", foreignKey = @ForeignKey(name = "fk_patient_reaction_mapping_patient_id_patient_id")), inverseJoinColumns = @JoinColumn(name = "reaction_id", foreignKey = @ForeignKey(name = "fk_patient_reaction_mapping_reaction_id_reaction_id")))
	private List<Reaction> reaction = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientOnsetAge() {
		return patientOnsetAge;
	}

	public void setPatientOnsetAge(String patientOnsetAge) {
		this.patientOnsetAge = patientOnsetAge;
	}

	public Integer getPatientOnsetAgeUnit() {
		return patientOnsetAgeUnit;
	}

	public void setPatientOnsetAgeUnit(Integer patientOnsetAgeUnit) {
		this.patientOnsetAgeUnit = patientOnsetAgeUnit;
	}

	public Integer getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(Integer patientSex) {
		this.patientSex = patientSex;
	}

	public Double getPatientWeight() {
		return patientWeight;
	}

	public void setPatientWeight(Double patientWeight) {
		this.patientWeight = patientWeight;
	}

	public List<Drug> getDrug() {
		return drug;
	}

	public void setDrug(List<Drug> drug) {
		this.drug = drug;
	}

	public List<Reaction> getReaction() {
		return reaction;
	}

	public void setReaction(List<Reaction> reaction) {
		this.reaction = reaction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drug == null) ? 0 : drug.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((patientOnsetAge == null) ? 0 : patientOnsetAge.hashCode());
		result = prime * result + ((patientOnsetAgeUnit == null) ? 0 : patientOnsetAgeUnit.hashCode());
		result = prime * result + ((patientSex == null) ? 0 : patientSex.hashCode());
		result = prime * result + ((patientWeight == null) ? 0 : patientWeight.hashCode());
		result = prime * result + ((reaction == null) ? 0 : reaction.hashCode());
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
		Patient other = (Patient) obj;
		if (drug == null) {
			if (other.drug != null)
				return false;
		} else if (!drug.equals(other.drug))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (patientOnsetAge == null) {
			if (other.patientOnsetAge != null)
				return false;
		} else if (!patientOnsetAge.equals(other.patientOnsetAge))
			return false;
		if (patientOnsetAgeUnit == null) {
			if (other.patientOnsetAgeUnit != null)
				return false;
		} else if (!patientOnsetAgeUnit.equals(other.patientOnsetAgeUnit))
			return false;
		if (patientSex == null) {
			if (other.patientSex != null)
				return false;
		} else if (!patientSex.equals(other.patientSex))
			return false;
		if (patientWeight == null) {
			if (other.patientWeight != null)
				return false;
		} else if (!patientWeight.equals(other.patientWeight))
			return false;
		if (reaction == null) {
			if (other.reaction != null)
				return false;
		} else if (!reaction.equals(other.reaction))
			return false;
		return true;
	}

}
