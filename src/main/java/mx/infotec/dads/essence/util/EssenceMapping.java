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

import mx.infotec.dads.essence.model.SEGraphicalElement;
import mx.infotec.dads.essence.model.foundation.SEBasicElement;
import mx.infotec.dads.essence.model.foundation.SEElementGroup;
import mx.infotec.dads.essence.model.foundation.SELanguageElement;
import mx.infotec.dads.essence.model.foundation.SEPractice;

/**
 * 
 * @author Daniel Cortes Pichardo
 * @since essence 1.1
 * @version 1.1
 */
public class EssenceMapping {

    public static void fillSELanguageElements(SELanguageElement element) {
        element.setExtension(new ArrayList<>());
        element.setFeatureSelection(new ArrayList<>());
        element.setOwner(null);
        element.setPatternAssociation(new ArrayList<>());
        element.setProperties(new ArrayList<>());
        element.setReferrer(new ArrayList<>());
        element.setResource(new ArrayList<>());
        element.setSuppressable(false);
        element.setTag(new ArrayList<>());
        element.setViewSelection(new ArrayList<>());
    }

    public static void fillSEElementGroup(SEElementGroup element) {
        // ElementGroup
        element.setBriefDescription("");
        element.setDescription("");
        element.setIcon(null);
        element.setMergeResolution(null);
        element.setName("");
        element.setOwnedElements(new ArrayList<>());
        element.setReferredElements(new ArrayList<>());
    }

    public static void fillBasicElement(SEBasicElement element) {
        element.setName("");
        element.setIcon(new SEGraphicalElement());
        element.setBriefDescription("");
        element.setDescription("");
    }

    public static void fillPractice(SEPractice element) {
        element.setConsistencyRules("");
        element.setEntry(new ArrayList<>());
        element.setMeasures(new ArrayList<>());
        element.setObjective("");
        element.setResult(new ArrayList<>());
    }

}
