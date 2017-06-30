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
import org.omg.essence.model.foundation.EndeavorProperty;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class EndeavorProperty. An element to represent properties that you want
 * to track during an endeavor. Each property can either be simple or be
 * expressed via an association.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * true
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 *
 * Endeavor properties are used to track individual properties of actual instances of elements during an endeavor. Endeavor
 * properties can be defined individually for language elements. See 9.5 for the minimal set of endeavor properties that is
 * used by the dynamic semantics of Essence.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
@Document(collection = "endeavorproperties")
public class SEEndeavorProperty implements EndeavorProperty {

    /** The language element. */
    @DBRef
    @JsonBackReference
    private SELanguageElement languageElement;

    /**
     * The association used to express this property if it is not a simple
     * property.
     */
    @DBRef
    @JsonBackReference
    private SEEndeavorAssociation association;

    /** The association owning this property */
    @DBRef
    @JsonBackReference
    private SEEndeavorAssociation owningAssociation;

    /** The type of the property */
    @DBRef
    private SEType type;

    /** Name of the property */
    private String name;

    /** Lower bound of the property */
    private int lowerBound;

    /** Upper bound of the property */
    private int upperBound;

    @Override
    public SELanguageElement getLanguageElement() {
        return languageElement;
    }

    public void setLanguageElement(SELanguageElement languageElement) {
        this.languageElement = languageElement;
    }

    @Override
    public SEEndeavorAssociation getAssociation() {
        return association;
    }

    public void setAssociation(SEEndeavorAssociation association) {
        this.association = association;
    }

    @Override
    public SEEndeavorAssociation getOwningAssociation() {
        return owningAssociation;
    }

    public void setOwningAssociation(SEEndeavorAssociation owningAssociation) {
        this.owningAssociation = owningAssociation;
    }

    @Override
    public SEType getType() {
        return type;
    }

    public void setType(SEType type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    @Override
    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

}
