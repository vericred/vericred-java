package api;

import vericred.ApiClient;

import model.NotificationSubscriptionResponse;
import model.RequestProviderNotificationSubscription;
import model.ProviderNetworkEventNotification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-02T17:06:11.296-04:00")
public interface ProviderNotificationSubscriptionsApi extends ApiClient.Api {


  /**
   * Subscribe
   * Subscribe to receive webhook notifications when providers join or leave a network.  The request must include a list of National Provider Index (NPI) numbers for providers, a callback URL where notifications should be sent, and either a plan ID or a network ID. The response will include a &#x60;nonce&#x60; value. The &#x60;nonce&#x60; will be included in all webhook notifications originating from this subscription and will be used as the identifier for all subsequent requests.  The &#x60;network_id&#x60; and &#x60;plan_id&#x60; are mutually exclusive. The request must include a value for one of the fields, but cannot include both.  Examples of valid request bodies are as follows:  &#x60;&#x60;&#x60; {   \&quot;npis\&quot;: [\&quot;2712589\&quot;, \&quot;8498549\&quot;, \&quot;19528190\&quot;],   \&quot;plan_id\&quot;: 1,   \&quot;callback_url\&quot;: \&quot;https://example.com/webhook\&quot; }  &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; {   \&quot;npis\&quot;: [\&quot;2712589\&quot;, \&quot;8498549\&quot;, \&quot;19528190\&quot;],   \&quot;network_id\&quot;: 1,   \&quot;callback_url\&quot;: \&quot;https://example.com/webhook\&quot; }  &#x60;&#x60;&#x60;
   * @param root  (optional)
   * @return NotificationSubscriptionResponse
   */
  @RequestLine("POST /providers/subscription")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  NotificationSubscriptionResponse createProviderNotificationSubscription(RequestProviderNotificationSubscription root);

  /**
   * Unsubscribe
   * Unsubscribe from an existing webhook notification.
   * @param nonce The nonce value that was included in the response when the subscription was created (required)
   * @return void
   */
  @RequestLine("DELETE /providers/subscription/{nonce}")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  void deleteProviderNotificationSubscription(@Param("nonce") String nonce);

  /**
   * Webhook
   * Webhook notifications are sent when there are events relevant to a subscription. Notifications will be sent to the callback URL that was provided in the original request.  The endpoint handling this request should respond with a successful status code (200 &lt;&#x3D; Status Code &lt; 300). If a successful status code is not returned the notification will be sent again at a regular interval.
   * @param root  (optional)
   * @return void
   */
  @RequestLine("POST /CALLBACK_URL")
  @Headers({
    "Content-type: application/json",
    "Accept: application/json",
  })
  void notifyProviderNotificationSubscription(ProviderNetworkEventNotification root);
}
