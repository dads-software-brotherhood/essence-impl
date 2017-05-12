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
package mx.infotec.dads.essence.repository;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.infotec.dads.essence.model.foundation.SEPractice;

/**
 * Test for GeneratorService
 * 
 * @author Daniel Cortes Pichardo
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeRepositoryTest {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SEPracticeRepository practiceRepository;

    private static String id;

    @Test
    public void insertPractice() throws Exception {
        LOGGER.info("insert practice");
        SEPractice practice = new SEPractice();
        // Practice
        practice.setConsistencyRules("Consistency Rules");
        practice.setEntry(Arrays.asList("Requeriments:Alpha", "Software:Architecture"));
        practice.setMeasures(Arrays.asList("Timing", "five minutes pear meeting"));
        practice.setObjective("The Objetive of the practice");
        practice.setResult(Arrays.asList("Requeriments:Alpha", "Software:Architecture"));

        // ElementGroup
        practice.setBriefDescription("Practice Brief Descrition");
        practice.setDescription("Refactoring all");
        practice.setIcon(null);
        practice.setMergeResolution(null);
        practice.setName("Name of the Practice");
//        practice.setOwnedElements(ownedElements);
//        practice.setReferredElements(referredElements);
//
//        // Inheritance
//        practice.setExtension(extension);
//        practice.setFeatureSelection(featureSelection);
//        practice.setOwner(owner);
//        practice.setPatternAssociation(patternAssociation);
//        practice.setProperties(properties);
//        practice.setReferrer(referrer);
//        practice.setResource(resource);
        practice.setSuppressable(false);
//        practice.setTag(tag);
//        practice.setViewSelection(viewSelection);
        practiceRepository.save(practice);
        id = practice.getId();
        LOGGER.info("id = {}", id);
    }

    @Test
    public void getPractice() {
        LOGGER.info("get practice id = {}", id);
        SEPractice practice = practiceRepository.findOne(id);
        System.out.println(practice);
        LOGGER.info("id: {}",practice.getId());
    }
}
