package com.dxctraining.ui;

import com.dxctraining.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ItemMain {

    public static void main(String args[]){
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.register(JavaConfig.class);
			context.refresh();
		}

    }

}
