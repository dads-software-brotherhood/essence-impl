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

import org.omg.essence.model.alphaandworkproduct.WorkProductManifest;

import mx.infotec.dads.essence.model.foundation.SELanguageElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class WorkProductManifest. A work product manifest binds a work product
 * to an alpha.
 * 
 * <pre>
 * 
 * <b>Invariant:</b>
 * 
 * {@code
 * true
 * }
 * }
 * </pre>
 * 
 * <pre>
 * 
 * <b>Semantics:</b>
 * 
 * Work product manifest represents a tri-nary relationship. It is a relationship from a practice to a work product which is
 * used for describing an alpha. Several work products may be bound to the same alpha, i.e., there may be multiple alpha
 * manifests within a practice binding a specific alpha to different work products.
 * 
 * For each work product manifest, there is a multiplicity stating how many instances there should be of the associated work
 * product describing one instance of the alpha.
 * 
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class SEWorkProductManifest extends SELanguageElement implements WorkProductManifest {

    /**
     * Lower bound for the number of instances of the work product associated to
     * one instance of the alpha.
     */
    private int lowerBound;

    /**
     * Upper bound for the number of instances of the work product associated to
     * one instance of the alpha.
     */
    private int upperBound;

    /** The alpha bound by this manifest. */
    private SEAlpha alpha;

    /** The work product bound by this manifest. */
    private SEWorkProduct workProduct;

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public SEAlpha getAlpha() {
        return alpha;
    }

    public void setAlpha(SEAlpha alpha) {
        this.alpha = alpha;
    }

    public SEWorkProduct getWorkProduct() {
        return workProduct;
    }

    public void setWorkProduct(SEWorkProduct workProduct) {
        this.workProduct = workProduct;
    }

    @Override
    public SEAlpha alpha() {
        return this.alpha;
    }

    @Override
    public int upperBound() {
        return this.upperBound;
    }

    @Override
    public SEWorkProduct workProduct() {
        return this.workProduct;
    }

}
