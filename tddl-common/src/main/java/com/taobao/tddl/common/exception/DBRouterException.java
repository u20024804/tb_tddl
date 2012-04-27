/*(C) 2007-2012 Alibaba Group Holding Limited.	


public class DBRouterException extends Exception{
	private static final long serialVersionUID = -7468723962922760016L;

	/**
	 * @param msg
	 * @param cause
	 */
	public DBRouterException(String msg, Throwable cause) {
		super(msg, cause);
	}

	/**
	 * @param cause
	 */
	public DBRouterException(Throwable cause) {
		super(cause);
	}

	public DBRouterException() {
		super();
	}

	/**
	 * @param string
	 */
	public DBRouterException(String message) {
		super(message);
	}

}