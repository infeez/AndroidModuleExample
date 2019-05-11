package com.arellomobile.mvp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoxyReflector {
    private static Map<Class<?>, Object> sViewStateProviders;
    private static Map<Class<?>, List<Object>> sPresenterBinders;
    private static Map<Class<?>, Object> sStrategies;

    static {
        sViewStateProviders = new HashMap<>();
        sPresenterBinders = new HashMap<>();
        sStrategies = new HashMap<>();
    }

    public static Object getViewState(Class<?> presenterClass) {
        return sViewStateProviders.get(presenterClass);
    }

    public static List<Object> getPresenterBinders(Class<?> delegated) {
        return sPresenterBinders.get(delegated);
    }

    public static Object getStrategy(Class strategyClass) {
        return sStrategies.get(strategyClass);
    }
}
