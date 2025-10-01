package api.repository;

import api.model.XmlFile;

@Repository
public interface XmlRepository extends JpaRepository<XmlFile, Long> {
}
