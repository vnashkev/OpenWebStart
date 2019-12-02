package com.openwebstart.proxy.ui.error;

import net.adoptopenjdk.icedteaweb.i18n.Translator;

public class ProxySelectionFailedDialog extends ProxyErrorDialog {

    private final static String TITLE_KEY = "proxy.error.selectionFailed.title";
    private final static String MESSAGE_KEY = "proxy.error.selectionFailed.message";

    public ProxySelectionFailedDialog() {
        super(Translator.getInstance().translate(TITLE_KEY),
                Translator.getInstance().translate(MESSAGE_KEY));
    }
}