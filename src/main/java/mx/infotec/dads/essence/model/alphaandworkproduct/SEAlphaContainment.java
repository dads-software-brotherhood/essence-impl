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
package mx.infotec.dads.essence.model.alphaandworkproduct;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.omg.essence.model.alphaandworkproduct.AlphaContainment;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import mx.infotec.dads.essence.model.foundation.SELanguageElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class AlphaContainment. Alpha association is used to represent a
 * sub(ordinate)-alpha relationship between alphas.
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
 * The sub-alpha relationships define the graphs that show how the states of lower level, more granular alpha instances
 * contribute to and drive the states of the higher level, more abstract, alpha instances.
 * 
 * The relationship between a sub(ordinate)-alpha and a super-alpha can, in general, be many-to-many. The ends of the
 * relationship are modeled separately to indicate which is the sub(ordinate)-alpha and which is the super-alpha of the
 * relationship.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
@Document(collection = "alphacontainments")
public class SEAlphaContainment extends SELanguageElement implements AlphaContainment {

    /** Lower bound for the number of instances of the sub(ordinate)-alpha. */
    private int lowerBound;

    /** Upper bound for the number of instances of the sub(ordinate)-alpha. */
    private int upperBound;

    /** The super alpha */
    @DBRef
    @JsonBackReference
    private SEAlpha superAlpha;

    /** The subordinate alpha. */
    @DBRef
    @JsonBackReference
    private SEAlpha subordinateAlpha;

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

    @Override
    public SEAlpha getSuperAlpha() {
        return superAlpha;
    }

    public void setSuperAlpha(SEAlpha superAlpha) {
        this.superAlpha = superAlpha;
    }

    @Override
    public SEAlpha getSubordinateAlpha() {
        return subordinateAlpha;
    }

    public void setSubordinateAlpha(SEAlpha subordinateAlpha) {
        this.subordinateAlpha = subordinateAlpha;
    }

}
