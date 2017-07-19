/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2016 Daniel Cortes Pichardo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.infotec.dads.essence.model.foundation;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Collection;

import org.joda.time.DateTime;
import org.omg.essence.model.foundation.LanguageElement;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import mx.infotec.dads.essence.audit.Auditable;
import mx.infotec.dads.essence.model.alphaandworkproduct.SEAlpha;
import mx.infotec.dads.essence.model.alphaandworkproduct.SEAlphaAssociation;
import mx.infotec.dads.essence.model.alphaandworkproduct.SEWorkProduct;
import mx.infotec.dads.essence.model.alphaandworkproduct.SEWorkProductManifest;
import mx.infotec.dads.essence.model.competency.SECompetency;
import mx.infotec.dads.essence.model.view.SEFeatureSelection;
import mx.infotec.dads.essence.model.view.SEViewSelection;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class LanguageElement. Abstract superclass for an Essence concept.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * -- All language elements that are not element groups need an owner
 * (not self.oclIsKindOf(ElementGroup)) implies owner <> null
 * 
 * -- Each and every instance of LanguageElement may be related to each other via
 * endeavor associations
 * LanguageElement::allInstances->forAll(e1,e2 : LanguageElement |
 * EndeavorAssociation::allInstances->exists(a: EndeavorAssociation | a.memberEnd
 * ->exists(p1,p2 : EndeavorProperty | p1.languageElement=e1 and
 * p2.languageElement=e2)))
 * 
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Language element is the root for all basic elements, auxiliary elements and element groups. It defines the concepts within
 * the Essence language that can be grouped to build composite entities such as Kernels and Practices.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = SEAlpha.class, name = "alpha"), @Type(value = SEPractice.class, name = "practice"),
		@Type(value = SECompetency.class, name = "competency"),
		@Type(value = SEWorkProduct.class, name = "workProduct"),
		@Type(value = SEWorkProductManifest.class, name = "workProductManifest"),
		@Type(value = SEAlphaAssociation.class, name = "alphaAssociation"), })
public abstract class SELanguageElement implements LanguageElement, Auditable {
	/** The mongodb Id */
	@Id
	private String id;

	/**
	 * A flag indicating whether this element may be suppressed in an extension
	 * or composition (see 9.4.3.2 on the essence standard)
	 */
	protected boolean isSuppressable = true;

	/** The element group that owns this language element */
	@DBRef
	@JsonBackReference
	protected SEElementGroup owner;

	/** Tags associated with this language element */
	@DBRef
	@JsonManagedReference
	protected Collection<SETag> tag;

	/** Resources associated with this language element. */
	@DBRef
	@JsonManagedReference
	protected Collection<SEResource> resource;

	/**
	 * Properties (defined at M1 level) that you want to track during the
	 * endeavor.
	 */
	@DBRef
	@JsonManagedReference
	protected Collection<SEEndeavorProperty> properties;

	/**
	 * A list of ViewSelection selects a subset of constructs and construct
	 * features such as attributes and associations.
	 */
	@DBRef
	protected Collection<SEViewSelection> viewSelection;

	/** The feature selection. */
	@DBRef
	@JsonManagedReference
	protected Collection<SEFeatureSelection> featureSelection;

	/** The extension. */
	@DBRef
	@JsonManagedReference
	protected Collection<SEExtensionElement> extension;

	/** The referrer. */
	@DBRef
	@JsonBackReference
	protected Collection<SEElementGroup> referrer;

	/** The pattern association. */
	@DBRef
	protected Collection<SEPatternAssociation> patternAssociation;

	/** The created Date **/
	@CreatedDate
	private DateTime createdDate;

	/** The last modified Date **/
	@LastModifiedDate
	private DateTime lastModifiedDate;

	@Override
	public boolean isSuppressable() {
		return isSuppressable;
	}

	public void setSuppressable(boolean isSuppressable) {
		this.isSuppressable = isSuppressable;
	}

	@Override
	public SEElementGroup getOwner() {
		return owner;
	}

	public void setOwner(SEElementGroup owner) {
		this.owner = owner;
	}

	@Override
	public Collection<SETag> getTag() {
		return tag;
	}

	public void setTag(Collection<SETag> tag) {
		this.tag = tag;
	}

	@Override
	public Collection<SEResource> getResource() {
		return resource;
	}

	public void setResource(Collection<SEResource> resource) {
		this.resource = resource;
	}

	@Override
	public Collection<SEEndeavorProperty> getProperties() {
		return properties;
	}

	public void setProperties(Collection<SEEndeavorProperty> properties) {
		this.properties = properties;
	}

	@Override
	public Collection<SEViewSelection> getViewSelection() {
		return viewSelection;
	}

	public void setViewSelection(Collection<SEViewSelection> viewSelection) {
		this.viewSelection = viewSelection;
	}

	@Override
	public Collection<SEFeatureSelection> getFeatureSelection() {
		return featureSelection;
	}

	public void setFeatureSelection(Collection<SEFeatureSelection> featureSelection) {
		this.featureSelection = featureSelection;
	}

	@Override
	public Collection<SEExtensionElement> getExtension() {
		return extension;
	}

	public void setExtension(Collection<SEExtensionElement> extension) {
		this.extension = extension;
	}

	@Override
	public Collection<SEElementGroup> getReferrer() {
		return referrer;
	}

	public void setReferrer(Collection<SEElementGroup> referrer) {
		this.referrer = referrer;
	}

	@Override
	public Collection<SEPatternAssociation> getPatternAssociation() {
		return patternAssociation;
	}

	public void setPatternAssociation(Collection<SEPatternAssociation> patternAssociation) {
		this.patternAssociation = patternAssociation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public DateTime getCreatedDate() {
		return createdDate;
	}

	@Override
	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public DateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	@Override
	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
