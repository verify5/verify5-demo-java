package com.verify5.demo;

import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Test;

public class Verify5ClientTest {

	@Test
	public void testGetToken() {
		//get app info from https://www.verify5.com
		String host="freetvks2vi2.verify5.com";
		String appkey="47653fe36609401a8e47e9348b1d9ce4";
		String appid="d705966925574bba8890d1de23ddfffb";
		Verify5Client client=new Verify5Client(host, appid, appkey);
		client.init();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Map<String, String> tokenData = client.getTokenData();
		assertNotNull(tokenData);
	}
}
