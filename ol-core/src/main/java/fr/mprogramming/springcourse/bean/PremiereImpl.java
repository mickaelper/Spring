package fr.mprogramming.springcourse.bean;

import fr.mprogramming.springcourse.bean.api.Etape;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by MICK on 14/07/2015.
 */
@Component
@Order(value = 1)
public class PremiereImpl implements Etape{
}
