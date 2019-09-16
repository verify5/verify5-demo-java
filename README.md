# verify5-demo-java
```
//get app parameters info from https://www.verify5.com
String host="freetvks2vi2.verify5.com";
String appid="(APPID)";
String appkey="(APPKEY)";
Verify5Client client=new Verify5Client(host, appid, appkey);
client.init(1000,60*1000);
try {
  Thread.sleep(5000);
} catch (InterruptedException e) {
  e.printStackTrace();
}
Map<String, String> tokenData = client.getTokenData();
assertNotNull(tokenData);
String token=tokenData.get("token");
assertNotNull(token);
System.out.println("token is "+token);
```
