package tml.xiaochun.cicd_test.console;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author：XiaoChun
 * @Date：2024/7/15 上午11:10
 */
@Component
@Scope("prototype")
public class ResourceConsole {
    private final Map<String, Object> resources;

    public ResourceConsole() {
        resources = new HashMap<>();
    }

    public ResourceConsole put(String key, Object value) {
        resources.put(key, value);
        return this;
    }

    public Object get(String key) {
        return resources.get(key);
    }
}
