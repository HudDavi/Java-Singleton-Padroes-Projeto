package app;

import app.service.eager.EagerService;
import app.service.holder.HolderService;
import app.service.lazy.LazyService;

public abstract class App {
	public static void main(String[] args) {
		LazyService lazyService = LazyService.getLazy();
		System.out.println(lazyService);
		lazyService = LazyService.getLazy();
		System.out.println(lazyService);
		
		EagerService eagerService = EagerService.getEager();
		System.out.println(eagerService);
		eagerService = EagerService.getEager();
		System.out.println(eagerService);
		
		HolderService holderService = HolderService.getHolder();
		System.out.println(holderService);
		holderService = HolderService.getHolder();
		System.out.println(holderService);
	}
}