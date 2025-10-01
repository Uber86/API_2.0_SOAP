package api.model;

import org.w3c.dom.Document;

import java.util.Objects;

public class XmlFile {

    private Long id;

    private Document document;

    public XmlFile() {
    }

    public XmlFile(Long id, Document document) {
        this.id = id;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        XmlFile xmlFile = (XmlFile) o;
        return Objects.equals(id, xmlFile.id) && Objects.equals(document, xmlFile.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, document);
    }

    @Override
    public String toString() {
        return "XmlFile{" +
                "id=" + id +
                ", document=" + document +
                '}';
    }
}
