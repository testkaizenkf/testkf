package sg.gov.eld.ereg.testkf.model;

import com.ecquaria.lowcode.base.BaseAuditEntity;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = Dept.TABLE_NAME)
public class Dept extends BaseAuditEntity {

    public static final String TABLE_NAME = "DEPT";

    public static final String COL_DEPT = "DEPT";

    public static final String COL_ID = "ID";


    @Column(name = COL_DEPT)
    private String dept;

    @Id
    @GeneratedValue(generator = COMMONS_ID_GENERATOR)
    @Column(name = COL_ID)
    private ${column.columnType} id;

}
