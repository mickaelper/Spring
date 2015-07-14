package fr.mprogramming.springcourse.service;

import fr.mprogramming.springcourse.bean.api.Etape;
import fr.mprogramming.springcourse.service.api.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

/**
 * Created by MICK on 14/07/2015.
 */
@Service
public class MainServiceImpl implements MainService{

    @Autowired
    private List<Etape> etapes;

    @PostConstruct
    private void init() {
        Collections.sort(etapes, AnnotationAwareOrderComparator.INSTANCE);
    }

    public void handle() {
        System.out.println(etapes);
    }
}
