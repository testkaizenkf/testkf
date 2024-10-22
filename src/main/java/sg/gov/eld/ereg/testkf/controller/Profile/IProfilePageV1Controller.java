package sg.gov.eld.ereg.testkf.controller.Profile;

import com.ecquaria.lowcode.base.R;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RequestMapping(value = "/api/v1/getInfo")
public interface IProfilePageV1Controller {

    @RequestMapping( produces = MediaType.APPLICATION_JSON_VALUE,
                    method = RequestMethod.GET)
    R<?> profiletest ();

}
