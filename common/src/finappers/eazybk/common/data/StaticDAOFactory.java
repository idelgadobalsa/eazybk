/**
 * 
 */
package finappers.eazybk.common.data;

import finappers.eazybk.child.data.ChildDAOInterface;
import finappers.eazybk.child.data.StaticChildDAO;
import finappers.eazybk.parent.data.ParentDAOInterface;
import finappers.eazybk.parent.data.StaticParentDAO;

/**
 * @author ifraixedes
 *
 */
public class StaticDAOFactory implements DAOFactoryInterface {

	private static StaticDAOFactory instance; 
	
	private StaticDAOFactory() {
		
	}
	
	public static StaticDAOFactory getInstance() {
		if (StaticDAOFactory.instance == null) {
			StaticDAOFactory.instance = new StaticDAOFactory();
		}
		
		return StaticDAOFactory.instance;
	}
	
	/* (non-Javadoc)
	 * @see finappers.eazybk.common.data.DAOFactoryInterface#getChildDAO()
	 */
	@Override
	public ChildDAOInterface getChildDAO() {
		return new StaticChildDAO();
	}

	/* (non-Javadoc)
	 * @see finappers.eazybk.common.data.DAOFactoryInterface#getParentDAO()
	 */
	@Override
	public ParentDAOInterface getParentDAO() {
		return new StaticParentDAO();
	}

}
