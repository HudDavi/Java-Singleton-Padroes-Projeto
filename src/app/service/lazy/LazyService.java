package app.service.lazy;

public class LazyService {

	private static LazyService lazyService;
	
	private LazyService() {
		super();
	}
	
	public static LazyService getLazy() {
		if (lazyService == null) {
			lazyService = new LazyService();
		}
		return lazyService;
	}
}