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
package mx.infotec.dads.essence.model.foundation.extention;

import org.omg.essence.model.GraphicalElement;
import org.omg.essence.model.foundation.BasicElement;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import mx.infotec.dads.essence.model.foundation.SELanguageElement;

/**
 * <pre>
 * <b>Description: </b>
 * </pre>
 * 
 * The Kernel is organized into three discrete areas of concern, each focusing
 * on a specific aspect of software engineering. These are the main areas of
 * concern represented by essence
 * <ul>
 * <li>Customer – This area of concern contains everything to do with the actual
 * use and exploitation of the software system to be produced.</li>
 * <li>Solution – This area of concern contains everything to do the
 * specification and development of the software system.</li>
 * <li>Endeavor – This area of concern contains everything to do with the team,
 * and the way that they approach their work.</li>
 * </ul>
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
@Document(collection = "areaOfConcerns")
public class SEAreaOfConcern extends SELanguageElement implements BasicElement {

    /** The name of the element. */
    private String name;

    /**
     * The icon to be used when presenting the elements.
     * 
     * @see GraphicalElement
     */
    @DBRef
    private GraphicalElement icon;

    /**
     * The color of the Area Of Concern
     */
    @DBRef
    private Color color;

    /**
     * A short and concise description of what the element is. It is discouraged
     * to use rich formatting and structuring elements like section headings in
     * the brief description. The content of this attribute should be a summary
     * of the content fiven in attribute "description".
     */
    private String briefDescription;

    /**
     * A more detailed description of the element. The content of this attribute
     * may be written in a markup language to allow for rich descriptions. It
     * may include section headings, formatting information, hyperlinks, or
     * similar to ease structured reading and navigation.
     */
    private String description;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public GraphicalElement getIcon() {
        return icon;
    }

    public void setIcon(GraphicalElement icon) {
        this.icon = icon;
    }

    @Override
    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
