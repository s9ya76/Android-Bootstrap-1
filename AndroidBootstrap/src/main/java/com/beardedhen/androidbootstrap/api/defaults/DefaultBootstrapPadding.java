package com.beardedhen.androidbootstrap.api.defaults;

import com.beardedhen.androidbootstrap.api.attributes.BootstrapPadding;

public enum DefaultBootstrapPadding implements BootstrapPadding {

    NONE(0),
    PADDING_A(1.0f),
    PADDING_MD(1.5f),
    PADDING_LG(3.0f);

    private final float scaleFactor;

    DefaultBootstrapPadding(float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    @Override public int paddingStart() {
        return 0; // FIXME
    }

    @Override public int paddingEnd() {
        return 0; // FIXME
    }

    @Override public int paddingTop() {
        return 0; // FIXME
    }

    @Override public int paddingBottom() {
        return 0; // FIXME
    }

}
