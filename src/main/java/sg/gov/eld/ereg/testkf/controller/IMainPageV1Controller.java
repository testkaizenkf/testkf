package sg.gov.eld.ereg.testkf.controller;

import com.ecquaria.lowcode.base.R;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

public interface IMainPageV1Controller {

    @RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE,
                    method = RequestMethod.GET)
    R<?> login ();

}
