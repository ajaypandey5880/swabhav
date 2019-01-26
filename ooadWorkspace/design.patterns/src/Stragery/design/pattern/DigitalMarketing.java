package Stragery.design.pattern;

public class DigitalMarketing {
	private IMarketingPlatform iMarketingPlatform;

	/*public DigitalMarketing(IMarketingPlatform iMarketingPlatform) {
		this.iMarketingPlatform = iMarketingPlatform;
	}*/
	
	public String selectMarketingPlatform(IMarketingPlatform iMarketingPlatform) {
		return iMarketingPlatform.publishOn();
	}
	

}
