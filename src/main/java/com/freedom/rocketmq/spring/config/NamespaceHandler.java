package com.freedom.rocketmq.spring.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class NamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("config", new RocketMQClientBeanDefinitionParser(RocketMQAutoConfiguration.class));
    }


    static class RocketMQClientBeanDefinitionParser implements BeanDefinitionParser {
        private final Class<?> beanClass;

        public RocketMQClientBeanDefinitionParser(Class<?> beanClass){
            this.beanClass = beanClass;
        }


        @Override
        public BeanDefinition parse(Element element, ParserContext parserContext) {
            BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(beanClass);

            //注册bean到BeanDefinitionRegistry中
            BeanDefinitionRegistry beanDefinitionRegistry = parserContext.getRegistry();
            beanDefinitionRegistry.registerBeanDefinition(beanClass.getName(), beanDefinitionBuilder.getBeanDefinition());

            return beanDefinitionBuilder.getBeanDefinition();
        }
    }

}
