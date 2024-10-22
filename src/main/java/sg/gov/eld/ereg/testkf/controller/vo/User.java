package sg.gov.eld.ereg.testkf.controller.vo;

import com.ecquaria.lowcode.base.BaseVO;
import lombok.Data;

@Data
public class User extends BaseVO {
    private String name;
    private String age;
    private String gender;
}
