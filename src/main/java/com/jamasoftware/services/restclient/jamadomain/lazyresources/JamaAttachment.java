package com.jamasoftware.services.restclient.jamadomain.lazyresources;

import com.jamasoftware.services.restclient.exception.RestClientException;
import com.jamasoftware.services.restclient.jamadomain.core.JamaInstance;

public class JamaAttachment {

    protected JamaItem item;
    protected String name;
    protected int size;
    protected int attachmentId;
    protected JamaInstance jamaInstance;

    public JamaItem getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    public void setJamaInstance(JamaInstance jamaInstance) {
        this.jamaInstance = jamaInstance;
    }

    public void setItem(int id) throws RestClientException {
        this.item=jamaInstance.getItem(id);
    }

    public JamaAttachment(JamaInstance jamaInstance) {
        this.jamaInstance=jamaInstance;
    }
}
