package app.service.holder;

public class HolderService {

	private static class SetHolder {
		public static HolderService holderService = new HolderService();
	}
	
	private HolderService() {
		super();
	}
	
	public static HolderService getHolder() {
		return SetHolder.holderService;
	}
}