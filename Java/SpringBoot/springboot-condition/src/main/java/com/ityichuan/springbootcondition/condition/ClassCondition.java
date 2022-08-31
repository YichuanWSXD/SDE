package com.ityichuan.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ClassCondition implements Condition {
    /**
     *
     * @param context 上下文对象。用于获取环境，IOC容易， ClassLoader objects
     * @param metadata 注解源对象。可以用于获取注解定义的属性值。
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());

        String[] value = (String[]) map.get("value");
        boolean flag = true;
        try {
            for (String className: value) {
                Class<?> cls = Class.forName(className);
                System.out.println(cls);
            }
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }

}
