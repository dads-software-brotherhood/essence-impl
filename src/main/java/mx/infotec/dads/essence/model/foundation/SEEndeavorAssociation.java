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

import java.util.Collection;

import org.omg.essence.model.foundation.EndeavorAssociation;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class EndeavorAssociation. Represents associations that you want to track
 * during an endeavor.
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
 * Endeavor associations are used to link actual instances of elements on metalevel 0 (aka “the endeavor level”). This can
 * be used for instance to keep track of which particular document (an instance of a work product) was created by which
 * particular team member (an instance of alpha “Team member”). In general, these associations have no specific semantics
 * within Essence.
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class SEEndeavorAssociation implements EndeavorAssociation {

    /** The properties of this association */
    @DBRef
    private Collection<SEEndeavorProperty> ownedEnd;

    /** End properties of the association */
    @DBRef
    private Collection<SEEndeavorProperty> memberEnd;

    @Override
    public Collection<SEEndeavorProperty> getOwnedEnd() {
        return ownedEnd;
    }

    public void setOwnedEnd(Collection<SEEndeavorProperty> ownedEnd) {
        this.ownedEnd = ownedEnd;
    }

    @Override
    public Collection<SEEndeavorProperty> getMemberEnd() {
        return memberEnd;
    }

    public void setMemberEnd(Collection<SEEndeavorProperty> memberEnd) {
        this.memberEnd = memberEnd;
    }

}