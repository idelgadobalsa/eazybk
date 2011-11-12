package finappers.eazybk.common.data;

public interface DAOFactoryInterface {
	public ChildDAO getChildDAO();
	public ParentDAO getParentDAO();
}
