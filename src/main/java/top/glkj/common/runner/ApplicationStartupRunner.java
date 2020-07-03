package top.glkj.common.runner;
import lombok.extern.slf4j.Slf4j;
import java.net.InetAddress;
/**
 * @author : null
 * @date : 2020/7/4 0:26
 * @Description :
 */

@Slf4j
public class ApplicationStartupRunner{
    public void run() throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        String url = String.format("http://%s:%s", address.getHostAddress(), 8080);
        log.info("系统启动完毕，地址：{}", url);
    }
}
