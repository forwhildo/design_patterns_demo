package quick;

/**
 * Created by HuGuodong on 3/13/20.
 */


public class ObserverImpl {

  private DemoService demoService;


  public ObserverImpl() {
    demoService = new DemoService();
  }

  @Subscribe
  public void handleRegSuccess(Long userId) {
    System.out.println("handleRegSuccess...");
    demoService.issueNewUserExperienceCash(userId);
  }
}
