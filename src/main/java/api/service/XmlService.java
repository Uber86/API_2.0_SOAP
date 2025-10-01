package api.service;

import api.model.XmlFile;

import javax.swing.text.Document;

public interface XmlService {

    XmlFileDto GetRequest(Document document);
}
