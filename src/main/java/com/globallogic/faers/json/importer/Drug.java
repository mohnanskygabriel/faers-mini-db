package com.globallogic.faers.json.importer;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "drug")
public class Drug implements Serializable {

	static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@SerializedName("drugadministrationroute")
	@Column(name = "administration_route", columnDefinition = "smallint")
	private Integer drugAdministrationRoute;

	@SerializedName("drugcharacterization")
	@Column(name = "characterization", columnDefinition = "smallint")
	private Integer drugCharacterization;

	@SerializedName("drugindication")
	@Column(name = "indication", columnDefinition = "text")
	private String drugIndication;

	@SerializedName("medicinalproduct")
	@Column(name = "medicinal_product", columnDefinition = "text")
	private String medicinalProduct;

	@SerializedName("openfda")
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_drug_openfda_drug_info_id_openfda_drug_info_id"))
	private OpenFDA openFDA_Drug_Info;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDrugAdministrationRoute() {
		return drugAdministrationRoute;
	}

	public void setDrugAdministrationRoute(Integer drugAdministrationRoute) {
		this.drugAdministrationRoute = drugAdministrationRoute;
	}

	public Integer getDrugCharacterization() {
		return drugCharacterization;
	}

	public void setDrugCharacterization(Integer drugCharacterization) {
		this.drugCharacterization = drugCharacterization;
	}

	public String getDrugIndication() {
		return drugIndication;
	}

	public void setDrugIndication(String drugIndication) {
		this.drugIndication = drugIndication;
	}

	public String getMedicinalProduct() {
		return medicinalProduct;
	}

	public void setMedicinalProduct(String medicinalProduct) {
		this.medicinalProduct = medicinalProduct;
	}

	public OpenFDA getOpenfda() {
		return openFDA_Drug_Info;
	}

	public void setOpenfda(OpenFDA openfda) {
		this.openFDA_Drug_Info = openfda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drugAdministrationRoute == null) ? 0 : drugAdministrationRoute.hashCode());
		result = prime * result + ((drugCharacterization == null) ? 0 : drugCharacterization.hashCode());
		result = prime * result + ((drugIndication == null) ? 0 : drugIndication.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((medicinalProduct == null) ? 0 : medicinalProduct.hashCode());
		result = prime * result + ((openFDA_Drug_Info == null) ? 0 : openFDA_Drug_Info.hashCode());
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
		Drug other = (Drug) obj;
		if (drugAdministrationRoute == null) {
			if (other.drugAdministrationRoute != null)
				return false;
		} else if (!drugAdministrationRoute.equals(other.drugAdministrationRoute))
			return false;
		if (drugCharacterization == null) {
			if (other.drugCharacterization != null)
				return false;
		} else if (!drugCharacterization.equals(other.drugCharacterization))
			return false;
		if (drugIndication == null) {
			if (other.drugIndication != null)
				return false;
		} else if (!drugIndication.equals(other.drugIndication))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (medicinalProduct == null) {
			if (other.medicinalProduct != null)
				return false;
		} else if (!medicinalProduct.equals(other.medicinalProduct))
			return false;
		if (openFDA_Drug_Info == null) {
			if (other.openFDA_Drug_Info != null)
				return false;
		} else if (!openFDA_Drug_Info.equals(other.openFDA_Drug_Info))
			return false;
		return true;
	}
	
	

}
