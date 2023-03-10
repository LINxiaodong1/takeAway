package riggie;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
@ServletComponentScan
@EnableTransactionManagement
public class reggieApplication {
    public static void main(String[] args) {
       ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(reggieApplication.class,args);
log.info("项目启动成功！");
    }
}
