package sg.gov.eld.ereg.testkf.controller.Profile.vo;

import com.ecquaria.lowcode.base.BaseVO;
import lombok.Data;

@Data
public class Profile extends BaseVO {
    private String userName;
    private String userPassword;
    private String dob;
}
