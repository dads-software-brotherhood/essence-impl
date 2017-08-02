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

import org.joda.time.DateTime;

import mx.infotec.dads.essence.audit.Auditable;
import mx.infotec.dads.essence.model.alphaandworkproduct.SEState;
import mx.infotec.dads.essence.model.foundation.SEBasicElement;
import mx.infotec.dads.essence.model.foundation.SECheckpoint;
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

    private EssenceMapping() {

    }

    public static void fillSELanguageElements(SELanguageElement languageElement) {
        languageElement.setExtension(new ArrayList<>());
        languageElement.setFeatureSelection(new ArrayList<>());
        languageElement.setOwner(null);
        languageElement.setPatternAssociation(new ArrayList<>());
        languageElement.setProperties(new ArrayList<>());
        languageElement.setReferrer(new ArrayList<>());
        languageElement.setResource(new ArrayList<>());
        languageElement.setSuppressable(false);
        languageElement.setTag(new ArrayList<>());
        languageElement.setViewSelection(new ArrayList<>());
    }

    public static void fillSEElementGroup(SEElementGroup elementGroup) {
        fillSELanguageElements(elementGroup);
        elementGroup.setBriefDescription("");
        elementGroup.setDescription("");
        elementGroup.setIcon(null);
        elementGroup.setMergeResolution(null);
        elementGroup.setName("");
        elementGroup.setOwnedElements(new ArrayList<>());
        elementGroup.setReferredElements(new ArrayList<>());
    }

    public static void fillBasicElement(SEBasicElement basicElement) {
        fillSELanguageElements(basicElement);
        basicElement.setName("");
        basicElement.setIcon(null);
        basicElement.setBriefDescription("");
        basicElement.setDescription("");
    }

    public static void fillPractice(SEPractice practice) {
        fillSEElementGroup(practice);
        practice.setConsistencyRules("");
        practice.setEntry(new ArrayList<>());
        practice.setMeasures(new ArrayList<>());
        practice.setObjective("");
        practice.setResult(new ArrayList<>());
        practice.setEntryCriterion(new ArrayList<>());
        practice.setResultCriterion(new ArrayList<>());
    }

    public static void fillCheckpoint(SECheckpoint checkpoint, SEState state) {
        fillSELanguageElements(checkpoint);
        checkpoint.setName("");
        checkpoint.setDescription("");
        checkpoint.setShortDescription("");
        checkpoint.setState(state);
        checkpoint.setLevel(null);
        checkpoint.setCompetencyLevel(null);
    }

    public static void fillBitacoraData(Auditable auditable) {
        auditable.setLastModifiedDate(new DateTime());
        auditable.setCreatedDate(new DateTime());
    }
}
