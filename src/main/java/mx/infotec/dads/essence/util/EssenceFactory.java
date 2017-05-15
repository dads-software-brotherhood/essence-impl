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
package mx.infotec.dads.essence.util;

import java.util.ArrayList;

import mx.infotec.dads.essence.model.foundation.SEPractice;

/**
 * 
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 */
public class EssenceFactory {

    private EssenceFactory() {

    }

    /**
     * Create a DefaultPractice
     * 
     * @return SEPractice
     */
    public static SEPractice createDefaultPractice() {
        SEPractice practice = new SEPractice();
        // Practice
        practice.setConsistencyRules("");
        practice.setEntry(new ArrayList<>());
        practice.setMeasures(new ArrayList<>());
        practice.setObjective("");
        practice.setResult(new ArrayList<>());
        // ElementGroup
        practice.setBriefDescription("");
        practice.setDescription("");
        practice.setIcon(null);
        practice.setMergeResolution(null);
        practice.setName("");
        practice.setOwnedElements(new ArrayList<>());
        practice.setReferredElements(new ArrayList<>());
        // Inheritance
        practice.setExtension(new ArrayList<>());
        practice.setFeatureSelection(new ArrayList<>());
        practice.setOwner(null);
        practice.setPatternAssociation(new ArrayList<>());
        practice.setProperties(new ArrayList<>());
        practice.setReferrer(new ArrayList<>());
        practice.setResource(new ArrayList<>());
        practice.setSuppressable(false);
        practice.setTag(new ArrayList<>());
        practice.setViewSelection(new ArrayList<>());
        return practice;
    }
}
