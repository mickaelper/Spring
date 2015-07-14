package fr.mprogramming.springcourse.orderedlist;

import fr.mprogramming.springcourse.service.api.MainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static final String APPLICATION_CONTEXT_PATH = "applicationContext.xml";
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_PATH);
        MainService main = applicationContext.getBean(MainService.class);
        main.handle();
    }
}
