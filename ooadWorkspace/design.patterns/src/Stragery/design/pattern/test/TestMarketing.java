package Stragery.design.pattern.test;

import Stragery.design.pattern.DigitalMarketing;
import Stragery.design.pattern.PublishOnFacebook;
import Stragery.design.pattern.PublishOnInstagram;
import Stragery.design.pattern.PublishOnWebsite;

public class TestMarketing {

	public static void main(String[] args) {
		DigitalMarketing digitalMarketing = new DigitalMarketing(); 
		System.out.println(digitalMarketing.selectMarketingPlatform(new PublishOnInstagram()));
		System.out.println(digitalMarketing.selectMarketingPlatform(new PublishOnWebsite()));
		System.out.println(digitalMarketing.selectMarketingPlatform(new PublishOnFacebook()));

	}

}
