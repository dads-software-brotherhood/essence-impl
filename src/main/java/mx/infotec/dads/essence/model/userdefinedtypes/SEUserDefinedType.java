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
package mx.infotec.dads.essence.model.userdefinedtypes;

import java.util.Collection;

import org.omg.essence.model.userdefinedtypes.TypedPattern;
import org.omg.essence.model.userdefinedtypes.TypedResource;
import org.omg.essence.model.userdefinedtypes.TypedTag;
import org.omg.essence.model.userdefinedtypes.UserDefinedType;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import mx.infotec.dads.essence.model.foundation.SELanguageElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Class UserDefinedType. A user defined type is a named type containing a
 * description and constraints that can be used to detail patterns, resources,
 * and tags.
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
 *User defined types are intended to detail, explain, and constrain the proper usage of particular patterns, resources, or tags.
 *
 *The constraints defined by the type are meant to be evaluated on each typed element that is associated with this type.
 *Elements on which the evaluation fails are considered ill-defined. For example, a constraint on a type called “triary
 *pattern” could express that this type is intended to be used on typed patterns with at exactly three pattern associations.
 *Hence, using this type on other elements than typed patterns would be reported as ill-defined usage. Similarly, using this
 *type on a typed pattern with more or less than three pattern associations would also be ill-defined usage.
 *
 * </pre>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
@Document(collection = "userdefinedtypes")
public class SEUserDefinedType extends SELanguageElement implements UserDefinedType {

    /** The name of the type. */
    private String name;

    /** A short description of what the type is about. */
    private String description;

    /**
     * Rules that apply to all constructs using this type. It is recommended to
     * use either plain text or OCL.
     */
    private String constraint;

    /** The typed resource. */
    @DBRef
    private Collection<? extends TypedResource> typedResource;

    /** The typed pattern. */
    @DBRef
    private Collection<? extends TypedPattern> typedPattern;

    /** The typed tag. */
    @DBRef
    private Collection<? extends TypedTag> typedTag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public Collection<? extends TypedResource> getTypedResource() {
        return typedResource;
    }

    public void setTypedResource(Collection<? extends TypedResource> typedResource) {
        this.typedResource = typedResource;
    }

    public Collection<? extends TypedPattern> getTypedPattern() {
        return typedPattern;
    }

    public void setTypedPattern(Collection<? extends TypedPattern> typedPattern) {
        this.typedPattern = typedPattern;
    }

    public Collection<? extends TypedTag> getTypedTag() {
        return typedTag;
    }

    public void setTypedTag(Collection<? extends TypedTag> typedTag) {
        this.typedTag = typedTag;
    }

}
