package finappers.eazybk.common.data;

import finappers.eazybk.child.data.ChildDAOInterface;
import finappers.eazybk.parent.data.ParentDAOInterface;

public interface DAOFactoryInterface {
	
	public ChildDAOInterface getChildDAO();
	public ParentDAOInterface getParentDAO();
}
