package sg.gov.eld.ereg.testkf.dao;

import sg.gov.eld.ereg.testkf.model.Dept;
import com.ecquaria.lowcode.base.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptDao extends BaseDao<Dept, String> {

}