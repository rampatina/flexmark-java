package org.commonmark.internal;

import org.commonmark.node.Text;

class Delimiter {

    final Text node;
    final int index;

    Delimiter previous;
    Delimiter next;

    char delimiterChar;
    int numDelims = 1;

    /**
     * Can open emphasis, see spec.
     */
    boolean canOpen = true;

    /**
     * Can close emphasis, see spec.
     */
    boolean canClose = false;

    /**
     * Whether this delimiter is allowed to form a link/image.
     */
    boolean allowed = true;

    /**
     * Skip this delimiter when looking for a link/image opener because it was already matched.
     */
    boolean matched = false;

    Delimiter(Text node, Delimiter previous, int index) {
        this.node = node;
        this.previous = previous;
        this.index = index;
    }
}