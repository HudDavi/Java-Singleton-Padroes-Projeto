package app.service.eager;

public class EagerService {

	private static EagerService eagerService = new EagerService();
	
	private EagerService() {
		super();
	}
	
	public static EagerService getEager() {
		return eagerService;
	}
}