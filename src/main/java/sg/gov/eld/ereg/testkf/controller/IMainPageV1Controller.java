package sg.gov.eld.ereg.testkf.controller;

import com.ecquaria.lowcode.base.R;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RequestMapping(value = "/api/v1/create")
public interface IMainPageV1Controller {

    @RequestMapping( produces = MediaType.APPLICATION_JSON_VALUE,
                    method = RequestMethod.POST)
    R<?> testdatasource ();

}
