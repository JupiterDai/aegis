package org.legion.aegis.issuetracker.dto;

public class ExportDto {

    private byte[] data;
    private String uuid;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
