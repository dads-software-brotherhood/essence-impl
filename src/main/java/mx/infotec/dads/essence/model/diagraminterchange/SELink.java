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
package mx.infotec.dads.essence.model.diagraminterchange;

import org.omg.essence.model.diagraminterchange.Label;
import org.omg.essence.model.diagraminterchange.Link;
import org.omg.essence.model.diagraminterchange.Node;

/**
 * The Class Link.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.1
 * @since essence 1.1
 */
public class SELink extends SEDiagramElement implements Link {

    /** The end 1 bounds. */
    private Label end1bounds;

    /** The target. */
    private Node target;

    /** The source. */
    private Node source;

    /** The name. */
    private Label name;

    /** The end 2 bounds. */
    private Label end2bounds;

    @Override
    public Label getEnd1bounds() {
        return end1bounds;
    }

    public void setEnd1bounds(Label end1bounds) {
        this.end1bounds = end1bounds;
    }

    @Override
    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    @Override
    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    @Override
    public Label getName() {
        return name;
    }

    public void setName(Label name) {
        this.name = name;
    }

    @Override
    public Label getEnd2bounds() {
        return end2bounds;
    }

    public void setEnd2bounds(Label end2bounds) {
        this.end2bounds = end2bounds;
    }

}
