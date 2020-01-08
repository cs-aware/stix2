
package eu.csaware.stix2.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


/**
 * marking object
 */
public class StatementMarkingObject implements MarkingObject {

    @SerializedName("statement")
    @Expose
    private String statement;

    /**
     * No args constructor for use in serialization
     */
    public StatementMarkingObject() {
    }

    public StatementMarkingObject(String statement) {
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StatementMarkingObject)) return false;
        StatementMarkingObject that = (StatementMarkingObject) o;
        return Objects.equals(statement, that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statement);
    }
}
