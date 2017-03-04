/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.pojos;


import java.sql.Timestamp;
import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.interfaces.ISchemaVersion;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SchemaVersion implements ISchemaVersion {

    private static final long serialVersionUID = 1574754635;

    private Integer installedRank;
    private String version;
    private String description;
    private String type;
    private String script;
    private Integer checksum;
    private String installedBy;
    private Timestamp installedOn;
    private Integer executionTime;
    private Byte success;

    public SchemaVersion() {
    }

    public SchemaVersion(SchemaVersion value) {
        this.installedRank = value.installedRank;
        this.version = value.version;
        this.description = value.description;
        this.type = value.type;
        this.script = value.script;
        this.checksum = value.checksum;
        this.installedBy = value.installedBy;
        this.installedOn = value.installedOn;
        this.executionTime = value.executionTime;
        this.success = value.success;
    }

    public SchemaVersion(
            Integer installedRank,
            String version,
            String description,
            String type,
            String script,
            Integer checksum,
            String installedBy,
            Timestamp installedOn,
            Integer executionTime,
            Byte success
    ) {
        this.installedRank = installedRank;
        this.version = version;
        this.description = description;
        this.type = type;
        this.script = script;
        this.checksum = checksum;
        this.installedBy = installedBy;
        this.installedOn = installedOn;
        this.executionTime = executionTime;
        this.success = success;
    }

    @Override
    public Integer getInstalledRank() {
        return this.installedRank;
    }

    @Override
    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    @Override
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getScript() {
        return this.script;
    }

    @Override
    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public Integer getChecksum() {
        return this.checksum;
    }

    @Override
    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    @Override
    public String getInstalledBy() {
        return this.installedBy;
    }

    @Override
    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    @Override
    public Timestamp getInstalledOn() {
        return this.installedOn;
    }

    @Override
    public void setInstalledOn(Timestamp installedOn) {
        this.installedOn = installedOn;
    }

    @Override
    public Integer getExecutionTime() {
        return this.executionTime;
    }

    @Override
    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    @Override
    public Byte getSuccess() {
        return this.success;
    }

    @Override
    public void setSuccess(Byte success) {
        this.success = success;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SchemaVersion (");

        sb.append(installedRank);
        sb.append(", ").append(version);
        sb.append(", ").append(description);
        sb.append(", ").append(type);
        sb.append(", ").append(script);
        sb.append(", ").append(checksum);
        sb.append(", ").append(installedBy);
        sb.append(", ").append(installedOn);
        sb.append(", ").append(executionTime);
        sb.append(", ").append(success);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISchemaVersion from) {
        setInstalledRank(from.getInstalledRank());
        setVersion(from.getVersion());
        setDescription(from.getDescription());
        setType(from.getType());
        setScript(from.getScript());
        setChecksum(from.getChecksum());
        setInstalledBy(from.getInstalledBy());
        setInstalledOn(from.getInstalledOn());
        setExecutionTime(from.getExecutionTime());
        setSuccess(from.getSuccess());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISchemaVersion> E into(E into) {
        into.from(this);
        return into;
    }
}
