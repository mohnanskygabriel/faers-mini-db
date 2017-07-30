package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "openfda_drug_info")
public class OpenFDA implements Serializable {

	static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@SerializedName("substance_name")
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "openfda_drug_info_substance_name", foreignKey = @ForeignKey(name = "fk_openfda_drug_info_substance_name_openfda_drug_info_id"))
	@Column(name = "substance_name")
	private List<String> substanceName = null;

	@SerializedName("generic_name")
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "openfda_drug_info_generic_name", foreignKey = @ForeignKey(name = "fk_openfda_drug_info_generic_name_openfda_drug_info_id"))
	@Column(name = "generic_name", columnDefinition = "text")
	private List<String> genericName = null;

	@SerializedName("manufacturer_name")
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "openfda_drug_info_manufacturer_name", foreignKey = @ForeignKey(name = "fk_openfda_drug_info_manufacturer_name_openfda_drug_info_id"))
	@Column(name = "manufacturer_name")
	private List<String> manufacturerName = null;

	@SerializedName("brand_name")
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name = "openfda_drug_info_brand_name", foreignKey = @ForeignKey(name = "fk_openfda_drug_info_brand_name_openfda_drug_info_id"))
	@Column(name = "brand_name")
	private List<String> brand_Name = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getSubstanceName() {
		return substanceName;
	}

	public void setSubstanceName(List<String> substanceName) {
		this.substanceName = substanceName;
	}

	public List<String> getGenericName() {
		return genericName;
	}

	public void setGenericName(List<String> genericName) {
		this.genericName = genericName;
	}

	public List<String> getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(List<String> manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public List<String> getBrand_Name() {
		return brand_Name;
	}

	public void setBrand_Name(List<String> brand_Name) {
		this.brand_Name = brand_Name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand_Name == null) ? 0 : brand_Name.hashCode());
		result = prime * result + ((genericName == null) ? 0 : genericName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((manufacturerName == null) ? 0 : manufacturerName.hashCode());
		result = prime * result + ((substanceName == null) ? 0 : substanceName.hashCode());
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
		OpenFDA other = (OpenFDA) obj;
		if (brand_Name == null) {
			if (other.brand_Name != null)
				return false;
		} else if (!brand_Name.equals(other.brand_Name))
			return false;
		if (genericName == null) {
			if (other.genericName != null)
				return false;
		} else if (!genericName.equals(other.genericName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (manufacturerName == null) {
			if (other.manufacturerName != null)
				return false;
		} else if (!manufacturerName.equals(other.manufacturerName))
			return false;
		if (substanceName == null) {
			if (other.substanceName != null)
				return false;
		} else if (!substanceName.equals(other.substanceName))
			return false;
		return true;
	}

	
	
}
