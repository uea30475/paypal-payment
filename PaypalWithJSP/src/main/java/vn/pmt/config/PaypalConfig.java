package vn.pmt.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@Configuration
public class PaypalConfig {

	private String clientId="AZaQtxaj8h7YoWBbd8enl47taHyJ1qmxlBUQ-AyvZoeQiresgA3WTEkUq0HpTLdOUMPQE4HNeXILC0Pf";
	private String seret="EHwFV_X3LtUs_ZHGlkTkyRHXhqnwTc8LVI1mOKYULasAhbwDob_8OKrWMiWkHPHErsXlcua9un-Vl10G";
	private String mode="sandbox";
	
	private Map<String,String>getPaypalMap(){
		Map <String,String> paypalMap = new HashMap<>();
		paypalMap.put("mode", mode);
		return paypalMap;
	}
	
	private OAuthTokenCredential authTokenCredential() {
		return new OAuthTokenCredential(clientId, seret, getPaypalMap());
	}
	
	@Bean
	public APIContext apiContext() throws PayPalRESTException {
		 APIContext apiContext = new APIContext(authTokenCredential().getAccessToken());
		 apiContext.setConfigurationMap(getPaypalMap());
		 return apiContext;
	}
}
